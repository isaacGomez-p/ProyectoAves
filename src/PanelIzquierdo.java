aaaaimport java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PanelIzquierdo extends JPanel{
	public static JList<DatosAve> Limprimir;
	public static ArrayList<DatosAve> listaAves=new ArrayList<DatosAve>();
	public static Map<String, DatosAve> treeMapEspecie = new TreeMap<String, DatosAve>();
	public static Map<Integer, DatosAve> treeMapEdad = new TreeMap<Integer, DatosAve>();
	public static Map<Integer, DatosAve> treeMapPuntos = new TreeMap<Integer, DatosAve>();
	public static String nom, esp;
	public static int edad, punt;
	public static String key;
	public static Integer key4;
	static DatosAve ave,ave2,ave3,ave4;
	public static Iterator<String> it;
	public static Iterator<Integer> at;
	static DefaultListModel<DatosAve> listModel;
	private static Object[] bcs;
	static Integer att;
	public PanelIzquierdo() {
		setLayout(new BorderLayout());
		Border b1 = BorderFactory.createTitledBorder("Listado de Aves");
		setBorder(b1);
		BorderLayout a= new BorderLayout();
		Limprimir= new JList<DatosAve>();
		listModel=new DefaultListModel<DatosAve>();
		this.add(Limprimir);
	}

	public static void llenarTabla(String snom, String especie, int iedad, int ipunt) {
		//Iterator<ArrayList> a = new w.iterador();
		PanelIzquierdo.nom=snom;
		PanelIzquierdo.esp=especie;
		PanelIzquierdo.edad=iedad;
		PanelIzquierdo.punt=ipunt;
		System.out.println("Nombre"+PanelIzquierdo.nom+"Especie"+PanelIzquierdo.esp+"Edad"+PanelIzquierdo.edad+"Puntuacion"+PanelIzquierdo.punt+"_-_-_");
		ave= new DatosAve(PanelIzquierdo.nom,PanelIzquierdo.esp,PanelIzquierdo.edad,PanelIzquierdo.punt);
		ave2= new DatosAve(PanelIzquierdo.nom,PanelIzquierdo.edad,PanelIzquierdo.punt);
		ave3= new DatosAve(PanelIzquierdo.nom,PanelIzquierdo.esp,PanelIzquierdo.punt);
		ave4= new DatosAve(PanelIzquierdo.nom,PanelIzquierdo.edad,PanelIzquierdo.esp);
		treeMapPuntos.put(PanelIzquierdo.punt, ave4);
		treeMapEdad.put(PanelIzquierdo.edad, ave3);
		treeMapEspecie.put(PanelIzquierdo.esp, ave2);
		
		//String a =(PanelIzquierdo.nom+PanelIzquierdo.esp+PanelIzquierdo.edad+PanelIzquierdo.punt); 
		listaAves.add(ave);
		listModel.addElement(ave);
		
		for(int i=0;i<listaAves.size();i++) {
		System.out.println(listaAves.get(i).getNom());
		}
		Limprimir.setModel(listModel);
		MouseListener mouseListener = new MouseAdapter() 
		{
		    public void mouseClicked(MouseEvent e) 
		    {
		        if (e.getClickCount() == 1) 
		        {
		            int posicion = Limprimir.locationToIndex(e.getPoint());
		            DatosAve bcs = Limprimir.getSelectedValue();
		            //System.out.println("TENGO ESTO :O :O"+bcs.toString()+"HOLA PERRO FUNCIONA ESSTA POPO"+bcs.getEdad()+"---NO SEEEEE---");
		            PanelCentral aveImprimir = new PanelCentral(bcs.toString(),bcs.getEsp(),Integer.toString(bcs.getEdad()),Integer.toString(bcs.getPuntos()));
		            //System.out.println("La posicion es " + posicion);
		         }
		    }
		};
		 Limprimir.addMouseListener(mouseListener);
		 
	}
	public static void llenarEspecie() {
		listModel.removeAllElements();
		it = treeMapEspecie.keySet().iterator();
		while(it.hasNext()) {
			key = it.next();
			System.out.println("ESPECIE: " + key + " -> Valor: " + treeMapEspecie.get(key).getNom());
			listModel.addElement(treeMapEspecie.get(key));
		}
		
		Limprimir.setModel(listModel);
	}
	
	public static void llenarEdad() {
		listModel.removeAllElements();
		at = treeMapEdad.keySet().iterator();
		while(at.hasNext()) {
			key4 = at.next();
			System.out.println("EDAD: " + key4 + " -> Valor: " + treeMapEdad.get(key4).getNom());
			listModel.addElement(treeMapEdad.get(key4));
		}
		
		Limprimir.setModel(listModel);
	}

	public static void llenarPuntos() {
		listModel.removeAllElements();
		at = treeMapPuntos.keySet().iterator();
		while(at.hasNext()) {
			key4 = at.next();
			System.out.println("EDAD: " + key4 + " -> Valor: " + treeMapPuntos.get(key4).getNom());
			listModel.addElement(treeMapPuntos.get(key4));
		}
		Limprimir.setModel(listModel);
		
	}
	
}

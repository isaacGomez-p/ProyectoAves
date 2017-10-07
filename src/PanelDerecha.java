import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelDerecha extends JPanel implements ActionListener{
	JButton Bviejo, Bganador,Bperdedor;
	public static TreeMap<Integer, DatosAve> treeMapEdad = new TreeMap<Integer, DatosAve>();
	public static TreeMap<Integer, DatosAve> treeMapPunt = new TreeMap<Integer,DatosAve>();
	public static Integer k,k2,k3;
	//public static ArrayList<String,DatosAve> edad
	public PanelDerecha() {
		setLayout(new GridBagLayout());
		
		Border b1= BorderFactory.createTitledBorder("");
		setBorder(b1);
		GridBagConstraints c= new GridBagConstraints();
		
		c.gridx = 0;// definir la columna que empieza mi componete
        c.gridy = 0;// definir la fila que empieza mi componete
        c.fill = GridBagConstraints.BOTH;//El modo como va crecer el componente, BOTH:crece para los dos lados
       
        Insets insets = new Insets( 5, 10, 5, 10 );
        c.insets = insets;
        
        Bviejo= new JButton("Mas viejo");
        Bviejo.addActionListener(this);
        Bviejo.setActionCommand("viejo");
        c = new GridBagConstraints( );
        c.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
        c.gridy = 1;//
        c.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
        insets = new Insets( 5, 10, 5, 10 );
        c.insets = insets;	        
        add(Bviejo,c);
        
        Bganador= new JButton("Ganador");
        Bganador.addActionListener(this);
        Bganador.setActionCommand("winner");
        c = new GridBagConstraints( );
        c.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
        c.gridy = 2;//
        c.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
        insets = new Insets( 5, 10, 5, 10 );
        c.insets = insets;	        
        add(Bganador,c);
        
        Bperdedor= new JButton("Perdedor");
        Bperdedor.addActionListener(this);
        Bperdedor.setActionCommand("loser");
        c = new GridBagConstraints( );
        c.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
        c.gridy = 3;//
        c.fill = GridBagConstraints.BOTH; //Modificar el tamaño con respecto al grid
        insets = new Insets( 5, 10, 5, 10 );
        c.insets = insets;	        
        add(Bperdedor,c);
		
        
	}
	public PanelDerecha(int edad,DatosAve s, int punt, DatosAve d) {
		//int i=0;
		System.out.println("PUNTUACION----: "+punt+"DATOOS : "+d.getNom()+"---"+d.getEsp()+"---"+s.getEdad());
		treeMapEdad.put(edad, s);
		treeMapPunt.put(punt, d);
		Iterator<Integer> it = treeMapEdad.keySet().iterator();
		Iterator<Integer> it2= treeMapPunt.keySet().iterator();
		k2= it2.next();
		System.out.println("----El perdedor :"+k2);
		while(it.hasNext()){
			  Integer key = it.next();
			  
			  //edad[i]= (key,treeMapEdad.get(key).getNom(),treeMapEdad.get(key).getEsp());
			  System.out.println("Edad: " + key + " -> Valor: " + treeMapEdad.get(key).getNom());
			  //i++;
			  k= key;
			}
		while(it2.hasNext()) {
			Integer key = it2.next();
			System.out.println("Puntuacion: " + key + " -> Valor: " + treeMapPunt.get(key).getNom());
			k3= key;
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if("viejo".equals(arg0.getActionCommand())) {
			try {
			JOptionPane.showMessageDialog(null,""+treeMapEdad.get(k).getNom(),"El mas viejo es: ",JOptionPane.INFORMATION_MESSAGE);
			}
			catch(java.lang.NullPointerException a) {
				JOptionPane.showMessageDialog(null,"Por favor ingrese mas aves para determinar el mayor. ","Mensaje: ",JOptionPane.ERROR_MESSAGE);}
			}
		
		if("winner".equals(arg0.getActionCommand())) {	
			try {
			JOptionPane.showMessageDialog(null,""+treeMapPunt.get(k3).getNom(),"El ganador es: ",JOptionPane.INFORMATION_MESSAGE);
			}
			catch(java.lang.NullPointerException a) {
				JOptionPane.showMessageDialog(null,"Por favor ingrese mas aves para determinar un ganador. ","Mensaje: ",JOptionPane.ERROR_MESSAGE);}
			}
		
		if("loser".equals(arg0.getActionCommand())) {
			try {
			JOptionPane.showMessageDialog(null,""+treeMapPunt.get(k2).getNom(),"El perdedor es: ",JOptionPane.INFORMATION_MESSAGE);
			}
			catch(java.lang.NullPointerException a) {
				JOptionPane.showMessageDialog(null,"Por favor ingrese datos para determinar un perdedor. ","Mensaje: ",JOptionPane.ERROR_MESSAGE);}
			}
		}
	}
	
	


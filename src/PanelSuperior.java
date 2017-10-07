import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class PanelSuperior extends JPanel implements ActionListener{
	public JLabel Jnom, Jesp, Jedad, Jpuntos;
	public JTextField JTnom;
	public JComboBox JCedad,JCpun,JCesp;
	public JButton Joesp, Joedad, Jopun,Jagregar;
	public static ArrayList<DatosAve> listaAve = new ArrayList<DatosAve>();
	public static DatosAve da,daedad,dapunt;
	static String especie,snom;
	static String sedad;
	static String spunt;
	private DefaultTableModel table_model;
	PanelDerecha panelD;
	PanelIzquierdo paI;
	public PanelSuperior() {
		setLayout(new GridBagLayout());
		
		Border b1= BorderFactory.createTitledBorder("Ingreso aves");
		setBorder(b1);
		GridBagConstraints c= new GridBagConstraints();
		
		//ManejadorDeEventos m = new ManejadorDeEventos();
		
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 400;
		Insets in = new Insets(5,10,5,10);
		
		Jnom= new JLabel("Nombre: ");
		//c = new GridBagConstraints();
	    c.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	    c.gridy = 0;//
	    c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
	    in = new Insets( 5, 10, 5, 10 );
	    c.insets = in;	        
	    add( Jnom,c);
	    
	    JTnom= new JTextField();
	    //c = new GridBagConstraints();
        c.gridx = 1;//Aumenta el tamaña del espacio en que se en cuentra
        c.gridy = 0;//
        c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( JTnom,c);
        
        Jesp= new JLabel("Especie: ");
		//c = new GridBagConstraints();
	    c.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	    c.gridy = 1;//
	    c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
	    in = new Insets( 5, 10, 5, 10 );
	    c.insets = in;	        
	    add( Jesp,c);
	    
	    JCesp= new JComboBox();
	    JCesp.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una especie","Especie 1", "Especie 2", "Especie 3", "Especie 4","Especie 5","Especie 6","Especie 7","Especie 8","Especie 9","Especie 10"}));
        c.gridx = 1;//Aumenta el tamaña del espacio en que se en cuentra
        c.gridy = 1;//
        c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( JCesp,c);
        
        Jedad= new JLabel("Edad: ");
		//c = new GridBagConstraints();
	    c.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	    c.gridy = 2;//
	    c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
	    in = new Insets( 5, 10, 5, 10 );
	    c.insets = in;	        
	    add( Jedad,c);
	    
	    JCedad= new JComboBox();
	    JCedad.setModel(new DefaultComboBoxModel(new String[] {"Seleccione la edad","1", "2", "3", "4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"}));
        c.gridx = 1;//Aumenta el tamaña del espacio en que se en cuentra
        c.gridy = 2;//
        c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( JCedad,c);
        
        Jpuntos= new JLabel("Puntuacion: ");
		//c = new GridBagConstraints();
	    c.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	    c.gridy = 3;//
	    c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
	    in = new Insets( 5, 10, 5, 10 );
	    c.insets = in;	        
	    add( Jpuntos,c);
	    
	    JCpun= new JComboBox();
	    JCpun.setModel(new DefaultComboBoxModel(new String[] {"Seleccione puntuacion","1", "2", "3", "4","5"}));
        c.gridx = 1;//Aumenta el tamaña del espacio en que se en cuentra
        c.gridy = 3;//
        c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( JCpun,c);
        
        Jagregar= new JButton("Agregar");
        Jagregar.setActionCommand("agre");
        Jagregar.addActionListener(this);
        c.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
        c.gridy = 4;//
        c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( Jagregar,c);
        
        Joesp= new JButton("Ordenar por especie");
        Joesp.setActionCommand("Oesp");
        Joesp.addActionListener(this);
        c.gridx = 2;//Aumenta el tamaña del espacio en que se en cuentra
        c.gridy = 0;//
        c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( Joesp,c);
        
        Joedad= new JButton("Ordenar por edad");
        Joedad.setActionCommand("Oedad");
        Joedad.addActionListener(this);
        c.gridx = 2;//Aumenta el tamaña del espacio en que se en cuentra
        c.gridy = 1;//
        c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( Joedad,c);
        
        Jopun= new JButton("Ordenar por puntos");
        Jopun.setActionCommand("Opun");
        Jopun.addActionListener(this);
        c.gridx = 2;//Aumenta el tamaña del espacio en que se en cuentra
        c.gridy = 2;//
        c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( Jopun,c);
        //int j=10, k=3;
        //PanelIzquierdo.llenarTabla("CONDOR DE LOS ANDES", "Especie 1", j, k);
	}
	

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(validarDatos()) {
			if("agre".equals(arg0.getActionCommand())) {
				snom= JTnom.getText();
				int iesp= JCesp.getSelectedIndex();
				int iedad= JCedad.getSelectedIndex();
				int ipunt=JCpun.getSelectedIndex();
				especie = (String) JCesp.getItemAt(iesp);
				sedad = (String) JCedad.getItemAt(iesp);
				spunt= (String) JCpun.getItemAt(ipunt);
				//String puntuacion = (String) JCpun.getItemAt(ipunt);
				daedad= new DatosAve(snom,especie,ipunt);
				dapunt= new DatosAve(snom,iedad,especie);
				panelD= new PanelDerecha(iedad,daedad,ipunt,dapunt);
				System.out.println("-------"+JCpun.getItemAt(ipunt));
				//da=new DatosAve(snom,especie,iedad,ipunt);
				//listaAve.add(da);
				PanelIzquierdo.llenarTabla(snom,especie,iedad,ipunt);
				JOptionPane.showMessageDialog(null,"Ave agregada. ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
				//PanelIzquierdo a =new PanelIzquierdo(snom,especie,iedad,ipunt);
				//JTnom.setText(null);
				//JCesp.setSelectedIndex(0);
				//JCedad.setSelectedIndex(0);
				//JCpun.setSelectedIndex(0);
				
		}
	}
			if("Oesp".equals(arg0.getActionCommand())) {
				PanelIzquierdo.llenarEspecie();
			}
			if("Oedad".equals(arg0.getActionCommand())) {
				PanelIzquierdo.llenarEdad();
			}
			if("Opun".equals(arg0.getActionCommand())) {
				PanelIzquierdo.llenarPuntos();
			}
		
	}
	public boolean validarDatos() {
		if(JTnom.getText().isEmpty()||JCesp.getSelectedIndex()==0||JCedad.getSelectedIndex()==0||JCpun.getSelectedIndex()==0) {
			JOptionPane.showMessageDialog(null,"Por favor ingrese datos válidos. ","Error",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		else {
		return true;
		}
	}
}

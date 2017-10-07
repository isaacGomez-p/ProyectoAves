import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PanelCentral extends JPanel {
	public static JLabel Jnom, Jesp, Jedad, Jpun;
	public static JTextField JTnom, JTesp, JTedad, JTpun;
	
	public PanelCentral() {
		setLayout(new GridBagLayout());
		
		Border b1= BorderFactory.createTitledBorder("AVE SELECCIONADA");
		setBorder(b1);
		GridBagConstraints c= new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		c.weightx= 100;
		c.weighty= 10;
		//c.fill = GridBagConstraints.HORIZONTAL;
		
		Insets in = new Insets(5,10,5,10);
		
		Jnom= new JLabel("Nombre: ");
		//c = new GridBagConstraints();
	    c.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	    c.gridy = 0;//
	    c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
	    in = new Insets( 5, 10, 5, 10 );
	    c.insets = in;	        
	    add( Jnom,c);
	    
	    /*JTnom= new JTextField();
	    //c = new GridBagConstraints();
        c.gridx = 1;//Aumenta el tamaña del espacio en que se en cuentra
        c.gridy = 0;//
        c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( JTnom,c);*/
        
        Jesp= new JLabel("Especie: ");
		//c = new GridBagConstraints();
	    c.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	    c.gridy = 1;//
	    c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
	    in = new Insets( 5, 10, 5, 10 );
	    c.insets = in;	        
	    add( Jesp,c);
	    
	    Jedad= new JLabel("Edad: ");
		//c = new GridBagConstraints();
	    c.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	    c.gridy = 2;//
	    c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
	    in = new Insets( 5, 10, 5, 10 );
	    c.insets = in;	        
	    add( Jedad,c);
	    
	    Jpun= new JLabel("Puntuacion: ");
		//c = new GridBagConstraints();
	    c.gridx = 0;//Aumenta el tamaña del espacio en que se en cuentra
	    c.gridy = 3;//
	    c.fill = GridBagConstraints.HORIZONTAL; //Modificar el tamaño con respecto al grid
	    in = new Insets( 5, 10, 5, 10 );
	    c.insets = in;	        
	    add( Jpun,c);
	    
	   
	}
	public PanelCentral(String a, String b, String c, String d) {
		System.out.println("---"+a+"---"+b+"---"+c+"---"+d+"---");
		Jnom.setText("Nombre:    "+a);
		Jesp.setText("Especie:    "+b);
		Jedad.setText("Edad:    "+c);
		Jpun.setText("Puntuación:    "+d);
	}
}

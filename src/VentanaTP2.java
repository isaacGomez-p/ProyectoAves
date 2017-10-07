import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;



public class VentanaTP2 extends JFrame{
	PanelSuperior panelArri;
	static PanelIzquierdo panelIzqu;
	PanelCentral panelCe;
	PanelDerecha panelDe;
	String nom, esp;
	int edad, punt;
	
	public VentanaTP2() {
		this.iniciar();
		componente();
		this.pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public VentanaTP2 iniciar(){
		Dimension d = new Dimension(1000,700);
		this.setSize(d);
		this.setPreferredSize(d);
		
		this.getContentPane().setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		return this;
		
	}
	public void componente() {
		panelArri=new PanelSuperior();
		add(panelArri, BorderLayout.NORTH);
		
		panelIzqu=new PanelIzquierdo();
		add(panelIzqu,BorderLayout.WEST);
		
		panelCe=new PanelCentral();
		add(panelCe,BorderLayout.CENTER);
		
		panelDe=new PanelDerecha();
		add(panelDe,BorderLayout.EAST);
	}
}

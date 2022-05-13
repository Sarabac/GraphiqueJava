package fenetre;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CalculatriceFenetre extends JFrame implements ActionListener{
 
	public CalculatriceFenetre(){
		super();
 
		build();//On initialise notre fenêtre
	}
 
	private void build(){
		setTitle("Calculatrice"); //On donne un titre à l'application
		setSize(400,200); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Resultat: NA");
		panel.add(label);
		
		setContentPane(panel);
		
		
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
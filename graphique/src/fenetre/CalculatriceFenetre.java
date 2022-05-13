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
 
		build();//On initialise notre fen�tre
	}
 
	private void build(){
		setTitle("Calculatrice"); //On donne un titre � l'application
		setSize(400,200); //On donne une taille � notre fen�tre
		setLocationRelativeTo(null); //On centre la fen�tre sur l'�cran
		setResizable(false); //On interdit la redimensionnement de la fen�tre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit � l'application de se fermer lors du clic sur la croix
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Resultat: NA");
		panel.add(label);
		
		setContentPane(panel);
		
		
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
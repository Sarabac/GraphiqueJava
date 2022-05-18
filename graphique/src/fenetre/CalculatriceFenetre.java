package fenetre;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

@SuppressWarnings("serial")
public class CalculatriceFenetre extends JFrame{
	private JTextField field1;// Le nombre de droite de l'operation
	private JTextField field2;// Le nombre de gauche de l'operation
	private JLabel label;// Le resultat
	private JComboBox liste;// L'operateur
 
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
		JButton bouton = new JButton(new CalculeAction(this, "Calculer"));
		panel.add(bouton);
		
		this.field1 = new JTextField();
		this.field1.setColumns(10);
		panel.add(this.field1);
		
		this.liste = new JComboBox(
				// liste des operateurs possibles
				new Object[] {"+", "-", "*", "/"}
				);
		panel.add(this.liste);
		
		this.field2 = new JTextField();
		this.field2.setColumns(10);
		panel.add(this.field2);
		
		this.label = new JLabel("Rien pour le moment");
		panel.add(this.label);
		setContentPane(panel);

	}
	/**
	Renvoie les deux valeures entree sous forme de String[].
	La première est le nobre de droite, la seconde le nombre de gauche
	*/
	public String[] getField() {
		return new String[] {this.field1.getText(), this.field2.getText()};
	}
	/**
	Renvoie l'objet label pour pouvoir le modifer.
	Peut etre faudrait-il plutot un setter...
	*/
	public JLabel getLabel() {
		return this.label;
	}
	/**
	Renvoie le caractere corespondant a l'operateur selectionne.
	*/
	public String getOperateur() {
		return (String) this.liste.getSelectedItem();
	}

}


@SuppressWarnings("serial")
class CalculeAction extends AbstractAction{
	private CalculatriceFenetre fenetre;
	//nombre[0] est le nombre de gauche.
	//nombre[1] est le nombre de droite.
	double[] nombres = new double[] {0,0};
	
	public CalculeAction(CalculatriceFenetre fenetre, String texte) {
		super(texte);
		this.fenetre = fenetre;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String[] tNombres = this.fenetre.getField();
		double resultat = 0;
		
		//test si les string ne sont pas des nombres valides
		//plutot utiliser "isnumeric" ?
		try {
			this.nombres[0] = Double.parseDouble(tNombres[0]);
		}catch(NumberFormatException ex) {}
		try {
			this.nombres[1] = Double.parseDouble(tNombres[1]);
		}catch(NumberFormatException ex) {}
		
		switch(this.fenetre.getOperateur()) {
			case "+":
				resultat = this.nombres[0]+this.nombres[1];
				break;
			case "*":
				resultat = this.nombres[0]*this.nombres[1];
				break;
			case "-":
				resultat = this.nombres[0]-this.nombres[1];
				break;
			case "/":
				resultat = this.nombres[0]/this.nombres[1];
				break;
		}
		//affichage du resultat
		this.fenetre.getLabel().setText("resultat: " + resultat);
	}
}

package fenetre;

import java.util.ArrayList;
import javax.swing.*;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	private ArrayList<JButton> boutons = new ArrayList<JButton>();
	public Fenetre(int nbBouton) {
		super("Test");
		JButton bouton;
		this.setSize(500, 500);
		this.setVisible(true);
		for(int i=0; i<nbBouton; i++) {
			System.out.println(i);
			bouton = new JButton("B"+i);
			bouton.setSize(50,50);
			this.add(bouton);
			this.boutons.add(bouton);
		}
	}
	public void suppr(int index) {
		
	}
}

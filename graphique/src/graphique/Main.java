package graphique;
import fenetre.CalculatriceFenetre;
import javax.swing.*;
public class Main {
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				CalculatriceFenetre fenetre = new CalculatriceFenetre();
				fenetre.setVisible(true);
			}
		});
	}
}
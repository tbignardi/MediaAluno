package media;

import javax.swing.JOptionPane;

public class JanelinhaMedia {

	public static void main(String[] args) {
		
		Media media = new Media();
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
		double numero3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
		
		double resultado = media.somar(numero1, numero2, numero3);
		
		JOptionPane.showMessageDialog(null, "Sua media eh: " + resultado);
			

	}

}

package Decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		if (media>=6) {
			System.out.println("Aprovado com media: " + media);
		}
		if (media<4) {
			System.out.println("Infelizmente voc� foi reprovado com a media: " + media);
		}
		
	}

}

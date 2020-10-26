package Decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = JOptionPane.showInputDialog("Digite nome:").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2:"));	
		float media = (nota1+nota2)/2;
				
		if (media>=6 ) {
			System.out.println("Aprovado com média: " + media);
		}
		
		if (media<=4 ) {
			System.out.println("Reprovado com média: " + media);
		}
		
		// AND = &&
		// OR  = ||
		
		if (media>=4 && media<6 ) {
			System.out.println("Ainda tem chance no exame: " + media);
				
		
		}
		
	}

}

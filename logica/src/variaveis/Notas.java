package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input=> nome, disciplina, duas notas. 
		// Exibir o nome do aluno, a média e a disciplina.

		String nome = JOptionPane.showInputDialog("Digite nome:");
		String materia = JOptionPane.showInputDialog("Digite disciplina:");
		
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:"));
				
		double media = (nota1+nota2)/2;
				
		System.out.println("Nome do aluno.: " + nome);
		System.out.println("Disciplina....: " + materia);
		System.out.println("Média.........: " + media);  
		
		System.out.printf("%s sua média na disciplina %s foi de %.2f", nome, materia, media);
		
		
	}

}

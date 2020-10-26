package variaveis;

import javax.swing.JOptionPane;

public class Variavel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = JOptionPane.showInputDialog("Digite seu Nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));
		double imc = peso / (altura*altura);
		System.out.println("Usuário.: " + nome);
		System.out.println("Idade...: " + idade); 
		System.out.printf("IMC.....: %.2f", imc);
		
	}

}

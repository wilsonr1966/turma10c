package Decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = JOptionPane.showInputDialog("Digite nome:").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade:"));
			
		if (idade<=15) {
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Proibido Votar");
		}		
		
		if (idade==16 || idade==17 || idade>=70 ) {
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Voto facultativo");
		}		
		
		if (idade>=18 && idade<70 ) {
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Voto obrigatório");
		}		
		
	}

}

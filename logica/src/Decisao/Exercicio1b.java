package Decisao;

import javax.swing.JOptionPane;

public class Exercicio1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// AND = &&
		// OR  = ||

		String nome = JOptionPane.showInputDialog("Digite nome:").toUpperCase();
		short qtded = Short.parseShort(JOptionPane.showInputDialog("Qtde di�rias:"));
		
		float valorDiaria= (float) 0;
		System.out.println("H�spede: " + nome);		
		
		if (qtded<15) {
			valorDiaria= (float) 85.5;
		}else
			if (qtded==15) {
				valorDiaria = 86;
			}else 	{
				valorDiaria = 88;
			}
		System.out.println("Total: " + valorDiaria * qtded);	
		
	}

}

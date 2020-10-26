package variaveis;

import javax.swing.JOptionPane;

public class VendaProduto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String produto = JOptionPane.showInputDialog("Digite o produto:");
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código:"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário:"));
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
		double total = qtde*valor;
				
		System.out.println("Nome do produto....: " + produto);
		System.out.println("Total..............: " + total);  
		System.out.println("Total com desconto.: " + (total*0.9));
		
		
	}

}

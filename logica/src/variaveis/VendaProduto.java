package variaveis;

public class VendaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String produto = "Churros";
		int codigo = 1;
		double valor = 8.50;
		int qtde = 10;
		double total = qtde*valor;
				
		System.out.println("Nome do produto....: " + produto);
		System.out.println("Total..............: " + total);  
		System.out.println("Total com desconto.: " + (total*0.9));
		
	}

}

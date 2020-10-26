package variaveis;

public class Variavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String nome = "Wilson";
		int idade = 54;
		double altura = 1.70;
		double peso = 80;
		double imc = peso / (altura*altura);
		System.out.println("Usuário.: " + nome);
		System.out.println("Idade...: " + idade); 
		System.out.printf("IMC.....: %.2f", imc);
	}

}

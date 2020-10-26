package variaveis;

public class ManipulaStrig2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "umberto@fiap.com.br";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Minuscula: " + email.toUpperCase());
		System.out.println("Qtde de caracteres" + email.length());
		System.out.println("Posição do @: " + email.indexOf("@"));
		System.out.println("Exibir do 2o ao 4o caracter: " + email.substring(1,4));
		System.out.println("Exibir do 3o caracter em diante: " + email.substring(2));
		System.out.println("Exibir a primeira metade: " + email.substring(0,email.length()/2));
		System.out.println("Exibir usuario: " + email.substring(0,email.indexOf("@")));
		System.out.println("Exibir servidor: " + email.substring(email.indexOf("@")));
		System.out.println("Exibir servidor sem @: " + email.substring(email.indexOf("@")+1));
		System.out.println("Primeiro caracter: " + email.charAt(4));
		System.out.println("Comparação: " + (email.equals("regina@gama.academy")));
		
		
	}

}

package br.com.excecoes.implementacao;

public class TesteExcecao {

	public static void main(String[] args) {
		
	try {
		int numero = Integer.parseInt("7");
		System.out.println("Resultado = " + (numero * 10));
		
		String email="";
		System.out.println("Usuário: " + email.substring(0, email.indexOf("@")));
	
	}catch(NullPointerException e) {
		System.out.println("Objeto Nulo");
		
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("Coordenada Invalida");
	}catch(NumberFormatException e) {
		System.out.println("Número invalido");
	}catch(Exception e) {
		System.out.println("Deu ruim");
		e.printStackTrace();
	}finally {
		System.out.println("Até logo");
	}
	

	
		
	}

}

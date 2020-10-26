package br.com.unixyz.modelo;

// implemantação = principal = teste (camada onde tem o main ())
// modelo = beans = javabeans = tdto = to

/*
 * Design Patterns ==> DTO (Data Transfer Object)
 *  - Todo atributo DEVE ser privado.
 *  - Cada atributo deve possuir:
 *    		1 metodo de input (preencher) e 1 de output (retornar)
 *                 			   (setter)                  (getter)
 *   - ????
 */ 

public class Aluno {

	private int rm;
	private String nome;
	private String email;
	
	public Aluno() {
		super(); 
	}
	
	public Aluno(int rm, String nome, String email) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}

	public void SetAll(int rm, String nome, String email) {
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}
	
	public String getAll() {
		return 
				"RM    : " + rm + "\n" +
				"Nome  : " + nome + "\n" +
				"Email : " + email;			
	}
	
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
	
}

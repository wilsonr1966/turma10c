package br.com.unixyz.modelo;

public class Medio extends Formacao{
	
	private String tipo;

	public void calcMensalidade(float fator) {
		super.setMensalidade(super.getMensalidade() * 500 * (float) fator);
	}
	
	public String get()
	
	xxxxx falta definicao
	
	public void setAll(String descricao, int duracao, float mensalidade, String tipo) {
		super.setAll(descricao, duracao, mensalidade);
		this.tipo = tipo;
	}

	public Medio() {
		super();
	}

	public Medio(String descricao, int duracao, float mensalidade, String tipo) {
		super(descricao, duracao, mensalidade);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}

package br.com.unixyz.modelo;

public class Bacharelado extends Formacao {
	private int cargaHorariaEstagio;
	private String trabalhoConclusao;
	
	public void calcMensalidade (double fator) {
		super.setmensalidade(super.getMensalidade() * 600 (float) fator) + (cargaHorariaEstagio*4) ;
	}
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				
				
	}
	
	
	
	public void setAll(String descricao, int duracao, float mensalidade, int cargaHorariaEstagio,
			String trabalhoConclusao) {
		super.setAll(descricao, duracao, mensalidade);
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		this.trabalhoConclusao = trabalhoConclusao;
	}
	
	public Bacharelado() {
		super();
	}
	public Bacharelado(String descricao, int duracao, float mensalidade, int cargaHorariaEstagio,
			String trabalhoConclusao) {
		super(descricao, duracao, mensalidade);
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		this.trabalhoConclusao = trabalhoConclusao;
	}
	
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public String getTrabalhoConclusao() {
		return trabalhoConclusao;
	}
	public void setTrabalhoConclusao(String trabalhoConclusao) {
		this.trabalhoConclusao = trabalhoConclusao;
	}
	
	
	
	
}

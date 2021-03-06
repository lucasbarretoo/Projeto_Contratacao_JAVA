package entities.enums;

public enum TipoDeDocumento {
	RG("Registro Geral"),
	CPF("Cadastro de Pessoa F?sica"),
	CNPJ("Cadastro de Pessoa Jur?dica");
	
	private String Descricao;
	
	TipoDeDocumento(String DESCRICAO) {
		this.setDescricao(DESCRICAO);
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

}

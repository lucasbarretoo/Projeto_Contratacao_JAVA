package entities.enums;

public enum TipoDeDocumento {
	RG("Registro Geral"),
	CPF("Cadastro de Pessoa Física"),
	CNPJ("Cadastro de Pessoa Jurídica");
	
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

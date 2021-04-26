package entities;

import entities.enums.TipoDeDocumento;

public class Funcionario {

	private String Nome;
	private String NumeroDocumento;
	private TipoDeDocumento Documento;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getNumeroDocumento() {
		return NumeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		NumeroDocumento = numeroDocumento;
	}
	public TipoDeDocumento getDocumento() {
		return Documento;
	}
	public void setDocumento(TipoDeDocumento documento) {
		Documento = documento;
	}
	@Override
	public String toString() {
		return "Funcionario [Nome=" + Nome + ", NumeroDocumento=" + NumeroDocumento + ", Documento=" + Documento + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Documento == null) ? 0 : Documento.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + ((NumeroDocumento == null) ? 0 : NumeroDocumento.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (Documento != other.Documento)
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (NumeroDocumento == null) {
			if (other.NumeroDocumento != null)
				return false;
		} else if (!NumeroDocumento.equals(other.NumeroDocumento))
			return false;
		return true;
	}
	
	public Funcionario(String NOME, String NUMERO_DOCUMENTO, TipoDeDocumento DOCUMENTO) {
		this.setNome(NOME);
		this.setNumeroDocumento(NUMERO_DOCUMENTO);
		this.setDocumento(DOCUMENTO);
	}
}

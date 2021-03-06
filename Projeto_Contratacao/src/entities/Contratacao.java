package entities;

import static entities.enums.Status.PENDENTE;
import static entities.enums.Status.DEMITIDO;
import static entities.enums.Status.CONTRATADO;

import java.util.Date;

import entities.enums.Cargo;
import entities.enums.Status;

public class Contratacao {
	private Date Data;
	private Cargo Cargo;
	private Status Status;
	private Projeto Projeto;
	private Funcionario Funcionario;
	
	public Date getData() {
		return Data;
	}
	public void setData(Date data) {
		Data = data;
	}
	public Cargo getCargo() {
		return Cargo;
	}
	public void setCargo(Cargo cargo) {
		Cargo = cargo;
	}
	public Status getStatus() {
		return Status;
	}
	public void setStatus(Status status) {
		Status = status;
	}
	public Funcionario getFuncionario() {
		return Funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		Funcionario = funcionario;
	}
	
	@Override
	public String toString() {
		return "Contratacao [Data=" + Data + ", Cargo=" + Cargo + ", Status=" + Status + ", Projeto=" + Projeto
				+ ", Funcionario=" + Funcionario + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cargo == null) ? 0 : Cargo.hashCode());
		result = prime * result + ((Data == null) ? 0 : Data.hashCode());
		result = prime * result + ((Funcionario == null) ? 0 : Funcionario.hashCode());
		result = prime * result + ((Projeto == null) ? 0 : Projeto.hashCode());
		result = prime * result + ((Status == null) ? 0 : Status.hashCode());
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
		Contratacao other = (Contratacao) obj;
		if (Cargo != other.Cargo)
			return false;
		if (Data == null) {
			if (other.Data != null)
				return false;
		} else if (!Data.equals(other.Data))
			return false;
		if (Funcionario == null) {
			if (other.Funcionario != null)
				return false;
		} else if (!Funcionario.equals(other.Funcionario))
			return false;
		if (Projeto == null) {
			if (other.Projeto != null)
				return false;
		} else if (!Projeto.equals(other.Projeto))
			return false;
		if (Status != other.Status)
			return false;
		return true;
	}
	
	public Projeto getProjeto() {
		return Projeto;
	}
	public void setProjeto(Projeto projeto) {
		Projeto = projeto;
	}
	
	public Contratacao(Date DATA, Cargo CARGO, Funcionario FUNCIONARIO, Projeto PROJETO) {
		this.setData(DATA);
		this.setCargo(CARGO);
		this.pendente();
		this.setFuncionario(FUNCIONARIO);
		this.setProjeto(PROJETO);
		this.Projeto.AdicionarContratacao(this);
	}
	public void pendente() {
		if(this.getStatus() != PENDENTE) {
			this.setStatus(PENDENTE);
		}else {
			System.out.println("N?o foi possivel realizar altera??o de Status para 'PENDENTE'");
		}
	}
	public void contratar() {
		this.setStatus(CONTRATADO);
	}
	public void demitir() {
		if(this.getStatus() != DEMITIDO) {
			this.setStatus(DEMITIDO);
		}else {
			System.out.println("N?o foi possivel realizar altera??o de Status para 'DEMITIDO'");
		}
	}
}

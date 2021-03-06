package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.Status;

public class Projeto {
	
	private String nome;
	private Date dt_Inicio;
	private Date dt_Termino;
	private List<Contratacao> ListaContratacao = new ArrayList<>();

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDt_Inicio() {
		return dt_Inicio;
	}
	public void setDt_Inicio(Date dt_Inicio) {
		this.dt_Inicio = dt_Inicio;
	}
	public Date getDt_Termino() {
		return dt_Termino;
	}
	public void setDt_Termino(Date dt_Termino) {
		this.dt_Termino = dt_Termino;
	}
	public List<Contratacao> getListaContratacao() {
		return ListaContratacao;
	}
	public void setListaContratacao(List<Contratacao> listaContratacao) {
		ListaContratacao = listaContratacao;
	}
	
	@Override

	public String toString() {
		return "Projeto [nome=" + nome + ", dt_Inicio=" + dt_Inicio + ", dt_Termino=" + dt_Termino + "]";
	}	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dt_Inicio == null) ? 0 : dt_Inicio.hashCode());
		result = prime * result + ((dt_Termino == null) ? 0 : dt_Termino.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Projeto other = (Projeto) obj;
		if (dt_Inicio == null) {
			if (other.dt_Inicio != null)
				return false;
		} else if (!dt_Inicio.equals(other.dt_Inicio))
			return false;
		if (dt_Termino == null) {
			if (other.dt_Termino != null)
				return false;
		} else if (!dt_Termino.equals(other.dt_Termino))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public Projeto(String NOME, Date DT_INICIO, Date DT_TERMINO) {
		this.nome = NOME;
		this.dt_Inicio = DT_INICIO;
		this.dt_Termino = DT_TERMINO;
	}
	public boolean AdicionarContratacao(Contratacao CONTRATACAO) {
		if(ListaContratacao.add(CONTRATACAO)){
			return true;
		}else {
			return false;
		}
	}
	public boolean RemoverContratacao(Contratacao CONTRATACAO) {
		if(ListaContratacao.remove(CONTRATACAO)){
			return true;
		}else {
			return false;
		}
	}
	public void ListarContratacao() {
		System.out.println();
		if (ListaContratacao.isEmpty()) {
			System.out.println("O Projeto " + this.nome + " n?o possui nenhum funcion?rio cadastrado");
		}
		else {
			System.out.println("***Contrata??es***");
			System.out.println("Projeto:");
			System.out.println("       " + this.getNome());
			System.out.println("Funcion?rio(s): ");
			for (Contratacao c : this.ListaContratacao ) {
				if(c.getStatus() != Status.DEMITIDO ) {
					System.out.println("       " + c.getFuncionario().getNome() + "["+ c.getStatus() + "]");
				}
					
			}
		}
	}

	
}

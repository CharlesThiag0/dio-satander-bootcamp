package edu.estudos.collections.convidados;

import java.util.Objects;

public class Convidado {
	private String nome;
	private Integer codigo;
	
	public Convidado(String nome, Integer codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigo=" + codigo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCodigo());
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		
		if(!(obj instanceof Convidado convidado)) 
			return false;
		
		
		return getCodigo() == convidado.getCodigo();
	}
}

package edu.estudos.collections.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadosSet;

	public ConjuntoConvidados() {
		this.convidadosSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigo) {
		convidadosSet.add(new Convidado(nome, codigo));
	}
	
	public void removerConvidado(int codigo) {
		Convidado convidadoParaRemover = null;
		
		for(Convidado convidado : convidadosSet) {
			if(convidado.getCodigo() ==codigo ) {
				convidadoParaRemover = convidado;
				break;
			}
		}
	
		convidadosSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadosSet.size();
	}
	
	public void exibirConvidados() {
		convidadosSet.forEach(x -> System.out.println(x));
	}
	
}

package edu.estudos.collections.palavras;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> palavras;

	public ConjuntoPalavrasUnicas() {
		this.palavras = new HashSet<>();
	}

	private void testaSet() {
		if (palavras.isEmpty())
			throw new RuntimeException("Set esta vazio!");

	}

	public void adicionarPalavra(String palavra) {
		palavras.add(palavra);
	}

	public void removerPalavra(String palavra) {
		testaSet();

		for (String stg : palavras) {
			if (stg.equals(palavra)) {
				palavras.remove(stg);

				return;
			}
		}
		
		System.out.println("Palavra não encontrada");
	}
	
	public boolean verificarPalavra(String palavra) {
		testaSet();
		
		if(palavras.contains(palavra)) {
			return true;
		}
		
		return false;
	}
	
	public void exibirPalavrasUnicas() {
		palavras.forEach(x -> System.out.println(x.toString()));
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(palavras);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		
		if (obj == null) return false;
		
		if (getClass() != obj.getClass())
			return false;
		ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
		return Objects.equals(palavras, other.palavras);
	}
	
	
	
}

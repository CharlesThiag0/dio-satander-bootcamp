package edu.estudos.debug;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Pessoa> listPessoas = PessoaUtils.criarPessoas(10);
		PessoaUtils utils = new PessoaUtils(listPessoas);
	
		System.out.println(utils.mediaIdade());
		
		
		
//		for(Pessoa pessoa : listPessoas) {
//			System.out.println(pessoa);
//		}
	}
}

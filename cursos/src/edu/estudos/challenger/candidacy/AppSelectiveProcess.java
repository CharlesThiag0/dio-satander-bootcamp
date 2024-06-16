package edu.estudos.challenger.candidacy;

import java.util.List;

public class AppSelectiveProcess {

	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		
		SelectiveProcess process = new SelectiveProcess();
		
		List<Candidacy> candidacys = process.createCandidates(10);
		
		process.printCandadacys();
		
		process.selectiveProcess(candidacys);
		
		process.printCandadacys();
		
		System.out.println("teste de tentativas ___________________________");
		
		process.gettingTouch();
	}

}

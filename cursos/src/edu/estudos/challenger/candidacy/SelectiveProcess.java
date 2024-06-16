package edu.estudos.challenger.candidacy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectiveProcess {
	private final Double SALARY = 2000.0;
	private List<Candidacy> candidacys = new ArrayList<>();

	public SelectiveProcess() {
	}

	public void analyzeCandidate(double intendedSalary) {
		if (SALARY > intendedSalary) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (SALARY == intendedSalary) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO O RESULTADO DEMAIS CANDIDATOS");
		}
	}

	public void addCandidacy(Candidacy candidacy) {
		candidacys.add(candidacy);
	}

	public List<Candidacy> selectiveProcess(List<Candidacy> candidacies) {
		List<Candidacy> newCandidacies = new ArrayList<>();

		int candidateSelective = 0;
		int i = 0;
		while (candidateSelective < 5 && i < this.candidacys.size()) {
			Candidacy candidacy = candidacies.get(i);

			if (SALARY >= candidacy.getIntendedSalary()) {

				newCandidacies.add(candidacy);
				candidateSelective++;
				System.out
						.println("O candidato " + candidacy + " solicitou o valor : " + candidacy.getIntendedSalary());
				System.out.println("E foi selecionado para vaga");

			} else if (SALARY < candidacy.getIntendedSalary() && candidacy.isProposal()) {
				candidacy.setIntendedSalary(2000.0);
				newCandidacies.add(candidacy);
				candidateSelective++;

				System.out
						.println("O candidato " + candidacy + " solicitou o valor : " + candidacy.getIntendedSalary());
				System.out.println("E foi selecionado para vaga");
			}

			i++;
		}

		this.candidacys = newCandidacies;
		return newCandidacies;
	}

	public List<Candidacy> createCandidates(int quantity) {
		for (int i = 1; i <= quantity; i++) {
			candidacys.add(new Candidacy("Pessoa" + i, 20 + i));
		}

		return this.candidacys;
	}

	public void printCandadacys() {
		System.out.println("Imprimindo cadidatos informando o indice do elemento");

		int i = 0;
		for (Candidacy candidacy : this.candidacys) {
			System.out.println("O candidato de n- " + (++i) + " é " + candidacy.getName());

		}

	}

	// metudo auxiliar
	private boolean toMeet() {
		return new Random().nextInt(3) == 1;
	}

	public void gettingTouch() {

		for (Candidacy candidacy : candidacys) {

			int attempts = 0;
			boolean toTry = true;
			boolean answered = false;

			do {
				answered = toMeet();
				toTry = !answered;
				attempts++;
				
				if (answered) {
					System.out.println("\nCONTATO REALIZADO COM SUCESSO");
				} 

			} while (toTry && attempts < 3);

			if (answered) {
				System.out.printf("CONSEGUIMOS CONTATO COM O %s EM UM TOTAL DE %d TENTATIVAS\n",
						candidacy.getName(), attempts);
			} else {
				System.out.printf("\nNAO CONSEGUIMOS CONTATO COM O %s NO TOTAL MAXIMO(%d) DE TENTATIVAS\n",
						candidacy.getName(), attempts);
			}
		}

	}

}

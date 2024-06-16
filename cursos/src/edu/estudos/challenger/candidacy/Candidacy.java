package edu.estudos.challenger.candidacy;

import java.util.concurrent.ThreadLocalRandom;

public class Candidacy {
	private String name;
	private Integer age;
	private Double intendedSalary;
	private boolean proposal;
	
 	public Candidacy(String name, Integer age) {
		this.name = name;
		this.age = age;
		this.intendedSalary = ThreadLocalRandom.current().nextDouble(1900, 2200); // definir valor aleatorio
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
	
	public Double getIntendedSalary() {
		return intendedSalary;
	}
	
	public void setIntendedSalary(Double intendedSalary) {
		this.intendedSalary = intendedSalary;
	}

	public boolean isProposal() {
		return proposal;
	}

	@Override
	public String toString() {
		return "Candidato [name = " + name + ", idade = " + age + ", salario pretendido = " + intendedSalary + "]";
	}

	public void acceptProposal() {
		proposal = true;
	}
}

package edu.estudos.debug;

public class Pessoa {
	private String name;
	private String cpf;
	private Integer age;
	
	public Pessoa(String name, String cpf, Integer age) {
		this.name = name;
		this.cpf = cpf;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Integer getAge() {
		return age;
	}

	
	
}

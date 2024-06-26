package edu.desafio;

public class Main {
	public static void main(String[] args) {
		Curso curso = new Curso("curso java", "descricao java", 1);
		Curso curso2 = new Curso("curso js", "descricao js", 1);

		Mentoria mentoria = new Mentoria("mentoria java", "descrição mentoria java");
		Mentoria mentoria2 = new Mentoria("mentoria js", "descrição mentoria js");
		
//		System.out.println(mentoria2);	
//		System.out.println(mentoria);		
//		System.out.println(curso2);		
//		System.out.println(curso);
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp", "descrção Bootcamp");
		bootcamp.getConteudos().add(mentoria);
		bootcamp.getConteudos().add(mentoria2);
		
		Dev devCamilla = new Dev("Cammila");
		bootcamp.getDevsInscritos().add(devCamilla);
		devCamilla.inscreverBootcamp(bootcamp);
		
		Dev devJoao = new Dev("João");
		bootcamp.getDevsInscritos().add(devJoao);
		devJoao.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos inscritos Cammila " + devCamilla.getConteudos());
		devCamilla.progredir();
		System.out.println("Conteudos inscritos Cammila " + devCamilla.getConteudos());
		System.out.println("Conteudos concluidos Cammila" + devCamilla.getConteudosConcluidos());
		devCamilla.progredir();
		System.out.println("XP CAMMILA " + devCamilla.calcularTotalXp());

		
		System.out.println("Conteudos inscritos João " + devJoao.getConteudos());
		devJoao.progredir();
		System.out.println("Conteudos inscritos João " + devJoao.getConteudos());
		System.out.println("Conteudos concluidos João" + devJoao.getConteudosConcluidos());
		System.out.println("XP JOAO " + devJoao.calcularTotalXp());

	}
}

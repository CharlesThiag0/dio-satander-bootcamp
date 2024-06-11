package edu.estudos.condicionais;

import java.util.Scanner;

public class AppTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		Task taskList = new Task();
		
		String menu = "\n---------Menu---------"
					+ "\n1. Adicionar Tarefa"
					+ "\n2. Listar Tarefas"
					+ "\n3. Marcar Tarefa como Concluída"
					+ "\n4. Excluir Tarefa"
					+ "\n5. Sair"
					+ "\nEscolha uma opção: ";
		
		while(continuar) {
			String name, description;
			
			System.out.println(menu);
		
			// pegar a opção e ja iniciar o switch
			switch(sc.nextInt()) {
			case 1:
				
				System.out.println("Cadastro da Tarefa");
				System.out.println("Digite o Nome: ");
				name = sc.next();
				
				System.out.println("Digite a Descrição: ");
				sc.nextLine();
				description = sc.nextLine();
				
				taskList.add(new Task(name, description));
				break;
				
			case 2 :
				taskList.allTask();
					
				break;
			
			case 3 :
				System.out.println("Digite o nome da Tarefa: ");
				name = sc.next();
				
				try {
					taskList.conclude(name);
					System.out.printf("Tarefa %s foi Concluida\n", name);
				} catch (Exception e) {
					System.out.print("Tarefa não encontrada");
				}
				
				break;
				
			case 4 :
				System.out.println("Digite o nome da Tarefa: ");
				name = sc.next();
				
				try {
				taskList.delete(name);
				System.out.printf("Tarefa %s foi Excluida\n", name);
				} catch(Exception e) {
					System.out.print(e.getMessage());
				}

				break;
				
			case 5 :
				continuar = false;
				System.out.println("Saindo ... .");
				
				break;
			default:
                System.out.println("Opção inválida. Tente novamente.");
			}
		}
		
		sc.close();
	}

}

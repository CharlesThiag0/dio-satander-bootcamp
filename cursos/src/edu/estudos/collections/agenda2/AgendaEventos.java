package edu.estudos.collections.agenda2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Agenda> agendas;

	public AgendaEventos() {
		this.agendas = new HashMap<LocalDate, Agenda>();
	}

	public void adicionarEvento(LocalDate local, String nome, String atracao) {
		agendas.put(local, new Agenda(nome, atracao));
	}

	public Map<LocalDate, Agenda> exibirAgenda() {
		Map<LocalDate, Agenda> agendas = new TreeMap<>(this.agendas);

		return agendas;
	}

	public void remove(LocalDate local) {
		agendas.remove(local);
	}

	public void obterProximoEvento() {
		LocalDate atual = LocalDate.now();
		
		Map<LocalDate, Agenda> agendaOrganizada = this.exibirAgenda();
		
		for(Map.Entry<LocalDate, Agenda> entry : agendaOrganizada.entrySet()) {
			 
			if(entry.getKey().isAfter(atual)) {
				System.out.println("O proximo evento: " + entry.getValue() + "aconteceram em: " + entry.getKey());
			}
			
		}
		
		
	}
}

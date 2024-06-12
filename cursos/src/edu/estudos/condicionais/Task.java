package edu.estudos.condicionais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task {
	private String name;
	private String description;
	private Boolean concluded = false;
	private List<Task> taskList = new ArrayList<>();

	public Task() {}
	
	public Task(String name, String description) {
		this.name = name;
		this.description = description;
	}

	protected List<Task> getTaskList() {
		return Collections.unmodifiableList(this.taskList);
	}

	protected void add(Task task) {
		taskList.add(task);
	}

	protected Task search(String name) throws Exception{
		if (taskList.isEmpty()) {
			throw new IllegalArgumentException("Lista está vazia");
		}

		for (Task task : this.taskList) {
			if (task.name.equals(name)) {
				return task;
			}
		}

		return null;
	}

	protected void conclude(String name) throws Exception {
		search(name).concluded = true;;
	}

	protected void delete(String name) throws Exception {
		Task task = search(name);
		
		if(task == null) {
			throw new IllegalArgumentException("Tarefa não encontrado");
		}
		
		taskList.remove(task);
	}

	protected void allTask(){
		taskList.forEach(x -> System.out.println(x.name + " status: " + x.concluded));
	}

	@Override
	public String toString() {
		return "Task [name : " + name + ", description : " + description + ", concluded : " + concluded;
	}
}

package edu.estudos.lab;

public class Semaforo {
	public static void main(String[] args) {

	}

	public static String updateLight(String current) {
		
		// gree > yellow > red > green
		return (current.equals("green") ? "yellow" : current.equals("yellow") ? "red" : "green");
	}
	
	

}

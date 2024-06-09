package edu.estudos.lab;

public class SmartTV {
	private Integer volume = 25;
	private Integer canal = 10;
	private Boolean ligada = false;

	public void aumentarVolume() {
		this.volume++;
		System.out.println("Aumentando " + volume);
	}

	public void diminuirVolume() {
		this.volume--;
		System.out.println("Diminuindo " + volume);
	}

	public void mudarCanal() {
		canal++;
		System.out.println("Canal : " + canal);
	}

	public void mudarCanal(int canal) {
		this.canal = canal;
		System.out.println("Canal : " + canal);
	}

	public void ligaDesligaTv() {
		this.ligada = !ligada;

		if (ligada == true) {
			System.out.println("Ligando... .");
		} else {
			System.out.println("Desligando... .");
		}

	}

}

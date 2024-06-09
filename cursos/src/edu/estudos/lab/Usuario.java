package edu.estudos.lab;

public class Usuario {
	public static void main(String[] args) {
		
		SmartTV smartTv = new SmartTV();
		
		smartTv.ligaDesligaTv();
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		
		smartTv.diminuirVolume();
		
		smartTv.mudarCanal();
		smartTv.mudarCanal(90);
		
		smartTv.ligaDesligaTv();
	}
}

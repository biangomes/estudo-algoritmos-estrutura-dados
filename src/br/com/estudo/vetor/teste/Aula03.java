package br.com.estudo.vetor.teste;

import br.com.estudo.vetor.Vetor;

public class Aula03 {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);
		
		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("");
			vetor.adiciona("elemento 3");			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

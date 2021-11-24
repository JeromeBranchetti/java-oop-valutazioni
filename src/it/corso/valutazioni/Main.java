package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		CalcolaValutazione[] registroA = new CalcolaValutazione[20];
		int id;
		int assenzeRand;
		double votoRand;
		
		for (int i = 0; i < registroA.length; i++) {
			id = i + 1;
			assenzeRand = random.nextInt(101);
			votoRand = 0.1 * random.nextInt(51);
			
			registroA[i] = new CalcolaValutazione(id , assenzeRand, votoRand);
		}
		for (int j = 0; j < registroA.length; j++) {
			
			System.out.println("Lo strundente " + registroA[j].id + " è stato assente " + registroA[j].percAssenze + " volte quindi" + " è stato " + registroA[j].valutazioneFinale() + " col voto di " + registroA[j].votoMedio);
		}

	}

}

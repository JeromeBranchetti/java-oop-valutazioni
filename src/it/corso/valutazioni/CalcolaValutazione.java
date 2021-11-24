package it.corso.valutazioni;

public class CalcolaValutazione {
	//attributi
	
	int id;
	int percAssenze;
	double votoMedio;
	String valutazione = "Promosso";
	
	//costruttore
	
	public CalcolaValutazione(int id, int percAssenze, double votoMedio) {
		this.id = id;
		this.percAssenze = percAssenze;
		this.votoMedio = votoMedio;
	}
	
	//metodi
	 public String valutazioneFinale() {
		 if (percAssenze > 50) {
			 valutazione = "Bocciato";
			
		 }
		 else if (percAssenze > 25 && percAssenze < 50) {
			 if (votoMedio <= 2) {
				 valutazione = "Bocciato";
			 }
		 }
		 else if (percAssenze < 25) {
			 if (votoMedio < 2) {
				 valutazione = "Bocciato";
			 }
		 }
		 return valutazione;
		
	}
}

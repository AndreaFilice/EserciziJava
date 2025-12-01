
public class Animale implements Comparable<Animale>{
	private String nome;
	private int eta; // in anni
	private double peso; // in Kg
	
	// Costruttore di default
	public Animale() {
		nome = "Nessun nome";
		eta = 0;
		peso = 0;
	}
	
	// Costruttore con parametri
	public Animale(String nomeiniziale, int etalniziale, double pesolniziale) {

		nome = nomeiniziale;
		if (etalniziale < 0 || pesolniziale < 0) {
			System.out.println("Errore: età o peso negativi.");
			System.exit(0);
		} else {
			eta = etalniziale;
			peso = pesolniziale;
		}
	}
	// Setter e getter
	public void setAnimale(String nuovoNome, int nuovaEta, double nuovoPeso) {

		nome = nuovoNome;
		if (nuovaEta < 0 || nuovoPeso < 0) {
			System.out.println("Errore: età o peso negativi.");
			System.exit(0);
		} else {
			eta = nuovaEta;
			peso = nuovoPeso;
		}
	}
	
	public void setNome(String nuovoNome) {
		nome = nuovoNome;
	}
	
	public void setEta(int nuovaEta) {
		if (nuovaEta < 0) {
			System.out.println("Errore: età negativa.");
			System.exit(0);
		} else {
			eta = nuovaEta;
		}
	}

	public void setPeso(double nuovoPeso) {
		if (nuovoPeso < 0) {
			System.out.println("Errore: peso negativo.");
			System.exit(0);
		} else {
			peso = nuovoPeso;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void scriviOutput() {
		System.out.println("Nome: " + nome);
		System.out.println("Età: " + eta + " anni");
		System.out.println("Peso: " + peso + " Kg");
	}
	
	@Override
	public int compareTo(Animale o) {
		return this.nome.compareToIgnoreCase(o.nome);
	}
}

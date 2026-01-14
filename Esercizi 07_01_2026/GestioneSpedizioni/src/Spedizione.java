import java.util.Scanner;

public class Spedizione {
    //ATTRIBUTES
    private Veicolo veicoloAssegnato = new Veicolo();
    private String codiceSpedizione;
    private double caricoNetto;
    private String dataPartenza;
    private Scanner t = new Scanner(System.in);

    //CONSTRUCTOR
    public Spedizione(Veicolo veicolo, String codiceSpedizione, double caricoNetto, String dataPartenza) {
            if(caricoNetto < 0){
                System.out.println("ERRORE. Carico netto inferiore a 0.");
                System.exit(0);
            }
            else{
                veicoloAssegnato = veicolo;
                this.codiceSpedizione = codiceSpedizione;
                this.caricoNetto = caricoNetto;
                this.dataPartenza = dataPartenza;
            }
    }

    public Spedizione(){}

    //METODI
    public void setVeicoloAssegnato(Veicolo veicoloAssegnato) {this.veicoloAssegnato = veicoloAssegnato;}
    public void setCodiceSpedizione(String codiceSpedizione) {this.codiceSpedizione = codiceSpedizione;}
    public void setCaricoNetto(double caricoNetto) {this.caricoNetto = caricoNetto;}
    public void setDataPartenza(String dataPartenza) {this.dataPartenza = dataPartenza;}

    public Veicolo getVeicoloAssegnato() {return veicoloAssegnato;}
    public String getCodiceSpedizione() {return codiceSpedizione;}
    public double getCaricoNetto() {return caricoNetto;}
    public String getDataPartenza() {return dataPartenza;}

    public void leggiInput(){
        System.out.println("Inserisci il carico netto: ");
        double peso = t.nextDouble();
        t.nextLine();
        if(peso < 0){
            System.out.println("ERRORE. Peso negativo.");
            System.exit(0);
        }
        else{
            setCaricoNetto(peso);
            System.out.println("Inserisci il codice di spedizione: ");
            String codiceSpedizione = t.nextLine();
            setCodiceSpedizione(codiceSpedizione);
            System.out.println("Inserisci la data di partenza: ");
            String dataPartenza = t.nextLine();
            setDataPartenza(dataPartenza);
            System.out.println("--INSERIMENTO DATI VEICOLO--");
            Veicolo nuovoVeicolo = new Veicolo();
            nuovoVeicolo.leggiInput();
            this.veicoloAssegnato = nuovoVeicolo;
        }
    }

    public void scriviOutput(){
        System.out.println("Carico netto: " + getCaricoNetto() + "kg, Codice spedizione: " + getCodiceSpedizione() + ", Data di partenza: " + getDataPartenza());
    }

    public boolean equals(Spedizione altroOggetto){
        return (this.codiceSpedizione.equals(altroOggetto.codiceSpedizione) && this.caricoNetto == altroOggetto.caricoNetto);
    }
}

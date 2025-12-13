public class Opera {
    //ATTRIBUTES
    private int codice;
    private String titolo;
    private double prezzo;
    private String autore;

    //CONSTRUCTOR
    public Opera(int codice, String titolo, double prezzo, String autore) {
        if(prezzo < 0){
            System.out.println("Prezzo non valido.");
            System.exit(0);
        }
        else{
            this.codice = codice;
            this.titolo = titolo;
            this.prezzo = prezzo;
            this.autore = autore;
        }
    }
    public Opera(){}

    //SETTER and GETTERS
    public void setCodice(int codice) {this.codice = codice;}
    public void setTitolo(String titolo) {this.titolo = titolo;}
    public void setPrezzo(double prezzo) {this.prezzo = prezzo;}
    public void setAutore(String autore) {this.autore = autore;}
    public void setOpera(String titolo, int codice, double prezzo, String autore) {
        if(prezzo < 0){
            System.out.println("Prezzo non valido.");
            System.exit(0);
        }
        else{
            this.codice = codice;
            this.titolo = titolo;
            this.prezzo = prezzo;
            this.autore = autore;
        }
    }

    public int getCodice() {return this.codice;}
    public String getTitolo() {return this.titolo;}
    public double getPrezzo() {return this.prezzo;}
    public String getAutore() {return this.autore;}
}

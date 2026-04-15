public class Nodo {
    //ATTRIBUTI
    private Paziente valori;
    private Nodo collegamento;

    //COSTRUTTORE
    public Nodo(Paziente valori, Nodo collegamento) {
        this.valori = valori;
        this.collegamento = collegamento;
    }

    public Nodo() {
        this.valori = null;
        this.collegamento = null;
    }

    //SETTER e GETTER
    public Paziente getValori() {return valori;}
    public void setValori(Paziente valori) {this.valori = valori;}
    public Nodo getCollegamento() {return collegamento;}
    public void setCollegamento(Nodo collegamento) {this.collegamento = collegamento;}
}

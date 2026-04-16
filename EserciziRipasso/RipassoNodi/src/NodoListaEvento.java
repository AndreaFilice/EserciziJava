public class NodoListaEvento {
    //ATTRIBUTI
    private Evento dati;
    private NodoListaEvento collegamento;

    //COSTRUTTORE
    public NodoListaEvento(Evento dati, NodoListaEvento collegamento) {
        this.dati = dati;
        this.collegamento = collegamento;
    }

    public NodoListaEvento(){
        this.dati = null;
        this.collegamento = null;
    }

    //SET e GET
    public Evento getDati() {return dati;}
    public void setDati(Evento dati) {this.dati = dati;}
    public NodoListaEvento getCollegamento() {return collegamento;}
    public void setCollegamento(NodoListaEvento collegamento) {this.collegamento = collegamento;}
}

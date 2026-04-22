public class NodoListaLibro {
    //ATTRIBUTI
    private Libro dati;
    private NodoListaLibro collegamento;

    //COSTRUTTORI
    public NodoListaLibro() {
        this.dati = null;
        this.collegamento = null;
    }

    public NodoListaLibro(Libro dati, NodoListaLibro collegamento) {
        this.dati = dati;
        this.collegamento = collegamento;
    }

    //METODI GET e SET
    public Libro getDati() {return dati;}
    public void setDati(Libro dati) {this.dati = dati;}
    public NodoListaLibro getCollegamento() {return collegamento;}
    public void setCollegamento(NodoListaLibro collegamento) {this.collegamento = collegamento;}
}

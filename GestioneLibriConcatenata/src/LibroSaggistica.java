public class LibroSaggistica extends Libro {
    //ATTRIBUTI
    private String ambito;

    //COSTRUTTORE
    public LibroSaggistica(String titolo, String isbn, String ambito, int numeroPagine, boolean disponibile) {
        super(titolo, isbn, numeroPagine, disponibile);
        this.ambito = ambito;
    }

    //METODI GET e SET
    public String getAmbito() {return ambito;}
    public void setambito(String ambito) {this.ambito = ambito;}

    //METODI
    @Override
    public String toString() {return String.format("Saggistica;%s;%s;%s;%s;%s", getIsbn(), getTitolo(), getNumeroPagine(), isDisponibile(), getAmbito());}
}

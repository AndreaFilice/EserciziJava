public class LibroNarrativa extends Libro {
    //ATTRIBUTI
    private String genere;

    //COSTRUTTORE
    public  LibroNarrativa(String titolo, String isbn, String genere, int numeroPagine, boolean disponibile) {
        super(titolo, isbn, numeroPagine, disponibile);
        this.genere = genere;
    }

    //METODI GET e SET
    public String getGenere() {return genere;}
    public void setGenere(String genere) {this.genere = genere;}

    //METODI
    @Override
    public String toString() {return String.format("Narrativa;%s;%s;%s;%s;%s", getIsbn(), getTitolo(), getNumeroPagine(), isDisponibile(), getGenere());}
}

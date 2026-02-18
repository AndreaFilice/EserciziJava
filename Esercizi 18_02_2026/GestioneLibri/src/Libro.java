public class Libro extends Pubblicazione{
    //ATTRIBUTI
    private String isbn;
    private int numeroPagine;
    private boolean disponibile;

    //COSTRUTTORE
    public Libro(String titolo, String isbn, int numeroPagine, boolean disponibile) {
        super(titolo);
        this.isbn = isbn;
        this.numeroPagine = numeroPagine;
        this.disponibile = disponibile;
    }

    //METODI GET e SET
    public String getIsbn() {return isbn;}
    public void setIsbn(String isbn) {this.isbn = isbn;}
    public int getNumeroPagine() {return numeroPagine;}
    public void setNumeroPagine(int numeroPagine) {this.numeroPagine = numeroPagine;}
    public boolean isDisponibile() {return disponibile;}
    public void setDisponibile(boolean disponibile) {this.disponibile = disponibile;}

    //METODI
    @Override
    public String toString() {
        return String.format("%s;%s;%s;%s", isbn, getTitolo(), numeroPagine, disponibile);
    }
}

public class Concerto extends Evento{
    //ATTRIBUTI
    private String genereMusicale;

    //COSTRUTTORE
    public Concerto(String titolo, String luogo, String data, String genereMusicale) {
        super(titolo, luogo, data);
        this.genereMusicale = genereMusicale;
    }

    //SET e GET
    public String getGenereMusicale() {return genereMusicale;}
    public void setGenereMusicale(String genereMusicale) {this.genereMusicale = genereMusicale;}

    //METODI ABSTRACTS
    @Override
    public String toString() {
        return String.format("Titolo: %s\nLuogo: %s\nData: %s\nGenere musicale: %s", getTitolo(), getLuogo(), getData(), genereMusicale);
    }
}

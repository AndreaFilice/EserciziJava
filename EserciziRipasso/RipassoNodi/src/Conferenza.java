public class Conferenza extends Evento{
    //ATTRIBUTI
    private String relatore;

    //COSTRUTTORE
    public Conferenza(String titolo, String luogo, String data, String relatore) {
        super(titolo, luogo, data);
        this.relatore = relatore;
    }

    //SET e GET
    public String getRelatore() {return relatore;}
    public void setRelatore(String relatore) {this.relatore = relatore;}

    //METODI ABSTRACTS
    @Override
    public String toString() {
        return String.format("Titolo: %s\nLuogo: %s\nData: %s\nRelatore: %s", getTitolo(), getLuogo(), getData(), relatore);
    }
}

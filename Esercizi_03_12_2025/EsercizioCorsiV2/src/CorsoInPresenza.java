public class CorsoInPresenza extends Corsi{
    //ATTRIBUTO
    private String indirizzo;

    //COSTRUTTORE
    public CorsoInPresenza(String nome, String docente, int durataOre, String indirizzo){
        super(nome,docente,durataOre);
        this.indirizzo = indirizzo;
    }

    //METODI GET e SET
    public String getIndirizzo(){return this.indirizzo;}
    public void setIndirizzo(String indirizzo){this.indirizzo = indirizzo;}

    //METODO CLASSE ASTRATTA
    @Override
    public String descrivi() {
        return "Indirizzo del corso: " + indirizzo;
    }
}

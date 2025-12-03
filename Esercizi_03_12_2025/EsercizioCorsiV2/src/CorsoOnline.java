public class CorsoOnline extends Corsi{
    //ATTRIBUTI
    private String piattaforma;
    private boolean live;

    //COSTRUTTORE
    public CorsoOnline(String nome, String docente, int durataOre, String piattaforma, boolean live){
        super(nome, docente, durataOre);
        this.piattaforma = piattaforma;
        this.live = live;
    }

    //METODI GET e SET
    public void setPiattaforma(String piattaforma){this.piattaforma = piattaforma;}
    public void setLive(boolean live){this.live = live;}

    public String getPiattaforma(){return this.piattaforma;}
    public boolean getLive(){return this.live;}

    //METODI CLASSE ASTRATTA
    @Override
    public String descrivi() {
        return "Nome alunno: " + this.getNome() + ", Docente: " + this.getDocente() + ", Piattaforma: "
                + piattaforma + ", è in live? " + ((live == true) ? "sì" : "no");
    }
}

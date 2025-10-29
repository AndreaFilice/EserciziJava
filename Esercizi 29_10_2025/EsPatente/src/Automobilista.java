public class Automobilista extends Persona{
    //ATTRIBUTI
    private String numeroPatente;
    private int puntiPatente;

    //CONSTRUCTOR
    public Automobilista(){}
    public Automobilista(String nome, String cognome, String numeroPatente, int annoDiNascita, int puntiPatente){
        super(nome, cognome, annoDiNascita);
        this.numeroPatente = numeroPatente;
        this.puntiPatente = puntiPatente;
    }

    //METODI
    public int getPunti(){return puntiPatente;}
    public String getPatente(){return numeroPatente;}
    public void addPunti(int p){this.puntiPatente += p;}
}

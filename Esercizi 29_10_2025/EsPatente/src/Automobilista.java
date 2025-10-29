public class Automobilista extends Persona{
    //ATTRIBUTI
    private String numeroPatente;
    private int puntiPatente;

    //CONSTRUCTOR
    public Automobilista(){}
    public Automobilista(String nome, String cognome, String numeroPatente, int annoDiNascita, int puntiPatente){
        super(nome, cognome, annoDiNascita);
        this.numeroPatente = numeroPatente;
        ctrlPatente();
        this.puntiPatente = puntiPatente;
    }

    //METODI
    public int getPunti(){return puntiPatente;}
    public String getPatente(){return numeroPatente;}
    public void addPunti(int p){this.puntiPatente += p;}

    public void ctrlPatente(){
        //CONTROLLA LUNGHEZZA di 10
        if(numeroPatente.length()!= 10){
            System.out.print("ERRORE: Numero patente non valido. Lunghezza: 10 caratteri.");
            System.exit(0);
        }
        //CONTROLLA LA SINTASSI SE E' CORRETTA
        if(!Character.isLetter(numeroPatente.charAt(0)) &&
                !Character.isLetter(numeroPatente.charAt(3)) &&
                !Character.isLetter(numeroPatente.charAt(9))){
            System.out.print("ERRORE: Numero patente non valido. Sintassi non corretta.");
            System.exit(0);
        }
    }
}

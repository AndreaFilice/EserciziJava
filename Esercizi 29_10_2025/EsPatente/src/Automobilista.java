import java.util.Scanner;

public class Automobilista extends Persona{
    //ATTRIBUTI
    private String numeroPatente;
    private int puntiPatente;

    //CONSTRUCTOR
    public Automobilista(){}
    public Automobilista(String nome, String cognome, String numeroPatente, int annoDiNascita, int puntiPatente){
        super(nome, cognome, annoDiNascita);
        this.numeroPatente = numeroPatente;
        if(ctrlPatente() == false)
            System.exit(0);
        this.puntiPatente = puntiPatente;
    }

    //METODI SET
    public void setNumeroPatente(String numeroPatente){this.numeroPatente = numeroPatente;}
    public void setPuntiPatente(int puntiPatente){this.puntiPatente = puntiPatente;}

    //METODI GET
    public int getPunti(){return puntiPatente;}
    public String getPatente(){return numeroPatente;}
    public void addPunti(int p){this.puntiPatente += p;}

    public boolean ctrlPatente(){
        //CONTROLLA LUNGHEZZA di 10
        if(numeroPatente.length() != 10){
            System.out.println("ERRORE: Numero patente non valido. Lunghezza: 10 caratteri.");
            return false;
        }
        //CONTROLLA LA SINTASSI SE E' CORRETTA
        if(!Character.isLetter(numeroPatente.charAt(0)) &&
                !Character.isLetter(numeroPatente.charAt(3)) &&
                !Character.isLetter(numeroPatente.charAt(9))){
            System.out.println("ERRORE: Numero patente non valido. Sintassi non corretta.");
            return false;
        }
        return true;
    }

    public void scriviOutput(){
        System.out.println("Nome: " + nome + ", Cognome: " + cognome + ", Numero patente: " + numeroPatente + ", Punti patente: " + puntiPatente);
    }

    public void leggiInput(){
        Scanner t = new Scanner(System.in);

        //INSERISCI I DATI
        do{
            System.out.println("Inserisci il numero della patente: ");
            this.numeroPatente = t.next();
        } while(!ctrlPatente());

        System.out.println("Inserisci il nome dell'automobilista: ");
        this.nome = t.next();

        System.out.println("Inserisci il cognome dell'automobilista: ");
        this.cognome = t.next();

        System.out.println("Inserisci l'anno di nascita dell'automobilista: ");
        this.annoDiNascita = t.nextInt();

        System.out.println("Inserisci i punti della patente: ");
        this.puntiPatente = t.nextInt();
    }
}

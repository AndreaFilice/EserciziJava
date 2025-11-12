import java.util.Scanner;

public class Persona {
    //ATTRIBUTI
    protected String nome;
    protected String cognome;
    protected int annoDiNascita;

    //CONSTRUCTOR
    public Persona(){}
    public Persona(String nome, String cognome, int annoDiNascita){
        setPersona(nome, cognome, annoDiNascita);
    }

    //METODI SET
    public void setPersona(String nome, String cognome, int annoDiNascita){
        this.nome = nome;
        this.cognome = cognome;
        this.annoDiNascita = annoDiNascita;
    }

    public void setNome(String nome){this.nome = nome;}
    public void setCognome(String cognome){this.cognome = cognome;}
    public void setAnnoDiNascita(int annoDiNascita){this.annoDiNascita = annoDiNascita;}

    //METODI GET
    public String getNome(){return nome;}
    public String getCognome(){return cognome;}
    public int getAnnoDiNascita(){return annoDiNascita;}

    //METODI
    public void leggiInput(){
        Scanner t = new Scanner(System.in);

        System.out.println("Inserisci l'anno di nascita: ");
        int annoDiNascita = t.nextInt();
        if(annoDiNascita < 0){
            System.out.println("ERRORE. Anno di nascita non valido.");
            System.exit(0);
        }

        System.out.println("Inserisci il nome della Persona: ");
        String nome = t.next();
        System.out.println("Inserisci il cognome della Persona: ");
        String cognome = t.next();

        setPersona(nome, cognome, annoDiNascita);
    }
}

import java.util.Scanner;

public class Persona {
    //ATTRIBUTI
    protected String nome;
    protected String cognome;
    protected String codiceFiscale;

    //CONSTRUCTOR
    public Persona(){}
    public Persona(String nome, String cognome, String codiceFiscale){
        setPersona(nome, cognome, codiceFiscale);
    }

    //METODI SET
    public void setPersona(String nome, String cognome, String codiceFiscale){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public void setNome(String nome){this.nome = nome;}
    public void setCognome(String cognome){this.cognome = cognome;}
    public void setAnnoDiNascita(String codiceFiscale){this.codiceFiscale = codiceFiscale;}

    //METODI GET
    public String getNome(){return nome;}
    public String getCognome(){return cognome;}
    public String getCodiceFiscale(){return codiceFiscale;}

    //METODI
    public void leggiInput(){
        Scanner t = new Scanner(System.in);

        System.out.println("Inserisci codice fiscale: ");
        String codiceFiscale = t.nextLine();

        System.out.println("Inserisci il nome della Persona: ");
        String nome = t.nextLine();
        System.out.println("Inserisci il cognome della Persona: ");
        String cognome = t.nextLine();

        setPersona(nome, cognome, codiceFiscale);
    }
}

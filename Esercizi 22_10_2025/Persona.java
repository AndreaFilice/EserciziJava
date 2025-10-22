import java.util.Scanner;

public class Persona {
    //ATTRIBUTI
    private String nome;
    private String cognome;
    private int annoDiNascita;
    private float peso;
    private float altezza;

    //CONSTRUCTOR
    public Persona(){this("Nome", "Cognome", 0, 0, 0);}

    public Persona(String nome, String cognome, int annoDiNascita, float peso, float altezza){
        setPersona(nome, cognome, annoDiNascita, peso, altezza);
    }

    //METODI SET
    public void setPersona(String nuovoNome, String nuovoCognome, int nuovoAnnoDiNascita, float nuovoPeso, float nuovaAltezza){
        nome = nuovoNome; cognome = nuovoCognome; annoDiNascita = nuovoAnnoDiNascita; peso = nuovoPeso; altezza = nuovaAltezza;
    }

    public void setNome(String nuovoNome){nome = nuovoNome;}
    public void setCognome(String nuovoCognome){cognome = nuovoCognome;}
    public void setAnnoDiNascita(int nuovoAnnoDiNascita){annoDiNascita = nuovoAnnoDiNascita;}
    public void setPeso(float nuovoPeso){peso = nuovoPeso;}
    public void setAltezza(float nuovaAltezza){altezza = nuovaAltezza;}

    //METODI GET
    public String getNome(){return nome;}
    public String getCognome(){return cognome;}
    public int getAnnoDiNascita(){return annoDiNascita;}
    public float getPeso(){return peso;}
    public float getAltezza(){return altezza;}

    //METODI
    public void scriviOutput(){
        System.out.println("Nome: " + nome + ", cognome: " + cognome + ", anno di nascita: " + annoDiNascita + ", peso: " + peso + ", altezza: " + altezza);
    }

    public void leggiInput(){
        Scanner t = new Scanner(System.in);
        System.out.println("Inserisci il nome: ");
        String nome = t.nextLine();
        System.out.println("Inserisci il cognome: ");
        String cognome = t.nextLine();
        System.out.println("Inserisci l'anno di nascita: ");
        int annoDiNascita = t.nextInt();
        System.out.println("Inserisci il peso: ");
        float peso = t.nextFloat();
        System.out.println("Inserisci l'altezza: ");
        float altezza = t.nextFloat();
        setPersona(nome, cognome, annoDiNascita, peso, altezza);
        t.nextLine();
    }

    public int eta(){return  (2025 - annoDiNascita);}

    public boolean maggiorenne(){
        int eta = eta();

        return eta >= 18;
    }

    public float indiceMCorporea(){
        return peso / (altezza * altezza);
    }
}
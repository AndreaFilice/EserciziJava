import java.util.Objects;
import java.util.Scanner;

public class Dipendente extends Persona{
    //ATTRIBUTI
    private String matricola;
    private String email;

    //* CONSTRUCTOR
    public Dipendente(){}
    public Dipendente(String nome, String cognome, int annoDiNascita, String matricola, String email){
        super(nome, cognome, annoDiNascita);
        this.matricola = matricola;
        this.email = email;
    }

    //* METODI GET e SET
    public void setMatricola(String matricola){this.matricola = matricola;}
    public void setEmail(String email){this.email = email;}

    public String getMatricola(){return matricola;}
    public String getEmail(){return email;}

    //* METODI
    @Override
    public void leggiInput(){
        Scanner t = new Scanner(System.in);

        super.leggiInput();

        System.out.println("Inserisci la matricola del dipendente: ");
        String matricola = t.next();
        System.out.println("Inserisci l'email del dipendente: ");
        String email = t.next();

        this.matricola = matricola;
        this.email = email;
    }

    public void scriviOutput(){
        System.out.println("Nome: " + nome + " " + cognome + ", anno di nascita: " +
                annoDiNascita + ", email: " + email + ", matricola: " + matricola);
    }

    public boolean equals(Dipendente obj){
        return obj.nome.equals(this.nome) && obj.cognome.equals(this.cognome);
    }
}

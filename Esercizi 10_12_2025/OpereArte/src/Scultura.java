import java.util.Scanner;

public class Scultura extends Opera{
    //ATTRIBUTES
    private String materia;
    private String formaScultura;

    //CONSTRUCTOR
    public Scultura(int codice, String titolo, double prezzo, String autore, String materia, String formaScultura){
        super(codice,titolo,prezzo,autore);
        this.materia = materia;
        this.formaScultura = formaScultura;
    }

    public Scultura(){
        super();
    }

    //SETTERS and GETTERS
    public String getMateria(){return this.materia;}
    public String getFormaScultura(){return this.formaScultura;}

    public void setMateria(String materia){this.materia = materia;}
    public void setFormaScultura(String formaScultura){this.formaScultura = formaScultura;}

    //METODI
    public void leggiInput(Scanner t, int currentIndex){
        System.out.println("Inserisci il prezzo: ");
        double prezzo = t.nextDouble();

        if(prezzo < 0){
            System.out.println("ERRORE. Prezzo Negativo.");
            System.exit(0);
        }
        else{
            System.out.println("Inserisci il titolo: ");
            String nome = t.next();
            System.out.println("Inserisci l'autore: ");
            String autore = t.next();
            System.out.println("Inserisci la materia: ");
            String materia = t.next();
            System.out.println("Inserisci la forma scultura: ");
            String formaScultura = t.next();
            super.setOpera(nome, currentIndex, prezzo, autore);
            setMateria(materia);
            setFormaScultura(formaScultura);
        }
    }

    public void stampaOutput(){
        System.out.println("Titolo: " + this.getTitolo() + ", Autore: " + this.getAutore()
         + ", Materia: " + this.getMateria() + ", Forma Scultura: " + this.getFormaScultura() + ", Codice: " + this.getCodice());
    }
}

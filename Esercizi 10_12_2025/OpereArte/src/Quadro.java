import java.util.Scanner;

public class Quadro extends Opera{
    //ATTRIBUTES
    private double altezza;
    private double larghezza;
    private String tecnica;

    //CONSTRUCTOR
    public Quadro(int codice, String titolo, double prezzo, String autore, double altezza, double larghezza, String tecnica){
        super(codice,titolo,prezzo,autore);
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.tecnica = tecnica;
    }

    public Quadro(){
        super();
    }

    //SETTERS and GETTERS
    public void setAltezza(double altezza){this.altezza = altezza;}
    public void setLarghezza(double larghezza){this.larghezza = larghezza;}
    public void setTecnica(String tecnica){this.tecnica = tecnica;}

    public double getAltezza(){return this.altezza;}
    public double getLarghezza(){return this.larghezza;}
    public String getTecnica(){return this.tecnica;}

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
            System.out.println("Inserisci l'altezza: ");
            double altezza = t.nextDouble();
            System.out.println("Inserisci la larghezza: ");
            double larghezza = t.nextDouble();
            System.out.println("Inserisci la tecnica: ");
            String tecnica = t.next();
            super.setOpera(nome, currentIndex, prezzo, autore);
            setAltezza(altezza);
            setLarghezza(larghezza);
            setTecnica(tecnica);
        }
    }

    public void stampaOutput(){
        System.out.println("Titolo: " + this.getTitolo() + ", Autore: " + this.getAutore()
                + ", Altezza: " + this.getAltezza() + ", Larghezza:  " + this.getLarghezza() + ", Codice: " + this.getCodice());
    }
}

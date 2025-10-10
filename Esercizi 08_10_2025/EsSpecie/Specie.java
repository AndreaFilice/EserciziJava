import java.util.Scanner;

public class Specie {

    //ATTRIBUTI
    private String nome;
    private int popolazione;
    private double tassoCrescita;

    /// CONSTRUCTORS
    /// DEFAULT CONSTRUCTOR
    public Specie(){this("", 0, 0);}

    //CONSTRUCTOR SOLO PER IL NOME
    public Specie(String nome){this(nome, 0,0);}

    //CONSTRUCT SOLO PER LA POPOLAZIONE
    public Specie(int popolazione){this("", popolazione, 0);}

    //CONSTRUCTOR SOLO PER IL TASSO DI CRESCITA
    public Specie(double tassoCrescita){this("", 0, tassoCrescita);}

    //CONSTRUCTOR PER TUTTI E TRE I PARAMETRI
    public Specie(String nome, int popolazione, double tassoCrescita){
        setSpecie(nome, popolazione, tassoCrescita);
    }

    /// METODI SET E GET
    //METODI SET

    public void setSpecie(String nuovoNome, int nuovaPopolazione, double nuovoTassoCrescita){
        nome = nuovoNome;
        popolazione = nuovaPopolazione;
        tassoCrescita = nuovoTassoCrescita;
    }

    public void setNome(String nuovoNome){setSpecie(nuovoNome, popolazione, tassoCrescita);}
    public void setPopolazione(int nuovaPopolazione){setSpecie(nome, nuovaPopolazione, tassoCrescita);}
    public void setTassoCrescita(double nuovoTassoCrescita){setSpecie(nome, popolazione, nuovoTassoCrescita);}

    //METODI GET
    public String getNome(){return nome;}
    public int getPopolazione(){return popolazione;}
    public double getTassoCrescita(){return tassoCrescita;}

    //METODI
    public void leggiInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il nome della specie: ");
        nome = input.nextLine();
        System.out.println("Inserisci la popolazione della specie: ");
        popolazione = input.nextInt();
        System.out.println("Inserisci il tasso di crescita della popolazione: ");
        tassoCrescita = input.nextDouble();
    }

    public void scriviOutput(){
        System.out.println("Nome della specie: " + nome + ", Popolazione: " + popolazione + ", Tasso di crescita: " + tassoCrescita);
    }

    public int prediciPopolazione(int anni){
        double popolazionePrevista = popolazione;

        while(anni > 0 && popolazionePrevista > 0){
            popolazionePrevista += (tassoCrescita / 100) * popolazionePrevista;
            anni--;
        }

        if(popolazionePrevista < 0)
            return 0;

        return (int)popolazionePrevista;
    }

    public boolean equals(Specie altroOggetto){
        return (nome.equalsIgnoreCase(altroOggetto.nome) && popolazione == altroOggetto.popolazione && tassoCrescita == altroOggetto.tassoCrescita);
    }

    public int confrontaSpecie(Specie altroOggetto){
        int i = 0, popolazioneFutura = this.popolazione;

        while(popolazioneFutura < altroOggetto.popolazione && i <= 30){
            i++;
            popolazioneFutura = this.prediciPopolazione(i);
        }

        return i;
    }
}
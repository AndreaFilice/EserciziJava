import java.util.Scanner;

public class SpecieTerzaProva {
    //ATTRIBUTI
    private String nome;
    private int popolazione;
    private double tassoCrescita;

    //METODI
    // METODO SET per impostare gli attributi utilizzando 'this' per non incorre in errori per via del nome uguale delle variabili negli argomenti e negli attributi
    public void setSpecie(String nome, int popolazione, double tassoCrescita){
        this.nome = nome;
        this.popolazione = popolazione;
        this.tassoCrescita = tassoCrescita;
    }

    // METODI GET per ritornare gli attributi
    public String getNome(){return nome;}
    public int getPopolazione(){return popolazione;}
    public double getTassoCrescita(){return tassoCrescita;}

    //Leggi da tastiera dei valori
    public void leggiInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il nome della specie: ");
        nome = input.nextLine();

        System.out.println("Inserisci il numero di individui attuali: ");
        popolazione = input.nextInt();

        System.out.println("Inserisci il tasso di crescita annuale in percentuale: ");
        tassoCrescita = input.nextDouble();

        input.close();
    }

    //Scrivi l'output
    public void scriviOutput(){
        System.out.println("Nome della specie: " + nome);
        System.out.println("Popolazione: " + popolazione);
        System.out.println("Tasso di crescita:  " + tassoCrescita + "%");
    }

    //Metodo che prende gli anni da predire e calcola la popolazione prevista
    public int prediciPopolazione(int anni){
        double popolazionePrevista = popolazione;

        while(anni > 0 && popolazionePrevista > 0){
            popolazionePrevista += (tassoCrescita / 100) * popolazionePrevista;
            anni--;
        }

        if(popolazionePrevista < 0)
            System.exit(0);

        return (int)popolazionePrevista;
    }
}

import java.util.Scanner;

public class SpeciePrimaProva {

    //ATTRIBUTI
    public String nome;
    public int popolazione;
    public double tassoCrescita;

    //METODI
    //Leggi da tastiera
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

    //Metodo che prende gli anni da predirre e calcola la popolazione prevista
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
}

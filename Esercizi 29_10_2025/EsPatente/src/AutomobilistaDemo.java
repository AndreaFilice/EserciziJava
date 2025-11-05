import java.util.Scanner;

public class AutomobilistaDemo {
    static void main() {
        // VARIABILI
        Scanner t = new Scanner(System.in);
        Automobilista[] automobilisti = new Automobilista[1];

        // INSERISCI GLI AUTOMOBILISTI
        inserisciAutomobilisti(automobilisti);

        while (true){
            System.out.println("Scegli dal menù: ");
            System.out.println("1. Visualizza punti patente dal numero della patente.");
            System.out.println("2. Attribuisci una sanzione (dando il numero della patente).");
            System.out.println("3. Elenco automobilisti con punti inferiori a X.");
            System.out.println("4. Esci.");
            int scelta = t.nextInt();
            String pat;
            switch(scelta){
                case 1:
                    System.out.println("Inserisci il numero della patente: ");
                    pat = t.next();
                    visualizzaPuntiPatente(pat, automobilisti);
                    break;
                case 2:
                    System.out.println("Inserisci il numero della patente: ");
                    pat = t.next();
                    System.out.println("Inserisci il numero di punti da rimuovere: ");
                    int puntiDaRimuovere = t.nextInt();
                    applicaSanzione(pat, automobilisti, puntiDaRimuovere);
                    break;
                case 3:
                    System.out.println("Inserisci il numero di punti: ");
                    int punti = t.nextInt();
                    ricercaAutomobilisti(punti, automobilisti);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

    public static void visualizzaPuntiPatente(String pat, Automobilista[] vet){
        int ricercaAutomobilista = ricerca(pat, vet);

        if(ricercaAutomobilista != -1)
            System.out.println("PUNTI PATENTE: " + vet[ricercaAutomobilista].getPunti());
        else
            System.out.println("ERRORE! Errore durante la ricerca del numero di patente");
    }

    public static void applicaSanzione(String pat, Automobilista[] vet, int puntiDaRimuovere){
        int ricercaAutomobilista = ricerca(pat, vet);
        int puntiPatente = vet[ricercaAutomobilista].getPunti();

        int totalePunti = puntiPatente - puntiDaRimuovere;

        vet[ricercaAutomobilista].setPuntiPatente(totalePunti);
        System.out.println("PUNTI RIMOSSI CON SUCCESSO! (Punti attuali: " + vet[ricercaAutomobilista].getPunti() + ").");
    }

    public static void ricercaAutomobilisti(int puntiPatente, Automobilista[] vet){
        System.out.println("AUTOMOBILIST CON PUNTI INFERIORI A " + puntiPatente + ": ");
        for (int i = 0; i < vet.length; i++) {
            if(vet[i].getPunti() < puntiPatente)
                System.out.println(vet[i].getNome());
        }
    }

    public static int ricerca(String pat, Automobilista vet[]){
        for (int i = 0; i < vet.length; i++) {
            if(vet[i].getPatente().equals(pat))
                return i;
        }

        return -1;
    }

    public static void inserisciAutomobilisti(Automobilista[] automobilisti){
        //* FOR-EACH PER GLI AUTOMOBILISTI
        for(int i = 0; i < automobilisti.length; i++){
            automobilisti[i] = new Automobilista();
            automobilisti[i].leggiInput();
        }
    }
}

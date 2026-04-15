import java.util.Scanner;

public class GestionePS {
    public static void main(String[] args) {
        //ATTRIBUTI
        Coda codaRossa = new Coda();
        Coda codaVerde = new Coda();
        Scanner t = new Scanner(System.in);

        int selezione = 0;

        while (true) {
            System.out.println("SELEZIONA DAL MENU': ");
            System.out.println("1. Accettazione Paziente");
            System.out.println("2. Medico serve Paziente");
            System.out.println("3. Numero pazienti in coda");
            System.out.println("Seleziona: ");
            selezione = t.nextInt();

            switch (selezione) {
                case 1:
                    t.nextLine();
                    System.out.println("Inserisci il nome: ");
                    String nome = t.nextLine();
                    System.out.println("Inserisci il sintomo: ");
                    String sintomo = t.nextLine();

                    int codice = 0;

                    while(codice != 1 && codice != 2) {
                        System.out.println("Inserisci il codice (può essere SOLAMENTE 1 per la codice rosso e 2 per codice verde): ");
                        codice = t.nextInt();
                    }

                    Paziente temp = new Paziente(nome, sintomo, codice);

                    if(codice == 1 && codaRossa.lunghezza() < 10) {
                        codaRossa.addToQueue(temp);
                        System.out.println("Paziente in coda rossa aggiunto correttamente.");
                    }
                    else if(codice == 2 && codaVerde.lunghezza() < 10) {
                        codaVerde.addToQueue(temp);
                        System.out.println("Paziente in coda verde aggiunto correttamente.");
                    }
                    else
                        System.out.println(String.format("ERRORE: La coda %s è piena, svuotala rimuovendo un paziente.", (codice == 1) ? "rossa" : "verde"));

                    t.nextLine();
                    break;
                case 2:
                    if(!codaRossa.isEmpty()) {
                        Paziente pazienteDaServire = codaRossa.getNext();
                        System.out.println(String.format("Paziente da servire: %s. Coda rossa.", pazienteDaServire.getNome()));
                    }
                    else if(!codaVerde.isEmpty()) {
                        Paziente pazienteDaServire = codaVerde.getNext();
                        System.out.println(String.format("Paziente da servire: %s. Coda verde.", pazienteDaServire.getNome()));
                    }
                    else
                        System.out.println("ERRORE: Tutte le code sono vuote.");
                    break;
                case 3:
                    System.out.println("Numero pazienti in coda ROSSA: " + codaRossa.lunghezza());
                    System.out.println("Numero pazienti in coda VERDE: " + codaVerde.lunghezza());

                    break;
            }
        }
    }
}

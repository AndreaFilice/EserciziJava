import java.util.Scanner;

public class GestioneEventi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEventi lista = new ListaEventi();
        int scelta = -1;

        while (scelta != 0) {
            System.out.println("\n--- MENU GESTIONE EVENTI ---");
            System.out.println("1. Aggiungi evento in testa");
            System.out.println("2. Aggiungi evento in coda");
            System.out.println("3. Visualizza eventi");
            System.out.println("4. Cerca evento");
            System.out.println("5. Rimuovi evento");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");

            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere di a capo

            switch (scelta) {
                case 1:
                case 2:
                    System.out.print("Che tipo di evento? (1 = Concerto, 2 = Conferenza): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.print("Luogo: ");
                    String luogo = scanner.nextLine();
                    System.out.print("Data (gg/mm/aaaa): ");
                    String data = scanner.nextLine();

                    Evento nuovoEvento = null;

                    if (tipo == 1) {
                        System.out.print("Genere musicale: ");
                        String genere = scanner.nextLine();
                        nuovoEvento = new Concerto(titolo, luogo, data, genere);
                    } else if (tipo == 2) {
                        System.out.print("Relatore: ");
                        String relatore = scanner.nextLine();
                        nuovoEvento = new Conferenza(titolo, luogo, data, relatore);
                    }

                    if (nuovoEvento != null) {
                        if (scelta == 1)
                            lista.aggiungiEvento(nuovoEvento);
                        else
                            lista.aggiungiEventoInCoda(nuovoEvento);
                        System.out.println("Evento aggiunto con successo!");
                    } else
                        System.out.println("Tipo di evento non valido. Inserimento annullato.");
                    break;

                case 3:
                    lista.visualizzaEventi();
                    break;

                case 4:
                    System.out.print("Inserisci il titolo dell'evento da cercare: ");
                    String titoloCerca = scanner.nextLine();
                    lista.cercaEvento(titoloCerca); // Il tuo metodo stampa già il risultato
                    break;

                case 5:
                    System.out.print("Inserisci il titolo dell'evento da rimuovere: ");
                    String titoloRimuovi = scanner.nextLine();
                    boolean rimosso = lista.rimuoviEvento(titoloRimuovi);
                    if (rimosso) {
                        System.out.println("Evento rimosso con successo!");
                    } else {
                        System.out.println("Errore: Evento non trovato nella lista.");
                    }
                    break;

                case 0:
                    System.out.println("Chiusura del programma...");
                    break;

                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        }

        scanner.close();
    }
}
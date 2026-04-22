import java.util.Scanner;

public class Demo {

    static Scanner scanner = new Scanner(System.in);
    static String NOME_FILE = "savedDatas.txt";

    public static void main(String[] args) {
        ListaLibri lista = new ListaLibri();
        int scelta = -1;

        //CARICA FILE
        lista.caricaFile(NOME_FILE);

        while (scelta != 0) {
            System.out.println("\n--- MENU GESTIONE LIBRI ---");
            System.out.println("1. Aggiungi Libro in testa");
            System.out.println("2. Aggiungi Libro in coda");
            System.out.println("3. Visualizza Libri");
            System.out.println("4. Cerca libro per ISBN");
            System.out.println("5. Rimuovi libro");
            System.out.println("6. Visualizza Libri disponibili");
            System.out.println("7. Conta libri totali");
            System.out.println("8. Conta libri narrativa");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    Libro libroDaInserire = inserisciLibro();

                    lista.aggiungiLibro(libroDaInserire);
                    break;
                case 2:
                    Libro libroDaInserireCoda = inserisciLibro();

                    lista.aggiungiLibroInCoda(libroDaInserireCoda);
                    break;
                case 3:
                    lista.visualizzaLibri();
                    break;
                case 4:
                    System.out.println("Inserisci l'ISBN da cercare: ");
                    String ISBN = scanner.nextLine();

                    Libro temp = lista.cercaLibro(ISBN);
                    System.out.println(String.format("\nTitolo: %s\nISBN: %s\nTipologia: %s\nNumero Pagine: %s\nDisponibile: %s\n",
                            temp.getTitolo(), temp.getIsbn(), (temp instanceof LibroSaggistica) ? "Saggistica" : "Narrativa",
                            temp.getNumeroPagine(), (temp.isDisponibile()) ? "Disponibile" : "Non Disponibile"
                    ));
                    break;
                case 5:
                    System.out.println("Inserisci l'ISBN da rimuovere: ");
                    String ISBNdaRimuovere = scanner.nextLine();

                    boolean success = lista.rimuoviLibro(ISBNdaRimuovere);
                    System.out.println(String.format("%s", (success) ? "Libro rimosso con successo!" : "Errore durante la rimozione."));
                    break;
                case 6:
                    lista.visualizzaLibriDisponibili();
                    break;
                case 7:
                    System.out.println("Totale Libri: " + lista.contaLibri());
                    break;
                case 8:
                    System.out.println("Totale Libri Narrativa: " + lista.contaLibriNarrativa());
                    break;
                default:
                    lista.salvaSuFile(NOME_FILE);
                    System.exit(0);
            }
        }
    }

    public static Libro inserisciLibro() {
        String titolo, ISBN;
        int numeroPagine;
        boolean disponibile;

        int selezione = 0;
        System.out.println("Il libro è di Narrativa (1) o di Saggistica (2)?");
        selezione = scanner.nextInt();

        System.out.println("Modalità selezionata!");
        scanner.nextLine();
        System.out.println("Inserisci il titolo del Libro: ");
        titolo = scanner.nextLine();
        System.out.println("Inserisci l'ISBN del Libro: ");
        ISBN = scanner.nextLine();
        System.out.println("Inserisci il numero pagine del Libro: ");
        numeroPagine = scanner.nextInt();
        System.out.println("Il Libro è disponibile? (s/n)");
        char selection = scanner.next().charAt(0);
        disponibile = (Character.toLowerCase(selection) == 's');

        scanner.nextLine();
        if(selezione == 1) {
            System.out.println("Inserisci il genere del Libro: ");
            String genere = scanner.nextLine();
            return new LibroNarrativa(titolo, ISBN, genere, numeroPagine, disponibile);
        }
        else {
            System.out.println("Inserisci l'ambito del Libro: ");
            String ambito = scanner.nextLine();
            return new LibroSaggistica(titolo, ISBN, ambito, numeroPagine, disponibile);
        }
    }
}
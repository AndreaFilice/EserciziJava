import java.io.*;
import java.util.Scanner;

public class GestioneLibriDemo {

    static Scanner t = new Scanner(System.in);
    static final String FILE_NAME = "libri.txt";
    static PrintWriter outWriter;
    static Scanner outReader;

    public static void main(String[] args) {
        while(true) {
            init();

            System.out.println("SELEZIONA DAL MENU'");
            System.out.println("1. Inserisci un nuovo libro");
            System.out.println("2. Visualizza tutti i libri");
            System.out.println("3. Cerca libro da ISBN");
            System.out.println("4. Modifica disponibilità libro");
            System.out.println("5. Calcola numero medio pagine");
            System.out.println("6. Esci");
            int scelta = t.nextInt();

            switch (scelta) {
                case 1:
                    inserisciLibro();
                    break;
                case 2:
                    visualizzaLibri();
                    break;
                case 3:
                    ricercaLibroISBN();
                    break;
                case 4:
                    modificaDisponibilita();
                    break;
                case 5:
                    calcolaMedia();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    public static void init(){
        try{
            outWriter = new PrintWriter(new FileOutputStream(FILE_NAME, true));
            outReader = new Scanner(new FileInputStream(FILE_NAME));
        } catch (FileNotFoundException e) {
            System.out.println("ERRORE: " + e.getMessage());
        }
    }

    public static void inserisciLibro() {
        String isbn, titolo;
        int numeroPagine;
        boolean disponibile;

        t.nextLine();

        while(true) {
            try{
                System.out.println("Inserisci il codice ISBN: ");
                isbn = t.nextLine();
                convalidaISBN(isbn);
                break;
            }
             catch (LunghezzaISBNException | FormatoISBNException e){
                System.out.println(e.getMessage());
             }
        }

        System.out.println("Inserisci il titolo del Libro: ");
        titolo = t.nextLine();

        System.out.println("Inserisci il numero pagine del Libro: ");
        numeroPagine = t.nextInt();

        System.out.println("Inserisci se il libro è disponibile (S/N): ");
        char userChoice = t.next().charAt(0);
        disponibile = (userChoice == 'S' ||  userChoice == 's');

        Libro temp = new Libro(titolo, isbn, numeroPagine, disponibile);

        outWriter.println(temp.toString());
        outWriter.close();
    }

    public static void visualizzaLibri(){
        while(outReader.hasNextLine()){
            String[] valori =  outReader.nextLine().split(";");
            System.out.println(String.format("ISBN: %s\nTitolo: %s\nPagine: %s\nDisponibile: %s\n", valori[0], valori[1], valori[2], (valori[3] == "true") ? "SI" : "NO"));
        }
    }

    public static void ricercaLibroISBN() {
        t.nextLine();

        System.out.println("Inserisci codice ISBN del libro da cercare: ");
        String isbnDaCercare = t.nextLine();
        boolean trovato = false;

        while(outReader.hasNextLine() && !trovato){
            String[] valori =  outReader.nextLine().split(";");

            if(isbnDaCercare.equals(valori[0])){
                System.out.println(String.format("ISBN: %s\nTitolo: %s\nPagine: %s\nDisponibile: %s\n", valori[0], valori[1], valori[2], (valori[3] == "true") ? "SI" : "NO"));
                trovato = true;
            }
        }

        if(!trovato)
            System.out.println("Nessun libro con questo ISBN trovato.");
    }

    public static void modificaDisponibilita(){
        File fileOriginale = new File(FILE_NAME);
        File fileTemp = new File("temp.txt");
        PrintWriter printerTemp = null;

        outWriter.close();
        t.nextLine();

        try{
            printerTemp = new PrintWriter(new FileOutputStream("temp.txt", false));
        }
        catch (FileNotFoundException e){
            System.out.println("ERRORE: " + e.getMessage());
        }

        System.out.println("Inserisci codice ISBN da cercare: ");
        String isbnDaCercare = t.nextLine();
        boolean disponibile;

        while(outReader.hasNextLine()){
            String[] valori =  outReader.nextLine().split(";");

            if(valori[0].equals(isbnDaCercare)){
                System.out.println("Inserisci il nuovo valore, è disponibilie (S/N)?");
                char userChoice = t.next().charAt(0);
                disponibile = (userChoice == 'S' ||  userChoice == 's');
                printerTemp.println(String.format("%s;%s;%s;%s", valori[0], valori[1], valori[2], String.valueOf(disponibile)));
            }
            else
                printerTemp.println(String.format("%s;%s;%s;%s", valori[0], valori[1], valori[2], valori[3]));
        }
        printerTemp.close();
        outReader.close();

        if(fileOriginale.delete()){
            if(fileTemp.renameTo(fileOriginale)){
                System.out.println("File eliminato correttamente");
            }
            else
                System.out.println("Errore rinominando il file");
        }
        else
            System.out.println("Errore eliminando il file");
    }

    public static void calcolaMedia(){
        double numeroPagineTotale = 0;
        double totaleLibri = 0;

        while(outReader.hasNextLine()){
            String[] valori = outReader.nextLine().split(";");

            totaleLibri++;
            numeroPagineTotale += Double.parseDouble(valori[2]);
        }

        if(totaleLibri > 0)
            System.out.printf("\nNumero pagine totali: %.2f\n", (numeroPagineTotale/totaleLibri));
    }

    public static void convalidaISBN(String isbn) throws FormatoISBNException, LunghezzaISBNException {
        if(isbn.length() != 13)
            throw new LunghezzaISBNException("ERRORE: Lunghezza non valida.");
        else if(!isbn.matches("[0-9]{13}"))
            throw new FormatoISBNException("ERRORE: Formato non valido.");
    }
}

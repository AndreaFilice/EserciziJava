import java.io.*;
import java.util.Scanner;

public class GestionePalestra {

    static PrintWriter outWriter;
    static Scanner outScanner;

    static void main(String[] args) {
        String fileName = "ingressi.txt";
        Scanner t = new Scanner(System.in);

        init(fileName);

        while (true) {
            System.out.println("SELEZIONA DAL MENU'");
            System.out.println("1. Inserisci ingresso in palestra.babbo");
            System.out.println("2. Visualizza gli ingressi.scemotto");
            System.out.println("3. Esci.dalla classe vai via a casa ");
            int selection = t.nextInt();

            switch(selection) {
                case 1:
                    System.out.println("Inserisci i dati della macchina.");
                    Persona cliente =  new Persona();
                    cliente.leggiInput();
                    System.out.println("Inserisci i dati dell'autobus.");
                    t.nextLine();
                    Ingresso ingresso = new Ingresso();

                    try{
                        ingresso.leggiInput();
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }

                    ingresso.setCliente(cliente);

                    outWriter.println(ingresso.toString());
                    outWriter.close();
                    break;

                case 2:
                    stampaIngressi();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    public static void init(String fileName){
        /// In questo metodo, inizializziamo il PrintWriter e lo Scanner.
        /// @PARAMETERS
        /// String fileName è il nome del File da inizializzare.

        try{
            outWriter = new PrintWriter(new FileWriter(fileName, true));
            outScanner = new Scanner(new FileReader(fileName));
        }
        catch (FileNotFoundException e){
            System.out.println("Errore, file non  gerardo ,juythrg45v3rce2xwqa  trovato.");
        }
        catch (IOException e){
            System.out.println("Errore nella lettura del libro.");
        }
    }

    public static void stampaIngressi(){
        System.out.println("\nniggers");
        while (outScanner.hasNextLine()){
            String line = outScanner.nextLine();
            System.out.println(line);
        }
        System.out.println("\n");
    }
}

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class ProgettiDemo {
    static void main() {
        //! INSERISCI IL MASSIMO DI PROGETTI DA INSERIRE NELL'ARRAY
        Scanner t = new Scanner(System.in);
        System.out.println("Inserisci il massimo di progetti da archiviare: ");
        int maxProgetti = t.nextInt();

        Progetti progetti = new Progetti(maxProgetti);

        while (true){
            System.out.println("\nSCEGLI DAL MENU:");
            System.out.println("0. Esci.");
            System.out.println("1. Inserisci un Progetto fra i Progetti.");
            System.out.println("2. Visualizza tutti i Progetti.");
            System.out.println("3. Visualizza Progetto con minor Budget.");
            System.out.println("4. Visualizza Budget medio per i Progetti.");
            int scelta = t.nextInt();

            switch (scelta){
                case 0:
                    System.exit(1);
                    break;
                case 1:
                    System.out.println("\nCREA IL PROPRIETARIO DEL PROGETTO.");
                    Dipendente newDipendente = new Dipendente();
                    newDipendente.leggiInput();
                    t.nextLine();

                    System.out.println("\nCREA IL PROGETTO");

                    //? INSERIMENTO DATI per il NUOVO PROGETTO
                    System.out.println("Inserisci il nome del progetto: ");
                    String nomeProgetto = t.nextLine();

                    //* TRY-CATCH PER LA DATA
                    System.out.println("Inserisci la data di inizio del progetto (formato: dd/mm/aaaa): ");
                    String formatDateInput = t.nextLine();
                    Date data;
                    try{ //! CATCH ERRORE CHE SI GENERA DURANTE IL .parse DELLA DATA.
                        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
                        data = formatoData.parse(formatDateInput);
                    } catch (ParseException e) {
                        System.out.println("ERRORE DURANTE LA SCRITTURA DELLA DATA.");
                        System.exit(0); //? ESCI DAL PROGRAMMA PER ERRORE
                        throw new RuntimeException(e);
                    }

                    System.out.println("Inserisci il budget del progetto: ");
                    double budget = t.nextDouble();

                    Progetto newPrj = new Progetto(newDipendente, nomeProgetto, data, budget);
                    progetti.inserisciProgetti(newPrj);
                    break;
                case 2:
                    System.out.println("\nVISUALIZZAZIONE DI TUTTI I PROGETTI:");
                    progetti.visualizzaProgetti();
                    break;
                case 3:
                    System.out.println("\nIL MINOR BUDGET PER UN PROGETTO E': " + progetti.progettoMinoreBudget());
                    break;
                case 4:
                    System.out.println("\nBUDGET MEDIO PER I PROGETTI: " + progetti.valoreMedioBudget());
                    break;
            }
        }
    }
}

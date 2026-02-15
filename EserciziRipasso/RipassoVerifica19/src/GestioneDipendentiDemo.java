import java.io.*;
import java.util.Scanner;

public class GestioneDipendentiDemo {

    static Scanner t = new Scanner(System.in);
    static PrintWriter fw;
    static final String FILE_NAME = "dipendenti.txt";

    static void main(String[] args) {

        init();

        while (true){
            System.out.println("SELEZIONA DAL MENU'");
            System.out.println("1. Inserisci un nuovo dipendente");
            System.out.println("2. Visualizza tutti i dipendenti");
            System.out.println("3. Modifica salario dipendente");
            System.out.println("4. Calcola salario medio");
            System.out.println("5. Esci");

            int selezione = t.nextInt();

            switch(selezione){
                case 1:
                    boolean completedInserimento = false;
                    Dipendente temp = null;

                    while(!completedInserimento){
                        completedInserimento = true;

                        try{
                            temp = creaDipendente();
                        }
                        catch (FormatoCFException | LunghezzaCFException e){
                            System.out.println(e.getMessage());
                            completedInserimento = false;
                        }
                    }

                    //INSERIMENTO NEL FILE
                    fw.println(temp.toString());
                    fw.close();

                    break;
                case 2:
                    leggiDipendenti();
                    break;
                case 3:
                    if (fw != null)
                        fw.close();

                    System.out.println("Inserisci il codice fiscale del dipendente da modificare:");
                    String cfDaCercare = t.next();

                    File fileOriginale = new File(FILE_NAME);
                    File fileTemporaneo = new File("temp.txt");

                    try (Scanner fileReader = new Scanner(fileOriginale);
                         PrintWriter tempWriter = new PrintWriter(new FileWriter(fileTemporaneo))) {

                        while (fileReader.hasNextLine()) {
                            String riga = fileReader.nextLine();
                            String[] valori = riga.split(";");

                            String cfFile = valori[1];

                            if (cfFile.equalsIgnoreCase(cfDaCercare)) {
                                System.out.println("Trovato: " + valori[0] + " - Salario attuale: " + valori[2]);
                                System.out.println("Inserisci il nuovo salario: ");
                                double nuovoSalario = t.nextDouble();

                                tempWriter.println(valori[0] + ";" + valori[1] + ";" + nuovoSalario);
                            } else {
                                tempWriter.println(riga);
                            }
                        }

                    } catch (IOException e) {
                        System.out.println("Errore I/O: " + e.getMessage());
                    }

                    if (fileOriginale.delete()) {
                        if (fileTemporaneo.renameTo(fileOriginale)) {
                            System.out.println("Modifica completata con successo.");
                            init();
                        } else
                            System.out.println("Errore: Impossibile rinominare il file temporaneo.");
                    } else
                        System.out.println("Errore: Impossibile cancellare il file originale (ancora in uso o permessi negati).");

                    break;
                case 4:
                    double totaleSalari = 0;
                    int totaleDipendenti = 0;

                    try(Scanner fileReader = new Scanner(new File(FILE_NAME));){
                        while(fileReader.hasNextLine()){
                            String riga = fileReader.nextLine();
                            String[] valori = riga.split(";");

                            double salario = Double.valueOf(valori[valori.length-1]);
                            totaleSalari += salario;
                            totaleDipendenti++;
                        }

                        if(totaleDipendenti > 0)
                            System.out.println("VALORE MEDIO SALARI: " + (totaleSalari / totaleDipendenti));
                        else
                            System.out.println("VALORE MEDIO SALARI: Errore durante il calcolo.");
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }

                    try (Scanner fileReader = new Scanner(new File(FILE_NAME))){
                        while(fileReader.hasNextLine()){
                            String riga = fileReader.nextLine();
                            String[] valori = riga.split(";");

                            double salario = Double.valueOf(valori[2]);
                            if(totaleDipendenti > 0 && salario > (totaleSalari / totaleDipendenti))
                                System.out.println(String.format("Il dipendete %s ha un salario sopra la media.", valori[0]));
                            else if(totaleDipendenti > 0 && salario < (totaleSalari / totaleDipendenti))
                                System.out.println(String.format("Il dipendete %s ha un salario sotto la media.", valori[0]));
                            else if(totaleDipendenti > 0 && salario == (totaleSalari / totaleDipendenti))
                                System.out.println(String.format("Il dipendete %s ha un salario uguale alla media.", valori[0]));
                            else
                                System.out.println("Si è verificato un errore imprevisto.");
                        }
                    }
                    catch(FileNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("\n");
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    public static Dipendente creaDipendente() {
        t.nextLine();
        System.out.println("Inserisci il nome del dipendente: ");
        String nome = t.nextLine();
        System.out.println("Inserisci il codice fiscale del dipendente: ");
        String codiceFiscale = t.nextLine();
        System.out.println("Inserisci il salario del dipendente: ");
        double salario = t.nextDouble();

        return new Dipendente(nome, codiceFiscale, salario);
    }

    public static void init(){
        try {
            fw = new PrintWriter(new FileWriter(FILE_NAME, true));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void leggiDipendenti() {
        System.out.println("\nDIPENDENTI:");

        try (Scanner fileReader = new Scanner(new File(FILE_NAME))) {
            while(fileReader.hasNextLine()){
                String riga = fileReader.nextLine();
                System.out.println(riga);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File non ancora esistente o non trovato.");
        }

        System.out.println("\n");
    }
}

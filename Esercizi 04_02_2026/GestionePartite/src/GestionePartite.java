import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GestionePartite {

    static PrintWriter out = null;
    static Scanner fileOutput = null;

    static void main(String[] args) {
        ArrayList<Risultato> risultati = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        init();

        while (true) {
            System.out.println("SELEZIONA DAL MENU");
            System.out.println("1. Inserisci Risultato");
            System.out.println("2. Visualizza Risultati");
            System.out.println("3. Stampa Classifica");
            System.out.println("4. Esci");

            int selection = input.nextInt();

            switch (selection) {
                case 1:
                    input.nextLine();
                    System.out.println("Inserisci squadra di casa:");
                    String squadraCasa = input.nextLine();
                    System.out.println("Inserisci squadra ospite:");
                    String squadraOspite = input.nextLine();

                    if(squadraCasa.equalsIgnoreCase(squadraOspite)){
                        System.out.println("ERRORE. Squadre Uguali");
                        break;
                    }

                    System.out.println("Inserisci goal squadra di casa:");
                    int squadraGoalCasa = input.nextInt();
                    System.out.println("Inserisci goal ospite:");
                    int squadraGoalOspite = input.nextInt();
                    Risultato risultato = new Risultato(squadraCasa, squadraOspite, squadraGoalCasa, squadraGoalOspite);

                    out.println(risultato.toString());
                    out.flush();
                    break;
                case 2:
                    System.out.println("Inserisci il totale dei risultati da visualizzare:");
                    int totaleRisultati = input.nextInt();
                    stampaRisultati(totaleRisultati);
                    System.out.println("\n");
                    break;
                case 3:
                    stampaClassifica(risultati);
                    break;
                case 4:
                    out.close();
                    System.exit(0);
            }
        }
    }

    public static void init() {
        try{
            out = new PrintWriter(new FileWriter("risultati.txt", true));
            fileOutput = new Scanner(new File("risultati.txt"));
        }
        catch (FileNotFoundException e){
            System.out.println("ERRORE DURANTE L'INIZIALIZZAZIONE DEL PrintWriter e dello Scanner.");
        } catch (IOException e) {
            System.out.println("ERRORE DURANTE L'INIZIALIZZAZIONE DEL PrintWriter e dello Scanner.");
        }
    }

    public static void stampaRisultati(int risultati){
        int index = 0;

        try (Scanner reader = new Scanner(new File("risultati.txt"))) {
            while(reader.hasNextLine() && index < risultati){
                System.out.println(reader.nextLine());
                index++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato.");
        }
    }

    public static void stampaClassifica(ArrayList<Risultato> risultati){

        try (Scanner ris = new Scanner(new File("risultati.txt"))) {
            while (ris.hasNextLine()) {
                String riga = ris.nextLine();
                String[] dati = riga.split(" ");
                String squadraCasa = dati[0];
                String squadraFuori = dati[1];
                int puntiCasa = Integer.parseInt(dati[2]);
                int puntiFuori = Integer.parseInt(dati[3]);
                risultati.add(new Risultato(squadraCasa, squadraFuori, puntiCasa, puntiFuori));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato.");
        }

        HashMap<String, Integer> classifica = new HashMap<>();

        for (Risultato r : risultati) {
            classifica.put(r.getSquadraCasa(),
                    classifica.getOrDefault(r.getSquadraCasa(), 0) + r.puntiCasa());
            classifica.put(r.getSquadraOspite(),
                    classifica.getOrDefault(r.getSquadraOspite(), 0) + r.puntiOspite());
        }

        ArrayList<String> squadre = new ArrayList<>(classifica.keySet());
        squadre.sort((a, b) -> classifica.get(b) - classifica.get(a));
        System.out.println("\nCLASSIFICA");
        for (String squadra : squadre) {
            System.out.println(squadra + " : " + classifica.get(squadra) + " punti");
        }
        System.out.println("\n");
    }
}

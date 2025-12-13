import java.util.*;

public class Demo {

    //VARIABLES
    static ArrayList<Double> list = new ArrayList<>();
    static Scanner t = new Scanner(System.in);

    public static void main() {
        while(true){
            System.out.println("SCEGLI DAL MENU'");
            System.out.println("1. Inserisci il valore");
            System.out.println("2. Visualizza dati");
            System.out.println("3. Ricerca di un numero");
            System.out.println("4. Modifica un numero");
            System.out.println("5. Elimina un numero");
            System.out.println("6. Ordina i numeri");

            int scelta = t.nextInt();

            switch (scelta){
                case 1:
                    inserisciNumeri();
                    break;
                case 2:
                    visualizzaArray();
                    break;
                case 3:
                    System.out.println("Inserisci il numero da cercare: ");
                    double numeroDaCercare = t.nextDouble();

                    int indexNumber = ricercaNumero(numeroDaCercare);

                    if(indexNumber == -1)
                        System.out.println("ERRORE. Numero non presente nella lista.");
                    else
                        System.out.println("NUMERO TROVATO! Indice: " + indexNumber);
                    break;
                case 4:
                    System.out.println("Inserisci il numero da modificare: ");
                    double numeroDaModificare = t.nextDouble();

                    modificaNumero(numeroDaModificare);
                    break;
                case 5:
                    System.out.println("Inserisci il numero da eliminare: ");
                    double numeroDaEliminare = t.nextDouble();

                    rimuoviNumero(numeroDaEliminare);
                    break;
                case 6:
                    System.out.println("ORDINAMENTO IN BASE AL NUMERO CRESCENTE: ");

                    Collections.sort(list, Comparator.comparing(Double::doubleValue));
                    visualizzaArray();
                    break;
                default:
                    System.out.println("USCITA.");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void inserisciNumeri(){
        boolean continueInput = true;

        while(continueInput){
            System.out.println("Inserisci il valore (inserisci -1 per uscire): ");
            double numeroDaInserire = t.nextDouble();

            continueInput = (numeroDaInserire != -1);
            if(continueInput){
                if(!list.contains(numeroDaInserire))
                    list.add(numeroDaInserire);
                else
                    System.out.println("ERRORE. Numero già presente nella lista.");
            }
            else
                System.out.println("FINE INSERIMENTO NUMERI.\n");
        }
    }

    public static void visualizzaArray(){
        System.out.println("NUMERI ALL'INTERNO DELLA LISTA: ");

        for(Double n : list){
            System.out.print(n + ", ");
        }

        System.out.print("\n");
    }

    public static int ricercaNumero(double numeroDaRicercare){
        return list.indexOf(numeroDaRicercare);
    }

    public static void modificaNumero(double numeroDaModificare){
        int index = ricercaNumero(numeroDaModificare);

        if(index != -1){
            System.out.println("Inserisci il nuovo valore del numero: ");
            double numeroModificato = t.nextDouble();
            list.set(index, numeroModificato);
        }
        else
            System.out.println("ERRORE. Numero non presente nella lista, impossibile continuare la modifica.");
    }

    public static void rimuoviNumero(double numeroDaRimuovere){
        int index = ricercaNumero(numeroDaRimuovere);

        if(index != -1)
            list.remove(index);
        else
            System.out.println("ERRORE. Numero non presente nella lista, impossibile rimuoverlo.");
    }
}

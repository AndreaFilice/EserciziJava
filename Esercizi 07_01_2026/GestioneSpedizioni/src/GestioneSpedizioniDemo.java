import java.util.Scanner;

public class GestioneSpedizioniDemo {

    //*GLOBAL VARIABLES
    static final RegistroSpedizioni registro = new RegistroSpedizioni();
    static final Scanner t = new Scanner(System.in);

    static void main() {
        int selection = 0;

        while (selection != -1){
            System.out.println("SELEZIONA DAL MENU'");
            System.out.println("1. Registra una spedizione.");
            System.out.println("2. Visualizza le spedizioni.");
            System.out.println("3. Visualizza veicolo più utilizzato.");
            System.out.println("4. Visualizza il carico medio totale.");
            System.out.println("5. Esci.");
            selection = t.nextInt();

            switch (selection){
                case 1:
                    Spedizione spedizioneDaInserire = new Spedizione();
                    spedizioneDaInserire.leggiInput();

                    registro.registraSpedizione(spedizioneDaInserire);
                    break;

                case 2:
                    registro.visualizzaSpedizioni();
                    break;
                case 3:
                    Veicolo veicoloPiuUsato = registro.veicoloPiuUsato();

                    if(veicoloPiuUsato != null)
                        System.out.println("Codice veicolo più utilizzato: " + veicoloPiuUsato.getUUID());
                    else
                        System.out.println("ERRORE DURANTE LA RICERCA DEL VEICOLO. Riprova.");
                    break;
                case 4:
                    double mediaCarico;
                    mediaCarico = registro.caricoMedioTotale();

                    System.out.println("Carico medio totale: " + mediaCarico);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}

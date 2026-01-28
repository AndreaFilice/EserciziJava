import java.util.Scanner;

public class DemoAssicurazione {
    static void main(String[] args) {
        GestorePolizze gestoreAssicurazione = new GestorePolizze();
        Scanner t = new Scanner(System.in);

        while (true){
            int selection;
            System.out.println("SELEZIONA DAL MENU'");
            System.out.println("1. Inserisci una Polizza.");
            System.out.println("2. Visualizza le Polizze.");
            System.out.println("3. Richiedi un Rimborso.");
            System.out.println("4. Esci.");

            selection = t.nextInt();

            switch (selection){
                case 1:
                    gestoreAssicurazione.inserisciPolizza();
                    break;
                case 2:
                    gestoreAssicurazione.stampaPolizze();
                    break;
                case 3:
                    try{
                        t.nextLine();
                        System.out.println("Inserisci l'UUID della Polizza da richiedere il rimborso: ");
                        String uuid = t.nextLine();
                        PolizzaAssicurativa polizzaDaRimborsare = gestoreAssicurazione.cercaPolizza(uuid);

                        System.out.println("Inserisci l'importo del rimborso: ");
                        int importo = t.nextInt();
                        polizzaDaRimborsare.richiediRisarcimento(importo);
                    }
                    catch (Exception e){
                        System.out.println(e.toString());
                    }
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}

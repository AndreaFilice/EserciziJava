import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Demo {

    static Scanner t = new Scanner(System.in);
    static ArrayList<Opera> galleria = new ArrayList<>();

    public static void main() {
        while(true){
            System.out.println("SCEGLI DAL MENU'");
            System.out.println("1. Inserisci un'opera ");
            System.out.println("2. Elenco opere d'arte");
            System.out.println("3. Vendi un'opera");

            int scelta = t.nextInt();

            switch (scelta){
                case 1:
                    acquistaOpera();
                    break;
                case 2:
                    System.out.println("Inserisci il prezzo massimo del range: ");
                    int maxPrice = t.nextInt();
                    System.out.println("Inserisci il prezzo minimo del range: ");
                    int minPrice = t.nextInt();

                    visualizzaOpere(maxPrice, minPrice);
                    break;
                case 3:
                    System.out.println("Inserisci il codice dell'opera da rimuovere: ");
                    int index = t.nextInt();

                    vendiOpera(index);
                    break;
                default:
                    System.out.println("USCITA.");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void acquistaOpera(){
        System.out.println("Inserisci il tipo dell'opera (S per scultura e Q per Quadro): ");
        char typo = t.next().charAt(0);

        if(typo == 'S' || typo == 's'){
            Scultura nuovaScultura = new Scultura();
            nuovaScultura.leggiInput(t, galleria.size());
            galleria.add(nuovaScultura);
        }
        else if (typo == 'Q' || typo == 'q'){
            Quadro nuovoQuadro = new Quadro();
            nuovoQuadro.leggiInput(t, galleria.size());
            galleria.add(nuovoQuadro);
        }
        else
            System.out.println("ERRORE. Non trovato.");
    }

    public static void visualizzaOpere(int maxPrice, int minPrice){
        ArrayList<Opera> operePrezzo = new ArrayList<>();

        for(int i = 0; i < galleria.size(); i++){
            if(galleria.get(i).getPrezzo() >= minPrice && galleria.get(i).getPrezzo() <= maxPrice){
                operePrezzo.add(galleria.get(i));
            }
        }

        Collections.sort(operePrezzo, Comparator.comparing(Opera::getPrezzo));

        for(Opera opera: operePrezzo){
            if(opera instanceof Scultura){
                Scultura scultura = (Scultura) opera;
                scultura.stampaOutput();
            }
            else if (opera instanceof Quadro){
                Quadro quadro = (Quadro) opera;
                quadro.stampaOutput();
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void vendiOpera(int index){
        galleria.remove(index);
        System.out.println("ELEMENTO RIMOSSO!");
    }
}

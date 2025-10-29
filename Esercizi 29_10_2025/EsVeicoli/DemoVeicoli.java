public class DemoVeicoli {
    static void main() {
        Veicolo veicolo = new Veicolo();
        Vettura vettura = new Vettura();
        Motociclo motociclo = new Motociclo();

        //LEGGI INPUT
        System.out.println("PRIMO VEICOLO: ");
        veicolo.leggiInput();
        System.out.println("SECONDA VETTURA: ");
        vettura.leggiInput();
        System.out.println("TERZO MOTOCICLO: ");
        motociclo.leggiInput();

        //METODO daRevisionare
        if(veicolo.daRevisionare() == true)
            System.out.println("CLASSE VEICOLO DA REVISIONARE: SI'");
        else
            System.out.println("CLASSE VEICOLO DA REVISIONARE: NO");

        if(vettura.daRevisionare() == true)
            System.out.println("CLASSE VETTURA DA REVISIONARE: SI'");
        else
            System.out.println("CLASSE VETTURA DA REVISIONARE: NO");

        if(motociclo.daRevisionare() == true)
            System.out.println("CLASSE MOTOCICLO DA REVISIONARE: SI'");
        else
            System.out.println("CLASSE MOTOCICLO DA REVISIONARE: NO");

        //SCRIVI OUTPUT
        System.out.print("\n");
        veicolo.scriviOutput();
        vettura.scriviOutput();
        motociclo.scriviOutput();
    }
}

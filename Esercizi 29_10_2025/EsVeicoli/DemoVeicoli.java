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
        System.out.println("CLASSE VEICOLO DA REVISIONARE: " + veicolo.daRevisionare());
        System.out.println("CLASSE VETTURA DA REVISIONARE: " + vettura.daRevisionare());
        System.out.println("CLASSE MOTOCICLO DA REVISIONARE: " + motociclo.daRevisionare());

        //SCRIVI OUTPUT
        veicolo.scriviOutput();
        vettura.scriviOutput();
        motociclo.scriviOutput();
    }
}

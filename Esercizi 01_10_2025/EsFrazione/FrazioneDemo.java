public class FrazioneDemo {
    public static void main(String[] args) {
        Frazione frazione1 = new Frazione(1, 2);
        Frazione frazione2 = new Frazione(2, 4);

        System.out.println("FRAZIONE NUMERO 1: " + frazione1.toString());
        System.out.println("FRAZIONE NUMERO 2: " + frazione2.toString());
        System.out.println("SOMMA TRA lE DUE FRAZIONI: " + frazione1.Somma(frazione2));
        System.out.println("SOTTRAZIONE TRA lE DUE FRAZIONI: " + frazione1.Sottrazione(frazione2));
        System.out.println("PRODOTTO TRA lE DUE FRAZIONI: " + frazione1.Prodotto(frazione2));
    }
}
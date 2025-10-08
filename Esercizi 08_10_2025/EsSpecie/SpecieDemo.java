public class SpecieDemo {
    public static void main(String[] args) {
        /// ANDREA FILICE, 4Ci, 08/10/2025
        /// ESERCIZIO 2

        //CREAZIONE DI DIVERSI OGGETTI CON COSTRUTTORI DIFFERENTI

        Specie specie1 = new Specie(); //CONSTRUCTOR DEFAULT
        Specie specie2 = new Specie("Gallotti"); //CONSTRUCTOR SOLO NOME
        Specie specie3 = new Specie(10); //CONSTRUCTOR SOLO POPOLAZIONE
        Specie specie4 = new Specie(9.0); //CONSTRUCTOR SOLO TASSO DI CRESCITA
        Specie specie5 = new Specie("Gallotti", 10, 9.0); //CONSTRUCTOR COMPLETO

        //STAMPA OUTPUT
        System.out.print("Specie 1: ");
        specie1.scriviOutput();
        System.out.print("Specie 2: ");
        specie2.scriviOutput();
        System.out.print("Specie 3: ");
        specie3.scriviOutput();
        System.out.print("Specie 4: ");
        specie4.scriviOutput();
        System.out.print("Specie 5: ");
        specie5.scriviOutput();

        /// MODIFICA VALORI
        modificaValori(specie1, specie2, specie3, specie4, specie5);

        System.out.print("\n FINE ESERCIZIO 2 \n");

        /// ANDREA FILICE, 4Ci, 08/10/2025
        /// ESERCIZIO 3

        //IMPOSTA SPECIE
        Specie specieUtente1 = new Specie();
        Specie specieUtente2 = new Specie();

        System.out.println("Inserisci i dati della prima specie: ");
        specieUtente1.leggiInput();
        System.out.println("Inserisci i dati della seconda specie: ");
        specieUtente2.leggiInput();

        //CONFRONTA LA POPOLAZIONE
        if(specieUtente1.getPopolazione() < specieUtente2.getPopolazione()){
            System.out.println("La specie utente 1 ha minor popolazione finale");
            System.out.println("La popolazione supererà la seconda fra " + specieUtente1.confrontaSpecie(specieUtente2) + " anni.");
        }
        else{
            System.out.println("La specie utente 2 ha minor popolazione finale");
            System.out.println("La popolazione supererà la prima fra " + specieUtente2.confrontaSpecie(specieUtente1) + " anni.");
        }
    }

    public static void modificaValori(Specie specie1, Specie specie2, Specie specie3, Specie specie4, Specie specie5){
        /// Specie 1
        specie1.setNome("Mina");
        specie1.setPopolazione(104);
        specie1.setTassoCrescita(67);
        System.out.print("Specie 1 (modificato): ");
        specie1.scriviOutput();

        /// Specie 2
        specie2.setPopolazione(670);
        specie2.setTassoCrescita(4);
        System.out.print("Specie 2 (modificato): ");
        specie2.scriviOutput();

        /// Specie 3
        specie3.setNome("Mocchi");
        specie3.setTassoCrescita(69);
        System.out.print("Specie 3 (modificato): ");
        specie3.scriviOutput();

        /// Specie 4
        specie4.setNome("Rossini");
        specie4.setPopolazione(400);
        System.out.print("Specie 4 (modificato): ");
        specie4.scriviOutput();

        /// Specie 5
        specie5.setPopolazione(700);
        specie5.setNome("Filice");
        System.out.print("Specie 5 (modificato): ");
        specie5.scriviOutput();
    }
}

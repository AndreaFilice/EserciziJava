public class SpecieSecondaProvaDemo {
    public static void main(String[] args) {
        SpecieSecondaProva specieDelMese = new SpecieSecondaProva();

        specieDelMese.leggiInput();
        specieDelMese.scriviOutput();

        System.out.println("La popolazione prevista in base al tasso di crescita tra 10 anni è: " + specieDelMese.prediciPopolazione(10) + "\n");

        //VALORI MESSI MANUALMENTE
        specieDelMese.setSpecie("Panthera tigris tigris", 3750, 30);
        specieDelMese.scriviOutput();
        System.out.println("La popolazione prevista in base al tasso di crescita tra 10 anni è: " + specieDelMese.prediciPopolazione(10) + "\n");
    }
}

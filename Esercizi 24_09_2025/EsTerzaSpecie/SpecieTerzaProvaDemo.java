public class SpecieTerzaProvaDemo {
    public static void main(String[] args) {
        SpecieTerzaProva specieDelMese = new SpecieTerzaProva();

        specieDelMese.leggiInput();
        specieDelMese.scriviOutput();

        System.out.println("Nome da metodo get: " + specieDelMese.getNome());
        System.out.println("Popolazione da metodo get: " + specieDelMese.getPopolazione());
        System.out.println("Tasso di crescita da metodo get: " + specieDelMese.getTassoCrescita());

        System.out.println("La popolazione prevista in base al tasso di crescita tra 10 anni è: " + specieDelMese.prediciPopolazione(10) + "\n");

        //VALORI MESSI MANUALMENTE
        specieDelMese.setSpecie("Panthera tigris tigris", 3750, 30);
        specieDelMese.scriviOutput();
        System.out.println("La popolazione prevista in base al tasso di crescita tra 10 anni è: " + specieDelMese.prediciPopolazione(10) + "\n");
    }
}
public class SpeciePrimaProvaDemo {

    public static void main(String[] args) {
        SpeciePrimaProva specieDelMese = new SpeciePrimaProva();

        specieDelMese.leggiInput();
        specieDelMese.scriviOutput();

        System.out.println("La popolazione prevista in base al tasso di crescita tra 10 anni è: " + specieDelMese.prediciPopolazione(10) + "\n");

        //ATTRIBUTI MODIFICATI MANUALMENTE

        specieDelMese.nome = "Panthera tigris tigris";
        specieDelMese.popolazione = 3750;
        specieDelMese.tassoCrescita = 30;

        specieDelMese.scriviOutput();
        System.out.println("La popolazione prevista in base al tasso di crescita tra 10 anni è: " + specieDelMese.prediciPopolazione(10));
    }
}

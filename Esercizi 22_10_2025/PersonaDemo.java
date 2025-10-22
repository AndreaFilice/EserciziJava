public class PersonaDemo {
    public static void main(String[] args) {
        //VARIABILI
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        //LEGGI INPUT
        System.out.println("DATI DELLA PRIMA PERSONA: ");
        persona1.leggiInput();
        System.out.println("DATI DELLA SECONDA PERSONA: ");
        persona2.leggiInput();

        //SCRIVI OUTPUT
        System.out.println("PRIMA PERSONA: ");
        persona1.scriviOutput();
        System.out.println("SECONDA PERSONA: ");
        persona2.scriviOutput();

        //DATI IMC
        float totaleIMC = 0;
        totaleIMC = Persona.indiceMCorporea(persona1) + Persona.indiceMCorporea(persona2);
        System.out.println("IMC PRIMA PERSONA: " + prendiStatoIMC(persona1));
        System.out.println("IMC SECONDA PERSONA: " + prendiStatoIMC(persona2));

        System.out.println("MEDIA IMC: " + (totaleIMC / 2));
    }

    public static String prendiStatoIMC(Persona persona){
        float imc = Persona.indiceMCorporea(persona);

        if(imc > 40)
            return "Graveobbeso";
        else if(imc >= 30 && imc < 40)
            return "Obeso";
        else if (imc >= 25 && imc < 30)
            return "Sovrappeso";
        else if(imc >= 18.5 && imc < 25)
            return "Normale";
        else
            return "Magro";
    }
}

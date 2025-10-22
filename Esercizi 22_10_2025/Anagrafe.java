import java.util.Scanner;

public class Anagrafe {
    //ATTRIBUTI
    private Persona[] persone;
    private int numeroDiPersone;

    public Anagrafe(int numeroDiPersoneIniziale){
        persone = new Persona[numeroDiPersoneIniziale];
        numeroDiPersone = numeroDiPersoneIniziale;
    }

    public void inserimentoDati(){
        for(int i = 0; i < persone.length; i++){
            System.out.println("-- INSERISCI I DATI DELLA PERSONA NUMERO " + (i+1) + ": ");
            persone[i].leggiInput();
        }
    }

    public void visualizzaPersone(){
        for(int i = 0; i < persone.length; i++){
            System.out.println("-- DATI DELLA PERSONA NUMERO " + (i+1) + ": ");
            persone[i].scriviOutput();
        }
    }

    public int etaMinore(){
        //TODO: Aggiungere un'array per verificare più condizioni
        int min = 100;

        for(int i = 0; i < persone.length; i++){
            if(persone[i].eta() < min){
                min = persone[i].eta();
            }
        }

        return min;
    }

    public float imcMaggiore(){
        //TODO: Aggiungere un'array per verificare più condizioni
        float max = 0;

        for(int i = 0; i < persone.length; i++){
            if(Persona.indiceMCorporea(persone[i]) > max){
                max = Persona.indiceMCorporea(persone[i]);
            }
        }

        return max;
    }
}

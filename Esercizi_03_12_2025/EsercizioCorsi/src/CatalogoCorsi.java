import java.util.ArrayList;

public class CatalogoCorsi {
    //ATTRIBUTI
    public ArrayList<Corsi> corsi = new ArrayList<>();

    public void aggiungiCorso(Corsi corso){
        corsi.add(corso);
        System.out.println("Corso aggiunto correttamente!");
    }

    public void mostraCorsi(){
        for (int i = 0; i < corsi.size(); i++) {
            System.out.println("\nTIPO DI CORSO: " + ((corsi.get(i) instanceof CorsoOnline) ? "Corso Online" : "Corso In Presenza"));
            System.out.println(corsi.get(i).descrivi());
        }
    }
}

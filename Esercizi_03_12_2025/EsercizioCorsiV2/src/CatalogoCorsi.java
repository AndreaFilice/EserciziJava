import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoCorsi {
    //ATTRIBUTI
    private ArrayList<Corsi> corsi = new ArrayList<>();
    private enum tipoDiCorso  {
        ONLINE,
        PRESENZA
    };

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

    public int getIndexByName(tipoDiCorso corsoTipo, String nomeCorso){
        for (int i = 0; i < corsi.size(); i++) {
            if(corsoTipo == tipoDiCorso.ONLINE && corsi.get(i) instanceof CorsoOnline){
                if(corsi.get(i).getNome().equals(nomeCorso))
                    return i;
            }
            else if(corsoTipo == tipoDiCorso.PRESENZA && corsi.get(i) instanceof CorsoInPresenza){
                if(corsi.get(i).getNome().equals(nomeCorso))
                    return i;
            }
        }

        return -1;
    }

    public void modificaCorso(){
        Scanner t = new Scanner(System.in);

        System.out.println("Inserisci il tipo di corso (Online o Presenza): ");
        String corsoString = t.next();

        tipoDiCorso corso = (corsoString.equalsIgnoreCase("Online") ? tipoDiCorso.ONLINE : tipoDiCorso.PRESENZA);

        System.out.println("Inserisci il nome corso: ");
        String nomeCorso = t.next();

        int index = getIndexByName(corso, nomeCorso);


    }
}

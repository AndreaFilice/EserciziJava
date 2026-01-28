import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;

public class GestorePolizze {
    //ATTRIBUTI
    private Scanner t = new Scanner(System.in);
    private ArrayList<PolizzaAssicurativa> polizze = new ArrayList<PolizzaAssicurativa>();

    //METODI
    public void inserisciPolizza(){
        /// Inizializza la nuova Polizza con i valori.
        UUID userID = UUID.randomUUID();
        String nomeTitolare;
        int massimalePolizza;
        char polizzaAttiva;

        /// Inserisci i valori con lo Scanner
        /// @PARAMETER nessun parametro da inserire.
        System.out.println("Inserisci il massimale della Polizza: ");
        massimalePolizza = t.nextInt();
        System.out.println("Inserisci il nome del titolare della Polizza: ");
        nomeTitolare = t.next();
        System.out.println("La polizza è attiva? (S/N)");
        t.nextLine();
        polizzaAttiva = t.next().charAt(0);

        /// Creazione del nuovo oggetto
        PolizzaAssicurativa temp = new PolizzaAssicurativa(userID, nomeTitolare, massimalePolizza, getActiveState(polizzaAttiva));
        polizze.add(temp);
    }

    /// Questo metodo ritorna il valore di una variabile char per l'userInput tramite le opzioni
    /// @FALLBACK: La regola di Fallback è che la polizza diventa FALSE
    /// @PARAMETER: char userInput = Input dell'utente.
    public boolean getActiveState(char userInput){return (userInput == 'S' || userInput == 's') ? true : false;}

    public PolizzaAssicurativa cercaPolizza(String uuidPolizza){
        /// Questo metodo ritorna la polizza con l'UUID che l'utente vuole cercare.
        /// @FALLBACK: La regola di Fallback è che la polizza sarà NULL.
        /// @PARAMETER: String uuidPolizza = Input dell'utente in base all'UUID della polizza.

        for(PolizzaAssicurativa polizza : polizze){
            if (polizza.getNumeroDellaPolizza().equals(UUID.fromString(uuidPolizza)))
                return polizza;
        }

        return null;
    }

    public void stampaPolizze(){
        System.out.println("\nPOLIZZE");

        if(polizze.isEmpty()){
            System.out.println("Nessuna polizza all'interno dell'assicurazione.");
        }
        else {
            polizze.forEach(polizza -> {
                polizza.scriviOutput();
            });
        }

        System.out.println("\n");
    }
}

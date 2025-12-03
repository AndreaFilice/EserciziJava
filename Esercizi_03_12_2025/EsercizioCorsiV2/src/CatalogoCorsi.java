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

        //TROVA IL CORSO DAL NOME E IL TIPO
        System.out.println("Inserisci il tipo di corso (Online o Presenza): ");
        String corsoString = t.next();
        tipoDiCorso corso = (corsoString.equalsIgnoreCase("Online") ? tipoDiCorso.ONLINE : tipoDiCorso.PRESENZA);
        System.out.println("Inserisci il nome corso: ");
        String nomeCorso = t.next();

        int index = getIndexByName(corso, nomeCorso);

        if(index == -1){
            System.out.println("ERRORE. NOME DEl CORSO O TIPO DI CORSO NON TROVATO.");
        }
        else {
            Corsi corsoSelezionato = corsi.get(index);
            boolean continueEditing = true;

            while (continueEditing){
                System.out.println("1. Modifica il nome del corso");
                System.out.println("2. Modifica il docente del corso");
                System.out.println("3. Modifica la durata del corso");
                if(corso == tipoDiCorso.ONLINE){
                    System.out.println("4. Modifica la piattaforma del corso");
                    System.out.println("5. Modifica se il corso è Live");
                }
                else
                    System.out.println("4. Modifica l'indirizzo del corso");
                int scelta = t.nextInt();

                switch(scelta){
                    case 1:
                        System.out.println("Inserisci il nuovo nome del corso: ");
                        String nomeNuovo = t.next();
                        corsi.get(index).setNome(nomeNuovo);
                        continueEditing = false;
                        break;
                    case 2:
                        System.out.println("Inserisci il nuovo nome del docente del corso: ");
                        String docenteNuovo = t.next();
                        corsi.get(index).setDocente(docenteNuovo);
                        continueEditing = false;
                        break;
                    case 3:
                        System.out.println("Inserisci la nuova durata del corso: ");
                        int durataNuovo = t.nextInt();
                        corsi.get(index).setDurataOre(durataNuovo);
                        continueEditing = false;
                        break;
                    case 4:
                        String nuovaStringa;
                        if(corso == tipoDiCorso.ONLINE){
                            System.out.println("Inserisci la nuova piattaforma del corso: ");
                            nuovaStringa = t.next();
                            CorsoOnline corsoDaModificare = (CorsoOnline) corsi.get(index);
                            corsoDaModificare.setPiattaforma(nuovaStringa);
                        }
                        else{
                            System.out.println("Inserisci il nuovo indirizzo del corso: ");
                            nuovaStringa = t.next();
                            CorsoInPresenza corsoDaModificare = (CorsoInPresenza) corsi.get(index);
                            corsoDaModificare.setIndirizzo(nuovaStringa);
                        }
                        continueEditing = false;
                        break;
                    case 5:
                        if(corso == tipoDiCorso.ONLINE){
                            System.out.println("Inserisci se il corso è live (si/no): ");
                            String live = t.next();
                            CorsoOnline corsoDaModificare = (CorsoOnline) corsi.get(index);
                            corsoDaModificare.setLive((live.equalsIgnoreCase("si") ? true : false));
                            continueEditing = false;
                        }
                        else
                            continueEditing = true;
                        break;
                    default:
                        continueEditing = true;
                        break;
                }
            }
        }
    }
}

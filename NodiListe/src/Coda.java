public class Coda {
    //ATTRIBUTI
    private Nodo inizio;
    private Nodo fine;

    //COSTRUTTORE
    public Coda(){
        this.inizio = null;
        this.fine = null;
    }

    //METODI
    public void addToQueue(Paziente dati) {
        Nodo nuovaFine = new Nodo(dati, null);

        if(fine != null) {
            fine.setCollegamento(nuovaFine);
            fine = nuovaFine;
        }
        else {
            inizio = nuovaFine;
            fine = nuovaFine;
        }
    }

    public Paziente getNext() {
        Nodo nodoDaEstrarre = inizio;

        if(inizio != null){
            inizio = inizio.getCollegamento();
            return nodoDaEstrarre.getValori();
        }
        else
            return null;
    }

    public boolean removeFromQueue() {
        if(inizio != null) {
            inizio = inizio.getCollegamento();
            return true;
        }
        else
            return false;
    }

    public boolean isEmpty(){return inizio == null;}

    public int lunghezza(){
        int counter = 0;
        Nodo pos = inizio;

        while (pos != null) {
            counter++;
            pos = pos.getCollegamento();
        }

        return counter;
    }
}
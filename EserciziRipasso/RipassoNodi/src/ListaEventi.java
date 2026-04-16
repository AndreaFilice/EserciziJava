public class ListaEventi {
    //ATTRIBUTI
    private NodoListaEvento testa;
    private NodoListaEvento fine;

    //COSTRUTTORE
    public ListaEventi() {
        testa = null;
        fine = null;
    }

    //METODI
    public void aggiungiEvento(Evento evento) {
        testa = new NodoListaEvento(evento, testa);
    }

    public void aggiungiEventoInCoda(Evento evento) {
        NodoListaEvento temp = new NodoListaEvento(evento, null);

        if(fine != null) {
            fine.setCollegamento(temp);
            fine = temp;
        }
        else {
            fine = temp;
            testa = temp;
        }
    }

    public void visualizzaEventi() {
        NodoListaEvento pos = testa;

        System.out.println("VISUALIZZAZIONE EVENTI:");
        while(pos != null) {
            System.out.println(pos.toString());
            pos = pos.getCollegamento();
        }
    }

    public void cercaEvento(String titolo) {
        NodoListaEvento pos = testa;
        boolean trovato = false;

        while(pos != null && !trovato) {
            if(pos.getDati().getTitolo().equals(titolo)) {
                System.out.println("EVENTO TROVATO!");
                System.out.println(pos.getDati().toString());
                trovato = true;
            }

            pos = pos.getCollegamento();
        }
    }

    public boolean rimuoviEvento(String titolo) {
        NodoListaEvento pos = testa;

        if(testa == null)
            return false;

        if(testa.getDati().getTitolo().equals(titolo)) {
            testa = testa.getCollegamento();
            return true;
        }

        while(pos.getCollegamento() != null) {
            if(pos.getCollegamento().getDati().getTitolo().equalsIgnoreCase(titolo)) {
                pos.setCollegamento(pos.getCollegamento().getCollegamento());
                return true;
            }

            pos = pos.getCollegamento();
        }

        return false;
    }
}

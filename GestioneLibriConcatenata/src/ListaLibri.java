import java.io.*;
import java.util.Scanner;

public class ListaLibri {
    //ATTRIBUTI
    private NodoListaLibro testa;
    private NodoListaLibro fine;

    //COSTRUTTORE
    public ListaLibri() {
        testa = null;
        fine = null;
    }

    //METODI
    public void aggiungiLibro(Libro libro) {
        testa = new NodoListaLibro(libro, testa);

        if(fine == null) fine = testa;
    }

    public void aggiungiLibroInCoda(Libro libro) {
        NodoListaLibro nuovaCoda = new NodoListaLibro(libro, null);

        if(fine == null) {
            fine = nuovaCoda;
            testa = nuovaCoda;
        }
        else {
            fine.setCollegamento(nuovaCoda);
            fine = nuovaCoda;
        }
    }

    public void visualizzaLibri() {
        NodoListaLibro pos = testa;

        while(pos != null) {
            Libro temp = pos.getDati();
            System.out.println(String.format("\nTitolo: %s\nISBN: %s\nTipologia: %s\nNumero Pagine: %s\nDisponibile: %s\n",
                    temp.getTitolo(), temp.getIsbn(), (temp instanceof LibroSaggistica) ? "Saggistica" : "Narrativa",
                    temp.getNumeroPagine(), (temp.isDisponibile()) ? "Disponibile" : "Non Disponibile"
            ));
            pos = pos.getCollegamento();
        }
    }

    public Libro cercaLibro(String isbn) {
        NodoListaLibro pos = testa;

        while(pos != null) {
            if(pos.getDati().getIsbn().equals(isbn))
                return pos.getDati();
            pos = pos.getCollegamento();
        }

        return null;
    }

    public boolean rimuoviLibro(String isbn) {
        NodoListaLibro pos = testa;

        if(testa.getDati().getIsbn().equals(isbn)) {
            testa = testa.getCollegamento();
            return true;
        }

        while(pos.getCollegamento() != null) {
            if(pos.getCollegamento().getDati().getIsbn().equals(isbn)) {
                pos.setCollegamento(pos.getCollegamento().getCollegamento());
                return true;
            }
            pos = pos.getCollegamento();
        }

        return false;
    }

    public void visualizzaLibriDisponibili() {
        NodoListaLibro pos = testa;

        while(pos != null) {
            Libro temp = pos.getDati();
            if(temp.isDisponibile()){
                System.out.println(String.format("\nTitolo: %s\nISBN: %s\nTipologia: %s\nNumero Pagine: %s\nDisponibile: %s\n",
                        temp.getTitolo(), temp.getIsbn(), (temp instanceof LibroSaggistica) ? "Saggistica" : "Narrativa",
                        temp.getNumeroPagine(), (temp.isDisponibile()) ? "Disponibile" : "Non Disponibile"
                ));
            }
            pos = pos.getCollegamento();
        }
    }

    public int contaLibri() {
        NodoListaLibro pos = testa;
        int contatore = 0;

        while(pos != null) {
            contatore++;
            pos = pos.getCollegamento();
        }

        return contatore;
    }

    public int contaLibriNarrativa() {
        NodoListaLibro pos = testa;
        int contatore = 0;

        while(pos != null) {
            Libro temp = pos.getDati();
            if(temp instanceof LibroNarrativa) contatore++;

            pos = pos.getCollegamento();
        }

        return contatore;
    }

    public void salvaSuFile(String nomeFile) {
        PrintWriter out = null;
        NodoListaLibro pos = testa;

        try {
            out = new PrintWriter(new FileOutputStream(nomeFile, true));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        while(pos != null) {
            Libro temp = pos.getDati();

            out.println(temp.toString());
            pos = pos.getCollegamento();
        }

        out.close();
    }

    public void caricaFile(String nomeFile) {
        File file = new File(nomeFile);
        Scanner in = null;

        try {
            in = new Scanner(file);
            while(in.hasNextLine()) {
                String[] values = in.nextLine().split(";");
                Libro temp = null;

                if(values[0] == "Saggistica")
                    temp = new LibroSaggistica(values[2], values[1], values[5], Integer.parseInt(values[3]), Boolean.parseBoolean(values[4]));
                else
                    temp = new LibroNarrativa(values[2], values[1], values[5], Integer.parseInt(values[3]), Boolean.parseBoolean(values[4]));

                aggiungiLibroInCoda(temp);
            }

            in.close();
        }
        catch (FileNotFoundException e) {System.out.println("ERRORE: " + e.getMessage());}
    }
}

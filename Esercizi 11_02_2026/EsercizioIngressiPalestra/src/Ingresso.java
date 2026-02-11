import java.util.Scanner;

public class Ingresso {
    //ATTRIBUTI
    private Persona cliente;
    private TipoDiAbbonamento tipoDiAbbonamento;
    private int minutiAllenamento;

    //COSTRUTTORI
    public Ingresso(){}
    public Ingresso(Persona cliente, TipoDiAbbonamento tipoDiAbbonamento, int minutiAllenamento){
        this.cliente = cliente;
        this.tipoDiAbbonamento = tipoDiAbbonamento;
        this.minutiAllenamento = minutiAllenamento;
    }

    //SETTERS AND GETTERS
    public Persona getCliente() {return cliente;}
    public void setCliente(Persona cliente) {this.cliente = cliente;}

    public TipoDiAbbonamento getTipoDiAbbonamento() {return tipoDiAbbonamento;}
    public void setTipoDiAbbonamento(TipoDiAbbonamento tipoDiAbbonamento) {this.tipoDiAbbonamento = tipoDiAbbonamento;}

    public int getMinutiAllenamento() {return minutiAllenamento;}
    public void setMinutiAllenamento(int minutiAllenamento) {this.minutiAllenamento = minutiAllenamento;}

    //METODI
    public String toString(){
        return String.format("%s %s %s %s", cliente.getNome(), cliente.getCodiceFiscale(), tipoDiAbbonamento.toString(), minutiAllenamento);
    }

    public int puntiFedelta(){
        if(minutiAllenamento >= 30 && minutiAllenamento <= 60)
            return 1;
        else if(minutiAllenamento >= 60)
            return 3;
        else
            return 0;
    }

    public void leggiInput(){
        Scanner t = new Scanner(System.in);

        System.out.println("Inserisci i minuti di allenamento: ");
        int minutiDiAllenamento = t.nextInt();
        if(minutiDiAllenamento < 0)
            throw new MinutiNegativiException("ERRORE: Minuti di allenamento negativi.");

        this.minutiAllenamento = minutiDiAllenamento;

        try{
            System.out.println("Inserisci il tipo di abbonamento (Open, Corsi o Piscina): ");
            String tipoDiAllenamento = t.next();
            TipoDiAbbonamento tipoDiAbbonamento = TipoDiAbbonamento.valueOf(tipoDiAllenamento.toUpperCase());
            this.tipoDiAbbonamento = tipoDiAbbonamento;
        }
        catch(IllegalArgumentException | NullPointerException e){
            System.out.println("ERRORE: Tipo di abbonamento non trovato.");
        }
    }
}

public class ScontoQuantita extends PoliticaSconto{
    //ATTRIBUTI
    private int quantitaMinima;
    private double percentualeSconto;

    //COSTRUTTORE
    public ScontoQuantita(int quantitaMinima, double percentualeSconto){
        if(quantitaMinima <= 0){
            System.out.println("ERRORE. Impossibile continuare con un'unità minima di 0 o inferiore.");
            System.exit(0);
        }
        else {
            this.quantitaMinima = quantitaMinima;
            this.percentualeSconto = percentualeSconto;
        }
    }

    //METODI

    @Override
    public double calcolaSconto(int numeroArticoli, double prezzoArticolo){
        if(numeroArticoli > quantitaMinima)
            return this.percentualeSconto;
        else
            return 0;
    }
}

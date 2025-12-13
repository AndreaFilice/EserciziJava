public class Progetti {
    //* ATTRIBUTES
    private Progetto[] arrayProgetti;
    private int numeroProgetti;

    //* CONSTRUCTOR
    public Progetti(int max){
        arrayProgetti = new Progetto[max];
    }

    public void inserisciProgetti(Progetto prj){
        if(numeroProgetti < arrayProgetti.length){
            arrayProgetti[numeroProgetti] = prj;
            numeroProgetti++;
        }
        else
            System.out.println("ARCHIVIO PROGETTI PIENO!");
    }

    public void visualizzaProgetti(){
        for (int i = 0; i < numeroProgetti; i++) {
            System.out.println("PROGETTO NUMERO " + (i+1) + ": ");
            arrayProgetti[i].scriviOutput();
        }
    }

    public double progettoMinoreBudget(){
        double min = 10000;

        for (int i = 0; i < numeroProgetti; i++) {
            if(arrayProgetti[i].getBudget() < min)
                min = arrayProgetti[i].getBudget();
        }

        return min;
    }

    public double valoreMedioBudget(){
        double totale = 0;

        for (int i = 0; i < numeroProgetti; i++) {
            totale += arrayProgetti[i].getBudget();
        }

        if(numeroProgetti > 0)
            return (totale / numeroProgetti);
        else
            return -1;
    }
}

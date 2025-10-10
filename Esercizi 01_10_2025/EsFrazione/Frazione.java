public class Frazione {

    /// ANDREA FILICE, 4Ci, 01/10/2025 frocio di merda gay nero
    /// 1. utilizzando la classe Frazione precedentemente prescritta aggiungi metodi necessari per effettuare la somma, la differenza e il prodotto di frazione.

    //ATTRIBUTI
    private int numeratore, denominatore;

    //COSTRUTTORE
    public Frazione(){}

    public Frazione(int num, int den){
        numeratore = num;
        denominatore = den;
        Semplifica();
    }

    //METODI
    public String toString(){return numeratore + "/" + denominatore;}

    public void Semplifica(){
        int MCD = MCD(numeratore, denominatore);
        numeratore = (numeratore/MCD);
        denominatore = (denominatore/MCD);
    }

    public int MCD(int a, int b) {
        if (a % b != 0) {
            int resto = a % b;
            return MCD(b, resto);
        } else
            return b;
    }

    public int mcm(int a, int b){
        if(b > 0)
            return (a*b) / MCD(a, b);
        else
            return 0;
    }

    public Frazione Somma(Frazione altraFrazione){
        if(denominatore == altraFrazione.denominatore){
            int numOggetto = numeratore + altraFrazione.numeratore;
            int denOggetto = altraFrazione.denominatore;
            return new Frazione(numOggetto, denOggetto);
        }
        else{
            int mcm = mcm(denominatore, altraFrazione.denominatore);
            int numOggetto = ((numeratore * altraFrazione.denominatore)) + ((altraFrazione.numeratore * denominatore));
            int denOggetto = mcm;
            return new Frazione(numOggetto, denOggetto);
        }
    }

    public Frazione Sottrazione(Frazione altraFrazione){
        if(denominatore == altraFrazione.denominatore){
            int numOggetto = numeratore - altraFrazione.numeratore;
            int denOggetto = altraFrazione.denominatore;
            return new Frazione(numOggetto, denOggetto);
        }
        else{
            int mcm = mcm(denominatore, altraFrazione.denominatore);
            int numOggetto = ((numeratore * altraFrazione.denominatore)) - ((altraFrazione.numeratore * denominatore));
            int denOggetto = mcm;
            return new Frazione(numOggetto, denOggetto);
        }
    }

    public Frazione Prodotto(Frazione altraFrazione){
        int numOggetto = numeratore * altraFrazione.numeratore;
        int denOggetto = denominatore * altraFrazione.denominatore;

        return new Frazione(numOggetto, denOggetto);
    }
}

public class Demo {
    static void main() {
        CatalogoCorsi corsi = new CatalogoCorsi();

        //CORSI STATICI
        CorsoOnline online1 = new CorsoOnline("Andrea", "Brunetti", 25, "Teams", false);
        CorsoOnline online2 = new CorsoOnline("Mina", "Minarelli", 25, "Zoom", true);

        CorsoInPresenza presenza1 = new CorsoInPresenza("Andrea", "Sauro", 4, "Via San Carlo");
        CorsoInPresenza presenza2 = new CorsoInPresenza("Andrea", "Rommaso Tuggeri", 7, "Via San Carlo");

        //AGGIUNGI CORSI
        corsi.aggiungiCorso(online1);
        corsi.aggiungiCorso(presenza1);
        corsi.aggiungiCorso(online2);
        corsi.aggiungiCorso(presenza2);

        //MOSTRA CORSI
        corsi.mostraCorsi();
    }
}

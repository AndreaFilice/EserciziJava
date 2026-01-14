import java.util.ArrayList;

public class RegistroSpedizioni {
    //ATTRIBUTI
    public ArrayList<Spedizione> spedizioni = new ArrayList<>();

    public void registraSpedizione(Spedizione spedizione) {
        spedizioni.add(spedizione);
    }

    public void visualizzaSpedizioni(){
        spedizioni.forEach(spedizione -> {
            spedizione.scriviOutput();
        });
        System.out.print("\n");
    }

    public Veicolo veicoloPiuUsato(){
        Veicolo veicoloPiuUsato = null;
        double maxKilometri = 0;

        for (Spedizione spedizione : spedizioni) {
            if(maxKilometri < spedizione.getVeicoloAssegnato().getKilometriPercorsi()){
                veicoloPiuUsato = spedizione.getVeicoloAssegnato();
                maxKilometri = spedizione.getVeicoloAssegnato().getKilometriPercorsi();
            }
        }

        return veicoloPiuUsato;
    }

    public double caricoMedioTotale(){
        double somma = 0;

        for (Spedizione spedizione : spedizioni) {somma += spedizione.getCaricoNetto();}

        if(spedizioni.size() < 0)
            return -1;
        else
            return somma/spedizioni.size();
    }
}

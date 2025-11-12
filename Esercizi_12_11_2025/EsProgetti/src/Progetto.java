import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Progetto {
    //* ATTRIBUTI
    private Dipendente dipendente;
    private String titoloProgetto;
    private Date dataInizio;
    private double budget;

    //* COSTRUTTORI
    public Progetto(){}
    public Progetto(Dipendente dipendente, String titoloProgetto, Date dataInizio, double budget){
        setProgetto(dipendente, titoloProgetto, dataInizio, budget);
    }

    //* METODI SET e GET
    public void setProgetto(Dipendente dipendente, String titoloProgetto, Date dataInizio, double budget){
        this.dipendente = dipendente;
        this.titoloProgetto = titoloProgetto;
        this.dataInizio = dataInizio;
        this.budget = budget;
    }

    public void setDipendente(Dipendente dipendente){this.dipendente = dipendente;}
    public void setTitoloProgetto(String titoloProgetto){this.titoloProgetto = titoloProgetto;}
    public void setDataInizio(Date dataInizio){this.dataInizio = dataInizio;}
    public void setBudget(double budget){this.budget = budget;}

    public Dipendente getDipendente(){return dipendente;}
    public String getTitoloProgetto(){return titoloProgetto;}
    public Date getDataInizio(){return dataInizio;}
    public double getBudget(){return budget;}

    //* METODI
    public boolean equals(Progetto obj){
        return obj.titoloProgetto.equals(this.titoloProgetto) && obj.budget == this.budget;
    }

    public void scriviOutput(){
        System.out.println("Nome del progetto: " + titoloProgetto + ", matricola dipendente: " + dipendente.getMatricola()
                + ", Data di inizio del progetto: " + dataInizio + ", Budget progetto: " + budget);
    }
}

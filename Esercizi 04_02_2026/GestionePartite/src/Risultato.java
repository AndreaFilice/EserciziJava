public class Risultato {
    //ATTRIBUTI
    private String squadraCasa;
    private String squadraOspite;
    private int golCasa;
    private int golOspite;

    public Risultato(String squadraCasa, String squadraOspite, int golCasa, int golOspite) {
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.golCasa = golCasa;
        this.golOspite = golOspite;
    }

    //SET E GET
    public String getSquadraCasa() {return squadraCasa;}
    public void setSquadraCasa(String squadraCasa) {this.squadraCasa = squadraCasa;}
    public String getSquadraOspite() {return squadraOspite;}
    public void setSquadraOspite(String squadraOspite) {this.squadraOspite = squadraOspite;}
    public int getGolCasa() {return golCasa;}
    public void setGolCasa(int golCasa) {this.golCasa = golCasa;}
    public int getGolOspite() {return golOspite;}
    public void setGolOspite(int golOspite) {this.golOspite = golOspite;}

    public String toString(){
        return squadraCasa + " " + squadraOspite + " " + golCasa + " " + golOspite;
    }

    public int puntiCasa(){
        if(golCasa > golOspite) return 3;
        else if(golCasa == golOspite) return 1;
        else return 0;
    }

    public int puntiOspite(){
        if(golOspite > golCasa) return 3;
        else if(golOspite == golCasa) return 1;
        else return 0;
    }
}

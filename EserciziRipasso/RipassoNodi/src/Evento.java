public abstract class Evento {
    //ATTRIBUTI
    private String titolo;
    private String luogo;
    private String data;

    //COSTRUTTORE
    public Evento(String titolo, String luogo, String data) {
        this.titolo = titolo;
        this.luogo = luogo;
        this.data = data;
    }

    //SET e GET
    public String getTitolo() {return titolo;}
    public String getLuogo() {return luogo;}
    public String getData() {return data;}
    public void setTitolo(String titolo) {this.titolo = titolo;}
    public void setLuogo(String luogo) {this.luogo = luogo;}
    public void setData(String data) {this.data = data;}

    //METODI
    public abstract String toString();
}
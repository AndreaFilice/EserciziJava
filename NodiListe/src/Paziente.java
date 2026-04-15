public class Paziente {
    //ATTRIBUTI
    private String nome;
    private String sintomo;
    private int codice;

    //COSTRUTTORE
    public Paziente(String nome, String sintomo, int codice) {
        this.nome = nome;
        this.sintomo = sintomo;
        this.codice = codice;
    }

    //SETTER e GETTER
    public String getNome() {return this.nome;}
    public String getSintomo() {return this.sintomo;}
    public int getCodice() {return this.codice;}
    public void setNome(String nome) {this.nome = nome;}
    public void setSintomo(String sintomo) {this.sintomo = sintomo;}
    public void setCodice(int codice) {this.codice = codice;}
}

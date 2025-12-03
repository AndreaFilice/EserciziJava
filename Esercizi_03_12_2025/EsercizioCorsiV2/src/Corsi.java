import java.util.Comparator;

public abstract class Corsi {
    //ATTRIBUTI
    private String nome;
    private String docente;
    private int durataOre;

    //CONSTRUCTOR
    public Corsi(String nome, String docente, int durataOre) {
        setCorso(nome, docente, durataOre);
    }

    //SET e GET
    public void setCorso(String nome, String docente, int durataOre){
        if(durataOre <= 0){
            System.out.println("ERRORE: DURATA ORE NON VALIDA.");
            System.exit(1);
        }
        else {
            this.nome = nome;
            this.docente = docente;
            this.durataOre = durataOre;
        }
    }
    public void setNome(String nome) {this.nome = nome;}
    public void setDocente(String docente) {this.docente = docente;}
    public void setDurataOre(int durataOre) {this.durataOre = durataOre;}

    public String getNome() {return this.nome;}
    public String getDocente() {return this.docente;}
    public int getDurataOre() {return this.durataOre;}

    //METODI
    public abstract String descrivi();
}

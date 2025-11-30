public class Animale {
    //ATTRIBUTI
    private String nome;
    private int eta;
    private double peso;

    //COSTRUTTORI
    public Animale(String nome, int eta, double peso) {
        setAnimale(nome, eta, peso);
    }

    //METODI SET e GET
    public void setAnimale(String nome, int eta, double peso){
        this.nome = nome;
        this.eta = eta;
        this.peso = peso;
    }

    public void setNome(String nome){this.nome = nome;}
    public void setEta(int eta){this.eta = eta;}
    public void setPeso(double peso){this.peso = peso;}

    public String getNome(){return this.nome;}
    public int getEta(){return this.eta;}
    public double getPeso(){return this.peso;}

    //METODI
    public void scriviOutput(){
        System.out.println("Nome: " + this.nome + ", età: " + this.eta + ", peso: " + this.peso);
    }
}
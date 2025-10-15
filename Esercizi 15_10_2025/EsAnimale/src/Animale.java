public class Animale {
    //ATTRIBUTI
    private String nome;
    private int eta;
    private double peso;

    //COSTRUTTORI
    public Animale(){setAnimale("Nuovo nome", 0, 0);} //DEFAULT
    public Animale(String nome, int eta, double peso){setAnimale(nome, eta, peso);} //COMPLETO
    public Animale(String nome){setAnimale(nome, 0, 0);} //SOLO STRING
    public Animale(int eta){setAnimale("Nuovo nome", eta, 0);} //SOLO INT
    public Animale(double peso){setAnimale("Nuovo nome", 0, peso);} //SOLO DOUBLE

    //METODI SET

    public void setAnimale(String nuovoNome, int nuovaEta, double nuovoPeso){
        if(nuovoPeso < 0 || nuovaEta < 0)
            System.exit(0);
        else{
            nome = nuovoNome;
            eta = nuovaEta;
            peso = nuovoPeso;
        }
    }

    public void setNome(String nuovoNome){nome = nuovoNome;}
    public void setEta(int nuovaEta){
        if(nuovaEta < 0)
            System.exit(0);
        else
            eta = nuovaEta;
    }

    public void setPeso(double nuovoPeso){
        if(nuovoPeso < 0)
            System.exit(0);
        else
            peso = nuovoPeso;
    }

    //METODI GET
    public String getNome(){return nome;}
    public int getEta(){return eta;}
    public double getPeso(){return peso;}

    //METODI
    public void scriviOutput(){
        System.out.println("Nome: " + nome + ", Età: " + eta + ", Peso: " + peso);
    }
}
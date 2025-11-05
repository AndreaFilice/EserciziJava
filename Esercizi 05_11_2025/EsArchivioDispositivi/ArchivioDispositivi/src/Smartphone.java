public class Smartphone extends Dispositivo{
    //ATTRIBUTI
    private int annoDiAcquisto;
    private int numeroSIM;

    //* CONSTRUCTOR
    public Smartphone(String marca, String modello, int uID, Cliente proprietario, int annoDiAcquisto, int numeroSIM){
        super(marca, modello, uID, proprietario);
        this.annoDiAcquisto = annoDiAcquisto;
        this.numeroSIM = numeroSIM;
    }

    //* METODI SET
    public void setAnnoDiAcquisto(int annoDiAcquisto){this.annoDiAcquisto = annoDiAcquisto;}
    public void setNumeroSIM(int numeroSIM){this.numeroSIM = numeroSIM;}

    //* METODI GET
    public int getAnnoDiAcquisto(){return annoDiAcquisto;}
    public int getNumeroSIM(){return numeroSIM;}

    //* METODI
    @Override
    public void scriviOutput(){
        super.scriviOutput();
        System.out.print(", anno di acquisto: " + annoDiAcquisto + ", numero SIM: " + numeroSIM + "\n");
    }
}

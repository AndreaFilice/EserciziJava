public class Laptop extends Dispositivo{
    //ATTRIBUTI
    private int annoDiAcquisto;
    private int dimensioneRAM;

    //* CONSTRUCTOR
    public Laptop(String marca, String modello, int uID, Cliente proprietario, int annoDiAcquisto, int dimensioneRAM){
        super(marca, modello, uID, proprietario);
        this.annoDiAcquisto = annoDiAcquisto;
        this.dimensioneRAM = dimensioneRAM;
    }

    //* METODI SET
    public void setAnnoDiAcquisto(int annoDiAcquisto){this.annoDiAcquisto = annoDiAcquisto;}
    public void setDimensioneRAM(int dimensioneRAM){this.dimensioneRAM = dimensioneRAM;}

    //* METODI GET
    public int getAnnoDiAcquisto(){return annoDiAcquisto;}
    public int getDimensioneRAM(){return dimensioneRAM;}

    //* METODI
    @Override
    public void scriviOutput(){
        super.scriviOutput();
        System.out.print(", anno di acquisto: " + annoDiAcquisto + ", dimensione RAM: " + dimensioneRAM + "\n");
    }
}
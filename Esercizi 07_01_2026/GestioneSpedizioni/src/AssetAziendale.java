import java.util.Scanner;

public class AssetAziendale {
    //ATTRIBUTES
    private String dataDiAcquisto;
    private Scanner t;

    //CONSTRUCTOR
    public AssetAziendale(String dataDiAcquisto) {this.dataDiAcquisto = dataDiAcquisto;}

    //METODI
    public void leggiInput(){
        System.out.println("Inserisci data di acquisto: ");
        String dataAcquisto = t.next();
        this.dataDiAcquisto = dataAcquisto;
    }

    public void scriviOutput(){
        System.out.println("Data di acquisto: " + this.dataDiAcquisto);
    }

    public String getDataDiAcquisto() {return this.dataDiAcquisto;}
}
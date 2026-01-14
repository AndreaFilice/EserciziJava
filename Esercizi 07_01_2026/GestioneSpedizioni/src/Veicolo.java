import java.util.Scanner;

public class Veicolo extends AssetAziendale{
    //ATTRIBUTES
    private String targa;
    private String marca;
    private String UUID;
    private String tipo;
    private double kilometriPercorsi;
    private Scanner t = new Scanner(System.in);

    public Veicolo(String targa, String marca, String UUID, String tipo, String dataAcquisto, double kilometriPercorsi) {
        super(dataAcquisto);
        if(kilometriPercorsi < 0){
            System.out.println("ERRORE, IMPOSSIBILE CONTINUARE IL PROGRAMMA. Kilometri inferiori a 0");
            System.exit(1);
        }
        else{
            this.targa = targa;
            this.marca = marca;
            this.UUID = UUID;
            this.tipo = tipo;
            this.kilometriPercorsi = kilometriPercorsi;
        }
    }

    public Veicolo(){super("");}

    //METODI
    public String getUUID() {return UUID;}
    public String getTipo() {return tipo;}
    public double getKilometriPercorsi() {return kilometriPercorsi;}

    @Override
    public void leggiInput(){
        System.out.println("Inserisci kilometri percorsi: ");
        double kilometriPercorsi = t.nextDouble();
        t.nextLine();

        if(kilometriPercorsi < 0){
            System.out.println("ERRORE, IMPOSSIBILE CONTINUARE IL PROGRAMMA. Kilometri inferiori a 0");
            System.exit(1);
        }
        else{
            this.kilometriPercorsi = kilometriPercorsi;
            super.leggiInput();
            System.out.println("Inserisci targa: ");
            String targa = t.nextLine();
            this.targa = targa;
            System.out.println("Inserisci marca: ");
            String marca = t.nextLine();
            this.marca = marca;
            System.out.println("Inserisci UUID: ");
            String UUID = t.nextLine();
            this.UUID = UUID;
            System.out.println("Inserisci tipo: ");
            String tipo = t.nextLine();
            this.tipo = tipo;
        }
    }

    public void scriviOutput(){
        System.out.println("Veicolo di targa: " + this.targa + ", UUID: " + this.UUID + ", marca: " + this.marca + ", tipo: " + this.tipo + ", kilometri percorsi: " + this.kilometriPercorsi);
    }
}

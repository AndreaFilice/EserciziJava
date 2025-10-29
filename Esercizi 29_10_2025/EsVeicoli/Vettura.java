import java.util.Scanner;

public class Vettura extends Veicolo{

    //ATTRIBUTI
    private String tipologia;

    //CONSTRUCTOR
    public Vettura(){}
    private Vettura(String targa, String modello, String marca, String tipologia, int annoDiMatricolazione){
        super(targa, modello, marca, annoDiMatricolazione);
        this.tipologia = tipologia;
    }

    //METODO SET
    public void setTipologia(String tipologia){this.tipologia = tipologia;}

    //METODO GET
    public String getTipologia(){return tipologia;}

    //METODI

    @Override
    public void scriviOutput(){
        System.out.println("\nDATI VETTURA: ");
        super.scriviOutput();
        System.out.print(", tipologia: " + tipologia + "\n");
    }

    @Override
    public void leggiInput(){
        Scanner t = new Scanner(System.in);
        super.leggiInput();
        System.out.println("Inserisci la tipologia della vettura: ");
        String tipologiaInput = t.next();
        setTipologia(tipologiaInput);
    }
}
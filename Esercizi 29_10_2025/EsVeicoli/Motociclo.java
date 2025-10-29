import java.util.Scanner;

public class Motociclo extends Veicolo{
    //ATTRIBUTI
    private int cilindrata;

    //CONSTRUCTOR
    public Motociclo(){}
    private Motociclo(String targa, String modello, String marca, int annoDiMatricolazione, int cilindrata){
        super(targa, modello, marca, annoDiMatricolazione);
        this.cilindrata = cilindrata;
    }

    //METODO SET
    public void setCilindrata(int cilindrata){this.cilindrata = cilindrata;}

    //METODO GET
    public int getCilindrata(){return cilindrata;}

    //METODI
    @Override
    public void scriviOutput(){
        System.out.println("\nDATI VETTURA: ");
        super.scriviOutput();
        System.out.print(", cilindrata: " + cilindrata + "\n");
    }

    @Override
    public void leggiInput(){
        Scanner t = new Scanner(System.in);
        super.leggiInput();
        System.out.println("Inserisci la cilindrata del motociclo: ");
        int cilindrataInput = t.nextInt();
        setCilindrata(cilindrataInput);
    }
}
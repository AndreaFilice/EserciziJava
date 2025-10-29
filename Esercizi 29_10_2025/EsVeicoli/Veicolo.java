import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Veicolo {

    //ATTRIBUTI
    protected String targa;
    protected String marca;
    protected String modello;
    protected int annoImmatricolazione;

    //COSTRUTTORE
    public Veicolo(){}
    public Veicolo(String targa, String marca, String modello, int annoImmatricolazione){
        setVeicolo(targa, marca, modello, annoImmatricolazione);
    }

    //METODI SET
    public void setVeicolo(String targa, String marca, String modello, int annoImmatricolazione){
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public void setTarga(String targa){this.targa = targa;}
    public void setMarca(String marca){this.marca = marca;}
    public void setModello(String modello){this.modello = modello;}
    public void setAnnoImmatricolazione(int annoImmatricolazione){this.annoImmatricolazione = annoImmatricolazione;}

    //METODI GET
    public String getTarga(){return targa;}
    public String getModello(){return modello;}
    public String getMarca(){return marca;}
    public int getAnnoImmatricolazione(){return annoImmatricolazione;}

    //METODI
    public void leggiInput(){
        Scanner t = new Scanner(System.in);

        System.out.println("Inserisci la targa del veicolo: ");
        String targaInput = t.nextLine();
        System.out.println("Inserisci il modello del veicolo: ");
        String modelloInput = t.nextLine();
        System.out.println("Inserisci la marca del veicolo: ");
        String marcaInput = t.nextLine();
        System.out.println("Inserisci l'anno di matricolazione: ");
        int annoImmatricolazioneInput = t.nextInt();
        if(annoImmatricolazioneInput < 0)
            System.exit(0);

        setVeicolo(targaInput, marcaInput, modelloInput, annoImmatricolazioneInput);
    }

    public void scriviOutput(){
        System.out.print("Marca: " + marca + ", modello: " + modello + ", targa: " + targa + ", anno di immatricolazione: " + annoImmatricolazione);
    }

    public boolean daRevisionare(){
        Date dataAttuale = new Date();
        Calendar calendario = new GregorianCalendar();
        int annoAttuale = calendario.get(calendario.YEAR); //NOTE: PRENDE L'ANNO ATTUALE.

        if((annoAttuale - annoImmatricolazione) < 4)
            return false;
        else if((annoAttuale - annoImmatricolazione) == 4)
            return true;
        else
           return (annoAttuale - annoImmatricolazione - 4) %2 == 0;
    }
}
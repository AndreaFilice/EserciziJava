import java.util.Scanner;

public class Anagrafe {
    public static void main(String[] args) {
        //VARIABILI
        Scanner t = new Scanner(System.in);

        System.out.println("Inserisci il numero di persone: ");

        int numeroDiPersone = t.nextInt();
        Persona[] persone = new Persona[numeroDiPersone];
        t.nextLine();
    }
}

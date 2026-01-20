import java.util.Scanner;

public class DemoAppuntamenti {

	public static void main(String[] args) {
		String[] orari = {"13","14","15","16","17","18"};
		String[] descrizione = new String[6];
		Scanner in = new Scanner(System.in);
		do {
			try {
				System.out.print("Inserisci un orario: ");
				String ora=in.nextLine();
				System.out.print("Inserisci descrizione: ");
				String desc=in.nextLine();
				if(!ora.matches("^[1][3-8]$")) {
					throw new OraNonContemplataException("Errore!");
				}
				int idxOrario=-1;
				for(int i=0;i<orari.length;i++) {
					if(ora.equals(orari[i])&&descrizione[i]==null) {
						idxOrario=i;
					}
				}
				if(idxOrario==-1) {
					throw new OraOccupataException("Errore!");
				}
				descrizione[idxOrario]=desc;
			}
			catch(OraNonContemplataException e) {
				System.out.println(e.getMessage());
			}
			catch(OraOccupataException e) {
				System.out.println(e.getMessage());
			}
		}while(checkVuoto(descrizione));
		System.out.println("Appuntamenti completati!");
	}
	
	public static boolean checkVuoto(String[] descrizione) {
		boolean check=true;
		for(int i=0;i<descrizione.length;i++) {
			if(descrizione[i]==null) {
				check=true;
				break;
				
			}
			else {
				check=false;
			}
		}
		return check;
	}
}

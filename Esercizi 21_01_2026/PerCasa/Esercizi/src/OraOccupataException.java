public class OraOccupataException extends Exception {

	public OraOccupataException(String string) {
		System.out.println(string);
		System.out.println("L'ora scelta è occupata!");
	}
	
}

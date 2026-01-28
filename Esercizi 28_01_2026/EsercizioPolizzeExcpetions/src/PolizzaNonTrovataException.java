public class PolizzaNonTrovataException extends RuntimeException {
    public PolizzaNonTrovataException(String message, ErrorCodes error) {
        super(message + error.toString());
    }
}

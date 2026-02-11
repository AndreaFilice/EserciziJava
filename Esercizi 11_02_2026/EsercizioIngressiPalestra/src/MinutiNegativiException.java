public class MinutiNegativiException extends RuntimeException {
    public MinutiNegativiException(String message) {
        super(message);
        System.exit(0);
    }
}

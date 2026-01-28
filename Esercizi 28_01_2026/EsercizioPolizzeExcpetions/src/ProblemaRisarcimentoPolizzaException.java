public class ProblemaRisarcimentoPolizzaException extends RuntimeException {
    public ProblemaRisarcimentoPolizzaException(String msg, ErrorCodes errCode) {
        super(msg + "\nCodice di errore: " + errCode.toString());
    }
}

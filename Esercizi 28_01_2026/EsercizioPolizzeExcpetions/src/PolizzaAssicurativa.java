import java.util.UUID;

public class PolizzaAssicurativa {
    //ATTRIBUTI
    private UUID numeroDellaPolizza;
    private String nomeTitolare;
    private int massimalePolizza;
    private boolean polizzaAttiva;

    //CONSTRUCTOR
    public PolizzaAssicurativa(UUID numeroDellaPolizza, String nomeTitolare, int massimalePolizza, boolean polizzaAttiva) {
        if(massimalePolizza < 0){
            System.out.println("ERRORE! MASSIMALE DELLA POLIZZA NEGATIVO!");
            System.exit(0);
        }
        else{
            this.numeroDellaPolizza = numeroDellaPolizza;
            this.nomeTitolare = nomeTitolare;
            this.massimalePolizza = massimalePolizza;
            this.polizzaAttiva = polizzaAttiva;
        }
    }

    public PolizzaAssicurativa(){
        this.numeroDellaPolizza = UUID.randomUUID();
        this.massimalePolizza = 1000;
        this.polizzaAttiva = true;
        this.nomeTitolare = "Polizza";
    }

    //METODI
    public boolean isPolizzaAttiva() {return polizzaAttiva;}
    public void setPolizzaAttiva(boolean polizzaAttiva) {this.polizzaAttiva = polizzaAttiva;}

    public int getMassimalePolizza() {return massimalePolizza;}
    public void setMassimalePolizza(int massimalePolizza) {this.massimalePolizza = massimalePolizza;}

    public String getNomeTitolare() {return nomeTitolare;}
    public void setNomeTitolare(String nomeTitolare) {this.nomeTitolare = nomeTitolare;}

    public UUID getNumeroDellaPolizza() {return numeroDellaPolizza;}
    public void setNumeroDellaPolizza(UUID numeroDellaPolizza) {this.numeroDellaPolizza = numeroDellaPolizza;}

    public void richiediRisarcimento(int importoRisarcimento){
        if(!this.polizzaAttiva)
            throw new ProblemaRisarcimentoPolizzaException("ERRORE DURANTE IL RISARCIMENTO, La tua Polizza non sembra essere attiva.", ErrorCodes.POLIZZA_NOT_ACTIVE);
        else if(importoRisarcimento > this.massimalePolizza)
            throw new ProblemaRisarcimentoPolizzaException("ERRORE DURANTE IL RISARCIMENTO, L'Importo del risarcimento da te fornito è maggiore a quello massimo della polizza.", ErrorCodes.IMPORTO_MAJORTO_MASSIMALEPOLIZZA);
        else
            System.out.println("RISARCIMENTO DI " + importoRisarcimento + "€ APPLICATO CORRETTAMENTE!");
    }

    public void scriviOutput(){
        System.out.println("UUID: " + this.numeroDellaPolizza + ", Nome Titolare: "
                + this.nomeTitolare + ", Massimale Polizza: "
                + this.massimalePolizza + "€, Polizza Attiva? " + ((this.polizzaAttiva == true) ? "Si" : "No"));
    }
}

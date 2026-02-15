public class Dipendente extends Persona{
    //ATTRIBUTI
    private String codiceFiscale;
    private double salario;

    //COSTRUTTORE
    public Dipendente(String nome, String codiceFiscale, double salario) {
        super(nome);

        //CONTROLLO CODICE FISCALE
        if(codiceFiscale.length() < 16)
            throw new LunghezzaCFException("ERRORE: Codice Fiscale troppo corto, reinserisci il Dipendente.");
        else if(codiceFiscale.matches("[A-Z][6][1-9][1-9][A-Z][1-9][1-9][A-Z][1-9][1-9][1-9][A-Z]"))
            throw new FormatoCFException("ERRORE: Codice Fiscale non esistente, reinserisci il Dipendente.");
        else {
            this.codiceFiscale = codiceFiscale;
            this.salario = salario;
        }
    }

    //METODI
    public String getCodiceFiscale() {return codiceFiscale;}
    public void setCodiceFiscale(String codiceFiscale) {
        if(codiceFiscale.length() < 16)
            throw new LunghezzaCFException("ERRORE: Codice Fiscale troppo corto.");
        else if(codiceFiscale.matches("[A-Z][6][1-9][1-9][A-Z][1-9][1-9][A-Z][1-9][1-9][1-9][A-Z]"))
            throw new FormatoCFException("ERRORE: Codice Fiscale non esistente.");
        else
            this.codiceFiscale = codiceFiscale;
    }
    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}

    public String toString(){return String.format("%s;%s;%s", this.getNome(), this.codiceFiscale, this.salario);}
}

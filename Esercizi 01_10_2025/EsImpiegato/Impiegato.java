public class Impiegato {

    /// ANDREA FILICE, 4Ci, 01/102025
    /// 3. realizza la classe impiegato con 3 attributi cognome, nome e reparto. quindi definisci 2 oggetti impiegati, instanzia tutti gli attributi e dopo aver visualizzato il loro contenuto mediante il metodo stampa(), distruggi  i 2 oggetti

    //ATTRIBUTI
    private String cognome, nome, reparto;

    //CONSTRUCTOR
    public Impiegato(){}
    public Impiegato(String nome, String cognome, String reparto){
        this.cognome = cognome;
        this.nome = nome;
        this.reparto = reparto;
    }

    //METODI
    public void Stampa(){System.out.println("Nome: " + nome + ", Cognome: " + cognome + ", Reparto: " + reparto);}
}

public class Cliente {
    //ATTRIBUTI
    protected String nominativo;

    //CONSTRUCTOR
    public Cliente(String nominativo){setNominativo(nominativo);}

    //METODO SET E GET
    public void setNominativo(String nominativo){
        this.nominativo = nominativo;
    }

    public String getNominativo(){return nominativo;}
}

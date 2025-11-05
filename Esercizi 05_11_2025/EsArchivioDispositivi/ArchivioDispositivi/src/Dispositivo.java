public class Dispositivo {
    //ATTRIBUTI
    protected String marca;
    protected String modello;
    protected int uID;
    protected Cliente proprietario;

    //COSTRUTTORI
    public Dispositivo(){
        this("", "", 0, null);
    }

    public Dispositivo(String marca, String modello, int uID, Cliente proprietario){
        setDispositivo(marca, modello, uID, proprietario);
    }

    //METODI SET
    public void setDispositivo(String marca, String modello, int uID, Cliente proprietario){
        this.marca = marca;
        this.modello = modello;
        this.uID = uID;
        this.proprietario = proprietario;
    }

    public void setMarca(String marca){this.marca = marca;}
    public void setModello(String modello){this.modello = modello;}
    public void setuID(int uID){this.uID = uID;}
    public void setProprietario(Cliente proprietario){this.proprietario = proprietario;}

    //METODI GET
    public String getMarca(){return marca;}
    public String getModello(){return modello;}
    public int getuID(){return uID;}
    public Cliente getProprietario(){return proprietario;}

    //METODI
    public void scriviOutput(){
        System.out.print("Marca: " + marca +
                ", modello: " + modello +
                ", codice univoco: " + uID +
                ", proprietario: " + proprietario.getNominativo());
    }
}

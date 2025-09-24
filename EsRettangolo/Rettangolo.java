public class Rettangolo {

    //ATTRIBUTI
    private int larghezza;
    private int altezza;
    private int area;

    //METODI
    //Metodo per impostare le dimensioni dalla classe RettangoloDemo
    public void setDimensioni(int nuovaLarghezza, int nuovaAltezza){
        larghezza = nuovaLarghezza;
        altezza = nuovaAltezza;
        //Calcolo dell'area
        area = larghezza * altezza;
    }

    //METODO GET che ritorna l'area calcolata in precedenza
    public double getArea(){return area;}
}

public class Rettangolo {

    /// ANDREA FILICE, 4Ci, 01/10/2025
    /// 2. data la classe rettangolo scrivi il codice di tutti i metodi e una classe di prova rettangoloDemo che legga i valori per creare 2 rettangoli e successivamente collaudi tutti i metodi

    //ATTRIBUTI
    private int larghezza;
    private int altezza;
    private int area;
    private int perimetro;

    //METODI
    //Metodo per impostare le dimensioni dalla classe RettangoloDemo
    public void setDimensioni(int larghezza, int altezza){
        this.larghezza = larghezza;
        this.altezza = altezza;

        //Calcolo dell'area
        area = larghezza * altezza;
        //Calcolo del perimetro
        perimetro = (larghezza * 2) + (altezza * 2);
    }

    //METODO GET che ritorna l'area calcolata in precedenza
    public double getArea(){return area;}
    public double getPerimetro(){return perimetro;}
}

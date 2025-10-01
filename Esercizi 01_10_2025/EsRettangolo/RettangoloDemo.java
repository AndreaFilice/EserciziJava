public class RettangoloDemo {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo();
        Rettangolo rettangolo2 = new Rettangolo();

        //INIZIALIZZA RETTANGOLO 1
        rettangolo1.setDimensioni(10, 5);

        //INIZIALIZZA RETTANGOLO 2
        rettangolo2.setDimensioni(7, 18);

        //TEST METODI
        System.out.println("AREA RETTANGOLO 1: " + rettangolo1.getArea());
        System.out.println("AREA RETTANGOLO 2: " + rettangolo2.getArea());

        System.out.println("PERIMETRO RETTANGOLO 1: " + rettangolo1.getPerimetro());
        System.out.println("PERIMETRO RETTANGOLO 2: " + rettangolo2.getPerimetro());
    }
}

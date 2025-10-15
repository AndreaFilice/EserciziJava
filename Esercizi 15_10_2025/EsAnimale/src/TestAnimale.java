public class TestAnimale {
    public static void main(String args[]) {
        Animale[] arrayAnimali = {new Animale("Gallotti", 18, 70),
                                new Animale("Filice", 17, 55),
                                new Animale("Rossini", 17, 90),
                                new Animale("Dediana", 18, 55),
                                new Animale("Aron", 19, 67)};

        //OUTPUT ANIMALI
        System.out.println("- PRIMO ANIMALE: ");
        arrayAnimali[0].scriviOutput();
        System.out.println("- SECONDO ANIMALE: ");
        arrayAnimali[1].scriviOutput();
        System.out.println("- TERZO ANIMALE: ");
        arrayAnimali[2].scriviOutput();
        System.out.println("- QUARTO ANIMALE: ");
        arrayAnimali[3].scriviOutput();
        System.out.println("- QUINTO ANIMALE: ");
        arrayAnimali[4].scriviOutput();

        //CALCOLO DEL PIU' PICCOLO
        System.out.print("\nL'Animale più piccolo è: ");
        trovaPiuPiccolo(arrayAnimali);
        //CALCOLO DEL PIU' GRANDE
        System.out.print("\nL'Animale più grande è: ");
        trovaPiuGrande(arrayAnimali);
        //CALCOLO DEL PIU' VECCHIO
        System.out.print("\nL'Animale più vecchio è: ");
        trovaPiuVecchio(arrayAnimali);
        //CALCOLO DEL PIU' GIOVANE
        System.out.print("\nL'Animale più giovane è: ");
        trovaPiuGiovane(arrayAnimali);
    }

    public static void trovaPiuPiccolo(Animale[] animali){
        double animaleMin = 100;
        int c = 0;
        String[] animaliPiuPiccoli = new String[animali.length/2];

        for(int i = 0; i < animali.length; i++){
            if(animaleMin > animali[i].getPeso())
                animaleMin = animali[i].getPeso();
        }

        for (int i = 0; i < animali.length; i++) {
            if(animali[i].getPeso() == animaleMin){
                animaliPiuPiccoli[c] = animali[i].getNome();
                c++;
            }
        }

        if(c == 0)
            System.out.print("Errore sconosciuto durante l'esecuzione.");
        else{
            for (int i = 0; i < animaliPiuPiccoli.length; i++) {
                if(animaliPiuPiccoli[i] != null)
                    System.out.print(animaliPiuPiccoli[i] + ", ");
            }
        }
    }

    public static void trovaPiuGrande(Animale[] animali){
        double animaleMax = 0;
        int c = 0;
        String[] animaliPiuGrandi = new String[animali.length/2];

        for(int i = 0; i < animali.length; i++){
            if(animaleMax < animali[i].getPeso())
                animaleMax = animali[i].getPeso();
        }

        for (int i = 0; i < animali.length; i++) {
            if(animali[i].getPeso() == animaleMax){
                animaliPiuGrandi[c] = animali[i].getNome();
                c++;
            }
        }

        if(c == 0)
            System.out.print("Errore sconosciuto durante l'esecuzione.");
        else{
            for (int i = 0; i < animaliPiuGrandi.length; i++) {
                if(animaliPiuGrandi[i] != null)
                    System.out.print(animaliPiuGrandi[i] + ", ");
            }
        }
    }

    public static void trovaPiuVecchio(Animale[] animali){
        int animaleVecchio = 0;
        int c = 0;
        String[] animaliPiuVecchi = new String[animali.length/2];

        for(int i = 0; i < animali.length; i++){
            if(animaleVecchio < animali[i].getEta())
                animaleVecchio = animali[i].getEta();
        }

        for (int i = 0; i < animali.length; i++) {
            if(animali[i].getEta() == animaleVecchio){
                animaliPiuVecchi[c] = animali[i].getNome();
                c++;
            }
        }

        if(c == 0)
            System.out.print("Errore sconosciuto durante l'esecuzione.");
        else{
            for (int i = 0; i < animaliPiuVecchi.length; i++) {
                if(animaliPiuVecchi[i] != null)
                    System.out.print(animaliPiuVecchi[i] + ", ");
            }
        }
    }

    public static void trovaPiuGiovane(Animale[] animali){
        int animaleGiovane = 100;
        int c = 0;
        String[] animaliPiuGiovani = new String[animali.length/2];

        for(int i = 0; i < animali.length; i++){
            if(animaleGiovane > animali[i].getEta())
                animaleGiovane = animali[i].getEta();
        }

        for (int i = 0; i < animali.length; i++) {
            if(animali[i].getEta() == animaleGiovane){
                animaliPiuGiovani[c] = animali[i].getNome();
                c++;
            }
        }

        if(c == 0)
            System.out.print("Errore sconosciuto durante l'esecuzione.");
        else{
            for (int i = 0; i < animaliPiuGiovani.length; i++) {
                if(animaliPiuGiovani[i] != null)
                    System.out.print(animaliPiuGiovani[i] + ", ");
            }
        }
    }
}

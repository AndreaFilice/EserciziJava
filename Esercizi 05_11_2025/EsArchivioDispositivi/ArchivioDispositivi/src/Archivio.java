public class Archivio {
    //ATTRIBUTI
    private Dispositivo[] dispositivi;
    private int count;

    //* CONSTRUCTOR
    public Archivio(int max){
        dispositivi = new Dispositivo[max];
        count = 0;
    }

    //* METODI ARCHIVIO
    public void aggiungiDispositivo(Dispositivo d){
        if(count < dispositivi.length){
            dispositivi[count] = d;
            count++;
        }
        else
            System.out.println("ARCHIVIO PIENO!");
    }

    public Dispositivo ricercaPerUID(int codice){
        for (int i = 0; i < dispositivi.length; i++) {
            if(dispositivi[i].getuID() == codice)
                return dispositivi[i];
        }
        return null;
    }

    public boolean aggiornaProprietario(int codice, Cliente nuovoProprietario){
        Dispositivo dispositivoDaModificare = ricercaPerUID(codice);

        if(dispositivoDaModificare != null){
            dispositivoDaModificare.setProprietario(nuovoProprietario);
            return true;
        }
        else
            return false;
    }

    public boolean rimuoviPerCodice(int codice){
        Dispositivo dispositivoDaRimuovere = ricercaPerUID(codice);
        int indexDispositivo = -1;

        for (int i = 0; i < dispositivi.length; i++) {
            if(indexDispositivo != -1)
                dispositivi[i-1] = dispositivi[i];
            if(dispositivi[i].equals(dispositivoDaRimuovere)){
                dispositivi[i] = null;
                indexDispositivo = i;
                count--;
            }
        }

        return indexDispositivo != -1;
    }

    public void scriviArchivio(){
        for(int i = 0; i < dispositivi.length; i++){
            dispositivi[i].scriviOutput();
        }
    }
}

import java.util.ArrayList;

public class ArrayListDemo {
    static void main() {
        ///ARRAY LISTS
        ///CREAZIONE DI UN ARRAY LIST:

        ArrayList<Integer> arrayDiInteri = new ArrayList<>();
        ///ArrayList<T> nome = new ArrayList<>(capacitàIniziale);
        /// <T> E' UN OGGETTO GENERICO, NO TIPI PRIMITIVI (come int, double etc...), solo
        /// classi WRAPPER (Integer, Double etc...).

        ///FUNZIONI DELL'ARRAY LIST
        ///FUNZIONE PER AGGIUNGERE (add):
        arrayDiInteri.add(1); ///AGGIUNGE "1" ALLA PRIMA DISPONIBILE POSIZIONE DELL'ARRAY
        arrayDiInteri.add(1, 1); ///AGGIUNGE "1" ALL'INDICE 1 DELL'ARRAY E SPOSTA TUTTO A DESTRA

        ///QUESTA FUNZIONE SERVE PER INSERIRE UN ELEMENTO NELL'ARRAY.
        ///SINTASSI: nomeArray.add(int index, <E> element);
        ///<E> E' UN ELEMENTO QUALSIASI (numero intero o double, stringa etc...)

        ///FUNZIONE PER RIMUOVERE (remove):
        arrayDiInteri.remove(1); ///RIMUOVE L'ELEMENTO DELL'ARRAY ALL'INDICE 1, SPOSTANDO TUTTO A SINISTRA.
        arrayDiInteri.remove(Integer.valueOf(1)); ///RIMUOVE TUTTE LE OCCORRENZE NELL'ARRAY CHE SONO UGUALI A "1", RICORDIAMO DI USARE valueOf PER PASSARGLI IL VALORE, ALTRIMENTI PRENDE L'index.

        ///QUESTA FUNZIONE SERVE PER RIMUOVERE UN ELEMENTO DALL'ARRAY.
        ///SINTASSI: nomeArray.remove(index o Object);

        ///FUNZIONE PER IMPOSTARE (set):
        arrayDiInteri.set(1, 2); ///IMPOSTA IL VALORE DELL'INDICE 1 A "2".

        ///QUESTA FUNZIONE SERVE PER MODIFICARE (impostare) UN VALORE.
        ///SINTASSI: nomeArray.set(int index, <E> Element);
        ///<E> E' UN ELEMENTO QUALSIASI (numero intero o double, stringa etc...)

        ///FUNZIONE PER PRENDERE UN ELEMENTO DALL'ARRAY (get):
        int valoreIndice1 = arrayDiInteri.get(1); ///PRENDE IL VALORE CHE HA L'INDICE 1

        ///QUESTA FUNZIONE SERVE PER PRENDERE UN VALORE DA UN INDICE.
        ///SINTASSI: nomeArray.get(int index);

        ///FUNZIONE PER LEGGERE LA LUNGHEZZA DELL'ARRAY (size):
        System.out.println(arrayDiInteri.size()); ///STAMPA LA LUNGHEZZA DELL'ARRAY

        ///FUNZIONE PER SVUOTARE L'ARRAY (clear):
        arrayDiInteri.clear(); ///SVUOTA L'ARRAY COMPLETAMENTE
    }
}

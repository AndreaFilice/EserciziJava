public class TestArchivio {
    static void main() {
        //VARIABILI DI TEST
        Archivio archivio = new Archivio(4);
        Cliente clienteAndrea = new Cliente("Andrea Filice");
        Cliente clienteScuola = new Cliente("Alessandrini Mainardi");

        Laptop laptop1 = new Laptop("Lenovo", "5000 Series", 928374615, clienteAndrea, 2022, 8);
        Laptop laptopFake = new Laptop("Dell", "5000 Series", 228374615, clienteAndrea, 2022, 8);
        Laptop laptop2 = new Laptop("HP", "250 G7", 2048573910, clienteAndrea, 2024, 16);
        Smartphone iPhone = new Smartphone("Apple", "iPhone 15", 739201846, clienteAndrea, 2025, 72883);

        //* TEST AGGIUNGI DISPOSITIVI
        System.out.println("AGGIUNTA LAPTOP 1.");
        archivio.aggiungiDispositivo(laptop1);
        System.out.println("AGGIUNTA LAPTOP DA RIMUOVERE.");
        archivio.aggiungiDispositivo(laptopFake);
        System.out.println("AGGIUNTA LAPTOP 2.");
        archivio.aggiungiDispositivo(laptop2);

        System.out.println("AGGIUNTA SMARTPHONE 1.");
        archivio.aggiungiDispositivo(iPhone);

        //* TEST RICERCA UID
        Dispositivo ricercaPerUID = archivio.ricercaPerUID(739201846);
        ricercaPerUID.scriviOutput();

        //* TEST AGGIORNA PROPRIETARIO
        archivio.aggiornaProprietario(928374615, clienteScuola);

        //* TEST RIMUOVI DA CODICE
        archivio.rimuoviPerCodice(228374615);

        //* TEST SCRIVI ARCHIVIO
        archivio.scriviArchivio();
    }
}

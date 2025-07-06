public class Main {
    public static void main(String[] args) {
        AsimoRumah asimo1 = new AsimoRumah("ASIMO-Rumah", 80, true);
        asimo1.nyalakan();
        asimo1.gerak("kiri");
        asimo1.gerak("kanan", 5); 
        asimo1.bersihkanRumah();
        asimo1.matikan();

        System.out.println();

        AsimoPabrik asimo2 = new AsimoPabrik("ASIMO-Pabrik", 100, 50);
        asimo2.nyalakan();
        asimo2.gerak("maju");
        asimo2.angkutBarang();
        asimo2.matikan();
    }
}

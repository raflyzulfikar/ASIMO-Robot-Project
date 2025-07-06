public class AsimoPabrik extends Robot {
    private int kapasitasAngkut;

    public AsimoPabrik(String nama, int dayaBaterai, int kapasitasAngkut) {
        super(nama, dayaBaterai);
        this.kapasitasAngkut = kapasitasAngkut;
    }

    public void angkutBarang() {
        System.out.println(nama + " mengangkut barang seberat " + kapasitasAngkut + " kg.");
    }
}

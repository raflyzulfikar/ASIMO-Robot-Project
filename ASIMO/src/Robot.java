public class Robot {
    protected String nama;
    protected int dayaBaterai;

    public Robot(String nama, int dayaBaterai) {
        this.nama = nama;
        this.dayaBaterai = dayaBaterai;
    }

    public void nyalakan() {
        System.out.println(nama + " dinyalakan.");
    }

    public void matikan() {
        System.out.println(nama + " dimatikan.");
    }

    public void gerak(String arah) {
        System.out.println(nama + " bergerak ke " + arah + ".");
    }

    public void gerak(String arah, int kecepatan) {
        System.out.println(nama + " bergerak ke " + arah + " dengan kecepatan " + kecepatan + " km/jam.");
    }
}
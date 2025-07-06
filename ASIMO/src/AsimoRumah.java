public class AsimoRumah extends Robot {
    private boolean bisaBersihBersih;

    public AsimoRumah(String nama, int dayaBaterai, boolean bisaBersihBersih) {
        super(nama, dayaBaterai);
        this.bisaBersihBersih = bisaBersihBersih;
    }

    public void bersihkanRumah() {
        if (bisaBersihBersih) {
            System.out.println(nama + " sedang membersihkan rumah.");
        } else {
            System.out.println(nama + " tidak memiliki fitur bersih-bersih.");
        }
    }

    @Override
    public void gerak(String arah) {
        System.out.println(nama + " (versi rumah) bergerak pelan ke " + arah + ".");
    }
}
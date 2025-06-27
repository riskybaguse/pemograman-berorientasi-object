public class Sepeda {
    int kecepatan = 0;
    int gir = 0;

    // method
    void ubahGir(int i) {
        gir = gir + i;
        System.out.println("Gir sekarang adalah " + gir);
    }

    void tambahKecepatan(int i) {
        kecepatan = kecepatan + i;
        System.out.println("Kecepatan sekarang adalah " + kecepatan);
    }
}

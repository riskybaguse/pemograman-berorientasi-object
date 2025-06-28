public class Sepeda {
    int kecepatan = 0;
    int gir = 0;

    //method
    void ubahGir(int penambahanGir) {
        gir = gir + penambahanGir;
        System.out.println("Gir sekarang adalah " + gir);
    }
    void tambahKecepatan(int penambahanKecepatan) {
        kecepatan = kecepatan + penambahanKecepatan;
        System.out.println("Kecepatan sekarang adalah " + kecepatan);
    }
}

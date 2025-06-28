public class SepedaGunung extends Sepeda{
    void ubahGir(int penambahanGir) {
        gir = 2*(gir + penambahanGir);
        System.out.println("Gir sekarang adalah " + gir);
    }
    void setSadel(int nilaiSadel){
        System.out.println("Sadel sekarang adalah " + nilaiSadel);
    }
}

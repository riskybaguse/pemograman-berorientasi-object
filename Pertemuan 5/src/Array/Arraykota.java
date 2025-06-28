package Array;

public class Arraykota {
    public static void main(String[] args) {
        String[] kota; // deklarasi array
        kota = new String[3]; // membuat object array

        // mengisi element array
        kota[0] = "Malang";
        kota[1] = "Surabaya";
        kota[2] = "Batu";

        // menampilkan element array
        for (int i = 0; i < kota.length; i++) {
            System.out.println(kota[i]);
        }
    }
}

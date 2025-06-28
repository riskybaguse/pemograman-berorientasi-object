package Array;

public class ArrayKota3 {
    public static void main(String[] args) {
        String[] kota = {"Malang", "Surabaya", "Batu", "Padang", "Pekanbaru", "Semarang", "Bandung"};

        int panjangArray = kota.length;
        System.out.println("Panjang Array = " + panjangArray);

        System.out.println("\nMencetak semua data dari array kota :");
        for (int i = 0; i < panjangArray; i++) {
            System.out.println(kota[i]);
        }
    }
}

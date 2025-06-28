import java.util.Scanner; /// [rpgram menggunakan classs scanner]
public class Penambahan {
    public static void main(String[] args) {
        // buat scanner menerima import dari command window
        Scanner input = new Scanner(System.in);
        // var
        int nomer_1;
        int nomer_2;
        int jumlah;

        System.out.print("Masukkan angka pertama "); // promt
        nomer_1 = input.nextInt();

        System.out.print("Masukkan angka kedua "); // promt
        nomer_2 = input.nextInt();

        jumlah  = nomer_1 + nomer_2;
        System.out.printf("Hasil Penjumlahan %d\n", jumlah);

    }
}

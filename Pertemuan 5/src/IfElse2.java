import javax.swing.*;
public class IfElse2 {
    public static void main(String[] args) {
        String tot = JOptionPane.showInputDialog("Masukkan jumlah belanja: ");
        int TotalBelanja = Integer.parseInt(tot);
        int diskon = 0;

        if (TotalBelanja >= 100000) {
            diskon = TotalBelanja * 10 / 100;
            TotalBelanja = TotalBelanja - diskon;
        }else {
            diskon = 0;
        }
        System.out.println("Diskon = " + diskon);
        System.out.println("Total Belanja = " + TotalBelanja);
    }
}

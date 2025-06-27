import javax.swing.*;

public class BacaInput {
    public static void main(String[] args) {
        String str      = JOptionPane.showInputDialog("Masukkan String: ");

        System.out.println(str);

        String bil      = JOptionPane.showInputDialog("Masukkan Angka: ");
        int bilangan    = Integer.parseInt(bil);

        System.out.println(bilangan);
    }
}

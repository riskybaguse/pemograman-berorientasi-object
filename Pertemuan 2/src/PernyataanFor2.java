import javax.swing.*;

public class PernyataanFor2 {
    public static void main(String[] args) {
        String bilangan = JOptionPane.showInputDialog("Masukkan jumlah perulangan: ");
        int    banyak   = Integer.parseInt(bilangan);

        for (int bil = 1; bil <= banyak; bil++)
            System.out.println("Java Cuy " + bil);
    }
}

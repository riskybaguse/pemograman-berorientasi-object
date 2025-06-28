import javax.swing.*;
public class PernyataanSwitch2 {
    public static void main(String[] args) {
        String pil = JOptionPane.showInputDialog("Masukkan jenis pilihan (1/2/3): ");
        int pilihan = Integer.parseInt(pil);
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih 1");
                break;
            case 2:
                System.out.println("Anda memilih 2");
                break;
            case 3:
                System.out.println("Anda memilih 3");
                break;
            default:
                System.out.println("Pilihan tidak ada");
        }
    }
}

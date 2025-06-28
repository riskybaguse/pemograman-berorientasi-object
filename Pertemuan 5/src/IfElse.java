public class IfElse {
    public static void main(String[] args) {
        int TotalBelanja = 120000;
        int diskon = 0;

        System.out.println("Total Belanja Awal = " + TotalBelanja);
        if (TotalBelanja >= 100000) {
            diskon = TotalBelanja * 10 / 100;
            TotalBelanja = TotalBelanja - diskon;
        }else {
            diskon = 0;
        }
        System.out.println("---------------");
        System.out.println("Diskon = " + diskon);
        System.out.println("Total Belanja = " + TotalBelanja);
    }
}

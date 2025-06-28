public class IfSederhana {
    public static void main(String[] args) {
        int TotalBelanja = 15000;
        int diskon = 0;

        System.out.println("Total Belanja = " + TotalBelanja);

        if (TotalBelanja >= 10000) {
            diskon = TotalBelanja * 12 / 100;
            TotalBelanja = TotalBelanja - diskon;
        }
        System.out.println("Diskon = " + diskon);
        System.out.println("Total Belanja = " + TotalBelanja);
    }
}

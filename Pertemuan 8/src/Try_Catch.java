public class Try_Catch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 2;
            int result = a / b;
            System.out.println("Hasil a / b adalah " + result);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan : Hasil tidak ditemukan!");
        }finally{
            System.out.println("Hasil Akhir: Program Selesai");
        }
    }
}

public class PesawatBeraksi {
    public static void main(String[] args) {
        //objek pesawat pertama
        Pesawat myPlane = new Pesawat("Merah", 2003) {};
        myPlane.info();
        System.out.println("--------------------------------\n");

        //objek pesawat kedua
        Pesawat yourPlane = new Pesawat() {};
        yourPlane.info();
        System.out.println("--------------------------------\n");

        //objek pesawat tempur
        PesawatTempur F16 = new PesawatTempur();
        F16.info();
        F16.Kecepatan(100);
        F16.Penumpang(3);
        F16.Kecepatan();
        F16.Penumpang();
        System.out.println("--------------------------------");


    }
}

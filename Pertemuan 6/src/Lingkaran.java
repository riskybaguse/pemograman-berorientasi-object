public class Lingkaran {
    int diameter;
    int x;
    int y;
    int warna;
    String namaLingkaran;
    public Lingkaran(int diameter){
        this.diameter = diameter;
    }
    public Lingkaran(int diameter, int x, int y){
        this.diameter = diameter;
        this.x = x;
        this.y = y;
    }
    public Lingkaran(int diameter, int x, int y, int warna, String namaLingkaran){
        this.diameter = diameter;
        this.x = x;
        this.y = y;
        this.warna = warna;
        this.namaLingkaran = namaLingkaran;
    }
    void info(){
        System.out.println("Diameter Lingkaran: " + this.diameter);
        System.out.println("X Lingkaran: " + this.x);
        System.out.println("Y Lingkaran: " + this.y);
        System.out.println("Warna Lingkaran: " + this.warna);
        System.out.println("Nama Lingkaran: " + this.namaLingkaran);
    }

}

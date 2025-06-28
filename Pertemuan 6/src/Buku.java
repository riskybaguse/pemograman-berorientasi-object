public class Buku {
    String judul, pengarang;
    int tahunTerbit;
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    public Buku(){
    }
    void info(){
        System.out.println("Judul Buku: " + this.judul);
        System.out.println("Pengarang Buku: " + this.pengarang);
        System.out.println("Tahun Terbit Buku: " + this.tahunTerbit);
    }
}

public abstract class Pesawat {
    String warna;
    int tahunProduksi;

    public Pesawat(String warna, int tahunProduksi){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    public Pesawat(){

    }
    void info(){
        System.out.println("Warna Pesawat: " + this.warna);
        System.out.println("Tahun Produksi Pesawat: " + this.tahunProduksi);
    }
    void Kecepatan(){
    }
    void Penumpang(){

    }
}

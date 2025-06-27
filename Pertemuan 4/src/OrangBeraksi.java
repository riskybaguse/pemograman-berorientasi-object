public class OrangBeraksi {
    public static void main(String[] args) {
        OrangIndonesia indo = new OrangIndonesia();
        OrangJepang japan   = new OrangJepang();

        indo.warnaKulit("Sawo Matang");
        indo.bahasaLokal("Bahasa Indonesia");
        indo.warnaRambut();

        System.out.println("==========================");

        japan.warnaKulit("Putih");
        japan.bahasaLokal("Nihongo");
        japan.bentukMata();
    }
}

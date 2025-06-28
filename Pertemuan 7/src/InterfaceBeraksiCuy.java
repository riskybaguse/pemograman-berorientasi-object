public class InterfaceBeraksiCuy {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        Burung burung = new Burung();

        System.out.println("====INI KUCING====");
        kucing.bergerak();
        kucing.suara();

        System.out.println("\n====INI BURUNG====");
        burung.bergerak();
        burung.suara();
    }
}

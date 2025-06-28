public class Burung implements Hewan{
    @Override
    public void suara() {
        System.out.println("Burung berkicau");
    }
    @Override
    public void bergerak() {
        System.out.println("Burung terbang di langit");
    }
}

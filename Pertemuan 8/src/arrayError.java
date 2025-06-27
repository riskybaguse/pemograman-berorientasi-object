public class arrayError {
    public static void main(String[] args) {
        try{
            int[] array = {1,2,3};

            System.out.println(array[3]);
            System.out.println("Baris ini tidak akan dijalankan");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi kesalahan : " + e.getMessage());
        }finally{
            System.out.println("Program Selesai");

        }
    }
}

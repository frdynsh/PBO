package pertemuan7;

public class tugas1b {
    public static void main(String[] args) {
        // TODO code application logic here
        int angka = 0;
        int batas = 20;
        
        while (angka <= batas){
            if(angka % 2 == 0){
                System.out.println(angka+" adalah bilangan genap");
            } else {
                System.out.println(angka+" adalah bilangan ganjil");
            }
            angka++;
        }
    }
}
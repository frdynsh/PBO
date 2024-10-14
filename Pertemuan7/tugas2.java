package pertemuan7;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai N(Maks 10):  ");
        int n = input.nextInt();
                
        if (n<=10){
            // Angka diatas tabel
            System.out.print("    ");
            for (int i = 1; i <= n; i++) {
            System.out.printf("%2d ", i);
            
            }
            System.out.println();
            System.out.print("   ");
            // batas atas tabel
            for (int i = 1; i <= n; i++) {
                System.out.print("---");
            }
            System.out.println();
            
            for(int i = 1; i <= n; i++){ // angka dan batas kiri tabel
                System.out.printf("%2d |", i);
                for(int j = 1; j <= n; j++){ // angka di dalam tabelnya
                    System.out.printf("%2d ", i*j);
                }
                System.out.println();
            }
        } else{
            System.out.println("Nilai n harus lebih kecil atau sama dengan 10.");
        }
    } 
}
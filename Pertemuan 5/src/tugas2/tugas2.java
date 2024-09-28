package tugas2;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int diskon, totalPembelian;        
        Scanner input = new Scanner(System.in);
        
        // Menampilkan Input
        System.out.print("Masukan Total Pembelian: Rp.");
        totalPembelian = input.nextInt();
         
        // Menentukan Diskon berdasarkan total pembelian
        if(totalPembelian < 50000){
            diskon = totalPembelian * 5/100;
        }else{
            diskon = totalPembelian * 20/100;
        }
        
        // Menampilkan Output
        System.out.println("Besarnya potongan: Rp."+diskon);
        System.out.println("Jumlah yang harus dibayarkan: Rp."+(totalPembelian-diskon));
    }    
}
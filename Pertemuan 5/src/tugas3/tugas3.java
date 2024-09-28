package tugas3;
import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        // TODO code application logic here
        double bb, tb;
        Scanner input = new Scanner(System.in);
        
        // Mencetak Input
        System.out.print("Berat Badan(kg): ");
        bb = input.nextDouble();
        System.out.print("Tinggi Badan(m): ");
        tb = input.nextDouble();
         
        // Menghitung nilai IMT
        double nilai_IMT = bb/(tb*tb);
        
        // Menentukan kriteria berdasarkan IMT
        String kriteria;
        if (nilai_IMT <= 18.4){
            kriteria = "Berat Badan Kurang";
        }else if (nilai_IMT >= 18.5 && nilai_IMT <= 24.9){
            kriteria = "Berat Badan Ideal";
        }else if (nilai_IMT >= 25 && nilai_IMT <= 29.9){
            kriteria = "Berat Badan Lebih";
        }else if (nilai_IMT >= 30 && nilai_IMT <= 39.9){
            kriteria = "Gemuk";
        }else{
            kriteria = "Sangat Gemuk";
        }
        
        // Mencetak Output       
        System.out.println("Nilai IMT Anda : " + nilai_IMT);
        System.out.println("Kriteria Anda  : " + kriteria);
    }  
}
package tugas1;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        String npm, nama;
        double nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS;
        Scanner input = new Scanner(System.in);

        // Mencetak Input
        System.out.println("Tampilan Input");
        System.out.print("NPM Mahasiswa   : ");
            npm = input.nextLine();
        System.out.print("Nama Mahasiswa  : ");
            nama = input.nextLine();
        System.out.print("Nilai Kehadiran : ");
            nilaiAbsen = input.nextDouble();
        System.out.print("Nilai Tugas     : ");
            nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS       : ");
            nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS       : ");
            nilaiUAS = input.nextDouble();
        
        // Menghitung Nilai Akhir
        double nilaiAkhir = (0.1 * nilaiAbsen) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        
        // Menentukan Grade dan Keterangan Berdasarkan Nilai Akhir
        char grade;
        String keterangan;
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = 'A';
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            grade = 'B';
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = 'C';
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = 'D';
            keterangan = "KURANG";
        } else {
            grade = 'E';
            keterangan = "KURANG SEKALI";
        }

        // Mencetak Output
        System.out.println("\nTampilan Output");
        System.out.println("NPM Mahasiswa   : " + npm);
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade           : " + grade);
        System.out.println("Keterangan      : " + keterangan);
    }
}
package pertemuan8;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Data Barang
        String[] kodeBarang = {"001", "002", "003", "004", "005"};
        String[] namaBarang = {"Pulpen", "Buku", "Pensil", "Spidol", "Penghapus"};
        int[] hargaBarang = {4000, 6000, 3000, 5000, 2000};
        
        // input item barang
        System.out.print("Masukkan Item Barang: ");
        int Item = input.nextInt();
        
        // membuat array untuk menyimpan hasil transaksi
        String[] kodeBarangBeli = new String[Item];
        int[] jumlahBeli = new int[Item];
        int[] jumlahBayar = new int[Item];
        String[] namaBarangBeli = new String[Item];
        int[] hargaBarangBeli = new int[Item];
        
        // Logiks proses pembelian
        for(int i = 0; i < Item; i++){
            System.out.println("Data ke "+(i+1));
            System.out.print("Kode Barang          : ");
            kodeBarangBeli[i] = input.next();
            System.out.print("Masukkan jumlah beli : ");
            jumlahBeli[i] = input.nextInt();
            
            boolean found = false;  // Untuk memastikan kode barang ditemukan
            
            // Loop untuk mencocokkan kode barang
            for (int j = 0; j < 5; j++) {  // Karena ada 5 barang
                if (kodeBarangBeli[i].equals(kodeBarang[j])) {
                    namaBarangBeli[i] = namaBarang[j];  // Menyimpan nama barang
                    hargaBarangBeli[i] = hargaBarang[j]; // Menyimpan harga barang
                    jumlahBayar[i] = jumlahBeli[i] * hargaBarang[j];
                    
                    found = true;
                    break;
                }
            }
             if (!found) {
                System.out.println("Kode barang tidak ditemukan!");
                namaBarangBeli[i] = "Tidak diketahui";
                jumlahBayar[i] = 0;
            }
        }
       
        // Menampilkan hasil
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("***********************");       
        System.out.printf("%-5s %-15s %-15s %-8s %-13s %-10s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("==========================================================================");       
        int totalBayar = 0;
     
        // buat nomor data menggunakan for loop
        for (int i = 0; i < Item; i++) {
            System.out.printf("%-5d %-15s %-15s %-13s %-13s %-10s\n", 
                              (i + 1), kodeBarangBeli[i], namaBarangBeli[i], hargaBarangBeli[i], jumlahBeli[i], jumlahBayar[i]);
            totalBayar = totalBayar + jumlahBayar[i];
        }
        System.out.println("==========================================================================");
        System.out.println("Total Bayar: " + totalBayar);
        System.out.println("==========================================================================");
    }
}
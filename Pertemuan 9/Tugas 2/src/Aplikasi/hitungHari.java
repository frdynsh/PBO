/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplikasi;

/**
 *
 * @author FERDI YANSAH
 */
public class hitungHari {
    private int tahun;
    private String bulan;

    public hitungHari(int tahun, String bulan) {
        this.tahun = tahun;
        this.bulan = bulan;
    }

    public int hitung() {
        int jumlahHari;

        // Mengecek bulan dan menentukan jumlah hari
        if (bulan.equals("Februari")) {
            // Mengecek apakah tahun kabisat
            if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                jumlahHari = 29;
            } else {
                jumlahHari = 28;
            }
        } else if (bulan.equals("April") || bulan.equals("Juni") ||
                   bulan.equals("September") || bulan.equals("November")) {
            jumlahHari = 30;
        } else{
            jumlahHari = 31;
        }
        return jumlahHari;
    }      
}
package Nilai;
public class Nilai {
    String Nim, Nama;
    double nilaiAbsen, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
    
    double nilai(){
       nilaiAkhir = ((nilaiAbsen * 0.1)+(nilaiTugas * 0.2)+(nilaiUts*0.3)+(nilaiUas*0.4));
       return nilaiAkhir;
    }    
    
    void cetakNilai(){
        System.out.println("NIM              : "+Nim);
        System.out.println("Nama             : "+Nama);
        System.out.println("Nilai Absen[10%] : "+nilaiAbsen);
        System.out.println("Nilai Tugas[20%] : "+nilaiTugas);
        System.out.println("Nilai UTS[30%]   : "+nilaiUts);
        System.out.println("Nilai UAS[40%]   : "+nilaiUas);
        System.out.println("Nilai Akhir      : "+nilai()+"\n");
    }
}
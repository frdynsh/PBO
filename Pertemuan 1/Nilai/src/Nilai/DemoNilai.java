package Nilai;
public class DemoNilai {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai mhs1 = new Nilai();
        Nilai mhs2 = new Nilai();
        
        mhs1.Nim = "2310631170084";
        mhs1.Nama = "Ferdi Yansah";
        mhs1.nilaiAbsen = 98;
        mhs1.nilaiTugas = 90;
        mhs1.nilaiUts = 90;
        mhs1.nilaiUas = 85;
        mhs1.nilai();
        mhs1.cetakNilai();
        
        mhs2.Nim = "2310631170224";
        mhs2.Nama = "Budi Sudarto";
        mhs2.nilaiAbsen = 98;
        mhs2.nilaiTugas = 85;
        mhs2.nilaiUts = 89;
        mhs2.nilaiUas = 80;
        mhs2.nilai();
        mhs2.cetakNilai();
    }   
}
package Pertemuan10;
import java.util.ArrayList;

public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listmahasiswa;
    
    public InputDataMahasiswa() {
        listmahasiswa = new ArrayList ();
    }
    
    public void insertData(String NIM, String Nama, String Alamat, String Matkul, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5, double nilaiAkhir) {
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, Matkul, nilai1, nilai2, nilai3, nilai4, nilai5, nilaiAkhir);
        listmahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa> getALL() {
        return listmahasiswa;
    }
    
    public void deleteData(int index) {
        listmahasiswa.remove(index);
    }
}
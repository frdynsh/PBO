package mahasiswa;
public class Mahasiswa {
   
    public static void main(String[] args) {
        // TODO code application logic here
        MahasiswaBeraksi mhs = new MahasiswaBeraksi();
        
        mhs.nama = "Ferdi Yansah";
        System.out.println("Saya seorang mahasiswa");
        System.out.println("Saya bernama "+mhs.nama);
        mhs.membaca();
        mhs.nyontek();
        mhs.memodifikasi();
    }
}

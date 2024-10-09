package reservasiHotel;

public class Pesanan {
    private String nama;
    private String nomorTelepon;
    private Kamar kamarDipesan;

    public Pesanan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }
    public String getNama() {
        return nama;
    }
    public String getNomorTelepon() { 
        return nomorTelepon; 
    }
    public Kamar getKamarDipesan() { 
        return kamarDipesan; 
    }
    public void setKamarDipesan(Kamar kamar) { 
        this.kamarDipesan = kamar; 
    }

    public String tampilkanDetailPesanan() {
        return "Pesanan [Nama: " + nama + ", Nomor Telepon: " + nomorTelepon + ", Kamar: " + kamarDipesan.tampilkan() + "]";
    }
}
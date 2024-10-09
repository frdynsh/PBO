package reservasiHotel;

public class Kamar {
    private int nomorKamar;
    private String tipeKamar;
    private double harga;
    private boolean tersedia;

    public Kamar(int nomorKamar, String tipeKamar, double harga) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.harga = harga;
        this.tersedia = true;
    }
    public int getNomorKamar() {
        return nomorKamar; 
    }
    public String getTipeKamar() {
        return tipeKamar; 
    }
    public double getHarga() {
        return harga; 
    }
    public boolean isTersedia() {
        return tersedia; 
    }
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia; 
    }
    public String tampilkan() {
        return "Kamar [Nomor: " + nomorKamar + ", Tipe: " + tipeKamar + ", Harga: " + harga + ", Tersedia: " + tersedia + "]";
    }
}
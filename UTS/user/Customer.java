package user;
import reservasiHotel.Reservasi;
import reservasiHotel.Pesanan;

public class Customer implements interfaceUser {
    private String username;
    private String password;
    private Pesanan pesanan;

    // Konstruktor
    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Metode login
    public void login(String username, String password) {
        // Proses login (misalnya, validasi)
        System.out.println("Customer " + username + " berhasil login.");
    }

    public Pesanan getPesanan() {
        return pesanan;
    }

    public void setPesanan(Pesanan pesanan) {
        this.pesanan = pesanan;
    }

    public boolean cekKetersediaanKamar(Reservasi reservasi, int nomorKamar) {
        return reservasi.cekKetersediaanKamar(nomorKamar);
    }

    public void pesanKamar(Reservasi reservasi, Pesanan pesanan, int nomorKamar) {
        reservasi.pesanKamar(pesanan, nomorKamar);
    }
}
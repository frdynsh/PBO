package reservasiHotel;

public interface interfaceReservasi {
    void pesanKamar(Pesanan pesanan, int nomorKamar);
    boolean cekKetersediaanKamar(int nomorKamar);
}
package reservasiHotel;

public class Reservasi implements interfaceReservasi {
    private Kamar kamar1 = new Kamar(101, "Single", 500000);
    private Kamar kamar2 = new Kamar(102, "Double", 750000);
    private Kamar kamar3 = new Kamar(103, "Suite", 1500000);
    private Kamar kamar4 = null;
    private Kamar kamar5 = null;

    public Kamar getKamar(int nomorKamar) {
        switch (nomorKamar) {
            case 101: 
                return kamar1;
            case 102: 
                return kamar2;
            case 103: 
                return kamar3;
            case 104: 
                return kamar4;
            case 105: 
                return kamar5;
            default:
                return null;
        }
    }

    public boolean cekKetersediaanKamar(int nomorKamar) {
        Kamar kamar = getKamar(nomorKamar);
        return kamar != null && kamar.isTersedia();
    }

    public void pesanKamar(Pesanan pesanan, int nomorKamar) {
        Kamar kamar = getKamar(nomorKamar);
        if (kamar != null && kamar.isTersedia()) {
            kamar.setTersedia(false);
            pesanan.setKamarDipesan(kamar);
            System.out.println("Kamar berhasil dipesan untuk " + pesanan.getNama());
        } else {
            System.out.println("Kamar tidak tersedia atau nomor kamar salah.");
        }
    }

    public void tampilkanKamar() {
        System.out.println("Daftar Kamar:");
        if (kamar1 != null) System.out.println(kamar1.tampilkan());
        if (kamar2 != null) System.out.println(kamar2.tampilkan());
        if (kamar3 != null) System.out.println(kamar3.tampilkan());
        if (kamar4 != null) System.out.println(kamar4.tampilkan());
        if (kamar5 != null) System.out.println(kamar5.tampilkan());
    }

    public void tambahKamar(int nomorKamar, String tipeKamar, double harga) {
        if (kamar4 == null) {
            kamar4 = new Kamar(nomorKamar, tipeKamar, harga);
            System.out.println("Kamar ke-4 berhasil ditambahkan.");
        } else if (kamar5 == null) {
            kamar5 = new Kamar(nomorKamar, tipeKamar, harga);
            System.out.println("Kamar ke-5 berhasil ditambahkan.");
        } else {
            System.out.println("Tidak ada slot kamar yang tersedia.");
        }
    }
}
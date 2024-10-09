package reservasiHotel;
import user.Admin;
import user.Customer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservasi reservasi = new Reservasi();
        int pilihan;

        // MENU AWAL
        do {
            System.out.println("======= MENU LOGIN =======");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Customer");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1: loginAdmin(scanner, reservasi);
                break;
                case 2: loginCustomer(scanner, reservasi); 
                break;
                case 3: System.out.println("Terima kasih! Sampai jumpa."); 
                break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);

        scanner.close();
    }

    
    // MENU ADMIN
    private static void loginAdmin(Scanner scanner, Reservasi hotel) {
        System.out.println("======= LOGIN ADMIN =======");
        System.out.print("Username: ");
        String adminUsername = scanner.next();
        System.out.print("Password: ");
        String adminPassword = scanner.next();

        Admin admin = new Admin(adminUsername, adminPassword);
        admin.login(adminUsername, adminPassword);

        int adminPilihan;
        do {
            System.out.println("======= MENU ADMIN =======");
            System.out.println("1. Tampilkan Daftar Kamar");
            System.out.println("2. Cek Ketersediaan Kamar");
            System.out.println("3. Tambahkan Kamar");
            System.out.println("4. Logout");
            System.out.print("Pilih menu (1-4): ");
            adminPilihan = scanner.nextInt();

            switch (adminPilihan) {
                case 1: hotel.tampilkanKamar(); 
                break;
                case 2: cekKetersediaanKamar(scanner, hotel); 
                break;
                case 3: tambahKamar(scanner, hotel); 
                break;
                case 4: System.out.println("Logout berhasil."); 
                break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (adminPilihan != 4);
    }

    
    // MENU CUSTOMER
    private static void loginCustomer(Scanner scanner, Reservasi reservasi) {
        System.out.println("======= LOGIN CUSTOMER =======");
        System.out.print("Username: ");
        String customerUsername = scanner.next();
        System.out.print("Password: ");
        String customerPassword = scanner.next();

        Customer customer = new Customer(customerUsername, customerPassword);
        customer.login(customerUsername, customerPassword);

        int customerPilihan;
        do {
            System.out.println("===== MENU CUSTOMER =====");
            System.out.println("1. Tampilkan Daftar Kamar");
            System.out.println("2. Cek Ketersediaan Kamar");
            System.out.println("3. Pesan Kamar");
            System.out.println("4. Logout");
            System.out.print("Pilih menu (1-4): ");
            customerPilihan = scanner.nextInt();

            switch (customerPilihan) {
                case 1: reservasi.tampilkanKamar(); 
                break;
                case 2: cekKetersediaanKamar(scanner, reservasi); 
                break;
                case 3: pesanKamar(scanner, reservasi, customer); 
                break;
                case 4: System.out.println("Logout berhasil."); 
                break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (customerPilihan != 4);
    }

    
    // input cek ketersediaan kamar
    private static void cekKetersediaanKamar(Scanner scanner, Reservasi reservasi) {
        System.out.print("Nomor kamar: ");
        int nomorKamar = scanner.nextInt();
        if (reservasi.cekKetersediaanKamar(nomorKamar)) {
            System.out.println("Kamar tersedia.");
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

    
    // input tambah kamar
    private static void tambahKamar(Scanner scanner, Reservasi reservasi) {
        System.out.print("Nomor Kamar: ");
        int nomorKamar = scanner.nextInt();
        System.out.print("Tipe Kamar: ");
        String tipeKamar = scanner.next();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        reservasi.tambahKamar(nomorKamar, tipeKamar, harga);
    }

    // input pesan kamar
    private static void pesanKamar(Scanner scanner, Reservasi reservasi, Customer customer) {
        System.out.print("Nama Pemesan: ");
        String nama = scanner.next();
        System.out.print("Nomor Telepon: ");
        String nomorTelepon = scanner.next();
        Pesanan pesanan = new Pesanan(nama, nomorTelepon);

        System.out.print("Nomor Kamar yang ingin dipesan: ");
        int nomorKamar = scanner.nextInt();
        reservasi.pesanKamar(pesanan, nomorKamar);
        System.out.println(pesanan.tampilkanDetailPesanan());
    }
}
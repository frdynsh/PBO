package user;

public class Admin implements interfaceUser {
    private String username;
    private String password;

    // Konstruktor
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Metode login
    public void login(String username, String password) {
        // Proses login (misalnya, validasi)
        System.out.println("Admin " + username + " berhasil login.");
    }
}
package pertemuan7;

public class tugas1a {
    public static void main(String[] args) {
        int angka = 20;
    
        for (int p = 2; p <= angka; p++) {
            int pembagi = 0; //untuk mereset pembagi di awal setiap iterasi p
            
            for (int i = 1; i <= p; i++) {
                if (p % i == 0) {
                    pembagi++;
                }
            }

            // logika mengecek bilangan primanya
            // yaitu hanya bisa dibagi angka 1 dan angka itu sendiri
            if (pembagi == 2) {
                System.out.println(p + " adalah bilangan prima.");
            } else {
                System.out.println(p + " bukan bilangan prima.");
            }
        }
    }
}

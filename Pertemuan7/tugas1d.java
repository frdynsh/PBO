package pertemuan7;

public class tugas1d {
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10; 
        
        while(n > 0){
            if (n == 1){
                System.out.println("Anak ayam turunlah " + n + ", mati satu maka habis.");
            } else {
                System.out.println("Anak ayam turunlah " + n + ", mati satu tinggallah " + (n - 1));
            }
            n--;
        }
    }    
}
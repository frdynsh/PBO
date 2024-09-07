package matematika;
public class Matematika {
    int hasil;
    
     // Methode accessor
    public int getHasil() {
        return hasil;
    }
    int pertambahan(int a,int b){
        hasil = a+b;
        return hasil;
    }
    int pengurangan(int a,int b){
        hasil = a-b;
        return hasil;
    }
    int perkalian(int a,int b){
        hasil = a*b;
        return hasil;
    }
    int pembagian(int a,int b){
        hasil = a/b;
        return hasil;
    }
}

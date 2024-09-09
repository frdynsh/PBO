package matematika;
public class Matematika implements InterfaceMatematika {
    int hasil;
    
     // Methode accessor
    public int getHasil() {
        return hasil;
    }
    public int pertambahan(int a,int b){
        hasil = a+b;
        return hasil;
    }
    public int pengurangan(int a,int b){
        hasil = a-b;
        return hasil;
    }
    public int perkalian(int a,int b){
        hasil = a*b;
        return hasil;
    }
    public int pembagian(int a,int b){
        hasil = a/b;
        return hasil;
    }
}

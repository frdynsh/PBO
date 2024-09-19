package Matematika2;

public class MatematikaInheritance {    
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika2 mtk = new Matematika2();
        
        System.out.println("Pertambahan : 8+4  = "+mtk.pertambahan(8,4));
        System.out.println("Pengurangan : 9-3  = "+mtk.pengurangan(9,3));
        System.out.println("Perkalian   : 7*2  = "+mtk.perkalian(7,2));
        System.out.println("Pembagian   : 6/2  = "+mtk.pembagian(6,2));
        System.out.println("Modulus     : 20/3 = "+mtk.modulus(20,3));
    }    
}
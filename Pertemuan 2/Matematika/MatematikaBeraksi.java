package matematika;
public class MatematikaBeraksi {

    public static void main(String[] args) {
        // TODO code application logic here
        Matematika nilai1 = new Matematika();
        
        System.out.println("Pertambahan : 8+4="+nilai1.pertambahan(8,4));
        System.out.println("Pengurangan : 9-3="+nilai1.pengurangan(9,3));
        System.out.println("Perkalian   : 7*2="+nilai1.perkalian(7,2));
        System.out.println("Pembagian   : 6/2="+nilai1.pembagian(6,2));
    }    
}
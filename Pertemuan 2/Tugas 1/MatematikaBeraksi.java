package matematika;
public class MatematikaBeraksi {

    public static void main(String[] args) {
        // TODO code application logic here
        Matematika mtk = new Matematika();
        
        mtk.pertambahan(8,4);
        System.out.println("Pertambahan : 8+4="+mtk.getHasil());
        
        mtk.pengurangan(9,3);
        System.out.println("Pengurangan : 9-3="+mtk.getHasil());
        
        mtk.perkalian(7,2);
        System.out.println("Perkalian   : 7*2="+mtk.getHasil());
        
        mtk.pembagian(6,2);
        System.out.println("Pembagian   : 6/2="+mtk.getHasil());
    }    
}
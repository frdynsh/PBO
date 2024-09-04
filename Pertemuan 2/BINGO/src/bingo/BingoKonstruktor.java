package bingo;
public class BingoKonstruktor {

    public static void main(String[] args) {
        // TODO code application logic here
        Bingo bingo1 = new Bingo("B","I","N","G","O");
        Bingo bingo2 = new Bingo("(Ferdi)","I","N","G","O");
        Bingo bingo3 = new Bingo("B","(Ferdi)","N","G","O");
        Bingo bingo4 = new Bingo("B","I","(Yansah)","G","O");
        Bingo bingo5 = new Bingo("B","I","N","(Yansah)","O");
        
        bingo1.cetak();
        bingo2.cetak();
        bingo3.cetak();
        bingo4.cetak();
        bingo5.cetak();
    }
}
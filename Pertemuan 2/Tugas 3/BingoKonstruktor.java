package bingo;
public class BingoKonstruktor {

    public static void main(String[] args) {
        // TODO code application logic here
        Bingo bingo1 = new Bingo("B","I","N","G","O");
        Bingo bingo2 = new Bingo("(clap)","I","N","G","O");
        Bingo bingo3 = new Bingo("(clap)","(clap)","N","G","O");
        Bingo bingo4 = new Bingo("(clap)","(clap","(clap)","G","O");
        Bingo bingo5 = new Bingo("(clap)","(clap)","(clap)","(clap)","O");
        Bingo bingo6 = new Bingo("(clap)","(clap)","(clap)","(clap)","(clap)");
        
        bingo1.cetak();
        bingo2.cetak();
        bingo3.cetak();
        bingo4.cetak();
        bingo5.cetak();                      
        bingo6.cetak();                      
    }
}
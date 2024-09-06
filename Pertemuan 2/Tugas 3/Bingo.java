package bingo;
class Bingo {
    String B,I,N,G,O;

    public Bingo(String B,String I,String N,String G,String O){
        this.B = B;
        this.I = I;
        this.N = N;
        this.G = G;
        this.O = O;
    }
    public void cetak(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        System.out.println(B+"-"+I+"-"+N+"-"+G+"-"+O);
        System.out.println(B+"-"+I+"-"+N+"-"+G+"-"+O);
        System.out.println(B+"-"+I+"-"+N+"-"+G+"-"+O);
        System.out.println("And Bingo was his name-o.\n");
    }
}
package Suhu;
public class KonversiSuhu2 extends KonversiSuhu {
    //mengkonversi dari celcius ke Fahrenheit lalu ke Reamur
    public double fahrenheitToReamur(double F){
        double c = 5.0/9.0 * (F - 32);
        return c * 4.0/5;
    }
}

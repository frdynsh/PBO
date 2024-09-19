package Suhu;
public class DemoKonversiSuhu {

    public static void main(String[] args) {
        // TODO code application logic here
        KonversiSuhu2 Demo = new KonversiSuhu2();
        
        double c = 80;
        double f = Demo.celciusToFahrenheit(c);
        double r = Demo.celciusToReamur(c);
        System.out.println("Perubahan dari "+c+" celcius ke Fahrenheit adalah "+f);
        System.out.println("Perubahan dari "+c+" celcius ke Reamur adalah "+r);
        
        double F = 120;
        double R = Demo.fahrenheitToReamur(F);
        System.out.println("Perubahan dari "+F+" Fahrenheit ke Reamur adalah "+R);
    }   
}
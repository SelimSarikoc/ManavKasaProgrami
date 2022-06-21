import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican, a, e , d , m , p, toplam;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kilo: ");
        armut = inp.nextDouble();
        a = armut * 2.14;
        System.out.println("Armut Toplam: " + a);

        System.out.print("Elma Kilo: ");
        elma = inp.nextDouble();
        e = elma * 3.67;
        System.out.println("Elma Toplam: " + e);


        System.out.print("Domates Kilo: ");
        domates = inp.nextDouble();
        d = domates * 1.11;
        System.out.println("Domates Toplam: " + d);

        System.out.print("Muz Kilo: ");
        muz = inp.nextDouble();
        m = muz * 0.95;
        System.out.println("Muz Topla: " +m);

        System.out.print("Patlican Kilo: ");
        patlican = inp.nextDouble();
        p = patlican * 5.00;
        System.out.println("Patlıcan Toplam: " +p);

        toplam = a*e*d*m*p;

        System.out.println("Genel Toplam: " + toplam);



    }
}

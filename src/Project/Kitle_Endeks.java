package Project;

import java.util.Scanner;

public class Kitle_Endeks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Boyunuzu (metre) cinsinden giriniz : ");
        double boy = scan.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        double kilo = scan.nextDouble();

        double index = kilo / (boy * boy);

        if (index >= 40) System.out.println("Morbid Obez");
        else if (index >= 30) System.out.println("Obez");
        else if (index >= 25) System.out.println("Ideal kilonun üstünde");
        else if (index >= 18.5) System.out.println("Ideal kilo");
        else  System.out.println("Ideal kilonun altında");

    }

}

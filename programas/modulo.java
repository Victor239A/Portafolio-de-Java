package programas;

import java.util.Scanner;

public class modulo{

    public static void modulo() {
Scanner scanNumeros = new Scanner(System.in);

System.out.println("[N1]:");
double N1 = scanNumeros.nextDouble();

System.out.println("[N2]:");
double N2 = scanNumeros.nextDouble();

System.out.println("[Re]:"+(N1%N2));

    }
}
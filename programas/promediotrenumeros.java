package programas;

import java.util.Scanner;

public class promediotrenumeros{

    public static void promediotrenumeros() {
Scanner scanNumeros = new Scanner(System.in);

System.out.print("Introduce el primer número: ");
double N1 = scanNumeros.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    double N2 = scanNumeros.nextDouble();
                    System.out.print("Introduce el tercer número: ");
                    double N3 = scanNumeros.nextDouble();
                    System.out.println("El promedio de los tres números es: " + ((N1 + N2 + N3) / 3));

    }
}
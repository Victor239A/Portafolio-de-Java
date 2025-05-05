package programas;

import java.util.Scanner;

public class numeroMyM3N{

    public static void numeroMyM3N() {
Scanner scanNumeros = new Scanner(System.in);

System.out.print("Introduce el primer número: ");
double N1 = scanNumeros.nextDouble();

System.out.print("Introduce el segundo número: ");
double N2 = scanNumeros.nextDouble();

System.out.print("Introduce el tercer número: ");
double N3 = scanNumeros.nextDouble();

double mayor = N1;
double menor = N1;

if (N2 > mayor) {
    mayor = N2;
}
if (N3 > mayor) {
    mayor = N3;
}

if (N2 < menor) {
    menor = N2;
}
if (N3 < menor) {
    menor = N3;
    System.out.println("El número mayor es: " + mayor);
    System.out.println("El número menor es: " + menor);
}

}


    }
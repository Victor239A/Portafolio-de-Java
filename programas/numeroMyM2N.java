package programas;

import java.util.Scanner;

public class numeroMyM2N{

    public static void numeroMyM2N() {
Scanner scanNumeros = new Scanner(System.in);

System.out.print("Introduce el primer número: ");
Double N1 = scanNumeros.nextDouble();
System.out.print("Introduce el segundo número: ");
Double N2 = scanNumeros.nextDouble();

if (N1 > N2) {
    System.out.println(N1 + " es el número mayor");
    System.out.println(N2 + " es el número menor");
} else {

    if (N2 > N1) {
        System.out.println(N2 + " es el número mayor");
        System.out.println(N1 + " es el número menor");
    } else {
        System.out.println("Ambos numeros son iguales.");
    }
}
    }
}
package programas;

import java.util.Scanner;

public class Dekgag{

    public static void Dekgag() {
Scanner scanNumeros = new Scanner(System.in);

System.out.print("Introduce la cantidad en kilogramos: ");
double kilogramos = scanNumeros.nextDouble();
System.out.println(kilogramos + " kilogramos son " + (kilogramos * 1000) + " gramos.");

}
}


    
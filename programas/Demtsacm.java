package programas;

import java.util.Scanner;

public class Demtsacm{

    public static void Demtsacm() {
Scanner scanNumeros = new Scanner(System.in);

System.out.print("Introduce la cantidad en metros: ");
                    double metros = scanNumeros.nextDouble();
                    System.out.println(metros + " metros son " + (metros * 100) + " centímetros.");
}
}


    
import java.util.Scanner;

public class Portafolio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Menú
            System.out.println("");
            System.out.println("Bienvenido a el proyecto(victor) java version 1.21 ");
            System.out.println("");
            System.out.println(" __     __      _            ");
            System.out.println(" \\ \\   / (_) ___| |_ ___  _ __ ");
            System.out.println("  \\ \\ / /| |/ __| __/ _ \\| '__|");
            System.out.println("   \\ V / | | (__| || (_) | |   ");
            System.out.println("    \\_/  |_|\\___|\\__\\___/|_|   ");
            System.out.println("");
            System.out.println("Proyecto iniciado --->  Mar 18 8:45 am 2025 ");
            System.out.println("Seleccione una opcion para continuar:");
            System.out.println("");



            System.out.println("[1] La suma de dos números");
            System.out.println("[2] Opción 2");
            System.out.println("[3] Opción 3 ");
            System.out.println("[0] Salir");
            System.out.print("[?]: ");
            opcion = sc.nextInt();
            
            
            // Opciones
            switch (opcion) {
                case 1:
                    System.out.println("[1] La suma de dos números");
                    System.out.print("Introduce el primer número: ");
                    int num1 = sc.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    int num2 = sc.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma de los dos números es: " + suma);
                    break;

                case 2:
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("");
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

            System.out.println(); 
        } while (opcion != 0);

        sc.close();
    }
}
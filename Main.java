import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;

        
        do {
            // Menú
            
            vistas.vista.banner();
            programas.opciones.opciones();
            

            System.out.println("[0] Salir:");
            System.out.println("[?]:");


            opcion = sc.nextInt();
            
            
            // Opciones
            switch (opcion) {
                case 1:
        System.out.println("----------");
                    programas.sumar.sumar();
         System.out.println("----------");
                    break;

                case 2:
                System.out.println("----------");
                programas.resta.resta();
     System.out.println("----------");

                 
                     
                    break;

                case 3:
                System.out.println("----------");
                programas.multiplicacion.multiplicacion();
     System.out.println("----------");

                    
                    break;

                case 4:
                System.out.println("----------");
                programas.division.división();
     System.out.println("----------");
                 
                   
                    break;

                case 5:
                System.out.println("----------");
                programas.modulo.modulo();
     System.out.println("----------");
                 
                    break;

                case 6:
                
                System.out.println("----------");
                programas.promediotrenumeros.promediotrenumeros();
     System.out.println("----------");
                 
                 
            
                    break;

                case 7:
                System.out.println("----------");
                programas.numeroMyM2N.numeroMyM2N();
     System.out.println("----------");
                
    break;
                    
       

                 
                case 8:
                System.out.println("----------");
                programas.numeroMyM3N.numeroMyM3N();
     System.out.println("----------");
        
             
                break;

        
                case 9:
                System.out.println("----------");
                programas.Dekgag.Dekgag();
     System.out.println("----------");
                
                break;
                case 10:
                System.out.println("----------");
                programas.Demtsacm.Demtsacm();
     System.out.println("----------");
                break;

                case 0:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Error de entrada");
                    break;
            }

            System.out.println(); 
        } while (opcion != 0);

     
    }
}

import java.util.Scanner;

/*
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el
  programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
  Incorrecto. Nota: investigar la función equals() en Java.
 */

/**
 *
 * @author Ruben
 */
public class tp2 {
    
    public static void main(String[] args) {
        String Cadena;
        String Cadena1 ="Eureka";
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Frase");
        Cadena = leer.nextLine();  
       if (Cadena.equals(Cadena1)){
          System.out.println( " CORRECTO");
       }
       else{
          System.out.println( " INCORRECTO");
       }
    }
    
}

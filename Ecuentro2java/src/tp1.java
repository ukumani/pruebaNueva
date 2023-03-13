
import java.util.Scanner;

/*
 * Crear un programa que dado un número determine si es par o impar.
 */

/**
 *
 * @author Ruben
 */
public class tp1 {
    
   public static void main(String[] args) {
       float num1;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un Numero");
        num1 = leer.nextFloat();
        if (num1%2 ==0){
            System.out.println("El numero Ingresado es Par");
        }
            else{
                System.out.println("EL Numero Ingresado es Impar");    
        }
        }
        
    }  


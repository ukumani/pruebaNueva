
import java.util.Scanner;

/*
   Escriba un programa en el cual se ingrese un valor limite positivo, y a
   continuacion solicite números al usuario hasta que la suma de los
   numeros introducidos supere el limite inicial.

 */
/**
 *
 * @author Ruben
 */
public class tp5 {

    public static void main(String[] args) {
        int num, num2, suma = 0;
        Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese Numero Limite");
            num = leer.nextInt();
        do {
           
            System.out.println("Ingrese un Numero");
            num2 = leer.nextInt();
            suma = suma + num2;
        } while (suma <= num);
        System.out.println("La suma es " + suma);

    }
}

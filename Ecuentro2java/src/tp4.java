
import java.util.Scanner;

/*
 *Escriba un programa que pida una frase o palabra y valide si la primera
  letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
  imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
  contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
  Substring y equals() de Java.
 */

/**
 *
 * @author Ruben
 */
public class tp4 {
    
    public static void main(String[] args) {
      String Cadena;
      String c;
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Frase");
        Cadena = leer.nextLine(); 
        c=Cadena.substring(0,1);
        
       if ("A".equals(c)){
           System.out.println( "CORRECTO");
       }
       else{
           System.out.println( " INCORRECTO");
       }
    }
        
    }
    



import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ruben
 */
public class tp6 {

    public static void main(String[] args) {
        int num, num2,op, suma, resta, mult;
        float div;
        String op2 = null;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Numero");
        num = leer.nextInt();
        System.out.println("Ingrese Otro Numero");
        num2 = leer.nextInt();
      do {  
        System.out.println("------MENU---------");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        System.out.println("ELIJA UNA OPCION:");
        System.out.println("Ingrese Una Opcion");
        op = leer.nextInt();
        switch (op){

            case 1:{
                  suma=num+num2;
                System.out.println("La suma de "+num+ " y" +num2+" es: "+suma);

                break;

            }

            case 2:{
                resta=num-num2;
                System.out.println("La resta de "+num+ " y" +num2+" es: "+resta);

                break;

            }

            case 3:{
                mult=num*num2;
                System.out.println("La Multiplicacion de "+num+ " y" +num2+" es: "+mult);

                break;

            }
            
            case 4:{
                
                if (num2 != 0){
                div =num*num2;
                System.out.println("La divicion de " +num+" y " +num2+" es: "+div);
                }
                else{
                   System.out.println("No se puede dividir por cero");
                }
                break;

            }

            case 5:{
               
                System.out.println("Escriba (S/N) para salir");
                op2 = leer.nextLine();
                if ("S".equals(op2)){
                 break;
                }
               
                break;

            }
            default: {

                System.out.println("Opcion incorrecta");

            }

      }
    } while (5!=op);     
        System.out.println("Finalizo el programa");   

    }

}


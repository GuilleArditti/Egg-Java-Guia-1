/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia1;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Guille
 */
public class EjerciciosGuia1 {

    public static int sumaDeValores(){
        System.out.println("Ingrese el primer valor");
        int valor1;
        Scanner num1= new Scanner(System.in);
        valor1=num1.nextInt();
        System.out.println("Ingrese el segundo valor");
        int valor2;
        Scanner num2= new Scanner(System.in);
        valor2=num2.nextInt();
        return valor1+valor2;
    }
    
    public static String mostrarNombre(){
        System.out.println("Ingresa tu nombre");
        String nombre;
        Scanner scan= new Scanner(System.in);
        nombre=scan.nextLine();
        return "Hola " + nombre + "!";
    }
    
     public static String mostrarEnMayYEnMin(){
        System.out.println("Ingresa una frase");
        String nombre;
        Scanner scan= new Scanner(System.in);
        nombre=scan.nextLine();
        return "\n" +  nombre.toUpperCase() + "\n" + nombre.toLowerCase() ;
    }
     
     public static int devolverEnFahrenheit(){
         System.out.println("Ingrese los grados en C°");
         int gradosEnC;
         Scanner scan = new Scanner(System.in);
         gradosEnC=scan.nextInt();
         
         return 32+(9*gradosEnC/5);
     }
     
     public static void devolverDobleTripleYRaiz(){
         System.out.println("Ingrese un numero entero");
         int numero;
         Scanner scan = new Scanner(System.in);
         numero=scan.nextInt();
         System.out.println("La raiz cuadrada de " + numero + " es: " +  Math.sqrt(numero));
         System.out.println("El doble de " + numero + " es: " + numero*2);
         System.out.println("El triple de " + numero + " es: " + numero*3);
     }
     
     public static void determinarParidad(){
         System.out.println("Ingrese un numero");
         int numero;
         Scanner scan = new Scanner(System.in);
         numero= scan.nextInt();
         if(numero%2==0){
             System.out.println(numero + " es par ");
         }
         else{
             System.out.println(numero + " es impar ");
         }
     }
     
     public static void fraseIgual(){
         System.out.println("Ingrese su frase!");
         String frase;
         Scanner scan = new Scanner(System.in);
         frase= scan.nextLine();
         if(frase.equals("eureka")){
             System.out.println("CORRECTO");
         }
         else{
             System.out.println("INCORRECTO");
         }
     }
     
     public static void longitudIgualA8(String frase){
         if(frase.length()==8){
            System.out.println("CORRECTO, " + frase + " tiene 8 caracteres");
        }
         else{
             System.out.println("INCORRECTO " + frase + " tiene " + frase.length()+ " caracteres");
         }
     }   
     
     public static void primeraLetraEsA(String frase){
         if(frase.substring(0,1).equals("A") || frase.substring(0,1).equals("a") ){
             System.out.println("CORRECTO! La primera letra de  " + frase + " es : " + frase.substring(0,1) );
         }
         else{
             System.out.println("INCORRECTO! La primera letra de  " + frase + " es : " + frase.substring(0,1) );
         }
     } 
     
     public static void limite(){
         System.out.println("Ingrese un valor límite positivo");
         int limite;
         Scanner scan = new Scanner(System.in);
         limite=scan.nextInt();
         int acumulador=0;
         int numero=0;
        while (acumulador<limite){
            System.out.println("Ingrese un numero");
            Scanner scan1 = new Scanner(System.in);
            numero=scan1.nextInt();
            acumulador=acumulador+numero;
            System.out.println("Suma actual de los numeros ingresados: " + acumulador);
        }
         System.out.println("Limite excedido");
     }
     public static void operaciones(){
         System.out.println("Ingrese un numero");
         
         int numero1;
         int numero2;
         
         Scanner scan = new Scanner(System.in);
         numero1=scan.nextInt();
         
         System.out.println("Ingrese otro numero");
         Scanner scan1 = new Scanner(System.in);
         numero2=scan1.nextInt();
         
         System.out.println("Numeros Ingresados: " + numero1 + " y " + numero2);
         System.out.println("\n MENU \n 1.SUMAR \n 2.RESTAR \n 3.MULTIPLICAR \n 4.DIVIDIR \n 5.SALIR \n Elija opción: " );
         
         int opcion;
         String salida;
         
         do{
         Scanner scan2= new Scanner(System.in);
         opcion=scan2.nextInt();
         
         switch(opcion){
             case 1:
                 System.out.println( "La suma da como resultado: " + (numero1+numero2));
                 break;
             case 2:
                 System.out.println( "La resta da como resultado: " + (numero1-numero2));
                 break;
             case 3:
                 System.out.println( "La multiplicacion da como resultado: " + numero1*numero2);
                 break;
             case 4:
                 System.out.println( "La división da como resultado: " + numero1/numero2);
                 break;
             default:
                 System.out.println("Seguro desea salir? S/N");
                 Scanner scan3 = new Scanner(System.in);
                 salida=scan3.nextLine();
                 while( salida.equalsIgnoreCase("s") || salida.equalsIgnoreCase("n")){
                    if(salida.equalsIgnoreCase("S")){
                        break;
                    }
                    else{
                        continue;
                    }
                 }
         }
         System.out.println("\n MENU \n 1.SUMAR \n 2.RESTAR \n 3.MULTIPLICAR \n 4.DIVIDIR \n 5.SALIR \n Elija opción: " );
         }while(opcion!=5);
     }
     
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("La suma da como resultado: " + sumaDeValores());
        //System.out.println(mostrarNombre());
        //System.out.println(mostrarEnMayYEnMin());
        //System.out.println("Su equivalente en Fahrenheit son: " + devolverEnFahrenheit());
        //devolverDobleTripleYRaiz();
        //determinarParidad();
        //fraseIgual();
        //longitudIgualA8("competicion");
        //primeraLetraEsA("Amigo");
        //limite();
        operaciones();
       
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia1;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

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
         
         
         int opcion;
         String salida="";
         
         do{
         System.out.println("\n MENU \n 1.SUMAR \n 2.RESTAR \n 3.MULTIPLICAR \n 4.DIVIDIR \n 5.SALIR \n Elija opción: " );
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
             case 5:
                 System.out.println("Seguro desea salir? S/N");
                 Scanner scan3 = new Scanner(System.in);
                 salida=scan3.nextLine();
                    if(salida.equalsIgnoreCase("n")){
                        break;
                    }
                    else{
                        if(salida.equalsIgnoreCase("s")){
                            System.out.println("Adios!");
                        }
                    }
         }
         }while(!salida.equalsIgnoreCase("s"));
     }

     public static String dispositivoRS232(){
         String cadena;
         int correctas=0;
         int incorrectas=0;
         do{
             System.out.println("Ingrese una cadena");
             Scanner scan= new Scanner(System.in);
             cadena=scan.nextLine();
             if(cadena.length()==5 && cadena.substring(0, 1).equalsIgnoreCase("x") && cadena.endsWith("o") || cadena.endsWith("O")){
                 correctas=correctas+1;
             }
             else{
                 if(!cadena.equals("&&&&&"))
                 incorrectas=incorrectas+1;
             }
             
         }while(!cadena.equals("&&&&&"));
         
         return " La cantidad de cadenas correctas fueron: " + correctas +
                 "\n La cantidad de cadenas incorrectas fueron: " + incorrectas;
     }
     
     public static void dibujarCuadrado(int n){
         for(int i=1;i<=n;i++){
             for(int j=1;j<=n;j++){
                if(i==1 || i==n){
                    System.out.print("*");
                }
                else{
                    if(j==1 || j==n){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
             System.out.println(" ");
        }
     }
     
     public static void convertirAEuros(int cantEuros, String moneda){
         if(moneda.equalsIgnoreCase("libras")){
             System.out.println(cantEuros + " Euros son " + cantEuros*0.86 + " Libras");
         }
         if(moneda.equalsIgnoreCase("dolares")){
             System.out.println(cantEuros + " Euros son " + cantEuros*1.28611 + " Dólares");
         }
         if(moneda.equalsIgnoreCase("yenes")){
             System.out.println(cantEuros + " Euros son " + cantEuros*129.852 + " Yenes");
         }
     }
     
     public static void rellenarVector(){
         int[] vector= new int [100];
         for(int i=1;i<100;i++){
             vector[i]=i;
             System.out.print("[" + vector[i] + "]");
         }
         System.out.println("");
     }
     public static void rellenarVectorDeTamañoN(int n, int buscarNum){
        int [] vector= new int[n];
        int contador=0;
        int numero = (int)(Math. random()*10+1);
        for(int i=0;i<n;i++){
            vector[i]=numero;
            numero = (int)(Math. random()*10+1);
            System.out.print("[" + vector[i] + "]");
         }
         System.out.println(" ");
        for(int i=0;i<n;i++){
            if(vector[i]==buscarNum){
                contador=contador+1;
                System.out.println(buscarNum + " Se encuentra en la posición " + i + " del vector");
            }
        }
         System.out.println("");
         if(contador==0){
         System.out.println(buscarNum + " No esta en el vector");
         }
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
        //operaciones();
        //System.out.println(dispositivoRS232());
        //dibujarCuadrado(50);
        //convertirAEuros(1, "yenes");
        //rellenarVector();
        rellenarVectorDeTamañoN(4,3);
    }
    
}

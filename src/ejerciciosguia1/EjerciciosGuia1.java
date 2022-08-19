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

/*----------Ejercicio 1---------------------*/
    
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
    
/*----------Ejercicio 2---------------------*/
    
    public static String mostrarNombre(){
        System.out.println("Ingresa tu nombre");
        String nombre;
        Scanner scan= new Scanner(System.in);
        nombre=scan.nextLine();
        return "Hola " + nombre + "!";
    }
    
/*----------Ejercicio 3---------------------*/ 
    
    public static String mostrarEnMayYEnMin(){
        System.out.println("Ingresa una frase");
        String nombre;
        Scanner scan= new Scanner(System.in);
        nombre=scan.nextLine();
        return "\n" +  nombre.toUpperCase() + "\n" + nombre.toLowerCase() ;
    }
     
/*----------Ejercicio 4---------------------*/
     
     public static int devolverEnFahrenheit(){
         System.out.println("Ingrese los grados en C°");
         int gradosEnC;
         Scanner scan = new Scanner(System.in);
         gradosEnC=scan.nextInt();
         
         return 32+(9*gradosEnC/5);
     }
     
/*----------Ejercicio 5---------------------*/
     
     public static void devolverDobleTripleYRaiz(){
         System.out.println("Ingrese un numero entero");
         int numero;
         Scanner scan = new Scanner(System.in);
         numero=scan.nextInt();
         System.out.println("La raiz cuadrada de " + numero + " es: " +  Math.sqrt(numero));
         System.out.println("El doble de " + numero + " es: " + numero*2);
         System.out.println("El triple de " + numero + " es: " + numero*3);
     }
     
/*----------Ejercicio 6---------------------*/
     
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
     
/*----------Ejercicio 7---------------------*/
     
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
     
/*----------Ejercicio 8---------------------*/
     
     public static void longitudIgualA8(String frase){
         if(frase.length()==8){
            System.out.println("CORRECTO, " + frase + " tiene 8 caracteres");
        }
         else{
             System.out.println("INCORRECTO " + frase + " tiene " + frase.length()+ " caracteres");
         }
     }   
     
/*----------Ejercicio 9---------------------*/
     
     public static void primeraLetraEsA(String frase){
         if(frase.substring(0,1).equals("A") || frase.substring(0,1).equals("a") ){
             System.out.println("CORRECTO! La primera letra de  " + frase + " es : " + frase.substring(0,1) );
         }
         else{
             System.out.println("INCORRECTO! La primera letra de  " + frase + " es : " + frase.substring(0,1) );
         }
     } 
     
/*----------Ejercicio 10---------------------*/
     
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
         System.out.println("Limite alcanzado/excedido");
     }
     
/*----------Ejercicio 11---------------------*/
     
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

/*----------Ejercicio 12---------------------*/
     
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
     
/*----------Ejercicio 13---------------------*/
     
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
     
/*----------Ejercicio 14---------------------*/
     
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
     
/*----------Ejercicio 15---------------------*/
     
     public static void rellenarVector(){
         int[] vector= new int [100];
         for(int i=99;i>0;i--){
             vector[i]=i;
             System.out.print("[" + vector[i] + "]");
         }
         System.out.println("");
     }
     
/*----------Ejercicio 16---------------------*/
     
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
    
/*----------Ejercicio 17---------------------*/
     
     public static void determinarDigito(){
         int n;
         int numero;
         int unDigito=0;
         int dosDigitos=0;
         int tresDigitos=0;
         int cuatroDigitos=0;
         int cincoDigitos=0;
         int masDigitos=0;
         
         System.out.println("Ingrese de cuanto va a ser el tamaño del vector");
         Scanner scan = new Scanner (System.in);
         n=scan.nextInt();
         
         int [] vector= new int[n];
        
         
         for(int i=0;i<vector.length;i++){
             System.out.println("Ingrese un numero");
              Scanner scan1= new Scanner (System.in);
              numero=scan1.nextInt();
              vector[i]=numero;
             if(vector[i]/2>=10 && vector[i]<100){
                 dosDigitos=dosDigitos+1;
             }
             else{
                 if(vector[i]/2<10){
                     unDigito=unDigito+1;
                 }
                 else{
                     if(vector[i]/2>=100 && vector[i]<1000){
                         tresDigitos=tresDigitos+1;
                     }
                     else{
                         if(vector[i]/2>=1000 && vector[i]<10000){
                        cuatroDigitos=cuatroDigitos+1;
                        }
                         else{
                             if(vector[i]/2>=10000 && vector[i]<100000){
                                 cincoDigitos=cincoDigitos+1;
                             }
                             else{
                                masDigitos=masDigitos+1;
                             }
                         }
                 }
             } 
         }
     }
         
         System.out.println("Hay "+ unDigito + " numeros de un digito\n" +
                            "Hay " + dosDigitos + " numeros de dos digitos\n" +
                             "Hay " + tresDigitos + " numeros de tres digitos\n" +
                              "Hay " + cuatroDigitos + " numeros de cuatro digitos\n" +
                                "Hay " + cincoDigitos + " numeros de cinco digitos\n" + 
                                   "Hay " + masDigitos + " numeros de mas de cinco digitos");
     } 
  
/*----------Ejercicio 18---------------------*/
     
     public static void mostrarTraspuesta(){
         int [][] matriz= new int [6][6];
         int numero;
         
         System.out.println("Matriz normal:");
         
         for(int i=0;i<matriz.length;i++){
               System.out.println("");
                 System.out.print("[");
             for(int j=0;j<matriz[0].length;j++){
                 numero = (int)(Math. random()*10+1);
                 matriz[i][j]=numero;
                 System.out.print(matriz[i][j] + " ");
                 if(j == matriz[0].length-1){
                     System.out.print("]");
                 }
             }
         }
         
         System.out.println(" ");
         System.out.println(" ");
         System.out.println("Matriz traspuesta: ");
         
           for(int i=0;i<matriz.length;i++){
               System.out.println("");
                 System.out.print("[");
             for(int j=0;j<matriz[0].length;j++){
                 System.out.print(matriz[j][i] + " ");
                 if(j == matriz[0].length-1){
                     System.out.print("]");
                 }
             }
         }
     }
     
/*----------Ejercicio 19---------------------*/
     
     public static boolean esAntisimetrica(int [][] matriz){
         boolean esAntisimetrica=true;
         for(int i=0;i<matriz.length;i++){
             for(int j=0;j<matriz[0].length;j++){
                 if(-matriz[i][j] == matriz[j][i]){
                     esAntisimetrica=esAntisimetrica && true;
                 }
                 else{
                     esAntisimetrica=false;
                 }
             }
         }
         return esAntisimetrica;
     }
/*----------Ejercicio 20---------------------*/ 
     
     public static boolean matrizMagica(){
         int [][] matriz = new int [3][3];
         boolean enRango=true;
         int entrada=0;
         int sumaDiag1=0;
         int sumaDiag2=0;
         int sumaCol=0;
         int sumaFil=0;
         
         for(int i=0;i<matriz.length;i++){
             for(int j=0;j<matriz.length;j++){
                 System.out.println("Ingrese un numero del 1 al 9 para la matriz en "+ i + "," + j);
                 Scanner scan= new Scanner(System.in);
                 entrada=scan.nextInt();
                 matriz[i][j]=entrada;
                 }
             }
      
         for(int i=0;i<matriz.length;i++){
             for(int j=0;j<matriz.length;j++){
                 if(i==j){
                     sumaDiag1=sumaDiag1 + matriz[i][j];
                 }
                 if(i+j==matriz.length-1){
                     sumaDiag2=sumaDiag2 + matriz[j][i];
                 }
                 sumaCol=sumaCol+matriz[j][i];
                 sumaFil=sumaFil+matriz[i][j];
             
                 if(matriz[i][j]>=1 && matriz[i][j]<=9){
                     enRango=enRango && true;
                 }
                 else{
                     enRango=false;
                     System.out.println("Se ingreso a la matriz un numero no admitido! : " + matriz[i][j] + ". \n ¡Recuerde ingresar numeros del 1 al 9!");
                 }
             }
         }
         sumaCol=sumaCol/matriz.length;
         sumaFil=sumaFil/matriz.length;
         
         if(enRango){
         mostrarMatriz(matriz);
         }
         
         return sumaDiag1==sumaDiag2 && sumaCol==sumaDiag1 && sumaDiag1==sumaFil && enRango;
     }
     
     
/*----------Ejercicio 21---------------------*/
     
     static public String matrizContenida(int [][] matrizM, int matrizP [][]){
         int indFila=0;
         int indCol=0;
         int contadorPosiciones=0;
         while(contadorPosiciones<=matrizP.length*matrizP[0].length){
         for(int i=0;i<matrizM.length;i++){
             for(int j=0;j<matrizM[0].length;j++){
                 if(matrizM[i][j]==matrizP[indFila][indCol]){
                     contadorPosiciones=contadorPosiciones+1;
                     //System.out.println(contadorPosiciones);
                     if(indFila<matrizP.length && indCol<matrizP[0].length-1){
                     indCol=indCol+1;
                     }
                     else{
                         if(contadorPosiciones<matrizP.length*matrizP[0].length)
                         indFila=indFila+1;
                         indCol=0;
                         
                     }
                }
            }
         }
         }
         if(contadorPosiciones==matrizP.length*matrizP[0].length){
             return "La matriz P esta contenida dentro de M!";
         }
         else{
             return "La matriz P  NO esta contenida dentro de M!";
         }
     }
  
/*-----------------Ejercicios Extras-------------------*/
     
     
     
     
/*------------------Ejercicio 1-------------------------*/
     
     static public String calcularDiasyHoras(int n){
        int aux=n;
        int dias=0;
        double horas=0;
        while(aux>=1440){
            dias=dias+1;
            aux=aux-1440;
        }
        if(aux<1440){
            horas=aux/60;
        }
        return n + " minutos son: " + dias + " dias, " + horas + " horas";
    }

/*------------------Ejercicio 2---------------------------*/
     
    static public void cambioDeValores(){
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        int aux=0;
        System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("CAMBIANDO!!!!!");
        System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
    }
     
/*------------------Ejercicio 3---------------------------*/
    
    static public void esVocal(){
        String s;
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese una letra");
        s=scan.nextLine();
        if(s.equalsIgnoreCase("A") || 
           s.equalsIgnoreCase("E") || 
           s.equalsIgnoreCase("I") || 
           s.equalsIgnoreCase("O") ||
           s.equalsIgnoreCase("U")){
            System.out.println(s + " es una vocal!");
           
        }
        else{
            System.out.println(s + " no es una vocal!");
            
        }
    }
    
/*------------------Ejercicio 4---------------------------*/
    
    static public void equivalenteEnRomano(){
        int numero;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        numero=scan.nextInt();
        if(numero>0 && numero<=10){
        switch(numero){
            case 1:
                System.out.println(numero + " en romano es : I ");
                break;
            case 2:
                System.out.println(numero + " en romano es : II ");
                break;
            case 3:
                System.out.println(numero + " en romano es : III ");
                break;
            case 4:
                System.out.println(numero + " en romano es : IV ");
                break;
            case 5:
                System.out.println(numero + " en romano es : V ");
                break;
            case 6:
                System.out.println(numero + " en romano es : VI ");
                break;
            case 7:
                System.out.println(numero + " en romano es : VII ");
                break;
            case 8:
                System.out.println(numero + " en romano es : VIII ");
                break;
            case 9:
                System.out.println(numero + " en romano es : IX ");
                break;
            case 10:
                System.out.println(numero + " en romano es : X ");
                break;
            
            
            }
        }
        else{
            System.out.println("Numero ingresado no valido");
        }
    }
    
/*------------------Ejercicio 5---------------------------*/
    static public double determinarElCostoAPagar(){
        String letra;
        double costoTratamiento=0;
        double costoFinal=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese la calse del socio: A , B o C");
        letra=scan.nextLine();
        System.out.println("Ingrese el costo del tratamiento");
        costoTratamiento=scan.nextDouble();
        if(letra.equalsIgnoreCase("A")){
            costoFinal=costoTratamiento/2;
        }
        if(letra.equalsIgnoreCase("B")){
            costoFinal=costoTratamiento -(costoTratamiento*0.35);
        }
        if(letra.equalsIgnoreCase("C")){
            costoFinal=costoTratamiento;
        }
        System.out.println("por ser socio de tipo " + letra.toUpperCase() + " usted abona: ");
        return costoFinal;
    }
     
/*------------------Ejercicio 6---------------------------*/
    
    static public double promedioDeEstaturas(){
        double acumulador=0;
        double n;
        double altura=0;
        double altura160=0;
        int contador=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a evaluar");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Ingrese la altura de la persona " + i);
            altura=scan.nextDouble();
            if(altura<1.60){
                contador=contador+1;
                altura160=altura160+altura;
            }
            acumulador=acumulador+altura;
        }
        
        if(contador>0){
        System.out.println("el promedio de estaturas que se encuentran por\n" +
                            "debajo de 1.60 mts. es: " + altura160/contador + " mts");
        System.out.println("");
        }
        
        System.out.println("El promedio de estaturas en general es: ");
        return acumulador/n;
    }
    
/*------------------Ejercicio 7---------------------------*/ 
    
    static public void maximoMinimoYPromedio(){
        int n=0;
        int contador=0;
        int numero=0;
        int promedio=0;
        int maximo=0;
        int minimo=0;
        System.out.println("Ingrese cuantos numeros va a introducir");
        Scanner scan= new Scanner(System.in);
        n=scan.nextInt();
        if(n>0){
        while(contador<n ){
            System.out.println("Ingrese un numero");
            numero=scan.nextInt();
            promedio=promedio+numero;
            if(numero>maximo ){
                maximo=numero;
            }
            if(contador==0){
                minimo=numero;
            }
            else{
                if(numero<minimo){
                    minimo=numero;
                }
            }
            contador=contador+1;
            }
        promedio=promedio/n;
        
            System.out.println("El valor maximo es: " + maximo + 
                            "\nEl valor minimo es: "+ minimo + "\n"
                            + "Y el promedio entre todos los numeros es: " + promedio);
        }
        else{
            System.out.println("No hay numeros para evaluar, puesto que ingreso 0");
        }
        
    }
 
/*------------------Ejercicio 8---------------------------*/ 
    static public void leerHastaMultiploCinco(){
        int n;
        int cantidadNumLeidos=0;
        int cantNumerosPares=0;
        int cantNumerosImpares=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n=scan.nextInt();
       while(n%5!=0){
           cantidadNumLeidos=cantidadNumLeidos+1;
           if(n>0){
           if(n%2==0){
               cantNumerosPares=cantNumerosPares+1;
           }
           else{
               cantNumerosImpares=cantNumerosImpares+1;
           }
           System.out.println("Ingrese un numero");
           n=scan.nextInt();
           }
       }
        System.out.println("La cantidad de numeros leidos fueron: " + cantidadNumLeidos + 
                            "\n La cantidad de numeros pares es: " + cantNumerosPares + 
                            "\n La cantidad de numeros impares es: " + cantNumerosImpares);
        
    }
    
/*------------------Ejercicio 9---------------------------*/
    static public String restaSucesiva(){
        int dividendo;
        int divisor;
        int cociente=0;
        int residuo=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        dividendo=scan.nextInt();
        System.out.println("Ingrese el divisor");
        divisor=scan.nextInt();
        System.out.println(dividendo + " dividido " + divisor + " :");
        while(dividendo>=divisor){
            cociente=cociente+1;
            residuo=dividendo-divisor;
            dividendo=dividendo-divisor;
        }
        return "El resto es : " + residuo + 
               "\n El cociente es: " + cociente;
    }
    
/*------------------Ejercicio 10---------------------------*/
    
    static public void adivinarResultado(){
        int numero1 = (int)(Math. random()*10+1);
        int numero2 = (int)(Math. random()*10+1);
        int multiplicacion=numero1*numero2;
        int ingreso;
        int intento=0;
        do{
        Scanner scan= new Scanner(System.in);
        if(intento==0){
        System.out.println("ADIVINAS? INGRESA UN NUMERO!");
        }
        else{
            System.out.println("UPS! ES INCORRECTO! INTENTA ORA VEZ :)");
        }
        ingreso=scan.nextInt();
        if(ingreso!=multiplicacion){
            intento=1;
        }
        }while(ingreso!=multiplicacion);
         
        System.out.println("FELICITACIONES!!! El número secreto era:  "+ multiplicacion);
      
    }
  
/*------------------Ejercicio 11---------------------------*/
     static public String devolverDigitos(){
         int numero;
         int cantDigitos=0;
         System.out.println("Ingrese un numero!");
         Scanner scan = new Scanner(System.in);
         numero=scan.nextInt();
         int aux=numero;
         while(numero>=10){
             cantDigitos=cantDigitos+1;
             numero=numero/10;
         }
         cantDigitos=cantDigitos+1;
         
         return aux + " tiene " + cantDigitos + " digitos";
     }
    
/*------------Anexo para Mostrar la matriz---------------*/
     
     static public void mostrarMatriz(int [][] matriz){
         
      for(int i=0;i<matriz.length;i++){
               System.out.println("");
                 System.out.print("[");
             for(int j=0;j<matriz[0].length;j++){
                 System.out.print(matriz[i][j] + " ");
                 if(j == matriz[0].length-1){
                     System.out.print("]");
                 }
             }
         }
         System.out.println(" ");
     }
     
/*--------------------------------------------------------*/
     
    public static void main(String[] args) {

        
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
        //rellenarVectorDeTamañoN(4,3);
        //determinarDigito();
        //mostrarTraspuesta();
        
        //int [][] matriz= {{0,-2,4},{2,0,2},{-4,-2,0}};
        //System.out.println(esAntisimetrica(matriz));
        //System.out.println(matrizMagica());
        int [][] matrizM={{1,26,36,47,5,6,72,81,95,10},
                          {11,12,13,21,41,22,67,20,10,61},
                          {56,78,87,90,9,90,17,12,87,67},
                          {41,87,24,56,97,74,87,42,64,35},
                          {32,76,79,1,36,5,67,96,12,11},
                          {99,13,54,88,89,90,75,12,41,76},
                          {67,78,87,45,14,22,26,42,56,78},
                          {98,45,34,23,32,56,74,16,19,18},
                          {24,67,97,46,87,13,67,89,93,24},
                          {21,68,78,98,90,67,12,41,65,12}};
                          
        int [][] matrizP={{36,5,67},
                          {89,90,75},
                          {14,22,26}};
        
        //System.out.println(matrizContenida(matrizM, matrizP));
        //System.out.println(calcularDiasyHoras(1600));
        //cambioDeValores();
        //esVocal();
        //equivalenteEnRomano();
        //System.out.println(determinarElCostoAPagar());
        //System.out.println(promedioDeEstaturas());
        //maximoMinimoYPromedio();
        //leerHastaMultiploCinco();
        //System.out.println(restaSucesiva());
        //adivinarResultado();
        System.out.println(devolverDigitos());
    }
    
}

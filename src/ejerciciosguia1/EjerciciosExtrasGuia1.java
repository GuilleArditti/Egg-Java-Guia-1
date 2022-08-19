/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia1;

/**
 *
 * @author Guille
 */
public class EjerciciosExtrasGuia1 {
    
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
        return n + "minutos son: " + dias + " dias, " + horas + " horas";
    }
    
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
    
    static public boolean esVocal(String s){
        if(s.equalsIgnoreCase("A") || 
           s.equalsIgnoreCase("E") || 
           s.equalsIgnoreCase("I") || 
           s.equalsIgnoreCase("O") ||
           s.equalsIgnoreCase("U")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(calcularDiasyHoras(1000));
    }
}

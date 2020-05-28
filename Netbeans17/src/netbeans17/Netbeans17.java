
package netbeans17;

import java.io.*;
import java.util.Scanner;
import java.math.MathContext;

public class Netbeans17 {

    public static void main(String[] args) {
        int n1, n2, cont=0;
        n2=(int)(Math.random()*100)+1;
        
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Se ha generado un número del 1 al 100 y usted tiene que adivinarlo");
        System.out.println("Ingrese el número");
        n1=ingreso.nextInt();
        
        while(n1!=n2){
            if(n1>n2){
                System.out.println("El número que tiene que adivinar es menor a "+n1);                
            }
            else{
                System.out.println("El número que tiene que adivinar es mayor a "+n1);
            }
            cont++;
            System.out.println("Ingrese otro número");
            n1=ingreso.nextInt();
        }
        
        System.out.println("¡Felicidades! Ha adivinado el número ("+n2+")");
        System.out.println("Lo ha logrado en "+(cont+1)+" intentos");
    }
    
}

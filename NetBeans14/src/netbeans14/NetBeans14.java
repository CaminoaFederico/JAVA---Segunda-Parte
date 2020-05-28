
package netbeans14;

import java.io.*;
import java.util.Scanner;

public class NetBeans14 {

    public static void main(String[] args) {
        int n1, n2, n3, i;
        
        Scanner ingreso = new Scanner(System.in);
        System.out.println("¿Cuál es la cantidad de números que desea ingresar?");
        n1 = ingreso.nextInt();
        
        System.out.println("Ingrese un número entero");
        n2 = ingreso.nextInt();
        
        for(i = 1 ; i<n1 ; i++){
            System.out.println("Ingrese el siguiente número");
            n3 = ingreso.nextInt();
            
            if(n3<n2){
                n2 = n3;
            }
        }
        
        System.out.println("El menor número entero ingresado es el "+n2);
    }
    
}

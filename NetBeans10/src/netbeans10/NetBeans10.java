
package netbeans10;

import java.io.*;
import java.util.Scanner;

public class NetBeans10 {

    public static void main(String[] args) {
        double n, i, fact=1;
        
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingresa un número");
        n = ingreso.nextDouble();
        
        for(i=1 ; i<=n ; i++){            
            fact = fact*i;
        }
        System.out.println("El factorial del número "+n+" es: "+fact);
    }
    
}


package netbeans16;

import java.io.*;
import java.util.Scanner;

public class NetBeans16 {

    public static void main(String[] args) {
        int n;
        
        Scanner ingreso = new Scanner(System.in);
           
        for(int aux=0; aux<5; aux++){
            System.out.println("Ingrese un número entero comprendido entre 1 y 30");
            n = ingreso.nextInt();
                
            if(n>=1 && n<=30){
                    
                for(int i=0; i<n; i++){
                    System.out.print("*");                                  
                }
                System.out.println();
            }
           
            else{
            System.out.println("Ha ingresado un valor que no está comprendido entre 1 y 30");
            aux=5;                      
            }           
        }
        System.out.println("Fin"); 
    }
    
}

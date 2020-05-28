
package netbeans15;

import java.io.*;
import java.util.Scanner;

public class NetBeans15 {

    public static void main(String[] args) {
        int mult=1;
        for(int i=1; i<=15; i++){
            if(i%2==1){
                mult=mult*i;
            }
        }
        System.out.println("El producto de los números impares comprendidos entre 1 y 15 es: "+mult);
    }
    
}

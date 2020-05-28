
package netbeans18;

import java.io.*;
import java.util.*;
import java.math.*;

public class NetBeans18 {

    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        int mult=1;
        
        for(int i=0; i<10; i++){
            System.out.println("A la posición "+i+" le corresponde el valor: "+numeros[i]);
            mult*=numeros[i];
        }
        
        System.out.println("El producto es: "+mult);        
    }
}

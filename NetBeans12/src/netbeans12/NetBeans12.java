
package netbeans12;

import java.io.*;
import java.util.Scanner;

public class NetBeans12 {

    public static void main(String[] args) {
        String vend;
        double art1=0, art2=0, art3=0, art4=0, suel=0;
        
        Scanner ingreso = new Scanner(System.in);
        Vendedor jaimito = new Vendedor("jaimito");
        
        System.out.println("Ingrese el nombre de el/la vendedor/a");
        vend = ingreso.nextLine();        
        System.out.println("¿Cuántas unidades del artículo 1 vendió?");
        art1 = ingreso.nextDouble();
        System.out.println("¿Cuántas unidades del artículo 2 vendió?");
        art2 = ingreso.nextDouble();
        System.out.println("¿Cuántas unidades del artículo 3 vendió?");
        art3 = ingreso.nextDouble();
        System.out.println("¿Cuántas unidades del artículo 4 vendió?");
        art4 = ingreso.nextDouble();   
                
        //suel = ((((art1*239.99) + (art2*129.75) + (art3*99.95) + (art4*350.89))*9)/100) + 200;
        suel = jaimito.Calculo(art1, art2, art3, art4);
        
        System.out.println("El sueldo semanal del/a vendedor/a "+vend+" es de: $"+suel);        
        }  
    
    private static class Vendedor{
            
            public Vendedor(String ingreso){
                nombre = ingreso;
            }
            
            public double Calculo(double art1, double art2, double art3, double art4){
                double calculo = ((((art1*239.99) + (art2*129.75) + (art3*99.95) + (art4*350.89))*9)/100) + 200;
                return calculo;
            }
            
        String nombre;
    }
    
}

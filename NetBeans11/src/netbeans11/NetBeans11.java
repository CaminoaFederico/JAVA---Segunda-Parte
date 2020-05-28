
package netbeans11;

import java.io.*;
import java.util.Scanner;

public class NetBeans11 {

    public static void main(String[] args) {
        float cuen, sal, art, cre, limi, exc=0;//variables
        
        Scanner ingreso = new Scanner(System.in);//objeto para ingresar datos
        System.out.println("Ingrese su número de cuenta");//mensaje solicitando datos
        cuen = ingreso.nextFloat();//se guardan el numero 
        
        Usuario Jorge = new Usuario("Jorge");//instancio el objeto de la clase Usuario
             
        if(cuen>0){        

        System.out.println("Ingrse su saldo correspondiente al inicio del mes");
        sal = ingreso.nextFloat();
        System.out.println("Ingrese el monto total por los artículos comprados en el mes");
        art = ingreso.nextFloat();
        System.out.println("Ingrese el monto correspondiente a los créditos solicitados");
        cre = ingreso.nextFloat();
        System.out.println("Ingrese el monto límite de créditos que pueden asignarle");
        limi = ingreso.nextFloat();//no se usa nunca
        
            exc = Jorge.Calculo(sal, art, cre);//se hace el cálculo que está dentro del método Cálculo
        
            if(exc<0){
                System.out.println("Se ha excedido el límite de su crédito");
            }
            else{
                System.out.println("No se ha excedido el límite de su crédito");
            }
        }
        else{
            System.out.println("Número de cuenta incorrecto");
        }        
    }
   
    private static class Usuario//nueva clase
    {
        public Usuario(String ingreso){//metodo constructor de la nueva clase
            nombre=ingreso;
        }
        
        public float Calculo(float sal, float art, float cre){//metodo para calcular
            float calculo = sal+art-cre;
            return calculo;
        }
        
        String nombre;
    }
    
}

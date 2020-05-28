
package netbeans13;

import java.io.*;
import java.util.Scanner;

public class NetBeans13 {

    public static void main(String[] args) {
        int i;
        float horas, tarifa, sueldo1=0, sueldo2=0;
        String emp;
        
        Empleado fefe = new Empleado("fefe");
        
        for(i=0 ; i<3 ; i++){
            Scanner ingreso = new Scanner(System.in);
            System.out.println("Ingrese el nombre del empleado");
            emp = ingreso.nextLine();
            System.out.println("Ingrese la cantidad de horas que trabajó la semana pasada");
            horas = ingreso.nextFloat();
            System.out.println("Ingrese la tarifa por hora que cobra el empleado");
            tarifa = ingreso.nextFloat();
            
            if(horas<=40){
                sueldo1 = fefe.Calculo1(horas, tarifa);
                System.out.println("El sueldo correspondiente a la semana pasada del/a empleado/a "+emp+" es de: $"+sueldo1);
            }
            else{
                //extra = horas - 40;
                sueldo2 = fefe.Calculo2(horas, tarifa);
                System.out.println("El sueldo correspondiente a la semana pasada del/a empleado/a "+emp+" es de: $"+sueldo2);
            }
        }
    }
    
    private static class Empleado{
        
        public Empleado(String ingreso){
            nombre = ingreso;
        }
        
        public float Calculo1(float horas, float tarifa){
            float sueldo1 = horas*tarifa;            
            return sueldo1;
        }
        
        public float Calculo2(float horas, float tarifa){
            float extra = horas - 40;
            float sueldo2 = (40*tarifa) + ((tarifa + (tarifa/2))*extra);
            return sueldo2;
        }
        
        String nombre;
    }
    
}


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Gabriela
 */
public class Cuotas {
    public static void main(String[] args){
    Scanner entrada= new Scanner(System.in);
    int plaza;
    double prestamo=0, interes=0,comision=0, seguro=0, cuotamensual=0, interesfinal=0,segurototal=0,mensual=0, total=0 ;
    
    System.out.println("Favor ingrese el valor del prestamo: ");
    prestamo= entrada.nextDouble();
    
    System.out.println("Favor ingresar el plaza de meses del prestamo: ");
    plaza= entrada.nextInt();
    
    System.out.println("Favor ingrese la taza de interes: ");
    interes= entrada.nextDouble()/100;
    
    System.out.println("Favor ingrese la comision por cuota");
    comision= entrada.nextDouble();
    
    System.out.println("Favor ingrese porcentaje de seguro mensual");
    seguro= entrada.nextDouble()/100;
    
    interesfinal=prestamo*interes;
    segurototal= prestamo*seguro;
    mensual= (prestamo/plaza)+interesfinal+segurototal+comision;
    total=plaza*mensual;
    
    
    System.out.println("**** CUOTAS MENSUALES *******");
    System.out.println("Cuota de Pago Mensual: HNL"+mensual);
    System.out.println("Total a Pagar: HNL"+total);
        
    }

    
}

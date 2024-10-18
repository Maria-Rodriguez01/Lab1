/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apellido_nombre_nombreejercicio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Maria Gabriela
 */
public class Apellido_Nombre_NombreEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner  entrada= new Scanner(System.in);
    String Nombre; 
    int Horas;
    double Tarifa, Salario;
    
    System.out.println("Favor ingresar nombre del empleado: ");
    Nombre = entrada.nextLine();
    
    System.out.println("Favor ingrese cantidad de horas trabajadas del empleado: ");
    Horas= entrada.nextInt();
    
    System.out.println("Favor ingrese cual es la tarifa por hora del empleado: ");
    Tarifa= entrada.nextDouble();
    
    Salario=(Horas)*(Tarifa);
    
    System.out.println("----- Boleta del Empleado -------");
    System.out.println("Nombre del Empleado: "+Nombre);
    System.out.println("Hora de Trabajo Mensual: "+Horas);
    System.out.println("Tarifa por Hora : Lps."+Tarifa);
    System.out.println("Salario del Empleado Semanal: Lps."+Salario);
    }
    
}

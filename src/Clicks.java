
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
public class Clicks {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double costoa,costob,costoc,costot,totalc,costoisv,totaleisv;
       
        System.out.println("Ingrese la cantidad de clics de 0.25%");
        int clics25 = entrada.nextInt();
        
        System.out.println("Ingrese la cantidad de clics de 0.30%");
        int clics30 = entrada.nextInt();
        
        System.out.println("Ingrese la cantidad de clics de 0.80%");
        int clics80 = entrada.nextInt();
        
        costoa =clics25*0.25;
        costob =clics30*0.30;
        costoc =clics80*0.80;
        costot=costoa+costob+costoc;
        totalc = clics80 + clics30 + clics25;
        costoisv=totalc * 0.16;
        totaleisv = costot + costoisv;

        System.out.println("Su total sera de: $"+totalc+" y el total con ISV $"+totaleisv);
    }
}

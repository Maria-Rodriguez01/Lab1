
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
public class Ecuaciones_Algebraicas {
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    double operaciona,operacionb,operacionc,operaciond,operacione,operacionf,operaciong,operacionh,operacioni,operacionj,operacionk;
    int valorx = 0, valory=0, valora=0, valorb=0, valorc=0, valord=0, valore=0, valorf=0, valorg=0, valorh=0, valorj=0, valorm=0, valorn=0, valorp=0, valorq=0, valorr=0, valors=0;
    
    System.out.println("Favor ingresar un valor para x:");
    valorx= entrada.nextInt();
    System.out.println("Favor ingresar un valor para y:");
    valorx= entrada.nextInt();
    System.out.println("Favor ingresar un valor para a:");
    valora= entrada.nextInt();
    System.out.println("Favor ingresar un valor para b:");
    valorb= entrada.nextInt();
    System.out.println("Favor ingresar un valor para c:");
    valorc= entrada.nextInt();
    System.out.println("Favor ingresar un valor para d:");
    valord= entrada.nextInt();
    System.out.println("Favor ingresar un valor para e:");
    valore= entrada.nextInt();
    System.out.println("Favor ingresar un valor para f:");
    valorf= entrada.nextInt();
    System.out.println("Favor ingresar un valor para g:");
    valorg= entrada.nextInt();
    System.out.println("Favor ingresar un valor para h:");
    valorh= entrada.nextInt();
    System.out.println("Favor ingresar un valor para j:");
    valorj= entrada.nextInt();
    System.out.println("Favor ingresar un valor para m:");
    valorm= entrada.nextInt();
    System.out.println("Favor ingresar un valor para n:");
    valorn= entrada.nextInt();
    System.out.println("Favor ingresar un valor para p:");
    valorp= entrada.nextInt();
    System.out.println("Favor ingresar un valor para q:");
    valorq= entrada.nextInt();
    System.out.println("Favor ingresar un valor para r:");
    valorr= entrada.nextInt();
    System.out.println("Favor ingresar un valor para s:");
    valors= entrada.nextInt();
    
    
    operaciona=(3/2)+(4/3);
    operacionb=(1/(valorx-5))-((3*valorx*valory)/4);
    operacionc=(1/2)+7;
    operaciond=7+(1/2);
    operacione=((valora^2)/(valorb-valorc))+((valord-valore)/(valorf-((valorg*valorh)/valorj)));
    operacionf=(valorm/valorn)+valorp;
    operaciong=valorm+(valorn/(valorp-valorq));
    operacionh=((valora^2)/(valorb^2))+((valorc^2)/(valord^2));
    operacioni=(valorm+(valorn/valorp))/valorq-(valorr/valors);
    operacionj=3*valora+valorb/valorc-(valord+5*valore/(valorf+(valorg/(2*valorh))));
    operacionk=(valora^2+(2*valora*valorb)+valorb^2)/((1/valorx^2)+2);
    
    System.out.println("a)"+operaciona);
    System.out.println("b)"+operacionb);
    System.out.println("c)"+operacionc);
    System.out.println("d)"+operaciond);
    System.out.println("e)"+operacione);
    System.out.println("f)"+operacionf);
    System.out.println("g)"+operaciong);
    System.out.println("h)"+operacionh);
    System.out.println("i)"+operacioni);
    System.out.println("j)"+operacionj);
    System.out.println("k)"+operacionk);
    
   
}
    
}

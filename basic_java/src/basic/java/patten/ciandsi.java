/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.java.patten;

import java.util.Scanner;

/**
 *
 * @author keerthana
 */
public class ciandsi {
    public static void main(String args[]){
        Double p,n,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount");
        p=sc.nextDouble();
        System.out.println("enter the number of years");
        n=sc.nextDouble();
        System.out.println("enter the intrest rate");
        r=sc.nextDouble();
        double si=(p*n*r)/100;
         double com=p * Math.pow(1.0+r/100.0,n) - p;
        System.out.println("simple intrest="+si);
        System.out.println("compount intrest="+com);
    }
        
      
}

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

public class fib {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("first "+n+" number of Fibonacci series");
       int num1=0,num2=1,num3=0;
        System.out.println(num1);
       System.out.println(num2);
       if(n!=0){
         
         for(int i=n-2;i!=0;i--){
           num3=num1+num2;
           num1=num2;
           num2=num3;
          System.out.println(num3);
           
         }
       }
    }
    
}

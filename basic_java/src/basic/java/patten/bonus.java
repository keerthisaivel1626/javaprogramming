/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.java.basicjava;

import java.util.Scanner;

/**
 *
 * @author keerthana
 */
public class bonus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int bonus;
      System.out.println("enter the salary");
      int salary=sc.nextInt();
       System.out.println("enter the year");
    int year =sc.nextInt();
    if(year>=5)
    {
        bonus=(salary*5/100);
       salary=salary+bonus;
    }else{
        System.out.println("he or she not eligible for bonus");
        
    }
     System.out.println("current salary"+salary);
        
    }
    
}

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
public class leap {
    public static void main(String args[]){
     
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(); 
    boolean leap = false;

        if(n % 4 == 0)
        {
            if( n % 100 == 0)
            {
                if ( n % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(n + " is a leap year.");
        else
            System.out.println(n + " is not a leap year.");  
}
}

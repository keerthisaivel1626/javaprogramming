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
public class fac {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
             for(int i=num-1;i>0;i--){
           num=num*i;
            }
         System.out.println(num); 
     }
}


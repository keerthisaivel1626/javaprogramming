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
public class upper_case_lower_case {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(n>='a'&&n<='z'){
            System.out.println("lower case");
        }
        else if(n>='A'&&n<='Z'){
            System.out.println("upper case");
            
        }
        else{
            System.out.println("not a aplhabetic character");
        }
     }
}

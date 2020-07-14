/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.java.patten.pttern;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author keerthana
 */
public class star_patten1 
 {
    public static void main(String args[])
    {
    System.out.println("pyramid patten program");
    Scanner sc= new Scanner(System.in);
    System.out.println("please enter the number for pyramid shape");
    int n=sc.nextInt();
        
        int  k = 0;

        for(int i = 1; i <= n; i++,k=0) {
            for(int j= 1; j <= n- i; j++) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print(" * ");
               ++k;
            }

            System.out.println();
        }
    }
} 
     
    
 

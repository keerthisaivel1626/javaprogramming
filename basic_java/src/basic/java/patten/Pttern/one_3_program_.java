/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.java.patten.Pttern;

import java.util.Scanner;

/**
 *
 * @author keerthana
 */

public class one_3_program_ {
    public static void main(String args[])
    {
    System.out.println("pyramid patten program");
    Scanner sc= new Scanner(System.in);
   int n=sc.nextInt();
  int c=1;

        for(int i = 0; i < n; i++) {
            for(int j = 1; j < n - i; ++j) {
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;

                System.out.printf("%4d", c);
            }

            System.out.println();
        }
    }
}
    

 
    


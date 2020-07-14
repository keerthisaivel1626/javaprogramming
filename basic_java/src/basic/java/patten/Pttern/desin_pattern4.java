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
public class desin_pattern4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int m=1;
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>=i;j--){
              System.out.print(j+" ");
                }
        
        System.out.println();
        }
        
    }
    
}

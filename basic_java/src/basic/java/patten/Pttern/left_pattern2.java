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
public class left_pattern2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(m);
                m=m+1;
            }
            System.out.println();
        }
    }
    
}

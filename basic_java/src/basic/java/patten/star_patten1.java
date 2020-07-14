/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.java.patten;

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
    for(int i=1;i<n;i++)
      {
        for(int j=i;j<i;j++)
        {
            out.println(i);
        }
      }
    }
 }

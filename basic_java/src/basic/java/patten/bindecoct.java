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
public class bindecoct {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String hexa=Integer.toHexString(n);
        String oct=Integer.toOctalString(n);
        String bin=Integer.toBinaryString(n);
        System.out.println("hexadecimal number="+hexa+"\n octal number="+oct+"\n binary number="+bin);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.java.patten;

import java.util.Scanner;

/**1
 *
 * @author keerthana
 */
public class intpal {
    public static void main(String args[]){
     
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(); 
int s=n,reverse=0,r=0;
while (n != 0) {
        r = n % 10;
        reverse = reverse * 10 + r;
        n /= 10;
    }
    if (s == reverse){
        System.out.println(s+" is a palindrome.");}
    else{
        System.out.println( s+"is not a palindrome.");

    }  
}

}


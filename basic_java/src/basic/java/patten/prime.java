/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.java.patten;

import java.util.Scanner;

/**
 *10
 * @author keerthana
 */
public class prime {
    public static void main(String args[]){
     int i,m=0,flag=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
m=n/2;
if(n==0||n==1){
System.out.println(n+" is  prime number");
 }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }//end of else  
}    
}   

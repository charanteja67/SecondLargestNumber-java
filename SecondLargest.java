package com;
import java.util.Scanner;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class SecondLargest {
 public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int large=0;
     int slarge=0;
     int []n=new int[5];
     for(int i=0;i<n.length;i++){
         n[i]=s.nextInt();
     }
     for(int i=0;i<n.length;i++){
         if(n[i]>large){
             large=n[i];
         }
     }
     for(int j=0;j<n.length;j++){
         if(n[j]>slarge&&n[j]!=large){
             slarge=n[j];
         }
     }
     System.out.print(slarge);
     
     
 }

	
	
	

}

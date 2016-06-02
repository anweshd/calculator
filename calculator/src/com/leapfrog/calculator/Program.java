/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator;

import java.util.Scanner;



public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.println("enter the number for multiplication table:");
        int num=input.nextInt();
        for(int i=1;i<=10;i++){
          
            System.out.println(num + " * " + i + " = " +(num*i));
            
        }
            System.out.println("Do you want to continue[Y/N]");
            
            String choice=input.next();
            if(choice.equalsIgnoreCase("n")){
                System.exit(0);
            }
        }
        
    }
    
}
   
     
   
    
            
      
    
        
    


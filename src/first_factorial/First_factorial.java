/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_factorial;

import java.util.Scanner;


public class First_factorial {

    public static void main(String[] args) 
    {
       
        int a ,b ,fact =1;
        
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter an Integer to calculate it's factorial:");
        a = scn.nextInt();
        
        if(a < 0)
        {
            System.out.println("Number should be non-negative.");
        }
        else{
        for(b =1; b<=a; b++)
            fact =fact*b;
        
        System.out.println("Factorial of " +a+"is =" +fact);
    }
   
}
}

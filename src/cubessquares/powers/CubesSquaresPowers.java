/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cubessquares.powers;

import java.util.Scanner;

/**
 *
 * @author beoos4091
 */
public class CubesSquaresPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        
        //Declaration of variables
        int option = 0;
        int number = 0;
        
        int numSquared = 0;
        int numSquaredSum = 0;
        
        int numCubed = 0;
        int numCubedSum = 0;
        
        int exponent = 1;
        int power = 1;
        int base = 1;
        
        
        do      
        // Interface to let the user choose what they would like to calculate.
        {
        System.out.println("--Squared, Cubed, and Powers program--");
        System.out.println("1... Find the value of a number squared.");
        System.out.println("2... Find the value of a number cubed.");
        System.out.println("3... Find the value of a number to any power");
        System.out.println("4... Exit Program");
        System.out.println("Please choose one of the options above");
        
        option = keyedInput.nextInt();
        
        //Option to square your value of choice.
        if (option == 1)
        {
            System.out.println("You have chosen to find the value of a number squared.");
            System.out.println("Please enter the value of the number you would like to square.");
            
            number = keyedInput.nextInt();
            
            numSquared = number * number;
            
            for (int i=1;i<=2;i++)
            { 
            numSquaredSum = number * number;
            }
            System.out.println(number + " squared is: " + numSquaredSum);
            numSquaredSum = 1; 
            
        }
        
        //Option to cube your value of choice.
        else if (option == 2)
        {
            System.out.println("You have chosen to find the value of a number cubed.");
            System.out.println("Please enter the value of the number you would like to cube.");
            
            number = keyedInput.nextInt();
            
            for (int i=1; i<=3; i++)
            {
            numCubedSum = number * number * number;
            }
            System.out.println(number + " cubed is " + numCubedSum);
            numCubedSum = 1;
        }
            
        //Option to choose both the base and the exponent.
        else if (option == 3)
        {
            System.out.println("You have chosen to find the value of a number to any power.");
            System.out.println("Please enter the value of the base number.");
            
            base = keyedInput.nextInt();
            
            System.out.println("Please enter the value of the exponent");
            exponent = keyedInput.nextInt();
            
            for (int i = 1; i <= exponent; i++)
                
            power = power * base;
            
            System.out.println(base + " to the exponent " + exponent + " is equal to " + power);
            
            power = 1;
            
        //Stops the program from looping further.
            }
        } while (option != 4);
        
        do 
        {
            System.out.println("You closed the program.");  
            option = 5;
        } while (option == 4);
    }   
            
}
            
            
        
        
        
               
 

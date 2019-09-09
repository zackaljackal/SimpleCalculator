/*******************************************
Simple Calculator
Zachary Miller
*******************************************/

import java.io.*;
import java.util.*;

public class SimpleCalculator{
   public static void main(String[] args) {
 
  float x,y,z;
  Scanner in;
  String arithmetic;
  String inputs;
  String outputs;
  String string_y;
  String string_x;
  
   in = new Scanner(System.in);
   System.out.println("Do you want to add, subtract, multiply, or divide?");
   arithmetic = in.nextLine();
   if (arithmetic.equals("divide"))
     { System.out.println("What is your quotient?");
      string_x = in.nextLine();
      x = Float.parseFloat(string_x);
      System.out.println("What is your divisor?");
      string_y = in.nextLine();
      y = Float.parseFloat(string_y);
      System.out.println(x/y);
      }
      else
        if (arithmetic.equals("add"))
        {
        System.out.println("What is your first number?");
        string_x = in.nextLine();
        x = Float.parseFloat(string_x);
        System.out.println("What is your second number?");
        string_y = in.nextLine();
        y = Float.parseFloat(string_y);
        System.out.println(x + y);
        
        }
         
            else
           if (arithmetic.equals("subtract"))
           {
           System.out.println("What is the number are you subtracting from?");
           string_x = in.nextLine();
           x = Float.parseFloat(string_x);
           System.out.println("What number are you subtracting with?");
           string_y = in.nextLine();
           y = Float.parseFloat(string_y);
           System.out.println(x-y);
           }
           else
           
           if(arithmetic.equals("multiply"))
           {
           System.out.println("What is your first number?");
           string_x = in.nextLine();
           x = Float.parseFloat(string_x);
           System.out.println("What is your second number?");
           string_y = in.nextLine();
           y = Float.parseFloat(string_y);
           System.out.println(x*y);  
           }
           else
           System.out.println("Error: Possible Type?");                     
   
   }
   }
   
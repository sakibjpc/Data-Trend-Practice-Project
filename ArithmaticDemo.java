
package javabeginner;

import java.util.Scanner;

public class ArithmaticDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1, num2, result; 
        
        double result2;
       
        System.out.print("num1 = ");
        num1 = input.nextInt();
        
        System.out.print("num2 = ");
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Sum = "+result);
        
        result = num1 - num2;
        System.out.println("Sub = "+result);
        
        result = num1 * num2;
        System.out.println("Multiplication = "+result);
        
        result2 = (double) num1 / num2;
        System.out.println("Div = "+result2);
        
        result = num1 % num2;
        System.out.println("Remaider = "+result);
                
    }
    
}

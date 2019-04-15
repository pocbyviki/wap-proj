package com.wap.math;
/**
 * 10-	Write a Java program to check if a number is Armstrong or not ?
 * Armstrong number--> if sum of cube of each digit is equal to the whole number then that number said to be Armstrong number
 * Ex- 370= 3^3+7^3+0^3=3*3*3+7*7*7+0=27+343+0=370---> Armstrong no.
 * 371=3^3+7^3+1^3=27+343+1=371--->Armstrong no
 * @author bhara
 *
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 370;
		armstrongByWhileLoop(num);
        
	}
	
	private static void armstrongByWhileLoop(int num) {
		int  number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10; // give remainder
            total = total + temp*temp*temp;
            number = number/10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    
	}
}

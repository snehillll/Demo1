<<<<<<< HEAD
import java.util.*;
public class SwapNumbers
{
=======
package day1;


import java.util.Scanner;


public class SwapNumbers {
>>>>>>> abc
	public static void main(String[] args) {
		System.out.println("Enter two numbers x and y: ");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		x = x + y;   
        y = x - y;   
        x = x - y;   
<<<<<<< HEAD
        System.out.println("After swapping: "+x+"  " + y);
=======
        
        
        System.out.println("After swapping: "+x +"  " + y);
>>>>>>> abc
	}
}
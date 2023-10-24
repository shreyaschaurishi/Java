package tester;
import java.util.Scanner;

public class Assignment2 
{

	public static void main(String[] args) 
	{
		int a, b, sum;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any Two numbers for Sum: ");
		
		System.out.println("Enter First Number: ");
		a=sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		b=sc.nextInt();
		
		sum = sum(a,b);
		
		System.out.println("The sum of two numbers a and b is: " +sum);
		
		sc.close();
	}
	
	public static int sum(int a, int b)
	{
		int sum = a + b;
		return sum;
	}

}

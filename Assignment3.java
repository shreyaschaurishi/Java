package tester;
import java.util.Scanner;

public class Assignment3 
{

	public static void main(String[] args)
	{
		int a, b, temp;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any two numbers: ");
		
		System.out.println("Enter First Number: ");
		a=sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		b=sc.nextInt();
		
		System.out.println("Numbers Before Swapping: "+a+" "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Numbers Before Swapping: "+a+" "+b);
		
		sc.close();
	}

}

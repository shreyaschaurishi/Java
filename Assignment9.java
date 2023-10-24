package tester;
import java.util.Scanner;

public class Assignment9 
{
	public static void main(String[] args) 
	{
		int num, i, fact=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number ");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++)
			fact = fact * i;
		
		System.out.println("The Factorial of "+num+" is "+fact);
		
		sc.close();	
	}
}

package tester;
import java.util.Scanner;

public class Assignment4 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		
		if(num % 2 == 0)
			System.out.println("The given number is Even ");
		else
			System.out.println("The given number is Odd ");
		
		sc.close();
	}

}

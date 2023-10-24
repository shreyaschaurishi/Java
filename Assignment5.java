package tester;
import java.util.Scanner;

public class Assignment5 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		
		if((num % 5 == 0) && (num % 7 == 0))
			System.out.println("The given number is Divisible by both 5 and 7");
		else
			System.out.println("The given number is Not Divisible by both 5 and 7");
		
		sc.close();
	}

}

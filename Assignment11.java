package tester;
import java.util.Scanner;

public class Assignment11 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Number to check it as a Prime Number");
		n = sc.nextInt();
		
		boolean Prime = true;
		for(int i=2; i<n; i++)
		{
			if(n % i == 0)	
				Prime = false;		
		}
		if (Prime)
		{
			System.out.println("The given Number is Prime Number");
		}
		else 
			System.out.println("The given Number is Not Prime Number");
		
		sc.close();
	}
}

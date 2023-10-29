package tester;
import java.util.Scanner;

public class Assignment12 
{
	public static void main(String[] args)
	{
		int i, n, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		n = sc.nextInt();
		
		for (i=1; i<=n; ++i)
		{
			 sum = sum + i;
		}
		
		System.out.println("The Sum of series is upto " +n+ " is " +sum);
		
		sc.close();
	}
}

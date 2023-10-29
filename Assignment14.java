package tester;
import java.util.Scanner;

public class Assignment14 
{
	public static void main(String[] args) 
	{
		int i, n, Esum = 0, Osum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to find Sum upto it ");
		n = sc.nextInt();
		
		for(i=0; i<=n; i++)
		{
			if(i % 2 == 0) 
			{
				Esum = Esum + i;
			}
			else
			{
				Osum = Osum + i;
			}
		}
		System.out.println("Sum of Even Numbers is: "+Esum);
		System.out.println("Sum of Odd Numbers is: "+Osum);
		sc.close();
	}
}

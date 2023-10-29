package tester;
import java.util.Scanner;

public class Assignment13 
{
	public static void main(String[] args) 
	{
		int m, n, rev = 0, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		n = sc.nextInt();
		m = n;
		while (n > 0)
		{
			x = n % 10;
			rev = rev * 10 + x;
			n = n / 10;
		}
		if(rev == m)
		{
			System.out.println(m+" is a Palindrome Number");
		}
		else
		{
			System.out.println(m+" is not a Palindrome Number");
		}
		sc.close();
	}

}

package tester;
import java.util.Scanner;

public class Assignment8 
{

	public static void main(String[] args) 
	{
		int a, b, c, sum;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter three angles for a Triangle: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		sum = a + b + c;
		
		if(sum == 180)
			System.out.println("The given Triangle is Valid ");
		else
			System.out.println("The given Triangle is Invalid");
		
		sc.close();
	}
}

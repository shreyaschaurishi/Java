package tester;
import java.util.Scanner;

public class Assignment15 
{
	public static void main(String[] args) 
	{
		int num, revNum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		
		while (num != 0)
		{
			int digit = num % 10;
			revNum = revNum * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reverse of the given Number is "+revNum);
		sc.close();
	}

}

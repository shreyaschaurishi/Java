package tester;
import java.util.Scanner;

public class Assignment7 
{

	public static void main(String[] args) 
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any Character: ");
		ch=sc.next().charAt(0);
		
		if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
				System.out.println("The given Character is Vowel ");
		else 
			System.out.println("The given Character is Consonant");
		
		sc.close();
	}
}

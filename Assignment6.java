package tester;
import java.util.Scanner;

public class Assignment6 
{

	public static void main(String[] args) 
	{
		int basic;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Basic Salary of an Employee: ");
		basic=sc.nextInt();
		
		if(basic < 150000)
			System.out.println("No tax Slab has been applied ");
		else if((basic >= 150000) && (basic < 300000))
				System.out.println("Tax Slab is applied is: 20% ");
		else
			System.out.println("Tax Slab is applied is: 30% ");
		
		sc.close();
	}

}

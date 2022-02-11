package practice;
import java.util.Scanner;

public class Calculator {
	public int addition(int a, int b)
	{
		return a+b;
	}
	public int substraction(int a, int b)
	{
		return a-b;
	}
	public int multiplication(int a, int b)
	{
		return a*b;
		
	}
	public int division(int a, int b)
	{
		return a/b;
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter First Number: ");
			int a = sc.nextInt();
			System.out.println("Enter Second Number:  ");
			int b = sc.nextInt();
			System.out.println("which operation would you like to perform(1/2/3/4):");
			System.out.println("1.addition(+)");
			System.out.println("2.substraction(-)");
			System.out.println("3.multiplication(*)");
			System.out.println("4.division(/)");
			int op = sc.nextInt();
			Calculator cal = new Calculator();
			if(op == 1)
			{
				System.out.println("Addition is: "+cal.addition(a,b));
	        }
			else if(op == 2)
			{
				System.out.println("Substraction is: "+cal.substraction(a,b));
				
			}
			else if(op == 3)
			{
				System.out.println("Multiplication is: "+cal.multiplication(a,b));
			}
			else if(op == 4)
			{
				System.out.println("Division is: "+cal.division(a,b));
			}
			else
			{
				System.out.println("Invalid Input");
			}
			System.out.println("Would you like to continue?(1 for YES,2 for NO)");
			int cont = sc.nextInt();
			if(cont == 2)
			{
				break;
			}
		}	
		
	}
}

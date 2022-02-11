package practice;


import java.util.Scanner;

public class Email {
	
	public static void main(String args[]){
		Boolean flag = false;
		String emails[] = new String[5];
		emails[0]="pratikshakashid97@gmail.com";
		emails[1]="kashidpratiksha23@gmail.com";
		emails[2]="pratikshakashid535@gmail.com";
		emails[3]="pratikshakashid390@gmail.com";
		emails[4]="pratikshakashid2303@gmail.com";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email :");
		String userEmail = sc.next();
		for (String email:emails)
		{
			if(userEmail.matches(email))
			{
				System.out.println("Welcome back"+userEmail);
				flag=true;
				break;
				
			}
		}
		if(flag==false)
		{
			System.out.println("Invalid User");
		}
	}
	

}


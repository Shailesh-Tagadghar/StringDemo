package DayTwo;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email ID ");
		String Email = sc.next();
		Email=Email.toLowerCase();
		
		if(Email.endsWith("@gmail.com")){
			System.out.println("Registration Successful...");
		}
		else {
			System.out.println("Kindly enter valid email address...");
		}
	}
}

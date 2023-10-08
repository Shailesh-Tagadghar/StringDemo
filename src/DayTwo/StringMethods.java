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
		
		System.out.println("Enter Unique Key Value for Student ID ");
		String UniqueKey = sc.next();
		
		if(UniqueKey.startsWith("s_")){
			System.out.println("Student Id is present in database...");
		}
		else {
			System.out.println("Student Id is start with 's_' so create new Id..");
		}
	}
}

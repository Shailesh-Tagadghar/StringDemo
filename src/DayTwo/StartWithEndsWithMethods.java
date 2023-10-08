package DayTwo;

import java.util.Scanner;

public class StartWithEndsWithMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter Name ");
			String Name = sc.nextLine().toLowerCase();
			char lastchar = Name.charAt(Name.length()-1);
			String Gender = (lastchar == 'a' || lastchar == 'e' || lastchar == 'i' || lastchar == 'o' || lastchar == 'u')
					        ? "femail"
					        : "mail";
			System.out.println("Its a "+Gender+ " name "+Name);
		}
	}
}

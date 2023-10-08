package DayOne;

import java.util.Scanner;

public class ReversePrint {
	public static void main(String[] args) {
//		String str = "Python";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.next();
//		System.out.println(str.charAt(5));
//		System.out.println(str.charAt(4));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(0));
		
//		  char[] resultarray = str.toCharArray();
//		  for (int i = resultarray.length - 1; i >= 0; i--)
//		            System.out.print(resultarray[i]);
		
		String reverse = "";
		for(int i = str.length()-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
//			System.out.println(str.charAt(i));
		}
		
		System.out.println(reverse);
		
		if(str.equals(reverse)) {
			System.out.println(str + " is Palindrome");
		}
		else {
			System.out.println(str + " is not Palindrome");
		}
		}
	}


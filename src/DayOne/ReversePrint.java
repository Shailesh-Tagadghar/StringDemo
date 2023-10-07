package DayOne;

public class ReversePrint {
	public static void main(String[] args) {
		String str = "Python";
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(0));
		
		  char[] resultarray = str.toCharArray();
		  for (int i = resultarray.length - 1; i >= 0; i--)
		            System.out.print(resultarray[i]);
		}
	}


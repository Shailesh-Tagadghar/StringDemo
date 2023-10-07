package DayOne;

public class Demo1 {
	public static void main(String[] args) {
		String s = "ABC"; //string literals
		String str = new String();
		System.out.println(s+" is the string object using literals");
		System.out.println(str+" is the string objcet using constructor");
		
		//immutable
		s="Hie";
		s.concat(" hello");
		System.out.println("first "+s);
		
		s=s.concat(" Hello");
		System.out.println("Second "+s);

		String s1 = "Welcome";
		String s2 = "Welcome";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		s1=s1.concat("All");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Good Bye");
		
		//object creation and storage
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("Python");
		String str4 = new String("Python");
		
		//checking literals
		System.out.println("checking literals");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//checking objects
		System.out.println("checking objects");
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		//string comparison
	}
}

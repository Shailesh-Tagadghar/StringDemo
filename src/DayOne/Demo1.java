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
		//1. == checks only the memory location
		System.out.println("Equals to (==) checks only the memory location");
		System.out.println(str1==str2); //true
		System.out.println(str3==str4); //false
		
		//2. equals() : it will compare string contents and return boolean
		System.out.println("equals() : it will compare string contents and return boolean");
		System.out.println(str3.equals(str4));
		
		//3. compareTo() : compares to string and return a numeric difference
		System.out.println("compareTo() : compares to string and return a numeric difference");
		System.out.println(str3.compareTo("Python"));
		System.out.println(str3.compareTo("python"));
		
		//4. Concat() : to join two string
		System.out.println("Concat() to join string");
		String join = str1.concat(str2);
		System.out.println(join);
		
		//5. CharAt() : it gives character of particular index
		System.out.println("CharAt() : it gives index of particular character");
		System.out.println("first character : "+str3.charAt(0));
		
		//6. length()
		System.out.println("Total Character or length of the string : "+str3.length());
		
		//7. Index Of()
		String str5 = "Welcome";
		System.out.println("indexOf()");
		System.out.println("Index of 't' is : "+str5.indexOf('t'));
		System.out.println("Index of 'e' is : "+str5.indexOf('e'));
		
		//8. lastIndexOf()
		System.out.println("Last Index of 'e' is : "+str5.lastIndexOf('e'));
	}
}

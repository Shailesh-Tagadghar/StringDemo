package DayTwo;

public class MutableString {
	public static void main(String[] args) {
		// StringBuffer 1.0 JDK AND StringBuilder 1.5 JDK
		
		StringBuilder sb= new StringBuilder("Hie");
		System.out.println(sb);
		sb.append("Hello");
		System.out.println(sb);
		
//		sb.reverse();
//		System.out.println(sb);
		
		sb.insert(2, "new");
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb);
	}
}

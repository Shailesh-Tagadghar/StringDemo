package DayTwo;

public class OtherMethods {
	public static void main(String[] args) {
		
		String str = "Welcome";
		//substring --> string_name.substring(start_index);
		String sub = str.substring(3); //come
		System.out.println(sub);
		
		//substring --> string_name.substring(start_index,end_index);
		sub = str.substring(1,4); //elc
		System.out.println(sub);
		
		//split method
		String str1 = "I love my India";
		String[] words = str1.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		
		String student_row = "101,shailesh,comp_sci,shailesh@gmail.com,1628267866";
		String[] values = student_row.split(",");
		for(int i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}
		
		//output : India 
		//         my 
		//         love 
		//         I
		
		for(int i= words.length-1; i>=0; i--) {
			System.out.println(words[i]+ " ");
		}
		
		System.out.println();
		
		//output : I
		//         evol 
		//         ym
		//         aidnI
		
		String input = "I love my India";
		String[] word = input.split(" ");
		
		for(int i = 0;i < word.length; i++) {
			String newWord = word[i];
			for(int j = newWord.length()-1; j>=0; j--) {
				System.out.println(newWord.charAt(j));
			}
			if(i>0) {
				System.out.print("");
			}
		}
	}
}

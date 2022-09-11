package session_5;

public class String1 {

	public static void main(String[] args) {
		String s = "elephant energy";
			
		//OR to find all 'e' using below method
		//ex-1
		String str = "e";
		int index2 = s.indexOf(str);
		while(index2 >= 0)
		{
			System.out.println(index2);
			index2 = s.indexOf(str,index2 + 1);
		}
	}
}

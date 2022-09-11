package session_2;

public class IncrementalDecrementalOperator {
	
	
public static void main(String[] args) {
		
		// ++ and --
		
		int a = 1;
		a = a+1;
		
	    System.out.println(a);
		System.out.println(++a);
		
		System.out.println("__________Pre Increment______________________");
		
		int i = 1;
		int j = ++i;
		
		System.out.println(i); // 2
		System.out.println(j); // 2
		
		System.out.println("_______Post Increment_________________________");
		
		
		int p = 1;
		int q = p++;
		System.out.println(p);  //2
		System.out.println(q);  //1
		
		System.out.println("_______Pre Decrement_________");
		
		int c = 2;
		int d = --c;
		
		System.out.println(c);   //1
		System.out.println(d);   //1
		
		System.out.println("__________Amol HW____________________");
		
		int x = -3;
		int y = x--;
		
		
		System.out.println(x);   //-4
		System.out.println(y);   //-3
		
		System.out.println("_______Post Decrement_________");
		
		int m = 0;
		int n = m--;
		
		System.out.println(m);   //-1
		System.out.println(n);   //0
		
		System.out.println("___pre decrement___________");
		
		int f = -1;
		int g = --f;
		
		System.out.println(f);   //-2
		System.out.println(g);   //-2
		

	}

}

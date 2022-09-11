package session_3;

public class ConditionalOperators {
	
	public static void main(String[] args) {
		
		//Conditional Opertor
//		1. == : Comparision 
//		2. >,<,>=,<=
//		3. != : Not equal to
//		4. && : Logical opertor (short circuit operator)
//		5. || : OR
		
		int a = 100;
		int b = 100;
		//1
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else
		{
			System.out.println("B is greater than A");
		}
		
		System.out.println("________________________________");
		
		//2
		if (a>b)
		{
			System.out.println("A is greater");
		}
		else
		{
			System.out.println("B isgreater or A and B are equal");
		}
		
       //3 
		System.out.println("________________________________");
		System.out.println("________________________________");
	    if (a>b)
	    {
	    	System.out.println("A is greater");
	    }
	    else if (b>a)
	    {
	    	System.out.println("B is greater");
	    }
	    else
	    {
	    	System.out.println("A and B both are equal");
	    }
	    
	    System.out.println("________________________________");
	    
	    //not equal to
	    int total = 100; // Total shoul not be zero, Then customer eligible for discount.
	    
	    if (!(total == 0))
	    {
	    	System.out.println("Customer eligible for Discount");
	    }
	    else 
	    {
	    	System.out.println("No discount");
	    }
	    
	    System.out.println("________________________________");

	    // To check vairable q is holding up value equal to no.5
	    
	    int q = 5;
	    if (q == 5)
	    {
	    	System.out.println("Q is holding up value 5");
	    }
	    else
	    {
	    	System.out.println("Q is not holding up value 5");
	    }
	    System.out.println("________________________________");

	    //Cheque variable e value is greater than 10, It could be a 15 or 17.
	    
	    int e = 55;
	    if (e > 10)
	    {
	    	if (e == 15)
	    	{
	    		System.out.println("e is equal to 15");
	    	}
	    	if (e == 17)
	    	{
	    		System.out.println("e is equal to 17");
	    	}
	    	else 
	    	{
	    		System.out.println("e is not equal to 15 or 17");
	    	}
	    	
	    }
	  else
	  {
	   System.out.println("condition not satisfied"); 		
	  }
	    
	    System.out.println("________________________________");
	    System.out.println("________________________________");

	    
	    //write a program to find out highest number among 3 nos
	    
	    int x = 100;
	    int y = 200;
	    int z = 300;
	    	
	    	if (x>y && x>z)
	    	{
	    	  System.out.println("x is greates");
	    	}
	    	else if (y>z)
	        {
	        	System.out.println("Y is greates");
	        }
	        else
	        {
	        	System.out.println("Z is greatest");
	        }
	    
	    	System.out.println("=========================================");
	    // or opertor 
	    	
	    	String username = "Joe";
	    	
	    	if (username == "Joe" || username == "steve")
	    	{
	    		System.out.println("hey developer");
	    	}
	    	else if (username == "Amol" || username == "pooja")
	    	{
	    		System.out.println(" hey tester");
	    	}
	    	else
	    	{
	    		System.out.println("How may I help you");
	    	}
	    	System.out.println("=========================================");

	    	
	    	int c = 10;
	    	
	    	if (false)
	    	{
	    		System.out.println("A");
	    	}
	    	else
	    	{
	    		System.out.println("B");
	    	}
	}

}

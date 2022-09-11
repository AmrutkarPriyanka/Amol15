package session_5;

public class StringmManupulation {

	public static void main(String[] args) {
   //Find string lenth given below 
		
		String Str1 = "Hello everyone lets learn something about string";
				
		System.out.println("String lent is :" + Str1.length());
		
		//other way to find string lenth
		
		System.out.println("______________________________________");
	    
		int Stringlenth = Str1.length();
	
    	System.out.println("String total lenth :" + Stringlenth);
	    
    	//find charater at specific index position
    	
    	String Str2 = "Hi How may I help you";
    	
    	int Stringlenth1 = Str2.length();
    	 
    	System.out.println(Stringlenth1);
		
		System.out.println("Char at 18 index position:" + Str2.charAt(18));
		
		
		System.out.println("____________________________"); 
		
		System.out.println("find index of char y:" + Str2.indexOf('y'));
		 
		System.out.println("____________________________");

		 
		int indexofy = Str2.indexOf('y');
		 
	    System.out.println(indexofy);
	    
	    //Check multi occurance in string 
	    
	    String Str3 = "Hello there are";
	    
	    System.out.println(Str3.length());
	    
	    System.out.println(Str3.indexOf('e', 2));
	    
	    //suppose we don't know position of first e
	    
	    System.out.println("____________________________");

	    System.out.println(Str3.indexOf('e', Str3.indexOf('e')+1));
	    
	    //To covert string into upper case
	    
	    String Str4 = "hello amol";
	    
	    System.out.println("AFter convert to upper case:" + Str4.toUpperCase());
	    
	    // To covert string into lower case
	    
	    String Str5 = "IM TEST ENGINEER";
	    
	    System.out.println("afer convert into lower case :" + Str5.toLowerCase() );
	    
	    //Findout specific word index
	    
	    String Str6 = "Thanx for the transaction your ID is AAAgdagilarhijef2324";
	    
	    System.out.println(Str6.indexOf("orange"));
	    
	    
	    int outputno = Str6.indexOf("AAA");
	    
	    if (outputno > -1)
	    {
	    System.out.println("Transaction is successfull");
	    }
	    else
	    {
	    	System.out.println("Transaction is not successfull");
	    }
	    	
	    	
	    
	}

}

package session_4;

import javax.sound.midi.SysexMessage;

public class SwitchCase {
	
	//Switch case use to check multiple conditions
	//it is more faster interms of execution 
	public static void main(String[] args) {
		
	
	int num =9;
	
	if (num == 1)
	{
		System.out.println("Number is one");
	}
	
	if (num == 2)
	{
		System.out.println("Number is Two");
	}
	if (num == 3)
	{
		System.out.println("Number is Three");
	}
	if (num == 4)
	{
		System.out.println("Number is Four");
	}
	else if (num == 4)
	{
		System.out.println("Number is Five");
	}
	else
	{
		System.out.println("Enter number from Zero to Nine");
	}
	
	//Now in the for of Switch case
	
	switch (num) {
	case 0:
		System.out.println("Number is Zero");
		break;
	case 1:
		System.out.println("Number is One");
		break;
	case 2:
		System.out.println("Number is Two");
		break;
	case 3:
		System.out.println("Number is Three");
		break;
	case 4:
		System.out.println("Number is Four");
		break;
	default:
		System.out.println("Enter number from 0 to 9");
		break;
	}
		//
		int digit = 1;
		
		switch(digit){
		
			case(0):
			case(1):
			System.out.println("Hello");
			break;
			case(2):
			case(4):
			System.out.println("Hii");
			default:
				break;
		}
		
		
		//Open Chrome, Opera and Edge only not Safari
		
		String browser = "Safari";
		switch (browser) {
		
		case "Opera":
			System.out.println("Open Opera browser");
			
			break;
		case "Chrome":
			System.out.println("Open Chrome browser");
			
			break;
		case "Edge":
			System.out.println("Open Edge browser");
			
			break;
		default:
			System.out.println("Please Enter Opera,Chrome and Edge only");
			break;
		}
		System.out.println("-----------------------------------------------");
	
		
	
	}
}

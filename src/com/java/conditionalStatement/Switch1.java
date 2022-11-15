package com.java.conditionalStatement;

//day of week, 1-Sunday, 2-Monday,----,7-Saturday, 8-invalid,0-invalid
public class Switch1 
{
	public static void main(String[] args) {
		int day=1;
		switch(day)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid entry");
		}	
		
	}
}

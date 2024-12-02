//Everlast Chigoba

import java.util.Scanner;

public class zodiacsign {

	public static void main(String[] args) {
		System.out.println("What is your zodiac? ");
		System.out.println("Enter your birthday -- Month followed by Day as numbers. ");
		Scanner keyboard = new Scanner(System.in);
		int month = keyboard.nextInt();//ensures that the program accepts the next number to be entered by the user to be read as the month
		int day = keyboard.nextInt();//ensures that the program accepts the next number to be entered by the user to be read as the day
		if(month>12) {// two if statements in order to make sure the month is within 1-12, otherwise invalid
			System.out.println("Invalid month!");
		}
		if(month<1) {
			System.out.println("Invalid month!");
		}
		if((day>31) || (day<1))//if statement in order to make sure the day is within 1-31
			System.out.println("Invalid day!");
		if ((month == 12 && day >=22 && day <= 31) || (month == 1 && day >= 1 && day<=19))
			System.out.println("You are a Capricorn!");
		else if((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day<=18))
				System.out.println("You are a Aquarius!");
		else if((month == 2 && day >= 19 && day <= 29) || (month == 3 && day >= 1 && day<=20))
			System.out.println("You are a Pisces!");
		else if((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day<=19))
			System.out.println("You are a Aries!");
		else if((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day<=20))
			System.out.println("You are a Taurus!");
		else if((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day<=20))
			System.out.println("You are a Gemeni!");
		else if((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day<=22))
			System.out.println("You are a Cancer!");
		else if((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day<=22))
			System.out.println("You are a Leo!");
		else if((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day<=22))
			System.out.println("You are a Virgo!");
		else if((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day<=22))
			System.out.println("You are a Libra!");
		else if((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day<=21))
			System.out.println("You are a Scorpio!");
		else if((month == 11 && day >= 22 && day <= 31) || (month == 12 && day >= 1 && day<=21))
			System.out.println("You are a Sagittarius!");
		else {
			System.out.print("Invalid Day!");// ensures that that days that may have less than 31 days get printed as invalid days if the respective month is put with 31
		}
		

		// TODO Auto-generated method stub

	}

}

package Guessnumber;

import java.util.Random;
import java.util.Scanner;

public class guessnumber {

	public static void main(String[] args) {
		System.out.println("This is a Guessing game "
				+ "you have to chose a number and"
				+ " the system will guess that number");
		
		// this will pick a random number
		
		Random random= new Random();
		Scanner scan= new Scanner(System.in);

		int number= scan.nextInt();
		System.out.print("Enter your number: ");

		
		//System.out.println(guessnum);
	
		
	boolean isGuessing= true;
		int count=1;
		while(isGuessing) {
			int guessnum = random.nextInt(100);
			if(number==guessnum) {
				System.out.println(guessnum);
				isGuessing = false;
				
				
			}else if (number < guessnum) {
				System.out.println(guessnum);
			}else if (number > guessnum) {
				System.out.println(guessnum);
			}
			count = count+1;
		}
		System.out.println("finally you guessed it");
		System.out.println("You Took "+count+" times to guess the number");

	}
	

}

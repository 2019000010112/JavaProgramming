package PracticeDay24;

import java.util.Random;

public class RendomNumberGenerator {
	public static void main(String []args) {
		Random randomNumber = new Random(); //random class helps to generate random numbers 
		
		int randomNumber2 = randomNumber.nextInt(10) + 1; //gets random number from 1 to 10
		System.out.print("Rendom number is :"+randomNumber2) ;
		
		
		//another method
		int getRandomNumber = (int) (Math.random()*10)+1; //random number 1 to 10
		System.out.print("\n Next Rendom number is :"+getRandomNumber);
	}

}

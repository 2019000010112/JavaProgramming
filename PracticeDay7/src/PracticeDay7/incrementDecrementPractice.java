package PracticeDay7;

public class incrementDecrementPractice {
	public static void main(String[]args) {
		int x = 25;
		int y;
		//post increment starts
		y=x++;
		System.out.print("Your current value if Y is:"+y);
		y=x;
		System.out.print("\nYour current value of Y is:"+y);
		//post increment ends
		
		int z=15;
		int w;
		w=++z;
		System.out.print("\nYour current value of W is :"+w);
		w=z;
		System.out.print("\nYour current value of W is:"+w);
		w=--z;
		System.out.print("\nYour current value of W is:"+w);
	}

}

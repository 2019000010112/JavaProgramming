package assignment3;
import java.util.Scanner;

public class Product {
	public static void main(String [] args) {
		int ID;
		String title;
		double price;
		String description;
		char category;
		
		/*input start*/
		
		Scanner ip1 = new Scanner(System.in);		
		System.out.println("Enter product ID:");
		ID = ip1.nextInt();
		
		Scanner ip2 = new Scanner(System.in);	
		System.out.println("Enter product title:");
		title = ip2.nextLine();
		
		Scanner ip3 = new Scanner(System.in);	
		System.out.println("Enter product price:");
		price = ip3.nextDouble();
		
		Scanner ip4 = new Scanner(System.in);	
		System.out.println("Enter product description:");
		description = ip4.nextLine();
		
		Scanner ip5 = new Scanner(System.in);	
		System.out.println("Enter product category:");
		category = ip5.next().charAt(0);
		/*input end*/
		System.out.println("\n");
		/*print start*/
		System.out.println("Product Identification is: "+ID);
		System.out.println("Your product title is : "+title);
		System.out.println("Your product price is : "+price);
		System.out.println("Your product description is : "+description);
		System.out.println("Your product category is : "+category);
		/*print end*/
	}
	

}

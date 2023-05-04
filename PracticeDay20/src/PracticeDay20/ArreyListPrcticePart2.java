package PracticeDay20;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class ArreyListPrcticePart2 {
	public static void main(String []args) {
		ArrayList <Integer> numberList = new ArrayList <>();
		
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		numberList.add(60);
		
		boolean checklist = numberList.isEmpty();//checks if the array list is empty or not
		boolean checkvalues = numberList.contains(30);//checks if the number is present in the list or not
		
		int valuePosition = numberList.indexOf(40);//check the position of the value into the array list
		System.out.println("Position of 40 is "+valuePosition);
		System.out.println("30 is present on the list?"+checkvalues);
		System.out.println("List contains "+numberList.size()+" values and they are :"+numberList);
		
		numberList.set(3, 80); //used to replace existing values on the list
		System.out.println("List contains "+numberList.size()+" values and they are :"+numberList);
		
		int getValueFromArray = numberList.get(5);
		System.out.println("Values of index 5 is :"+getValueFromArray);
		
	}

}

package PracticeDay22;

import java.util.ArrayList;

public class ArrayListPracicePart3 {
	public static void main(String []args) {
		ArrayList <Integer> numberList1 = new ArrayList<>();
		ArrayList <Integer> numberList2 = new ArrayList<>();
		ArrayList <Integer> numberList3 = new ArrayList<>();
		
		numberList1.add(10);
		numberList1.add(20);
		numberList1.add(30);
		numberList1.add(40);
		numberList1.add(50);
		System.out.print(" Vlues present on list 1 " +numberList1);
		
		
		numberList2.add(10);
		numberList2.add(20);
		numberList2.add(30);
		numberList2.add(40);
		System.out.print("\n Vlues present on list 2 " +numberList2);
		
		numberList3.addAll(numberList1);
		numberList3.addAll(3, numberList2);
		System.out.print("\n Vlues present on list 3 " +numberList3);
		
		boolean equalCheck = numberList3.equals(numberList2);
		System.out.print("is numberList3 equal to numberList2: "+equalCheck);

	}
}

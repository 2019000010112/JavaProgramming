package PracticeDay20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ArreyListPracticePert1 {
	public static void main(String []args) {
		ArrayList<Integer> numberList = new ArrayList<>();
		System.out.print("Size of number list is : "+numberList.size());
		
		//adding values to array
		numberList.add(10);
		numberList.add(1, 30);
		numberList.add(50);
		/*for(int x: numberList) {
			System.out.print("\n "+x);	
		}
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number to add");
		for(int row = 0; row <=3; row++) {
			numberList.add(row);
		}*/
		//using itertor method
//		Iterator itr = numberList.iterator();
//		while(itr.hasNext()) {
//			System.out.print(" \n "+itr.next());
//		}
		//System.out.print("\n Size of number list is : "+numberList.size());
		
		//best method
		for(int list : numberList) {
			System.out.println(" \n "+list);
		}
		//removing index value
		numberList.remove(1);
		System.out.println("Aafter deleting number from the list");
		for(int listNow : numberList) {
			System.out.print(" \n "+listNow);
		}
	}

}

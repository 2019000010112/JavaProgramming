package PracticeDay22;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListShortingPractice {

	public static void main(String []args) {
		ArrayList<Integer> numberList = new ArrayList<>();
		
		numberList.add(10);
		numberList.add(80);
		numberList.add(50);
		numberList.add(90);
		numberList.add(40);
		numberList.add(70);
		numberList.add(30);
		numberList.add(60);
		numberList.add(-20);
		
		System.out.print("\nArrayList contains :"+numberList);

		Collections.sort(numberList);
		//numberList.sort(Asscending);
		System.out.print("\nArrayList in Ascending Order :"+numberList);
		
		//ArrayList reverse or decending order
		
		Collections.sort(numberList, Collections.reverseOrder());
		System.out.print("\n Numbers in revarse order: "+numberList);
	}

}

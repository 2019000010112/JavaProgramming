package practiceDay11;
//1-10 loop and sum
public class Assignment10 {
	public static void main(String []args) {
		int i, sum = 0;
		
		for(i=2; i<=10; i=i+2) { 
			sum +=i; //value of i is set on sum. for every iteration i is added to sum hance the total is calculated
		}
		System.out.println(""+sum);
	}

}

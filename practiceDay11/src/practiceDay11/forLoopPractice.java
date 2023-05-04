package practiceDay11;

public class forLoopPractice {
	public static void main(String[]args) {
		/*
		 * for(int i = 2; i <=10; i=i+2) { System.out.print(i+"I love java\n"); }
		 * for(int i=10; i>=1;i--) { System.out.println(i+" Dicrement for loop"); }
		 */
		
		for(int i=1; i<100; i=i+3) {
			if(i==13) {
				continue;
			}
			System.out.println(i);
			/*
			 * for(int j=1; j<i; j++) { System.out.print("*"); }
			 */
		}
		
	}

}

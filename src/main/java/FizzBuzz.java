public class FizzBuzz {
	public static void main(String [] argsv) {
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.print("FIZZBUZZ "); 
			} else if (i % 3 == 0) {
				System.out.print("FIZZ ");
			} else if (i % 5 == 0) {
				System.out.print("BUZZ ");
			} else {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

}

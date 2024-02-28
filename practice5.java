package practice5;
import java.util.Random;
import java.util.Scanner;


public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//randomaveragecalculator();
		//dowhilepractice();
		//dowhile2(9);
		randompractice();
	}
	public static void randomaveragecalculator() {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the maximum paramater for the random number generator: ");
		int parameter = scanner.nextInt();
		System.out.println("How many random numbers would you like to generate: ");
		int amount = scanner.nextInt();
		int i = 0;
		int total = 0;
		do {
			int random = r.nextInt(parameter);
				System.out.println(random);
				i += 1;
				total = total + random;
		} while ( i < amount );	
	
		System.out.println(total);
		System.out.println(total/amount);
		return;
	}
	
	public static void dowhilepractice() {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		System.out.println("How many random numbers do you want to print: ");
		int amount = scanner.nextInt();
		System.out.println("What is the maximum random number possible: ");
		int parameter = scanner.nextInt();
		int total = 0;
		int i = 0;
		
		do { int random = r.nextInt(parameter);
		total = total + random;
		i += 1;
		} while (i < amount);
		
	System.out.println(total);
	return;
}		
	public static void dowhile2(int num1) {
		int total = 0;
		int i = 0;
		do {
			total = total + num1;
			i += 1;
		} while (i < 6); //iteration 6 really means 7 so its less than so it becomes 6 so always assume -1
		System.out.println(total);
		return;
//		essentially saying that total is 9 + total while i < 5 and each increment is increased by 1
//		so it occurs 5 times and come out to a total of 45 because 9 + 0 = 9
//		9 +9 = 18 
//		18 + 9 =27 until 9 gets added 5 times and it gets to 45, essentially division just basic practice for do while
	}
	
	public static void randompractice() {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		System.out.println("How many random numbers would you like to print: ");
		int amount = scanner.nextInt();
		System.out.println("What is the maximum parameter for those numbers: ");
		int parameter = scanner.nextInt();
		int i = 0;
		int random = 0;
		do { int rand = r.nextInt(parameter); 
			i += 1;
			System.out.println(rand);
			random = random + rand;
		} while (i < amount);	
		System.out.println(random);
	} 
}

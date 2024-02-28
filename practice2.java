package practice2;
import java.util.Random;
import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sumofseries();
		//factorialcalculator(5);
		//randomgenerator();
		scannedfactorial();
	}
	public static void sumofseries() {
		Random r = new Random();
		int rparameter = r.nextInt(100);
		System.out.println("The following for loop will now print the sum of the numbers counting up to: " + rparameter);
		int i = 1;
		int sum = 0;
		while (i <= rparameter) {
			sum = sum + i;
			System.out.println(sum);
			i += 1;
		}
	}
	public static void factorialcalculator(int num) {		int i = 1;
		int factorial = 1;
		int addfactorial = 0;
		while (i <= num) {
			addfactorial = addfactorial + i;
			factorial = factorial * i;
			i += 1;
		
		}
		System.out.println(addfactorial);
		System.out.println(factorial);
	}
	public static void randomgenerator() {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many random numbers do you want printed? ");
		int amount = scanner.nextInt();
		System.out.println("What is your maximum parameter? ");
		int num = scanner.nextInt();
		for (int i = 0; i < amount;) {
			int rand = r.nextInt(num);
			System.out.println(rand);
			i += 1;
		}
	}
	public static void scannedfactorial() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number would you like to calculate the factorial of? ");
		int factorialmax = scanner.nextInt();
		int i = 1;
		int factorialnew = 1;
		while (i <= factorialmax) {
			factorialnew = factorialnew * i;
			i += 1;

		}
		System.out.println(factorialnew);
	}
}

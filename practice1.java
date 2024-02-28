package practice1;
import java.util.Scanner;
import java.util.Random;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intarguements(7,3);
		//usergreeting();
		//superprinter();
		//classaverage();
		//randomid();
		//forloop();
		//whileloop();
		//dowhile();
		//whileloopbc();
		//gradecalcfor();
		//gradecalcwhile();
		
	}
	public static void intarguements(int num1, int num2) {
	int maximum = Math.max(num1, num2);
	superprinter("The max of your two numbers is " + maximum + "!" + " ---Printed using superprinter TM");
	}
	public static void usergreeting() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How are you doing today user? ");
		String greeting = scanner.next();
		System.out.println("you are doing "+ greeting + "! Have a good day");
	}
	public static void superprinter(double input) {
		System.out.println(input);
	}
	public static void superprinter(String input) {
		System.out.println(input);
	}
	public static void superprinter(int input) {
		System.out.println(input);
	}
	public static void classaverage() {
		
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
	
	for (int i = 0; i < 10; i = i + 1) { //basically just saying to tell me test scores 10 times in a row before doing the next function
		System.out.println("Enter your test scores here: ");
		double test = scanner.nextDouble();
		sum = sum + test;
	}
	superprinter("The average of your ten test scores is: " + (sum/10));
	}
	public static void randomid() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		superprinter("Enter a number as the maximum parameter for your random number id");
		int parameter = scanner.nextInt();
		
		int num1 = random.nextInt(parameter);
		superprinter("Your random number is " + num1);
		if (num1 % 2 == 0) {
			superprinter("Your random number is even");
		} else {
				superprinter("Your random number is odd");
		}
			}
		public static void forloop() {
			Scanner scanner = new Scanner(System.in);
			superprinter("What is your favorite number? ");
			int num = scanner.nextInt();
			for (int i = 1; i <= num;) {
				superprinter(i);
				i += 1;
			}
		}
		public static void whileloop() {
		Scanner scanner = new Scanner(System.in);
		superprinter("What is your favorite number");
		int num = scanner.nextInt();
		int i = 1;
		while (i <= num) {
			superprinter(i);
		i += 1;
			}
		}
		public static void dowhile() {
		Scanner scanner = new Scanner(System.in);
		superprinter("Print your favorite number");
		int num = scanner.nextInt();
		int i = 1;
		
		do {
			superprinter(i);
			i += 1;
		} while (i <= num);
		}
		public static void whileloopbc() {
			Scanner scanner = new Scanner(System.in);
			superprinter("What is your favorite number: ");
			int num = scanner.nextInt();
			int i = 0;
			while (i < num) {
				//continue when it reaches the middle number
				i += 1;
				if (i == num/2) {
					superprinter("we are using the continue function to skip and or break at the midpoint");
					//continue;
					break;
				}
				superprinter(i);
			
		}
	}
		public static void gradecalcfor() {
			Scanner scanner = new Scanner(System.in);
			superprinter("How many tests do you want to calcualte the value of");
			double numoftests = scanner.nextDouble();
			double total = 0;
			for (int i = 0; i < numoftests;) {
				superprinter("Print the test scores here: ");
				double testscore = scanner.nextDouble();
				total += testscore;
				i += 1;
		}
			superprinter("The average is: "+ (total/numoftests));
	}
}

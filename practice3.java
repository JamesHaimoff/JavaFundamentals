package practice3;
import java.util.Random;
import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scannerrandom();
		//tempcalculatorlong(); //consider importing this function into another one 
		//threedigitposs();
		//superprinter("Now I can call this thing whenever I want so I dont have to write out the full print statement (for doubles, ints, and Strings)");
		//sortdescendingfirst(6,3,5);
		sortdescendingsecond();
		
	}public static void scannerrandom() {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Welcom to random number generator...");
		System.out.println("What is the maximum parameter you want?");
		int parameter = scanner.nextInt();
		int rand = r.nextInt(parameter);
		System.out.println(rand);
		System.out.println(rand);
		int i = 0;
		int adfactor = 0;
		while (i <= rand) {
			adfactor = adfactor + i;
			i += 1;
		}
		System.out.println("Because I felt like it here is the addition factorial of your random number also: ");
		System.out.print(adfactor);
		
	}
	public static void tempcalculatorlong() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many days would you like to calculate the temprature for?");
		int days = scanner.nextInt();
		System.out.println("You will be prompted to put in the temprature on each day of the week...");
		int total = 0;
		for (int i = 1; i <= days;) {
				System.out.println("What is the temprature -sequenced: ");
				int day = scanner.nextInt();
				total = total + day;
			i += 1;
			}
		System.out.print("The average temprature for the week (rounded) is: " + (total/days));
		return;
	}
	public static void threedigitposs() {
		int i = 0;
		while (i < 10) {
			System.out.println("00" + i);
			i +=1;
		}
		while (i < 100) {
			System.out.println("0" + i);
			i += 1;
		}	
		while (i > 99 && i < 1000) {
			System.out.println(i);
			i += 1;
		}
		return;
	}
	public static void superprinter(int num){
		System.out.println(num);
		return;
	}
	public static void superprinter(String words){
		System.out.println(words);
		return;
	}
	public static void superprinter(Double num) {
		System.out.println(num);
		return;
	}
	public static void sortdescendingfirst(int num1, int num2, int num3) {
		//Biggest
		int biggest = 0;
		int mid = 0;
		int smallest = 0;
		if (num1 > num2 && num1 > num3) {
			biggest = num1;
			if (num2 > num3) {
				mid = num2;
				smallest = num3;
			}else {
					mid = num3;
					smallest = num2;
			}
		} else if (num2 > num1 && num2 > num3) {
			biggest = num2;
			if (num3 > num1) {
				mid = num3;
				smallest = num1;
			}else {
				mid = num1;
				smallest = num3;
			}
		}
		else if (num3 > num1 && num3 > num2) {
			biggest = num3;
			if (num1 > num2) {
				mid = num1;
				smallest = num2;
			}	else {
					mid = num2;
					smallest = num1;
			}
		}	
		superprinter(biggest + " " + mid + " " + smallest);
		return;
		}
		public static void sortdescendingsecond() {
			Scanner scanner = new Scanner(System.in);
			superprinter("What is your first number: ");
			int num1 = scanner.nextInt();
			superprinter("What is your second number: ");
			int num2 = scanner.nextInt();
			superprinter("What is your third number: ");
			int num3 = scanner.nextInt();
			//Biggest
			int biggest = 0;
			int mid = 0;
			int smallest = 0;
			if (num1 > num2 && num1 > num3) {
				biggest = num1;
			} else if (num2 > num1 && num2 > num3) {
				biggest = num2;
			}	else { 
					biggest = num3;
			}
			if (num1 > num2 && num2 > num3 || num1 < num2 && num2 < num3) {
				mid = num2;
			}else if (num1 < num2 && num1 > num3 || num1 > num2 && num1 < num3) {
				mid = num1;
			}else {
				mid = num3;
				
			}	
			if (num1 < num2 && num1 < num3) {
				smallest = num1;
			}else if (num2 < num1 && num2 < num3) {
				smallest = num2;
			}else {
				smallest = num3;
				
			}
			superprinter("Descendint order: " + biggest+ " " + mid + " " + smallest);
			superprinter("Ascending order because why not..." + smallest + " " + mid + " " + biggest);
			return;
			}
}
	

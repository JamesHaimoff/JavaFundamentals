package taxbracket;
import java.util.Scanner;

public class Taxbracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taxCalculator();
		taxCaseSwitch();
		//one note is that im not totally sure the correlative tax brackets, in your example 100k was in the 23% and mine is 28% idk
	}
	public static void taxCalculator() {
		double[] percentages = {0, .1, .15, .23, .28, .33, .35, .396};
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much do you make a year: ");
		double income = scanner.nextDouble();
		if (income <= 0) {
			System.out.println("You will pay " + percentages[0] + " in tax this year.");
			} else if (income > 0 && income <= 8925) {
				System.out.println("You will pay $" + income * percentages[1] + " in tax this year.");
			}else if (income > 8925 && income <= 36250) {
				System.out.println("You will pay $" + income * percentages[2] + " in tax this year.");
			}else if ( income > 36250 && income <= 87850) {
				System.out.println("You will pay $" + income * percentages[3] + " in tax this year.");
			}else if ( income > 87850 && income <= 183250) {
				System.out.println("You will pay $" + income * percentages[4] + " in tax this year.");
			}else if (income > 183250 && income <= 398350) {
				System.out.println("You will pay $" + income * percentages[5] + " in tax this year.");
			}else if (income > 398350 && income <= 400000) {
				System.out.println("You will pay $" + income * percentages[6] + " in tax this year.");
			}else if (400000 < income) {
				System.out.println("You will pay $" + income * percentages[7] + " in tax this year.");
//				I decided to use else if statements for everything except the first one so that
//				once it gets to the proper one it doesnt have to check everything else
			}
	}
	public static void taxCaseSwitch() {
		Scanner scanner = new Scanner(System.in);
		double[] percentages = {0, .1, .15, .23, .28, .33, .35, .396};
		int bracket = 0;
		
		System.out.println("What is your yearly income: ");
		double income = scanner.nextDouble();
		if (income <= 0) {
			bracket = 0;
		}else if (income > 0 && income <= 8925) {
			bracket = 1;
		}else if (income > 8925 && income <= 36250) {
			bracket = 2;
		}else if ( income > 36250 && income <= 87850) {
			bracket = 3;
		}else if ( income > 87850 && income <= 183250) {
			bracket = 4;
		}else if (income > 183250 && income <= 398350) {
			bracket = 5;
		}else if (income > 398350 && income <= 400000) {
			bracket = 6;
		}else if (400000 < income) {
			bracket = 7;
		}
		
		switch(bracket) { //had to convert the cases to individual values represented by if statements because it wouldnt 
		//allow me to choose a range for the case values which was annoying
			case (0): 
				System.out.println("You will pay " + percentages[0] + " in tax this year.");
				break;
			case (1):
				System.out.println("You will pay $" + income * percentages[1] + " in tax this year.");
				break;
			case (2): 
				System.out.println("You will pay $" + income * percentages[2] + " in tax this year.");
				break;
			case (3):
				System.out.println("You will pay $" + income * percentages[3] + " in tax this year.");
				break;
			case (4):
				System.out.println("You will pay $" + income * percentages[4] + " in tax this year.");
				break;
			case (5):
				System.out.println("You will pay $" + income * percentages[5] + " in tax this year.");
				break;
			case (6):
				System.out.println("You will pay $" + income * percentages[6] + " in tax this year.");
				break;
			case (7):
				System.out.println("You will pay $" + income * percentages[7] + " in tax this year.");
				break;
		}
		}
	
}

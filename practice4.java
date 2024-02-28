package practice4;
import java.util.Random;
import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randommethod();
		
	}
	public static void randommethod() {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Please print the parameter you would like for your random number: ");
		int parameter = scanner.nextInt();
		System.out.println("What is the amount of random numbers you would like");
		int amount = scanner.nextInt();
		int randtotal = 0;
		for (int i = 0; i < amount;) {
			int randominstance = r.nextInt(parameter);
			randtotal = randtotal + randominstance;
			i += 1;
			System.out.println(randominstance);
		}
		double sqrt = Math.sqrt(randtotal);
		System.out.println(sqrt);
		System.out.println("Based on the squareroot value the sum of all random numbers instanced is: " + sqrt*sqrt);
	}
	
}

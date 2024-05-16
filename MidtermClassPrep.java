import java.util.Random;
public class MidtermClassPrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	randomgenerator();
	}
	public static void randomgenerator() {
		Random r = new Random();
		int num = r.nextInt(100);
		System.out.print(num);
	}
}

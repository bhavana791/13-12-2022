package excercise1;
import java.util.Scanner;

public class Temprature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double fahrenhit,celcius = 0;
		System.out.println("Enter Temprature in celcius");
		celcius=scan.nextDouble();
		fahrenhit=1.8*celcius+32;
		System.out.println("fahrenhit="+fahrenhit);
		

	}

}

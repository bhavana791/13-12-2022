package excercise1;
import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		double area;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st:");
		int a=scan.nextInt();
		
		System.out.println("Enter 2nd:");
		int b=scan.nextInt();
		System.out.println("Enter 3rd:");
		int c=scan.nextInt();
		int s=a+b+c/2;
		area=(s*(s-a)*(s-b)*(s-c));
		System.out.println("area of triangle:"+area);

	}

}

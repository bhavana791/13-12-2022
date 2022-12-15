package excercise1;
import java.util.Scanner;  
import java.lang.Math; 

public class areaandcircum {
public static void main(String[] args)   {
		
	 double areaandcircum, radius,area;  
	double n=3.14;	 
		Scanner scan=new Scanner (System.in);  
		System.out.print("Enter the radius : ");  
		  
		radius=scan.nextDouble();
		 area=n*(radius*radius);
		areaandcircum= 2*n*radius;
		System.out.println("area of circle:"+area);
		System.out.println("The circumference of the circle is: "+areaandcircum);  
		}
		  

	}



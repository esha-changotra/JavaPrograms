package Assignment2;

import java.util.Scanner;

public class circumferenceofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of Pi");
		double pi=s1.nextDouble();
		System.out.println("Enter value of Radius");
		double r=s1.nextDouble();
		double circumference=2*pi*r;
		System.out.println("Enter value of Circumference -> "+circumference);

	}

}

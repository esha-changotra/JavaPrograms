package Assignment2;

import java.util.Scanner;

public class areaofrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter value of length");
		double length=s2.nextDouble();
		System.out.println("Enter value of breadth");
		double breadth=s2.nextDouble();
		double area=length*breadth;
		System.out.println("Enter value of Area of rectangle-> "+area);

	}

}

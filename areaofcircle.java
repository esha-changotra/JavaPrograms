package Assignment2;

import java.util.Scanner;

public class areaofcircle {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of Pi");
		double pi=s1.nextDouble();
		System.out.println("Enter value of Radius");
		double r=s1.nextDouble();
		double area=pi*r*r;
		System.out.println("Enter value of Area -> "+area);

	}

}

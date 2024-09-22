package Assignment2;

import java.util.Scanner;

public class areaoftriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of breadth");
		double b=s1.nextDouble();
		System.out.println("Enter value of height");
		double h=s1.nextDouble();
		double area=0.5*b*h;
		System.out.println("Enter value of Area -> "+area);


	}

}

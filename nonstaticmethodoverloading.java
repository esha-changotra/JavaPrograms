package basicsprograms;

public class nonstaticmethodoverloading {
	
	public void addition (int a, int b)
	
	{
		int sum=a+b;
		System.out.println("Sum -> " + sum);
	}
	public void addition(int a, int b, int c)
	{ 
		double mul=a*b*c;
		System.out.println("Multiplication -> " + mul);
	}
	public void addition(int a, double b)
	{
		double div=a/b;
		System.out.println("Division -> " + div);
	}
	public void addition(double a, int b)
	{
		double sub=a-b;
		System.out.println("Subtraction -> " + sub);
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonstaticmethodoverloading m1=new nonstaticmethodoverloading();
		m1.addition(3,5);
		m1.addition(2,1,3);
		m1.addition(9,5.1);
		m1.addition(12.5,8);
		}
}

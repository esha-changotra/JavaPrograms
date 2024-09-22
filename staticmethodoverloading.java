package basicsprograms;

public class staticmethodoverloading {
	
	public static void addition(int a,int b)
	{
		
        int sum=a+b;
		System.out.println("Sum -> " + sum);
	}
	public static void addition(int a,int b,int c)
	{
		int mul=a*b*c;
		System.out.println("Multiplication -> " + mul);
	}
	public static void addition(double a, double b)
	{
       double div=a/b;
		System.out.println("Division -> " + div);
	}
	public static void addition(double a, int b) 
	{
		double sub=a-b;
		System.out.println("Subtraction-> " + sub);
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition(2,3);
		addition(4,5,6);
		addition(3.1,3.7);
		addition(10.9,6);
		}
}

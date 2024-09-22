package basicsprograms;

public class nonstaticmethodcall {
	
    void addition ()
	{
    	int a=10;
    	int b=20;
		int sum=a+b;
		System.out.println("Sum -> " + sum);
	}
	void mul()
	{ 
		int a=5;
    	int b=20;
		int mul=a*b;
		System.out.println("Multiplication -> " + mul);
	}
	void div()
	{
		int a=100;
    	int b=20;
		int div=a/b;
		System.out.println("Division -> " + div);
	}
	void sub()
	{
		int a=450;
    	int b=20;
		int sub=a-b;
		System.out.println("Subtraction -> " + sub);
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonstaticmethodcall m1=new nonstaticmethodcall();
		m1.addition();
		m1.mul();
		m1.div();
		m1.sub();

	}

}

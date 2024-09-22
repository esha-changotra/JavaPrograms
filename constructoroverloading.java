package basicsprograms;

public class constructoroverloading {
	
	constructoroverloading()
	{
		System.out.println("1st");	
		
	}
	constructoroverloading(int a)
	{
		System.out.println("2nd");	
		
	}
	constructoroverloading(int a,int b)
	{
		System.out.println("3rd");	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new constructoroverloading();
		new constructoroverloading(400);
		new constructoroverloading(400,280);

	}

}

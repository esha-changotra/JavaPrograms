package basicsprograms;

public class mainmethodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		mainmethodoverloading m1=new mainmethodoverloading();
		m1.main();
		main("Esha",'E');

	}
	
	public void main() {
		// TODO Auto-generated method stub
		System.out.println("Not the Main Method");

	}
	public static void main(String name,char gender) {
		// TODO Auto-generated method stub
		System.out.println("Main Method with values");
	}

}

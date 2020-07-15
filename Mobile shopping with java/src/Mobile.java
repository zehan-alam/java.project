
public abstract class Mobile {	
	
	void price(int price) {
		System.out.println("Price is: "+price+" BDT");
	}
	
	void displaySize(double display) {
		System.out.println("Display size is : "+display+" inches");
	}
	
	abstract void osVersion();
	
	abstract public void showInfo();

	protected abstract String getName();
	
}

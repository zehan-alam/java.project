
public class Apple extends Mobile{
	private String name;
	private int price;
	private double display;
	private double os;


	public Apple(String name, int price, double d, double os) {
		this.name = name;
		this.price = price;
		this.display = d;
		this.os = os;
		//showInfo();
	}

	void osVersion() {
		System.out.println("OS version : iOS "+os);
		
	}

	public void showInfo() {
		System.out.println("Device name : "+name.toString());
		price(price);
		displaySize(display);
		osVersion();
		System.out.println();
	}

	public String getName() {
		return name;
	}
	
}

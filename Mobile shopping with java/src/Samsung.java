
public class Samsung extends Mobile{
	private String name;
	private int price;
	private double display;
	private String os;
	
	
	public Samsung(String name, int price, double display, String os) {
		super();
		this.name = name;
		this.price = price;
		this.display = display;
		this.os = os;
		//showInfo();
	}


	@Override
	void osVersion() {
		System.out.println("Android version is:"+os);
	}


	@Override
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

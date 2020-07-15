import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Mobile mobile1=new Apple("Iphone SE 2020",55000,4.7,14.0);
		Mobile mobile2=new Samsung("Galaxy S20",84000,6.3,"Android Q 10.0.2");
		List<Mobile> mobileList = new ArrayList<>();
		mobileList.add(mobile1);
		mobileList.add(mobile2);
		for(Mobile a: mobileList) {
			System.out.println(a.getName());
		}
	}



}

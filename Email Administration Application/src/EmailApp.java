import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		int n=1;
		System.out.println("Welcome to my Email Administration App");
		Scanner in = new Scanner(System.in);
		while(n!=2){
			System.out.println("Do you want create a new account?\n(1)->Yes\t(2)->No");
			n=in.nextInt();
			if(n==2) {
				System.out.println("Thanks");
				return;
			}
			System.out.print("Type your name:\nFirst name: ");
			String a = in.next();
			System.out.print("Last name: ");
			String b = in.next();
			Email em1 = new Email(a, b);
		}
	}

}
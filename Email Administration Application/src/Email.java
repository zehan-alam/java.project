import java.util.Random;
import java.util.Scanner;

public class Email {
	private String first;
	private String last;
	private String pass;
	private String email;
	private String dept;
	private int mailBoxCapacity = 500;
	Random rand = new Random();
	public Scanner in = new Scanner(System.in);

	public Email(String first, String last) {
		this.first = first;
		this.last = last;
		System.out.println("Name: " + first + " " + last);
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			System.out.println("OOPS");
		}
		System.out.println(this.dept = setDept());
		System.out.println();
		System.out.println("    Genereting Mail and Password...");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException ex) {
			System.out.println("OOPS");
		}

		email = first.toLowerCase() + "." + last.toLowerCase().substring(0, Math.min(last.length(), 3))
				+ rand.nextInt(100) + "@du.math.ac.bd";

		System.out.println("Your mail is     : " + email);
		System.out.println(this.pass = randomPass());
		System.out.println();
		changeInfo();
		System.out.println("=====================");
		showInfo();
		System.out.println("=====================");
		System.out.println("Thanks for using my app");
	}

	private String setDept() {
		System.out.print(
				"Choose your Account type:\n(1)-> Student\t(2)-> Savings\t(3)-> Dhanda \t(4)-> other \nEnter you code: ");
		int deptChoice = in.nextInt();
		switch (deptChoice) {
		case 1:
			return "Account type is: Student";
		case 2:
			return "Account type is: Savings";
		case 3:
			return "Account type is: Dhanda";
		default:
			return "Account type is: others";
		}
	}

	private String randomPass() {
		System.out.print("Your password is : ");
		int l = (int) Math.pow(10, 9 - Math.min(last.length(), 5));
		return last.toLowerCase().substring(0, Math.min(last.length(), 5)) + "_" + rand.nextInt(l);
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAltmail() {
		return email;
	}

	public void setAltmail(String altmail) {
		this.email = altmail;
	}

	private void changeInfo() {
		System.out.print("Choose if you want to change anything:\n" + "(1)-> Mail \t  (2)-> Password \t"
				+ "  (3)-> Both \t  (4)-> None \nEnter you code: ");
		int choice = in.nextInt();

		if (choice == 1) {
			System.out.print("Enter new mail: ");
			String am = in.next();
			setAltmail(am + "@du.math.ac.bd");
		} else if (choice == 2) {
			System.out.print("Enter new password: ");
			String ap = in.next();
			setPass(ap);
		} else if (choice == 3) {
			System.out.print("Enter new mail: ");
			String am1 = in.next();
			setAltmail(am1 + "@du.math.ac.bd");
			System.out.print("Enter new password: ");
			String ap1 = in.next();
			setPass(ap1);
		} else {
			System.out.println("Thanks for trusting us!");
		}
		System.out.println();
	}

	private void showInfo() {
		System.out.println("Mail: " + this.email);
		System.out.println("Pass: " + this.pass);
		System.out.println("Mailbox Capacity: " + this.mailBoxCapacity);
	}
}

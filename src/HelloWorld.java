import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String enteredName = scan.nextLine();
		HelloUser user = new HelloUser(enteredName);
		user.greetUser();
		scan.close();
	}

}

package Polymorphism;

public class MethodOverloading {

	public void emailAndPhoneNumber(String email) {
		System.out.println("Email code has been execute");
	}
	public void emailAndPhoneNumber(long phoneNumber) {
		System.out.println("Phone number code has been execute");
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.emailAndPhoneNumber(9876543210l);
		

	}

}

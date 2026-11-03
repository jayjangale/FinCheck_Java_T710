package oopsDemo;

public class AccessSpecifier1 {
    public long AccId = 562443443422244l;
	protected int balance = 84000;
	private int pin = 4755;
	String name = "Jay";
	public static void main(String[] args) {
		AccessSpecifier1 a = new AccessSpecifier1();
		System.out.println(a.AccId);
		System.out.println(a.balance);
		System.out.println(a.pin);
		System.out.println(a.name);
		
	}

	}



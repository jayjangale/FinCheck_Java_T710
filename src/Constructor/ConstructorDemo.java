package Constructor;

public class ConstructorDemo {
	
// 1.Constructor name should be same as Class Name
// 2.Constructor doesn't return any value
	
	// accessSpecifier methodName() {   }

//  default or no-argument constructor 
//  parameterized constructor
	public ConstructorDemo() {     // default or no-argument constructor
		System.out.println("hello");		
	}
	public ConstructorDemo(String Name) {
		System.out.println("Name of the person is "+Name);		
	}
	public int add(int a , int b) {
		return a+b;		
	}
	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo("Jay");
		System.out.println(c.add(15, 50));
		System.out.println(c.add(80, 90));
		System.out.println(c);
		System.out.println(c);
		
		
	}

}

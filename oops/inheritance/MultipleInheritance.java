package inheritance;
interface A{
	public void speed();
}
interface B{
	public void speed();
	public void demo();
}
class C implements A , B {
	@Override 
	public void speed() {
		System.out.println("this code belong to A and B class");
	}
	@Override
	public void demo() {
		System.out.println("this code belong to only B class");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		C c = new C();
		c.demo();
		c.speed();		
	}		
}



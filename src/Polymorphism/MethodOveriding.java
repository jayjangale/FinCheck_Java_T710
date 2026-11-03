package Polymorphism;
class Vehicle{
	public void speed() {
		System.out.println("this code belong to vehicle");
	}
}
class Car extends Vehicle{
	public void speed() {
		System.out.println("this code belong to car");
	}
}
class Bike extends Vehicle{
	public void speed() {
		System.out.println("this code belong to bike");
	}
}
public class MethodOveriding {
	public static void main(String[] args) {
		Car c = new Car();
		c.speed();		
	}
}



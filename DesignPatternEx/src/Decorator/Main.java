package Decorator;

public class Main {
	public static void main(String[] args) {
		Decorator decorator = new Decorator();
		System.out.println(decorator.getMerong());
		Decorator child = new ChildDecorator(decorator);
		System.out.println(child.getMerong());
		Decorator child2 = new ChildDecorator(child);
		System.out.println(child2.getMerong());
	}
}
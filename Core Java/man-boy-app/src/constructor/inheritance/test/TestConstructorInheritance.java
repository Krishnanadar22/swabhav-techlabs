package constructor.inheritance.test;

import constructor.inheritance.Child;
import constructor.inheritance.Parent;

public class TestConstructorInheritance {
	public static void main(String args[]) {
		Parent parent = new Parent(10);
		Child child1 = new Child();
		Child child2 = new Child(100);

		System.out.println(parent.getFoo());
		System.out.println(child1.getFoo());
		System.out.println(child2.getFoo());
	}
}

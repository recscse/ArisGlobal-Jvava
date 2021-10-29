package UpcastingAndDowncasting;


class Parent{
	void PrintData() {
		System.out.println("Method of parent Class");
	}
}

class Child extends Parent {
	void PrintData() {
		System.out.println("Method of Child class");
	}
}
public class UpcatingExample {
	public static void main(String args[]) {
		Parent obj1 = (Parent) new Child();
		Parent obj2 = (Parent) new Child();
		obj1.PrintData();
		obj2.PrintData();
	}
}

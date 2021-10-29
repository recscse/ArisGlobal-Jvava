package UpcastingAndDowncasting;

class Animal{
	void voice() {
		System.out.println("Animal voice");
	}
}

class cat extends Animal{
	void voice() {
		System.out.print("meowwwwwwwwwwww.......");
	}
}

public class UpcastingExample2 {
	public static void main(String args[]) {
		Animal cat = new cat();
		
	}

}

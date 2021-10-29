package InheritanceExample;
	import java.io.*;
// interface for printing
public interface Printer {
	void printit(String text);
	void disconnect();
}

// Implementing Interface for Printer
class IBMPrinter implements Printer{
	public void printit(String text) {
		System.out.print(text);
	}
	public void disconnect() {
		System.out.print("Printing Completed");
		System.out.println("Disconnected form IBM Printer");
	}
	// implementing Printer interface for Epson printer
	class EpsonPrinter implements Printer{
		public void printit(String text) {
			System.out.println(text);
		}
		public void disconnect() {
			System.out.println("Printing Completed");
			System.out.println("Disconnceted form Epson printer");
		}
	}
	class usePrinter{
		public static void main(String args[]) {
			
		}
	}
}

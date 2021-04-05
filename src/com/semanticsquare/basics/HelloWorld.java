public class HelloWorld {  // if you have "public" before class, the file name & the class name have to be the same
	public static void main(String[] args) {
		System.out.println("HelloWorld!!");
	}
}

class GoodBye {  // normally, this would be a nested class within HelloWorld
	public static void main(String[] args) {
		System.out.println("Goodbye!!");
	}
}

// If you want to run a file from the command line, you MUST have a "main" method in the class
// main method is where your program STARTS running
// main method must be declared public, static, or void
// We typically invoke other classes from the main method (and those other classes don't have to have a main method)
// Program ends when the main method ends
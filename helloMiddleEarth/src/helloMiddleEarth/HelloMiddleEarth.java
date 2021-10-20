package helloMiddleEarth;
import java.util.Scanner;
public class HelloMiddleEarth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] names = {"Bilbo", "Frodo", "Aragorn", "Legolas", "Gandalf", "Boromir", "Faramir"};
		do { 
			//print greetings to the fine folks in the Middle Earth
			for (String name : names) {
				System.out.println("Hello, " + name);
				//something nothing
				System.out.println("How are you doing today?");
				
			}
			System.out.println("Repeat?");
		}while(input.next() == "y");
	}

}

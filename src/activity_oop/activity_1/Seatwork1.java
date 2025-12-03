package activity_oop.activity_1;

public class Seatwork1 {
	public static void main(String[] args) {
		// Create objects
		Book myBook = new Book();
		myBook.title = "Harry Potter";
		myBook.read();

		House myHouse = new House();
		myHouse.numberOfWindows = 5;
		myHouse.openWindow();

		Tree myTree = new Tree();
		myTree.type = "Oak";
		myTree.grow();
	}
}

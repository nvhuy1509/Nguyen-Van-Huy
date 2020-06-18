package oop.project;

public class AppTest {
	public static void main(String [] args) {
		Note app = new Note();
		app.addNote();
		System.out.println("Result: ");
		app.showNote();
	}

}

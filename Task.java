package oop.project;

import java.util.ArrayList;

public class Task extends AppManager {

	// d�y c�c todolist v� d� c�c note
	private Todolist listtodo = new Todolist();
	private ArrayList<Note> listnotes = new ArrayList<Note>();

	public Task() {

	}

	public Task(String id, String content) {
		super();
	}

	public Task(String id, String content, ArrayList<Note> listnotes, Todolist listtodo) {
		super();
		this.listnotes = listnotes;
		this.listtodo = listtodo;
	}
}

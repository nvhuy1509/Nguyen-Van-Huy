package oop.project;

import java.util.ArrayList;

public class Tag extends AppManager{
	// trong tag có danh sách các notes và todolist
	private ArrayList<String> notes = new ArrayList<String>();
	private ArrayList<String> todolists = new ArrayList<String>();

	public Tag() {

	}

	public Tag(String id, String content) {
		super();
	}

	public void getIdNote(Note note) {
		notes.add(note.getId());
	}

	public void getIdTodoList(Todolist list) {
		todolists.add(list.getId());
	}

}

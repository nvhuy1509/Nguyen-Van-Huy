package oop.project;

import java.util.ArrayList;

public class Todolist extends todo {
	private ArrayList<todo> listtodo = new ArrayList<todo>();

	public Todolist() {
		
	}
	public Todolist(String id, String content, ArrayList<todo> listtodo) {
		super(id, content);
		this.listtodo = listtodo;
	}


	public Todolist(String id, String content) {
		super(id, content);
		// TODO Auto-generated constructor stub
	}


}

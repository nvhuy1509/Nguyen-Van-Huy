package oop.project;

import java.io.Serializable;

public class App<T> implements Serializable {
	protected int id; // id cho từng sub-class: note, todolist, task & TAG
	protected String content;

	public App() {

	}

	public App(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "App [id = " + id + ", content = " + content + "]";
	}

	
}

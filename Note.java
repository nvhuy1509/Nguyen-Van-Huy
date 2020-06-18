package oop.project;

import java.util.ArrayList;

public class Note extends AppManager {
	private String title;
	// tạo một list chứa id của tag
	private ArrayList<Note> idNote = new ArrayList<Note>();

	public Note(String id, String content, String title) {
		super();
		this.title = title;
	}

	public Note() {
		// TODO Auto-generated constructor stub
	}


	public ArrayList<Note> getIdNote() {
		return idNote;
	}

	public void setIdNote(ArrayList<Note> idNote) {
		this.idNote = idNote;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//	public void getIdTag(Tag tag) {
//		idTag.add(tag.getId());
//	}

	public String inputTitle() {
		System.out.println("Input Title:");
		return sc.nextLine();
	}

	public void addNote() {
		super.add();
		String title = inputTitle();
		Note note = new Note(super.getId(), super.getContent(), title);
		idNote.add(note);
	}

	public void showNote() {
//		for( Note apps : idNote) {
//			super.show();
//			System.out.println("Title= "+ apps.getTitle());
//		}
		for (Note apps : idNote) {
			System.out.println("Id= " + apps.getId());
			System.out.println("Title= " + apps.getTitle());
			System.out.println("Content= " + apps.getContent());
		}

	}
}

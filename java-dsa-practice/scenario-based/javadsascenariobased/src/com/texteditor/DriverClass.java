package com.texteditor;

public class DriverClass {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		editor.insert("welcome");
		editor.insert("have");
		editor.undo();
		
		editor.insert("to");
		editor.undo();
		editor.redo();
	}
}

package org.openjfx.hellofx;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class MainController {
	
	private int counter = 0;
	
	@FXML private Text textNum;
	
	
	
	@FXML
	private void print() {
		System.out.println("printing to console");
	}
	
	public void addCount() {
		counter++;
		String rep;
		
		rep = "Click Count: " + counter;
		textNum.setText(rep);
	}
	
	@FXML
	private void nextPage() throws IOException {
		HelloWorld.setRoot("List");
	}
}

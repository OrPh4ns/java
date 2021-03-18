package application;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Control {

    @FXML
    private TextArea yes;

    @FXML
    private TextArea no;

    @FXML
    private TextField website;

    @FXML
    void OnCheck() throws InterruptedException {


    		
    	String website = this.website.getText();
    	String file = "file.html";
		try {
			Scanner scanner = new Scanner(new File("C:\\Users\\Abdulx\\Desktop\\list.txt"));
			while (scanner.hasNextLine()) {
				String por = scanner.nextLine();
		    	Thread.sleep(1000);
	    		try {
					URL u = new URL(por,website,file);
					
					yes.appendText(por+"\n");
			
					
				} catch (MalformedURLException e) {
					no.appendText(por+"\n");

					
					
				
	    	}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
    	
    }

}

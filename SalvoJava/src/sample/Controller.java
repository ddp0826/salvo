package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.RadioButton;


import javax.swing.*;
import java.awt.event.ItemEvent;

public class Controller {

@FXML
private RadioButton clientRadio;
@FXML
private RadioButton serverRadio;
@FXML
private TextField serverInput;


    public void ConnectionStart(MouseEvent mouseEvent) {
        //get rid of radio buttons
        serverRadio.setVisible(false);
        clientRadio.setVisible(false);


    }


    public void radioStateChanged(MouseEvent mouseEvent) {
        if(clientRadio.isSelected()){
            serverInput.setVisible(true);
        }else{
            serverInput.setVisible(false);
        }
    }
}

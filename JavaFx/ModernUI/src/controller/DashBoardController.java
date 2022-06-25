package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardController implements Initializable {

    @FXML
    private VBox tblData;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Node[]nodes=new Node[10];
        try{
            for (int i = 0; i < nodes.length; i++) {
                nodes[i]= FXMLLoader.load(getClass().getResource("../view/Item.fxml"));
                tblData.getChildren().add(nodes[i]);
            }
        }catch (IOException e){
            new Alert(Alert.AlertType.ERROR,"Error Occured", ButtonType.CLOSE);
        }
    }
}

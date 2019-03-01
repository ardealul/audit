package ro.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProiectController2 {
    public static String numeProiect;

    @FXML
    private Button incepeProiect;

    @FXML
    private TextField numeProiectField;

    @FXML
    void incepeProiectAction(ActionEvent event) throws IOException {
        File f = new File("src//main//resources//files//"+numeProiectField.getText()+".mgvox");
        if (f.exists()){
            setAlert("File exists","File allready exists");
        }else
        {   numeProiect=numeProiectField.getText();
            BufferedWriter writer = new BufferedWriter(new FileWriter(f, true));
        writer.close();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("/fxml/apartamentDesign.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);

            tableViewScene.getStylesheets().add(getClass().getResource("/fxml/application.css").toExternalForm());
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(tableViewScene);
            window.show();
        }
    }
    public static void setAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

package ro.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ApartamentController {
    public static double inaltime;
    public static String nume;
    public static double suprafata;

    @FXML
    private TextField suprafataApartament;

    @FXML
    private Button proiectNouButton;

    @FXML
    private TextField inaltimeApartament;

    @FXML
    private Button intoarceteButton;



    @FXML
    void proiectNou(ActionEvent event) throws IOException {
    suprafata = Double.parseDouble(suprafataApartament.getText());
    nume = ProiectController2.numeProiect;
    inaltime = Double.parseDouble(inaltimeApartament.getText());
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("/fxml/usaStratFereastraDesign.fxml"));
        Scene tableViewScene = new Scene(tableViewParent, 1070, 713);
        tableViewScene.getStylesheets().add(getClass().getResource("/fxml/application.css").toExternalForm());
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    void intoarceProiect(ActionEvent event) {

    }

}

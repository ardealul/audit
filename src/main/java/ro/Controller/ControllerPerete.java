package ro.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import ro.model.java.*;
import ro.repository.java.CrudRepository;
import ro.repository.java.PereteRepository;


public class ControllerPerete {
    List<Usa> listaUsa = new ArrayList<Usa>();
    List<Fereastra> listaFereastra = new ArrayList<Fereastra>();
    List<Strat> listaStrat = new ArrayList<Strat>();
    static List<Perete> listaPerete = new ArrayList<Perete>();
    static Apartament apartament = new Apartament(listaPerete);
    static CrudRepository crudRepo = new CrudRepository(apartament);
    PereteRepository pereteRepository = new PereteRepository(apartament.getListaPereti());
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button urmPasButton;

    @FXML
    private Button adaugaPer;

    @FXML
    private Button stergePerete;

    @FXML
    private Button modificaPerete;



    @FXML
    private ImageView adaugaPeretebtn;

    @FXML
    private TextField idPereteField;

    @FXML
    private TextField inaltimeField;

    @FXML
    private TextField lungimeField;

    @FXML
    private Button pasAnteriorButton;







    @FXML
    private ChoiceBox<PunctCardinal> punctCardinalField;

    @FXML
    private TableView<Perete> pereteTableView;

    @FXML
    private TableColumn<Perete, Double> lungimeColoana;

    @FXML
    private TableColumn<Perete, Double> inaltimeCoalana;

    @FXML
    private TableColumn<Perete, Integer> idColoana;

    @FXML
    private TableColumn<Perete, TipPerete> tipPereteColoana;

    @FXML
    private TableColumn<Perete, PunctCardinal> punctCardinalColoana;



    @FXML
    private ChoiceBox<TipPerete> tipPereteField;



    @FXML
    void adaugaPereteAction(ActionEvent event) {

    }

    @FXML
    void stergePerete(ActionEvent event) throws InterruptedException {
        if(isInteger(idPereteField.getText())){
            Perete perete= new Perete(Integer.parseInt(idPereteField.getText()), Double.parseDouble(lungimeField.getText()), Double.parseDouble(inaltimeField.getText()), punctCardinalField.getValue(), tipPereteField.getValue());
            pereteRepository.delete(Integer.parseInt(idPereteField.getText()));
            System.out.println(perete);
            refreshObsList();

            // listView.getItems().addAll("PERETE "+Integer.parseInt(idPereteField.getText()));
            //pereteRepository.save(pereteRepository,new Perete(Integer.parseInt(idPereteField.getText()), Double.parseDouble(lungimeField.getText()), Double.parseDouble(inaltimeField.getText()), punctCardinalField.getValue(), tipPereteField.getValue()));

    }else setAlert("Date invalide","Datele introduse nu sunt bune!");
        }


    @FXML
    void modificaPerete(ActionEvent event)throws InterruptedException {
        if(isInteger(idPereteField.getText())&&isDouble(lungimeField.getText())&&isDouble(inaltimeField.getText())&&(!punctCardinalField.getSelectionModel().isEmpty())&&(!tipPereteField.getSelectionModel().isEmpty())) {
                Perete perete= new Perete(Integer.parseInt(idPereteField.getText()), Double.parseDouble(lungimeField.getText()), Double.parseDouble(inaltimeField.getText()), punctCardinalField.getValue(), tipPereteField.getValue());
                pereteRepository.update(perete);
            System.out.println(perete);
            System.out.println(apartament.getListaPereti());
         refreshObsList();


        }else setAlert("Date invalide","Datele introduse nu sunt bune!");
    }

    @FXML
    void urmPasAction(ActionEvent event) throws IOException {
       /* apartament.setInaltimea(5.2);
        apartament.setSuprafataUtila(100D);
        Repository repo = new Repository();
        Arie arie = new Arie();
        for(Perete per :apartament.getListaPereti())
            System.out.println("Aria Opaca a peretelui cu id-ul "+per.getId()+" este "+arie.calcArieOpacaPerete(per));
        System.out.println("aporturi Solare Apartament"+repo.aporturiSolare(apartament));
        System.out.println(repo.coeficientulDePierderiTermice(apartament)+"coeficient pierderi Termice");
        System.out.println(repo.aporturideCalguraGq(apartament)+"caldura cg");
        System.out.println(repo.aporturiSurseInterne(apartament)+"aposrturi surse interne");
        System.out.println(repo.coeficientulGlobalIzolareTermica(apartament)+"coeficientul global Izolare Termica");
        System.out.println(repo.necesarDeCaldura(apartament)+"necesar De Caldura");
        System.out.println(repo.necesarEnergieIncalzireQh(apartament)+"QH engegie Incalzire");*/
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("/fxml/adaugaRestul.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        tableViewScene.getStylesheets().add(getClass().getResource("/fxml/application.css").toExternalForm());
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }




    @FXML
    void adaugaPer(ActionEvent event) throws IOException {
        if(isInteger(idPereteField.getText())&&isDouble(lungimeField.getText())&&isDouble(inaltimeField.getText())&&(!punctCardinalField.getSelectionModel().isEmpty())&&(!tipPereteField.getSelectionModel().isEmpty())) {
            if (idPereteNotTaken(Integer.parseInt(idPereteField.getText()), listaPerete)) {


        // crudRepo.savePerete(new Perete(Integer.parseInt(idPereteField.getText()), Double.parseDouble(lungimeField.getText()), Double.parseDouble(inaltimeField.getText()), punctCardinalField.getValue(), tipPereteField.getValue()));
               Perete perete= new Perete(Integer.parseInt(idPereteField.getText()), Double.parseDouble(lungimeField.getText()), Double.parseDouble(inaltimeField.getText()), punctCardinalField.getValue(), tipPereteField.getValue());
        pereteRepository.save(perete);
       System.out.println(perete);

                refreshObsList();
       // listView.getItems().addAll("PERETE "+Integer.parseInt(idPereteField.getText()));
        //pereteRepository.save(pereteRepository,new Perete(Integer.parseInt(idPereteField.getText()), Double.parseDouble(lungimeField.getText()), Double.parseDouble(inaltimeField.getText()), punctCardinalField.getValue(), tipPereteField.getValue()));
            }else setAlert("ID Taken","Id-ul folosit deja, introdu unul nou!");
        }else setAlert("Date invalide","Datele introduse nu sunt bune!");
    }


    @FXML
    void pasAnteriorAction(ActionEvent event) throws IOException {


    }
 /*   @FXML
    void adaugaBonus(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("/fxml/pereteDesign.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }*/
   /* @FXML
    void adaugaFerestre(ActionEvent event) {
        if(isDouble(inaltimeFereastraField.getText())&&isDouble(inaltimeFereastraField.getText())&&fieldCheckNotNull(latimeFereastraField.getText())&&fieldCheckNotNull(inaltimeFereastraField.getText())&&fieldCheckNotNull(idFereastraField.getText())&&isInteger(idFereastraField.getText())){
            fereastraListView.getItems().addAll("FEREASTRA "+Integer.parseInt(idFereastraField.getText()));
            listaFereastra.add(new Fereastra(Integer.parseInt(idFereastraField.getText()),Double.parseDouble(inaltimeFereastraField.getText()),Double.parseDouble(latimeFereastraField.getText())));
        setAlert("Fereastra adaugata","inaltimea "+inaltimeFereastraField.getText()+" lungimea " +latimeFereastraField.getText());
        }
        else setAlert("Verifica Datele","Datele introduse nu sunt in format corect");
    }

    @FXML
    void adaugaUsi(ActionEvent event) {
        if(isDouble(inaltimeUsaField.getText())&&isDouble(latimeUsaField.getText())&&fieldCheckNotNull(inaltimeUsaField.getText())&&fieldCheckNotNull(latimeUsaField.getText())&&fieldCheckNotNull(idUsaField.getText())&&isInteger(idUsaField.getText())){
        listaUsa.add(new Usa(Integer.parseInt(idUsaField.getText()),Double.parseDouble(inaltimeUsaField.getText()),Double.parseDouble(latimeUsaField.getText())));
            usaListView.getItems().addAll("USA "+Integer.parseInt(idUsaField.getText()));
            setAlert("Usa adaugata","inaltimea "+inaltimeUsaField.getText()+" lungimea " +latimeUsaField.getText());}
        else setAlert("Verifica Datele","Datele introduse nu sunt in format corect");
    }

    @FXML
    void adaugaStrat(ActionEvent event) {
        if(isDouble(densitateaField.getText())&&isDouble(grosimeStratField.getText())&&fieldCheckNotNull(densitateaField.getText())&&fieldCheckNotNull(grosimeStratField.getText())&&fieldCheckNotNull(idStratField.getText())&&isInteger(idStratField.getText())){
        listaStrat.add(new Strat(Integer.parseInt(idStratField.getText()),Double.parseDouble(densitateaField.getText()),Double.parseDouble(grosimeStratField.getText())));
        setAlert("Strat adaugat","rezistenta "+densitateaField.getText()+" grosimea " +grosimeStratField.getText());
            usaListView.getItems().addAll("USA "+Integer.parseInt(idStratField.getText()));
        }
        else setAlert("Verifica Datele","Datele introduse nu sunt in format corect");
    }*/

    @FXML
    void initialize() {
        assert urmPasButton != null : "fx:id=\"urmPasButton\" was not injected: check your FXML file 'usaStratFereastraDesign.fxml'.";
        assert adaugaPer != null : "fx:id=\"adaugaPer\" was not injected: check your FXML file 'usaStratFereastraDesign.fxml'.";
        assert punctCardinalField != null : "fx:id=\"punctCardinalField\" was not injected: check your FXML file 'usaStratFereastraDesign.fxml'.";
        assert pereteTableView != null : "fx:id=\"pereteTableView\" was not injected: check your FXML file 'usaStratFereastraDesign.fxml'.";        assert tipPereteField != null : "fx:id=\"tipPereteField\" was not injected: check your FXML file 'usaStratFereastraDesign.fxml'.";
        assert adaugaPeretebtn != null : "fx:id=\"adaugaPeretebtn\" was not injected: check your FXML file 'usaStratFereastraDesign.fxml'.";
        assert idPereteField != null : "fx:id=\"idPereteField\" was not injected: check your FXML file 'usaStratFereastraDesign.fxml'.";
        assert inaltimeField != null : "fx:id=\"inaltimeField\" was not injected: check your FXML file 'usaStratFereastraDesign.fxml'.";
        assert lungimeField != null : "fx:id=\"lungimeField\" was not injected: check your FXML file 'usaStratFereastraDesign.fxml'.";
        assert pasAnteriorButton != null : "fx:id=\"pasAnteriorButton\" was not injected: check your FXML file 'usaStratFereastraDesign.fxml'.";
        punctCardinalField.getItems().setAll(PunctCardinal.values());
        tipPereteField.getItems().setAll(TipPerete.values());
        idColoana.setCellValueFactory(new PropertyValueFactory<Perete,Integer>("id"));
        inaltimeCoalana.setCellValueFactory(new PropertyValueFactory<Perete,Double>("inaltime"));
        lungimeColoana.setCellValueFactory(new PropertyValueFactory<Perete,Double>("latime"));
        punctCardinalColoana.setCellValueFactory(new PropertyValueFactory<Perete,PunctCardinal>("punctCardinal"));
        tipPereteColoana.setCellValueFactory(new PropertyValueFactory<Perete,TipPerete>("tipPerete"));
        refreshObsList();
        pereteTableView.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                int index = pereteTableView.getSelectionModel().getSelectedIndex();
                Perete perete = pereteTableView.getItems().get(index);
                idPereteField.setText(String.valueOf(perete.getId()));
                inaltimeField.setText(String.valueOf(perete.getInaltime()));
                lungimeField.setText(String.valueOf(perete.getLatime()));
                tipPereteField.getSelectionModel().select(perete.getTipPerete());
                punctCardinalField.getSelectionModel().select(perete.getPunctCardinal());
                System.out.println(perete);
            }
        });

                    }


    @FXML
    void getTableItemSelected(ActionEvent event) {

    }


    public void refreshObsList(){

        ObservableList<Perete> myList =  FXCollections.observableArrayList();

        for(Perete per : apartament.getListaPereti())
            myList.add(per);
        pereteTableView.setItems(myList);
        pereteTableView.getColumns().get(0).setVisible(false);
        pereteTableView.getColumns().get(0).setVisible(true);

    }

    public static void setAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public boolean fieldCheckNotNull(String field) {
        if (!(field.trim().equals(""))) {
            return true;
        } else
            return false;
    }
    public boolean idPereteNotTaken(int id, List<Perete> pereteList){
            for(Perete per1 : pereteList) {
                if (per1.getId() == id)
                    return false;
            } {return true;}
        }
        public void adaugaFereastra(int id,Fereastra fereastra){

        }

    }


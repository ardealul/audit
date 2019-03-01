package ro.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import ro.repository.java.Arie;
import ro.model.java.*;
import ro.repository.java.FereastraRepository;
import ro.repository.java.Repository;
import ro.repository.java.StratRepository;
import ro.repository.java.UsaRepository;

public class Controller {
    FereastraRepository crud = new FereastraRepository(ControllerPerete.apartament.getListaPereti());
    UsaRepository crudUsa = new UsaRepository(ControllerPerete.apartament.getListaPereti());
    StratRepository crudStrat = new StratRepository(ControllerPerete.apartament.getListaPereti());

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private TextField idPereteStratField;

    @FXML
    private TextField idPereteUsaField;

    @FXML
    private TextField lungimeFereastraField;

    @FXML
    private Button adaugaFereastraButton;

    @FXML
    private TextField idPereteFereastraField;

    @FXML
    private TableColumn<Fereastra, Integer> idFereastraColoana;

    @FXML
    private TableColumn<Usa, Double > inaltimeColoanaUsaPerete;

    @FXML
    private TextField inaltimeUsaField;

    @FXML
    private TableColumn<Perete, PunctCardinal> punctCardinalColoanaFereastaPerete;

    @FXML
    private TableColumn<Perete, TipPerete> tipPereteColoanaFereastaPerete;

    @FXML
    private TableView<Perete> pereteUsaTableView;

    @FXML
    private TableView<Perete> pereteFereastraTableView;

    @FXML
    private Button urmPasButton;

    @FXML
    private TableColumn<Perete, PunctCardinal> punctCardinalColoanaUsaPerete;

    @FXML
    private Button modificaUsaButton;

    @FXML
    private TableColumn<Perete, Double> lungimePereteColoanaUsaPerete;

    @FXML
    private TableColumn<Fereastra, Double> inaltimeFereastraColoana;

    @FXML
    private TableColumn<Fereastra, Double> lungimeFereastraColoana;

    @FXML
    private TableColumn<Perete, Integer> idColoanaUsaPerete;

    @FXML
    private TextField idFereastraField;

    @FXML
    private TableColumn<Perete, Double> inaltimePereteCoalanaUsaPerete;

    @FXML
    private TextField lungimeUsaField;

    @FXML
    private TextField inaltimeFereastraField;

    @FXML
    private Button modificaFereastraButton;

    @FXML
    private TableColumn<Usa, Integer> idPereteColoanaUsaPerete;

    @FXML
    private TableColumn<Perete, Double> lungimePereteColoanaFereastaPerete;

    @FXML
    private TableColumn<Perete, TipPerete> tipPereteColoanaUsaPerete;

    @FXML
    private TextField idUsaField;

    @FXML
    private TableColumn<Perete, Integer> idColoanaFereastaPerete;
    @FXML
    private TableColumn<Usa, Integer> idCoalanaUsaPerete;
    @FXML
    private TableColumn<Usa, Double> inaltimeCoalanaUsaPerete;

    @FXML
    private TableView<Fereastra> fereastraTableView;

    @FXML
    private TableColumn<Fereastra, Integer> idPereteColoanaFereastraPerete;

    @FXML
    private Button adaugaUsaButton;

    @FXML
    private TableColumn<Usa, Double> lungimeColoanaUsaPerete;

    @FXML
    private TableView<Usa> usaTableView;

    @FXML
    private TableColumn<Perete, Double> inaltimePereteCoalanaFereastaPerete;

    @FXML
    private Button stergeUsaButton;

    @FXML
    private Button stergeFereastraButton;

    @FXML
    private Button pasAnteriorButton;
    @FXML
    private TableColumn<Perete, Double> inaltimePereteCoalanaStratPerete;
    @FXML
    private TableColumn<Perete, TipPerete> tipPereteColoanaStratPerete;
    @FXML
    private TableColumn<Fereastra, Integer> idPereteColoanaStratPerete;
    @FXML
    private TextField idStratField;

    @FXML
    private TableColumn<Perete, Integer> idColoanaStratPerete;
    @FXML
    private TableColumn<Fereastra, Double> grosimeColoanaStratPerete;
    @FXML
    private TableColumn<Fereastra, Integer> idCoalanaStartPerete;
    @FXML
    private TableColumn<Perete, Double> lungimePereteColoanaStratPerete;
    @FXML
    private TableView<Strat> StratTableView;
    @FXML
    private TextField grosimeStratField;
    @FXML
    private TableColumn<Perete, PunctCardinal> punctCardinalColoanaStratPerete;
    @FXML
    private TableView<Perete> pereteStratTableView;
    @FXML
    private Button modificaStratButton;
    @FXML
    private TextField ConductivitateField;
    @FXML
    private Button stergeStratButton;
    @FXML
    private TableColumn<Fereastra, Double> conductivitateColoanaStratPerete;

    @FXML
    void urmPasAction(ActionEvent event) {
        ControllerPerete.apartament.setInaltimea(5.2);
        ControllerPerete. apartament.setSuprafataUtila(100D);
        Repository repo = new Repository();
        Arie arie = new Arie();
        for(Perete per :ControllerPerete.apartament.getListaPereti())
            System.out.println("Aria Opaca a peretelui cu id-ul "+per.getId()+" este "+arie.calcArieOpacaPerete(per));
        System.out.println("aporturi Solare Apartament"+repo.aporturiSolare(ControllerPerete.apartament));
        System.out.println(repo.coeficientulDePierderiTermice(ControllerPerete.apartament)+"coeficient pierderi Termice");
        System.out.println(repo.aporturideCalguraGq(ControllerPerete.apartament)+"caldura cg");
        System.out.println(repo.aporturiSurseInterne(ControllerPerete.apartament)+"aposrturi surse interne");
        System.out.println(repo.coeficientulGlobalIzolareTermica(ControllerPerete.apartament)+"coeficientul global Izolare Termica");
        System.out.println(repo.necesarDeCaldura(ControllerPerete.apartament)+"necesar De Caldura");
        System.out.println(repo.necesarEnergieIncalzireQh(ControllerPerete.apartament)+"QH engegie Incalzire");
    }
    @FXML
    void adaugaStrat(ActionEvent event) throws IOException {
        if(testStratFields()==true&&idPereteExists(Integer.parseInt(idPereteStratField.getText()))){
            crudStrat.save(new Strat(Integer.parseInt(idPereteStratField.getText()),Integer.parseInt(idStratField.getText()),Double.parseDouble(grosimeStratField.getText()),Double.parseDouble(ConductivitateField.getText())));
            refreshObsListStrat();
        }else ControllerPerete.setAlert("Date Incorecte","Verifica Elementele");
    }

    @FXML
    void stergeStrat(ActionEvent event) {

    }

    @FXML
    void modificaStrat(ActionEvent event) {

    }

    @FXML
    void pasAnteriorAction(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("/fxml/usaStratFereastraDesign.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        tableViewScene.getStylesheets().add(getClass().getResource("/fxml/application.css").toExternalForm());
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    void adaugaFereastra(ActionEvent event) throws IOException {
        if(testFereastraFields()==true&&idPereteExists(Integer.parseInt(idPereteFereastraField.getText()))){
          crud.save(new Fereastra(Integer.parseInt(idPereteFereastraField.getText()),Integer.parseInt(idFereastraField.getText()),Double.parseDouble(inaltimeFereastraField.getText()),Double.parseDouble(lungimeFereastraField.getText())));
            refreshObsListFereastra();
        }else ControllerPerete.setAlert("Date Incorecte","Verifica Elementele");
    }

    @FXML
    void stergeFereastra(ActionEvent event) throws IOException {
        if(fieldCheckNotNull(idFereastraField.getText())&&idPereteExists(Integer.parseInt(idPereteFereastraField.getText()))&&fieldCheckNotNull(idPereteFereastraField.getText())&&isInteger(idPereteFereastraField.getText())&&isInteger(idFereastraField.getText())){
            crud.delete(Integer.parseInt(idFereastraField.getText()),Integer.parseInt(idPereteFereastraField.getText()));
            refreshObsListFereastra();
        }else ControllerPerete.setAlert("Date Incorecte","Verifica Elementele");
    }

    @FXML
    void modificaFereastra(ActionEvent event) throws IOException {
        if(testFereastraFields()==true&&idPereteExists(Integer.parseInt(idPereteFereastraField.getText()))){
            crud.update(new Fereastra(Integer.parseInt(idPereteFereastraField.getText()),Integer.parseInt(idFereastraField.getText()),Double.parseDouble(inaltimeFereastraField.getText()),Double.parseDouble(lungimeFereastraField.getText())));
            refreshObsListFereastra();
        }else ControllerPerete.setAlert("Date Incorecte","Verifica Elementele");
    }

    @FXML
    void adaugaUsa(ActionEvent event) throws IOException {
        if(testUsaFields()==true&&idPereteExists(Integer.parseInt(idPereteUsaField.getText()))){
            crudUsa.save(new Usa(Integer.parseInt(idPereteUsaField.getText()),Integer.parseInt(idUsaField.getText()),Double.parseDouble(inaltimeUsaField.getText()),Double.parseDouble(lungimeUsaField.getText())));
            refreshObsListUsa();
        }else ControllerPerete.setAlert("Date Incorecte","Verifica Elementele");
    }

    @FXML
    void stergeUsa(ActionEvent event) throws IOException {
        if(fieldCheckNotNull(idPereteUsaField.getText())&&idPereteExists(Integer.parseInt(idPereteUsaField.getText()))&&fieldCheckNotNull(idUsaField.getText())&&isInteger(idPereteUsaField.getText())&&isInteger(idUsaField.getText())){
            crudUsa.delete(Integer.parseInt(idPereteUsaField.getText()),Integer.parseInt(idUsaField.getText()));
            refreshObsListUsa();
        }else ControllerPerete.setAlert("Date Incorecte","Verifica Elementele");
    }

    @FXML
    void modificaUsa(ActionEvent event) throws IOException {
        if(testUsaFields()==true&&idPereteExists(Integer.parseInt(idPereteUsaField.getText()))){
            crudUsa.update(new Usa(Integer.parseInt(idPereteUsaField.getText()),Integer.parseInt(idUsaField.getText()),Double.parseDouble(inaltimeUsaField.getText()),Double.parseDouble(lungimeUsaField.getText())));
            refreshObsListUsa();
        }else ControllerPerete.setAlert("Date Incorecte","Verifica Elementele");

    }

    @FXML
    void initialize() {
        assert idPereteUsaField != null : "fx:id=\"idPereteUsaField\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert lungimeFereastraField != null : "fx:id=\"lungimeFereastraField\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert adaugaFereastraButton != null : "fx:id=\"adaugaFereastraButton\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert idPereteFereastraField != null : "fx:id=\"idPereteFereastraField\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert idFereastraColoana != null : "fx:id=\"idFereastraColoana\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert inaltimeColoanaUsaPerete != null : "fx:id=\"inaltimeColoanaUsaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert inaltimeUsaField != null : "fx:id=\"inaltimeUsaField\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert punctCardinalColoanaFereastaPerete != null : "fx:id=\"punctCardinalColoanaFereastaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert tipPereteColoanaFereastaPerete != null : "fx:id=\"tipPereteColoanaFereastaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert pereteUsaTableView != null : "fx:id=\"pereteUsaTableView\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert pereteFereastraTableView != null : "fx:id=\"pereteFereastraTableView\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert urmPasButton != null : "fx:id=\"urmPasButton\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert punctCardinalColoanaUsaPerete != null : "fx:id=\"punctCardinalColoanaUsaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert modificaUsaButton != null : "fx:id=\"modificaUsaButton\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert lungimePereteColoanaUsaPerete != null : "fx:id=\"lungimePereteColoanaUsaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert inaltimeFereastraColoana != null : "fx:id=\"inaltimeFereastraColoana\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert lungimeFereastraColoana != null : "fx:id=\"lungimeFereastraColoana\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert idColoanaUsaPerete != null : "fx:id=\"idColoanaUsaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert idFereastraField != null : "fx:id=\"idFereastraField\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert inaltimePereteCoalanaUsaPerete != null : "fx:id=\"inaltimePereteCoalanaUsaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert lungimeUsaField != null : "fx:id=\"lungimeUsaField\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert inaltimeFereastraField != null : "fx:id=\"inaltimeFereastraField\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert modificaFereastraButton != null : "fx:id=\"modificaFereastraButton\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert idPereteColoanaUsaPerete != null : "fx:id=\"idPereteColoanaUsaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert lungimePereteColoanaFereastaPerete != null : "fx:id=\"lungimePereteColoanaFereastaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert tipPereteColoanaUsaPerete != null : "fx:id=\"tipPereteColoanaUsaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert idUsaField != null : "fx:id=\"idUsaField\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert idColoanaFereastaPerete != null : "fx:id=\"idColoanaFereastaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert inaltimeCoalanaUsaPerete != null : "fx:id=\"inaltimeCoalanaUsaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert fereastraTableView != null : "fx:id=\"fereastraTableView\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert idPereteColoanaFereastraPerete != null : "fx:id=\"idPereteColoanaFereastraPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert adaugaUsaButton != null : "fx:id=\"adaugaUsaButton\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert lungimeColoanaUsaPerete != null : "fx:id=\"lungimeColoanaUsaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert pereteUsaTableView != null : "fx:id=\"pereteUsaTableView\" was not injected: check your FXML file 'adaugaRestul.fxml'.";        assert inaltimePereteCoalanaFereastaPerete != null : "fx:id=\"inaltimePereteCoalanaFereastaPerete\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert stergeUsaButton != null : "fx:id=\"stergeUsaButton\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert stergeFereastraButton != null : "fx:id=\"stergeFereastraButton\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        assert pasAnteriorButton != null : "fx:id=\"pasAnteriorButton\" was not injected: check your FXML file 'adaugaRestul.fxml'.";
        { setTableIndicesPereteFereastra();
        refreshObsListPereteFereastra();
        setPereteFereastraTable();}
        {
            setTableIndicesFereastra();
            if(fieldCheckNotNull(idFereastraField.getText()))
            refreshObsListFereastra();
            setFereastraTable();
        }
        {
            setTableIndicesPereteUsa();
            refreshObsListPereteUsa();
            setPereteUsaTable();
        }
        {
            setTableIndicesuSA();
            if(fieldCheckNotNull(idPereteUsaField.getText()))
            refreshObsListUsa();
            setUsaTable();
        }
        {setPereteStratTable();
            setStratTable();
            setTableIndicesPereteStrat();
            setTableIndicesStrat();
            if(fieldCheckNotNull(idPereteStratField.getText()))
                refreshObsListStrat();

            refreshObsListPereteStrat();
        }
    }
    private void setTableIndicesPereteUsa() {
        idColoanaUsaPerete.setCellValueFactory(new PropertyValueFactory<Perete,Integer>("id"));
        inaltimePereteCoalanaUsaPerete.setCellValueFactory(new PropertyValueFactory<Perete,Double>("inaltime"));
        lungimePereteColoanaUsaPerete.setCellValueFactory(new PropertyValueFactory<Perete,Double>("latime"));
        punctCardinalColoanaUsaPerete.setCellValueFactory(new PropertyValueFactory<Perete, PunctCardinal>("punctCardinal"));
        tipPereteColoanaUsaPerete.setCellValueFactory(new PropertyValueFactory<Perete, TipPerete>("tipPerete"));
    }
    private void setTableIndicesPereteStrat() {
        idColoanaStratPerete.setCellValueFactory(new PropertyValueFactory<Perete,Integer>("id"));
        inaltimePereteCoalanaStratPerete.setCellValueFactory(new PropertyValueFactory<Perete,Double>("inaltime"));
        lungimePereteColoanaStratPerete.setCellValueFactory(new PropertyValueFactory<Perete,Double>("latime"));
        punctCardinalColoanaStratPerete.setCellValueFactory(new PropertyValueFactory<Perete, PunctCardinal>("punctCardinal"));
        tipPereteColoanaStratPerete.setCellValueFactory(new PropertyValueFactory<Perete, TipPerete>("tipPerete"));
    }
    private void setTableIndicesPereteFereastra() {
        idColoanaFereastaPerete.setCellValueFactory(new PropertyValueFactory<Perete,Integer>("id"));
        inaltimePereteCoalanaFereastaPerete.setCellValueFactory(new PropertyValueFactory<Perete,Double>("inaltime"));
        lungimePereteColoanaFereastaPerete.setCellValueFactory(new PropertyValueFactory<Perete,Double>("latime"));
        punctCardinalColoanaFereastaPerete.setCellValueFactory(new PropertyValueFactory<Perete, PunctCardinal>("punctCardinal"));
        tipPereteColoanaFereastaPerete.setCellValueFactory(new PropertyValueFactory<Perete, TipPerete>("tipPerete"));
    }
    private void setTableIndicesFereastra() {
        idPereteColoanaFereastraPerete.setCellValueFactory(new PropertyValueFactory<Fereastra,Integer>("idPerete"));
        idFereastraColoana.setCellValueFactory(new PropertyValueFactory<Fereastra,Integer>("id"));
        inaltimeFereastraColoana.setCellValueFactory(new PropertyValueFactory<Fereastra,Double>("inaltime"));
        lungimeFereastraColoana.setCellValueFactory(new PropertyValueFactory<Fereastra, Double>("latime"));

    }
    private void setTableIndicesStrat() {
        idPereteColoanaStratPerete.setCellValueFactory(new PropertyValueFactory<Fereastra,Integer>("idPerete"));
        idCoalanaStartPerete.setCellValueFactory(new PropertyValueFactory<Fereastra,Integer>("id"));
        grosimeColoanaStratPerete.setCellValueFactory(new PropertyValueFactory<Fereastra,Double>("grosimea"));
        conductivitateColoanaStratPerete.setCellValueFactory(new PropertyValueFactory<Fereastra, Double>("conductivitatea"));

    }
    private void setTableIndicesuSA() {
        idPereteColoanaUsaPerete.setCellValueFactory(new PropertyValueFactory<Usa,Integer>("idPerete"));
        idCoalanaUsaPerete.setCellValueFactory(new PropertyValueFactory<Usa,Integer>("id"));
        inaltimeColoanaUsaPerete.setCellValueFactory(new PropertyValueFactory<Usa,Double>(""));
        lungimeColoanaUsaPerete.setCellValueFactory(new PropertyValueFactory<Usa, Double>("latime"));

    }
    public void setFereastraTable() {
        fereastraTableView.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                int index = fereastraTableView.getSelectionModel().getSelectedIndex();
                Fereastra fereastra = fereastraTableView.getItems().get(index);
                idPereteFereastraField.setText(String.valueOf(fereastra.getIdPerete()));
                idFereastraField.setText(String.valueOf(fereastra.getId()));
                inaltimeFereastraField.setText(String.valueOf(fereastra.getInaltime()));
                lungimeFereastraField.setText(String.valueOf(fereastra.getLatime()));
                refreshObsListPereteFereastra();
                System.out.println(fereastra);
            }
        });
    }
    public void setPereteUsaTable() {
        pereteUsaTableView.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                int index = pereteUsaTableView.getSelectionModel().getSelectedIndex();
                Perete perete = pereteUsaTableView.getItems().get(index);
                idPereteUsaField.setText(String.valueOf(perete.getId()));
                refreshObsListPereteUsa();
                refreshObsListUsa();
                System.out.println(perete);
            }
        });
    }
    public void setPereteStratTable() {
        pereteStratTableView.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                int index = pereteStratTableView.getSelectionModel().getSelectedIndex();
                Perete perete = pereteStratTableView.getItems().get(index);
                idPereteStratField.setText(String.valueOf(perete.getId()));
                refreshObsListPereteStrat();
                refreshObsListStrat();
                System.out.println(perete);
            }
        });
    }
    public void setUsaTable() {
        usaTableView.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                int index = usaTableView.getSelectionModel().getSelectedIndex();
                Usa perete = usaTableView.getItems().get(index);
                idPereteUsaField.setText(String.valueOf(perete.getIdPerete()));
                idUsaField.setText(String.valueOf(perete.getId()));
                inaltimeUsaField.setText(String.valueOf(perete.getInaltime()));
                lungimeUsaField.setText(String.valueOf(perete.getLatime()));
                refreshObsListUsa();
                System.out.println(perete);
            }
        });
    }
    public void setStratTable() {
        StratTableView.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                int index = StratTableView.getSelectionModel().getSelectedIndex();
                Strat perete = StratTableView.getItems().get(index);
                idPereteStratField.setText(String.valueOf(perete.getIdPerete()));
                idStratField.setText(String.valueOf(perete.getId()));
                grosimeStratField.setText(String.valueOf(perete.getGrosimea()));
                ConductivitateField.setText(String.valueOf(perete.getConductivitatea()));
                refreshObsListUsa();
                System.out.println(perete);
            }
        });
    }
    public void setPereteFereastraTable() {
        pereteFereastraTableView.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                int index = pereteFereastraTableView.getSelectionModel().getSelectedIndex();
                Perete perete = pereteFereastraTableView.getItems().get(index);
                idPereteFereastraField.setText(String.valueOf(perete.getId()));
                refreshObsListFereastra();
                System.out.println(perete);
            }
        });
    }
    public void refreshObsListFereastra(){

        ObservableList<Fereastra> myList =  FXCollections.observableArrayList();

        for(int i=0;i <ControllerPerete.apartament.getListaPereti().size();i++)
            if(ControllerPerete.apartament.getListaPereti().get(i).getId()==Integer.parseInt(idPereteFereastraField.getText()))
            for(Fereastra fer : ControllerPerete.apartament.getListaPereti().get(i).getListaFerestre() )
            myList.add(fer);
        fereastraTableView.setItems(myList);
        fereastraTableView.getColumns().get(0).setVisible(false);
        fereastraTableView.getColumns().get(0).setVisible(true);

    }
    public void refreshObsListUsa(){

        ObservableList<Usa> myList =  FXCollections.observableArrayList();

        for(int i=0;i <ControllerPerete.apartament.getListaPereti().size();i++)
            if(ControllerPerete.apartament.getListaPereti().get(i).getId()==Integer.parseInt(idPereteUsaField.getText()))
                for(Usa fer : ControllerPerete.apartament.getListaPereti().get(i).getListaUsa() )
                    myList.add(fer);
        usaTableView.setItems(myList);
        usaTableView.getColumns().get(0).setVisible(false);
        usaTableView.getColumns().get(0).setVisible(true);

    }
    public void refreshObsListStrat(){

        ObservableList<Strat> myList =  FXCollections.observableArrayList();

        for(int i=0;i <ControllerPerete.apartament.getListaPereti().size();i++)
            if(ControllerPerete.apartament.getListaPereti().get(i).getId()==Integer.parseInt(idPereteStratField.getText()))
                for(Strat fer : ControllerPerete.apartament.getListaPereti().get(i).getListaStraturi() )
                    myList.add(fer);
        StratTableView.setItems(myList);
        StratTableView.getColumns().get(0).setVisible(false);
        StratTableView.getColumns().get(0).setVisible(true);

    }
    public void refreshObsListPereteUsa(){

        ObservableList<Perete> myList =  FXCollections.observableArrayList();

        for(Perete per : ControllerPerete.apartament.getListaPereti())
            myList.add(per);
        pereteUsaTableView.setItems(myList);
        pereteUsaTableView.getColumns().get(0).setVisible(false);
        pereteUsaTableView.getColumns().get(0).setVisible(true);

    }
    public void refreshObsListPereteStrat(){

        ObservableList<Perete> myList =  FXCollections.observableArrayList();

        for(Perete per : ControllerPerete.apartament.getListaPereti())
            myList.add(per);
        pereteStratTableView.setItems(myList);
        pereteStratTableView.getColumns().get(0).setVisible(false);
        pereteStratTableView.getColumns().get(0).setVisible(true);

    }

    public void refreshObsListPereteFereastra(){

        ObservableList<Perete> myList =  FXCollections.observableArrayList();

        for(Perete per : ControllerPerete.apartament.getListaPereti())
            myList.add(per);
        pereteFereastraTableView.setItems(myList);
        pereteFereastraTableView.getColumns().get(0).setVisible(false);
        pereteFereastraTableView.getColumns().get(0).setVisible(true);

    }

    public boolean testFereastraFields(){
        if(fieldCheckNotNull(idFereastraField.getText())&&fieldCheckNotNull(inaltimeFereastraField.getText())&&fieldCheckNotNull(lungimeFereastraField.getText())&&fieldCheckNotNull(idPereteFereastraField.getText())){
            if(isInteger(idFereastraField.getText())&&isInteger(idPereteFereastraField.getText())&&isDouble(inaltimeFereastraField.getText())&&isDouble(lungimeFereastraField.getText())) {
                return true;
            }
        }
        return false;
    }
    public boolean testUsaFields(){
        if(fieldCheckNotNull(idPereteUsaField.getText())&&fieldCheckNotNull(idUsaField.getText())&&fieldCheckNotNull(inaltimeUsaField.getText())&&fieldCheckNotNull(lungimeUsaField.getText())){
            if(isInteger(idPereteUsaField.getText())&&isInteger(idUsaField.getText())&&isDouble(inaltimeUsaField.getText())&&isDouble(lungimeUsaField.getText())) {
                return true;
            }
        }
        return false;
    }
    public boolean testStratFields(){
        if(fieldCheckNotNull(idStratField.getText())&&fieldCheckNotNull(idPereteStratField.getText())&&fieldCheckNotNull(grosimeStratField.getText())&&fieldCheckNotNull(ConductivitateField.getText())){
            if(isInteger(idStratField.getText())&&isInteger(idPereteStratField.getText())&&isDouble(ConductivitateField.getText())&&isDouble(grosimeStratField.getText())){
            return true;}
        }
        return false;
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
    public boolean idPereteExists(int id){
        for(Perete per1 : ControllerPerete.apartament.getListaPereti()) {
            if (per1.getId() == id)
                return true;
        } {return false;}
    }

}

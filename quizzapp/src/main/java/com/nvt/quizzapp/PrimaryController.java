package com.nvt.quizzapp;

import com.nvt.utils.MyAlert;
import com.nvt.utils.themes.ManagerThemes;
import static com.nvt.utils.themes.ManagerThemes.DARK;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{
    
    @FXML private ComboBox<ManagerThemes> cbThemes; 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ManagerThemes.values()));
    }
    
    
    public void managerBt(ActionEvent e){
        MyAlert.getInstance().showAlert("Coming soon...");
    }
    
    public void pratice(ActionEvent e){
        MyAlert.getInstance().showAlert("Coming soon...");
    }
    
    public void test(ActionEvent e){
        MyAlert.getInstance().showAlert("Coming soon...");
    }
    
    public void changeTheme(ActionEvent e){
        switch (this.cbThemes.getSelectionModel().getSelectedItem()) {
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style3.css").toExternalForm());
                break;
            case LIGHT:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style2.css").toExternalForm());
                break;
            default:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style1.css").toExternalForm());
        }
    }


}

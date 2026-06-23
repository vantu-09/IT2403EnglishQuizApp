/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.utils;

import com.dht.quizappv2.App;
import com.dht.utils.themes.ThemeManager;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStateSingleton {
    
    private static MyStateSingleton instance;
    private final Stage stage ;
    private MyStateSingleton() {
        this.stage = new Stage();
        this.stage.setTitle("Quiz App");
    }
    
    public static MyStateSingleton getInstance(){
        if(instance == null){
            instance = new MyStateSingleton();
        }
        return instance;
    }
    
    public void showStage(String fxml) throws IOException{
        if(!this.stage.isShowing()){
            Scene scene = new Scene(new FXMLLoader(App.class.getResource(fxml + ".fxml")).load());
            
            ThemeManager.applyTheme(scene);
            
            this.stage.setScene(scene);
            this.stage.show();
        }
    }

}

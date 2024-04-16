package org.ozuna.chris.instituto.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import org.ozuna.chris.instituto.App;
import org.ozuna.chris.instituto.Models.DataBase1;
import org.ozuna.chris.instituto.Models.Student;

public class MenuPrincipalController {
    @FXML
    private ListView<String> tabla;
    @FXML
    void initialize(){
        DataBase1 db = (DataBase1) App.getInstitutoDescartes().getDb1();
        tabla.getItems().clear();
        tabla.getItems().add("Nombre    |   Edad");
        for (Student i: db.getAlumnos()){
            tabla.getItems().add(i.toString());
        }
    }

    @FXML
    void guardarClick(MouseEvent event){
        App.nuevaVentana(event,"Agregar", "Agrega un estudiante.");
    }

    @FXML
    void editarClick(MouseEvent event){
        App.nuevaVentana(event,"Actualizar","Editar un estudiante.");
    }
}

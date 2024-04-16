package org.ozuna.chris.instituto.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.ozuna.chris.instituto.App;
import org.ozuna.chris.instituto.Models.Gestor;
import org.ozuna.chris.instituto.Models.InstitutoDescartes;

public class ActualizarController {
    @FXML
    private TextField update;
    @FXML
    private TextField nombreTxt;
    @FXML
    private TextField edadTxt;
    @FXML
    void editarClick(){
        InstitutoDescartes institutoDescartes = App.getInstitutoDescartes();

        String cambiar = update.getText();
        String nombre = nombreTxt.getText();
        int edad = Integer.parseInt(edadTxt.getText());

        Gestor db1 = institutoDescartes.getDb1();
        Gestor db2 = institutoDescartes.getDb2();
        Gestor db3 = institutoDescartes.getDb3();
        db1.actualizar(cambiar,nombre,edad);
        db2.actualizar(cambiar,nombre,edad);
        db3.actualizar(cambiar,nombre,edad);
    }
    @FXML
    void volverClick(MouseEvent event){
        App.nuevaVentana(event,"Menu","Instituto Descartes");
    }
}

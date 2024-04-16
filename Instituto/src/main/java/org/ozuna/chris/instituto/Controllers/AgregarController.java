package org.ozuna.chris.instituto.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.ozuna.chris.instituto.App;
import org.ozuna.chris.instituto.Models.Gestor;
import org.ozuna.chris.instituto.Models.InstitutoDescartes;
import org.ozuna.chris.instituto.Models.Student;

public class AgregarController {
    @FXML
    private TextField nombreTxt;
    @FXML
    private TextField edadTxt;
    @FXML
    void guardarClick(){
        InstitutoDescartes institutoDescartes = App.getInstitutoDescartes();

        Gestor db1 = institutoDescartes.getDb1();
        Gestor db2 = institutoDescartes.getDb2();
        Gestor db3 = institutoDescartes.getDb3();

        String nombre = nombreTxt.getText();
        int edad = Integer.parseInt(edadTxt.getText());
        Student student = new Student(nombre, edad);

        db1.guardar(student);
        db2.guardar(student);
        db3.guardar(student);
    }
    @FXML
    void volverClick(MouseEvent event){
        App.nuevaVentana(event,"Menu","Instituto Descartes");
    }
}

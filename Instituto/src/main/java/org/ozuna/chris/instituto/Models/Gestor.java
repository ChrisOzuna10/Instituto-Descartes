package org.ozuna.chris.instituto.Models;

public interface Gestor {
    void guardar(Student alumnos);

    void actualizar(String update, String nombre, int edad);

}
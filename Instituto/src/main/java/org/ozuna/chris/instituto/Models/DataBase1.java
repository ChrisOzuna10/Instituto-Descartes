package org.ozuna.chris.instituto.Models;

import java.util.ArrayList;

public class DataBase1 implements Gestor {
    private ArrayList<Student> alumnos = new ArrayList<>();

    public ArrayList<Student> getAlumnos() {
        return alumnos;
    }
    @Override
    public void guardar(Student alumno) {
        alumnos.add(alumno);
        System.out.println("Registro guardado en DataBase1");
    }

    @Override
    public void actualizar(String update,String nombre, int edad) {
        for (Student e : alumnos) {
            if (update.equalsIgnoreCase(e.getNombre())){
                e.setNombre(nombre);
                e.setEdad(edad);
            }
        }
    }
}
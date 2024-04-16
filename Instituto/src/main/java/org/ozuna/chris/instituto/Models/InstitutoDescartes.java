package org.ozuna.chris.instituto.Models;

public class InstitutoDescartes {
    Gestor db1 = new DataBase1();
    Gestor db2 = new DataBase2();
    Gestor db3 = new DataBase3();

    public Gestor getDb1() {
        return db1;
    }

    public Gestor getDb2() {
        return db2;
    }

    public Gestor getDb3() {
        return db3;
    }
}

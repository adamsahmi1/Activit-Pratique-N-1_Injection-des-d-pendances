package net.sahmi.pres;

import net.sahmi.dao.DaoImpl;
import net.sahmi.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args ){
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);
        System.out.println("RES = "+ metier.calcul());
    }
}

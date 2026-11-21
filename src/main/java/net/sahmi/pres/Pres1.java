package net.sahmi.pres;

import net.sahmi.metier.MetierImpl;
import net.sahmi.ext.DaoImplV2;

public class Pres1 {
        public static void main(String[] args ){
            DaoImplV2 d = new DaoImplV2();
            MetierImpl metier = new MetierImpl(d);
            System.out.println("RES = "+ metier.calcul());
        }
}

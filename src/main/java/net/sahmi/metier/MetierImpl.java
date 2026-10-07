package net.sahmi.metier;

import net.sahmi.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // couplage faible

    @Override
    public double calcul() {
        double temp = dao.getData();
        double res ;
        res = temp * Math.PI * Math.cos(temp);
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

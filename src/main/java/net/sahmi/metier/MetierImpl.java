package net.sahmi.metier;

import net.sahmi.dao.DaoImpl;
import net.sahmi.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao; // couplage faible

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

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

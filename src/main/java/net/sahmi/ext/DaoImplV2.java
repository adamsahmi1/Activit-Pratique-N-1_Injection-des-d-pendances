package net.sahmi.ext;
import net.sahmi.dao.IDao;

public class DaoImplV2 implements IDao{
    @Override
    public double getData(){
        System.out.println("Version capteurs ...");
        double t = 12;
        return t;
    }
}

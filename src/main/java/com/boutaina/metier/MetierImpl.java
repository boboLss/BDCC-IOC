package com.boutaina.metier;

import com.boutaina.dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;

    @Override
    public double calcule() {
        double t = dao.getData();
        return t * 12 * Math.PI / 2 * Math.cos(t);
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {
        super();
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

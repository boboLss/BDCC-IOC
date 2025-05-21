package com.boutaina.metier;

import com.boutaina.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    private IDao dao;

    @Override
    public double calcule() {
        double t = dao.getData();
        return t * 12 * Math.PI / 2 * Math.cos(t);
    }

    public MetierImpl(@Qualifier("daoImpl") IDao dao) {
        this.dao = dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

package com.boutaina.presentation;

import com.boutaina.dao.DaoImpl;
import com.boutaina.metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        DaoImpl daoImpl = new DaoImpl();
        MetierImpl metier = new MetierImpl(daoImpl);
        System.out.println("Res = " + metier.calcule());
    }
}

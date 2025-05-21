package com.boutaina.presentation;

import com.boutaina.dao.IDao;
import com.boutaina.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));
        String doaoClassName = scanner.nextLine();
        Class cDao = Class.forName(doaoClassName);
        IDao dao = (IDao) cDao.newInstance();
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
//        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
//        Method setDaoMethod = cMetier.getDeclaredMethod("setDao", IDao.class);
//        setDaoMethod.invoke(metier, dao);
        System.out.println(metier.calcule());
    }
}

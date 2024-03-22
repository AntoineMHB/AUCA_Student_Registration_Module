package model;

import dao.HibernateUtil;

public class TestModel {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
    }
}

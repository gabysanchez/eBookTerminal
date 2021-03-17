package com.company.dao;

import com.company.dao.book.DAOBook;
import com.company.dao.book.DAOBookSerializable;
import com.company.dao.library.DaoLibrary;
import com.company.dao.library.DaoLibrarySerializable;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOBook daoBook;
    private DaoLibrary daoLibrary;
    private DAOFactory(){}

    public static DAOFactory getInstance() {
        if(daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    public DaoLibrary getDaoLibrary() {
        if(daoLibrary== null){
            daoLibrary= new DaoLibrarySerializable();
        }
        return daoLibrary;
    }
    public DAOBook getDAOBook(){
        if (daoBook==null){
            daoBook= new DAOBookSerializable();
        }
        return  daoBook;
    }
}

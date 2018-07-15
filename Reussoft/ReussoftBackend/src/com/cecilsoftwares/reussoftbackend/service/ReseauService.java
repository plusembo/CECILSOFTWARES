package com.cecilsoftwares.reussoftbackend.service;

import com.cecilsoftwares.reussoftbackend.dao.ReseauDao;
import com.cecilsoftwares.reussoftmiddleend.model.Reseau;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Plamedi L. Lusembo
 */
public class ReseauService {

    private static ReseauService uniqueInstance;

    public ReseauService() {
    }

    public static synchronized ReseauService getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ReseauService();
        }
        return uniqueInstance;
    }

    public List<Reseau> listerTousLesReseaux() throws ClassNotFoundException, SQLException {
        return ReseauDao.getInstance().listerTousLesReseaus();
    }

    public Reseau selectionnerReseauParId(String idReseau) throws ClassNotFoundException, SQLException {
        return ReseauDao.getInstance().selectionnerReseauParId(idReseau);
    }

    public boolean enregistrerReseau(Reseau reseau) throws ClassNotFoundException, SQLException {
        return ReseauDao.getInstance().enregistrerReseau(reseau);
    }

    public boolean exclureReseau(String idReseau) throws ClassNotFoundException, SQLException {
        return ReseauDao.getInstance().exclureReseau(idReseau);
    }

}

package com.cecilsoftwares.reussoftbackend.service;

import com.cecilsoftwares.reussoftbackend.dao.PrixAchatProduitDao;
import com.cecilsoftwares.reussoftmiddleend.model.PrixAchatProduit;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Plamedi L. Lusembo
 */
public class PrixAchatProduitService {

    private static PrixAchatProduitService uniqueInstance;

    public PrixAchatProduitService() {
    }

    public static synchronized PrixAchatProduitService getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PrixAchatProduitService();
        }
        return uniqueInstance;
    }

    public List<PrixAchatProduit> listerTousLesPrixAchatProduits() throws ClassNotFoundException, SQLException {
        return PrixAchatProduitDao.getInstance().listerTousLesPrixAchatProduits();
    }

    public PrixAchatProduit selectionnerPrixAchatProduitParCode(int codePrixAchatProduit) throws ClassNotFoundException, SQLException {
        return PrixAchatProduitDao.getInstance().selectionnerPrixAchatProduitParCode(codePrixAchatProduit);
    }

    public boolean enregistrerPrixAchatProduit(PrixAchatProduit prixAchatProduit) throws ClassNotFoundException, SQLException {
        return PrixAchatProduitDao.getInstance().enregistrerPrixAchatProduit(prixAchatProduit);
    }

}
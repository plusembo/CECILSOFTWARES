package com.cecilsoftwares.reussoftbackend.dao;

import com.cecilsoftwares.reussoftmiddleend.model.CategorieProduit;
import com.cecilsoftwares.reussoftmiddleend.model.CategorieProduit.CategorieProduitBuilder;
import com.cecilsoftwares.reussoftmiddleend.model.Produit;
import com.cecilsoftwares.reussoftmiddleend.model.Produit.ProduitBuilder;
import com.cecilsoftwares.reussoftmiddleend.model.Reseau;
import com.cecilsoftwares.reussoftmiddleend.model.Reseau.ReseauBuilder;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Plamedi L. Lusembo
 */
public class ProduitDao {

    private StringBuilder scriptSQL;
    private static ProduitDao uniqueInstance;

    public ProduitDao() {
    }

    public static synchronized ProduitDao getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ProduitDao();
        }
        return uniqueInstance;
    }

    public List<Produit> listerTousLesProduits() throws ClassNotFoundException, SQLException {
        PreparedStatement prs;
        ResultSet res;
        List<Produit> listeProduits;

        try (Connection conexao = ConnectionFactory.getInstance().habiliterConnection()) {
            listeProduits = new ArrayList();

            scriptSQL = new StringBuilder("SELECT produit.code, produit.description, produit.observation,");
            scriptSQL.append(" produit.prixAchatUSD, produit.prixAchatFC,");
            scriptSQL.append(" produit.idCategorieProduit, categorieProduit.description, categorieProduit.descriptionAbregee,");
            scriptSQL.append("  categorieProduit.observation,");
            scriptSQL.append(" produit.idReseau, reseau.nom, reseau.nomAbrege, reseau.observation,");
            scriptSQL.append(" FROM produit");
            scriptSQL.append(" LEFT JOIN categorieproduit ON produit.idCategorieProduit = categorieproduit.code");
            scriptSQL.append(" LEFT JOIN reseau ON produit.idReseau = reseau.code");

            prs = ((PreparedStatement) conexao.prepareStatement(scriptSQL.toString()));
            res = prs.executeQuery();
            if (res != null) {
                while (res.next()) {

                    Reseau reseau = new ReseauBuilder(res.getInt(8))
                            .nom(res.getString(9))
                            .nomAbrege(res.getString(10))
                            .observation(res.getString(11))
                            .build();

                    CategorieProduit categorieProduit = new CategorieProduitBuilder(res.getInt(4))
                            .description(res.getString(5))
                            .descriptionAbregee(res.getString(6))
                            .observation(res.getString(7))
                            .build();

                    Produit produit = new ProduitBuilder(res.getInt(1))
                            .description(res.getString(2))
                            .observation(res.getString(3))
                            .prixAchatUSD(new BigDecimal(res.getString(4)))
                            .prixAchatFC(new BigDecimal(res.getString(5)))
                            .reseau(reseau)
                            .categorieProduit(categorieProduit)
                            .build();

                    listeProduits.add(produit);
                }
            }
            prs.close();
            res.close();
            conexao.close();
        }
        return listeProduits;
    }

    public Produit selectionnerProduitParCode(int codeProduit) throws ClassNotFoundException, SQLException {
        PreparedStatement prs;
        ResultSet res;

        try (Connection conexao = ConnectionFactory.getInstance().habiliterConnection()) {

            scriptSQL = new StringBuilder("SELECT produit.code, produit.description, produit.observation,");
            scriptSQL.append(" produit.prixAchatUSD, produit.prixAchatFC,");
            scriptSQL.append(" produit.idCategorieProduit, categorieProduit.description, categorieProduit.descriptionAbregee,");
            scriptSQL.append("  categorieProduit.observation,");
            scriptSQL.append(" produit.idReseau, reseau.nom, reseau.nomAbrege, reseau.observation,");
            scriptSQL.append(" FROM produit");
            scriptSQL.append(" LEFT JOIN categorieproduit ON produit.idCategorieProduit = categorieproduit.code");
            scriptSQL.append(" LEFT JOIN reseau ON produit.idReseau = reseau.code");
            scriptSQL.append(" WHERE produit.code=?");

            prs = ((PreparedStatement) conexao.prepareStatement(scriptSQL.toString()));
            prs.setInt(1, codeProduit);
            res = prs.executeQuery();

            if (res != null) {
                if (res.next()) {

                    Reseau reseau = new ReseauBuilder(res.getInt(8))
                            .nom(res.getString(9))
                            .nomAbrege(res.getString(10))
                            .observation(res.getString(11))
                            .build();

                    CategorieProduit categorieProduit = new CategorieProduitBuilder(res.getInt(4))
                            .description(res.getString(5))
                            .descriptionAbregee(res.getString(6))
                            .observation(res.getString(7))
                            .build();

                    Produit produit = new ProduitBuilder(res.getInt(1))
                            .description(res.getString(2))
                            .observation(res.getString(3))
                            .prixAchatUSD(new BigDecimal(res.getString(4)))
                            .prixAchatFC(new BigDecimal(res.getString(5)))
                            .reseau(reseau)
                            .categorieProduit(categorieProduit)
                            .build();

                    prs.close();
                    res.close();
                    conexao.close();

                    return produit;
                }
            }
            prs.close();
            res.close();
            conexao.close();
        }
        return null;
    }

    public boolean enregistrerProduit(Produit produit) throws ClassNotFoundException, SQLException {
        PreparedStatement prs;

        try (Connection conexao = ConnectionFactory.getInstance().habiliterConnection()) {
            if (produit.getCode() == 0) {

                scriptSQL = new StringBuilder("INSERT INTO produit(");
                scriptSQL.append(" description, idCategorieProduit, idReseau, prixAchatUSD, prixAchatFC, observation, code");
                scriptSQL.append(" VALUES (?, ?, ?, ?, ?, ?, ?)");

            } else {

                scriptSQL = new StringBuilder("UPDATE produit");
                scriptSQL.append(" SET description=?, idCategorieProduit=?, idReseau=?, prixAchatUSD=?, prixAchatFC=?, observation=?");
                scriptSQL.append(" WHERE code=?");
            }

            prs = ((PreparedStatement) conexao.prepareStatement(scriptSQL.toString()));

            prs.setInt(1, produit.getCode());
            prs.setString(2, produit.getDescription());
            prs.setInt(3, produit.getCategorieProduit().getCode());
            prs.setInt(4, produit.getReseau().getCode());
            prs.setBigDecimal(5, produit.getPrixAchatUSD());
            prs.setBigDecimal(6, produit.getPrixAchatFC());
            prs.setString(7, produit.getObservation());

            prs.execute();
            prs.close();
            conexao.close();
        }
        return true;
    }

    public boolean exclureProduit(int codeProduit) throws ClassNotFoundException, SQLException {
        PreparedStatement prs;

        try (Connection conexao = ConnectionFactory.getInstance().habiliterConnection()) {
            scriptSQL = new StringBuilder("DELETE FROM produit WHERE code=?");

            prs = ((PreparedStatement) conexao.prepareStatement(scriptSQL.toString()));
            prs.setInt(1, codeProduit);

            prs.execute();
            prs.close();
            conexao.close();
        }

        return true;
    }
}

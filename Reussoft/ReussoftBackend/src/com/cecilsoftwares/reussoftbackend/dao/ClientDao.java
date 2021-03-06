package com.cecilsoftwares.reussoftbackend.dao;

import com.cecilsoftwares.reussoftmiddleend.model.Client;
import com.cecilsoftwares.reussoftmiddleend.model.Shop;
import com.cecilsoftwares.reussoftmiddleend.model.Shop.ShopBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Plamedi L. Lusembo
 */
public class ClientDao {

    private StringBuilder scriptSQL;
    private static ClientDao uniqueInstance;

    public ClientDao() {
    }

    public static synchronized ClientDao getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ClientDao();
        }
        return uniqueInstance;
    }

    public List<Client> listerTousLesClients() throws ClassNotFoundException, SQLException {
        PreparedStatement prs;
        ResultSet res;
        List<Client> listeClients;

        try (Connection connection = ConnectionFactory.getInstance().habiliterConnection()) {
            scriptSQL = new StringBuilder("SELECT client.id, client.nom, client.entreprise, client.telephone,");
            scriptSQL.append(" client.idShop, shop.nom, shop.adresse, shop.active");
            scriptSQL.append(" FROM client LEFT JOIN shop ON client.idShop = shop.id");
            scriptSQL.append(" ORDER BY client.nom");

            prs = ((PreparedStatement) connection.prepareStatement(scriptSQL.toString()));
            res = prs.executeQuery();

            listeClients = new ArrayList();
            if (res != null) {
                while (res.next()) {

                    Client client = new Client(res.getString(1));
                    client.setNom(res.getString(2));
                    client.setEntreprise(res.getString(3));
                    client.setTelephone(res.getString(4));

                    Shop shop = new ShopBuilder(res.getString(5))
                            .withNom(res.getString(6))
                            .withAdresse(res.getString(7))
                            .withActive(res.getInt(8) == 0)
                            .create();

                    client.setShop(shop);

                    listeClients.add(client);
                }
            }
            prs.close();
            res.close();
            connection.close();
        }
        return listeClients;
    }

    public Client selectionnerClientParId(String idClient) throws ClassNotFoundException, SQLException {
        PreparedStatement prs;
        ResultSet res;

        try (Connection connection = ConnectionFactory.getInstance().habiliterConnection()) {
            scriptSQL = new StringBuilder("SELECT client.id, client.nom, client.entreprise, client.telephone,");
            scriptSQL.append(" client.idShop, shop.nom, shop.adresse, shop.active");
            scriptSQL.append(" FROM client LEFT JOIN shop ON client.idShop = shop.id");
            scriptSQL.append(" WHERE client.id=?");

            prs = ((PreparedStatement) connection.prepareStatement(scriptSQL.toString()));
            prs.setString(1, idClient);
            res = prs.executeQuery();

            if (res != null) {
                if (res.next()) {

                    Client client = new Client(res.getString(1));
                    client.setNom(res.getString(2));
                    client.setEntreprise(res.getString(3));
                    client.setTelephone(res.getString(4));

                    Shop shop = new ShopBuilder(res.getString(5))
                            .withNom(res.getString(6))
                            .withAdresse(res.getString(7))
                            .withActive(res.getInt(8) == 0)
                            .create();

                    client.setShop(shop);

                    prs.close();
                    res.close();
                    connection.close();

                    return client;
                }
            }
            prs.close();
            res.close();
            connection.close();
        }
        return null;
    }

    public boolean enregistrerClient(Client client) throws ClassNotFoundException, SQLException {
        PreparedStatement prs;

        try (Connection connection = ConnectionFactory.getInstance().habiliterConnection()) {

            scriptSQL = new StringBuilder("INSERT INTO client(");
            scriptSQL.append(" nom, entreprise, telephone, idShop, id )");
            scriptSQL.append(" VALUES (?, ?, ?, ?, ?)");

            prs = ((PreparedStatement) connection.prepareStatement(scriptSQL.toString()));

            prs.setString(1, client.getNom());
            prs.setString(2, client.getEntreprise());
            prs.setString(3, client.getTelephone());
            prs.setString(4, client.getShop().getId());
            prs.setString(5, client.getId());

            prs.execute();
            prs.close();
            connection.close();
        }
        return true;
    }

    public boolean actualiserClient(Client client) throws ClassNotFoundException, SQLException {
        PreparedStatement prs;

        try (Connection connection = ConnectionFactory.getInstance().habiliterConnection()) {

            scriptSQL = new StringBuilder("UPDATE client");
            scriptSQL.append(" SET nom=?, entreprise=?, telephone=?, idShop=?");
            scriptSQL.append(" WHERE id=?");
            prs = ((PreparedStatement) connection.prepareStatement(scriptSQL.toString()));

            prs.setString(1, client.getNom());
            prs.setString(2, client.getEntreprise());
            prs.setString(3, client.getTelephone());
            prs.setString(4, client.getShop().getId());
            prs.setString(5, client.getId());

            prs.execute();
            prs.close();
            connection.close();
        }
        return true;
    }

    public boolean exclureClient(String idClient) throws ClassNotFoundException, SQLException {
        PreparedStatement prs;

        try (Connection connection = ConnectionFactory.getInstance().habiliterConnection()) {
            scriptSQL = new StringBuilder("DELETE FROM client WHERE id=?");

            prs = ((PreparedStatement) connection.prepareStatement(scriptSQL.toString()));
            prs.setString(1, idClient);
            prs.execute();

            prs.close();
            connection.close();
        }

        return true;
    }

}

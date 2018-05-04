package com.cecilsoftwares.reussoftbackend.model;

import com.cecilsoftwares.reussoft.enumarable.DispatchEnum;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Plamedi L. Lusembo
 */
public class SortieStock {

    private final int code;
    private final Produit produit;
    private final Shop shop;
    private final Client client;
    private final DispatchEnum dispatchEnum;
    private final BigDecimal prixUSD;
    private final BigDecimal prixFC;
    private final TauxCarte tauxCarte;
    private final int quantiteProduit;
    private final Date dateHeure;

    public SortieStock(SortieStockBuilder sortieStockBuilder) {
        code = sortieStockBuilder.code;
        produit = sortieStockBuilder.produit;
        shop = sortieStockBuilder.shop;
        client = sortieStockBuilder.client;
        dispatchEnum = sortieStockBuilder.dispatchEnum;
        prixUSD = sortieStockBuilder.prixUSD;
        prixFC = sortieStockBuilder.prixFC;
        tauxCarte = sortieStockBuilder.tauxCarte;
        quantiteProduit = sortieStockBuilder.quantiteProduit;
        dateHeure = sortieStockBuilder.dateHeure;
    }

    public int getCode() {
        return code;
    }

    public Produit getProduit() {
        return produit;
    }

    public Shop getShop() {
        return shop;
    }

    public Client getClient() {
        return client;
    }

    public DispatchEnum getDispatchEnum() {
        return dispatchEnum;
    }

    public BigDecimal getPrixUSD() {
        return prixUSD;
    }

    public BigDecimal getPrixFC() {
        return prixFC;
    }

    public TauxCarte getTauxCarte() {
        return tauxCarte;
    }

    public int getQuantiteProduit() {
        return quantiteProduit;
    }

    public Date getDateHeure() {
        return dateHeure;
    }

    public static class SortieStockBuilder {

        private int code;
        private Produit produit;
        private Shop shop;
        private Client client;
        private DispatchEnum dispatchEnum;
        private BigDecimal prixUSD;
        private BigDecimal prixFC;
        private TauxCarte tauxCarte;
        private int quantiteProduit;
        private Date dateHeure;

        public SortieStockBuilder(int code) {
            this.code = code;
        }

        public SortieStockBuilder produit(Produit produit) {
            this.produit = produit;
            return this;
        }

        public SortieStockBuilder shop(Shop shop) {
            this.shop = shop;
            return this;
        }

        public SortieStockBuilder client(Client client) {
            this.client = client;
            return this;
        }

        public SortieStockBuilder dispatchEnum(DispatchEnum dispatchEnum) {
            this.dispatchEnum = dispatchEnum;
            return this;
        }

        public SortieStockBuilder prixUSD(BigDecimal prixUSD) {
            this.prixUSD = prixUSD;
            return this;
        }

        public SortieStockBuilder prixFC(BigDecimal prixFC) {
            this.prixFC = prixFC;
            return this;
        }

        public SortieStockBuilder tauxCarte(TauxCarte tauxCarte) {
            this.tauxCarte = tauxCarte;
            return this;
        }

        public SortieStockBuilder quantiteProduit(int quantiteProduit) {
            this.quantiteProduit = quantiteProduit;
            return this;
        }

        public SortieStockBuilder dateHeure(Date dateHeure) {
            this.dateHeure = dateHeure;
            return this;
        }

        public SortieStock build() {
            return new SortieStock(this);
        }

    }

}

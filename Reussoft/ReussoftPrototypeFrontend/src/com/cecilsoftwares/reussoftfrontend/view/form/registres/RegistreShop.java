package com.cecilsoftwares.reussoftfrontend.view.form.registres;

import com.cecilsoftwares.reussoftbackend.module.RegistreShopModule;
import com.cecilsoftwares.reussoftbackend.service.ShopService;
import com.cecilsoftwares.reussoftfrontend.view.dialog.ConsultationShop;
import com.cecilsoftwares.reussoftfrontend.view.component.JCustomTextField;
import com.cecilsoftwares.reussoftmiddleend.dto.ShopDTO;
import com.cecilsoftwares.reussoftmiddleend.dto.ShopDTO.ShopDTOBuilder;
import com.cecilsoftwares.reussoftmiddleend.model.Shop;
import com.cecilsoftwares.reussoftmiddleend.model.Shop.ShopBuilder;
import com.cecilsoftwares.reussoftmiddleend.util.Notification;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.awt.Cursor;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 * @author Plamedi L. Lusembo
 */
public class RegistreShop extends JInternalFrame {

    private String idShop;
    private boolean modeEdition;
    private boolean btnConsulterShopClickable;
    private boolean btnEnregistrerClickable;
    private boolean btnExclureClickable;
    private boolean btnAnnulerClickable;

    public RegistreShop() {
        initComponents();

        tfdNumero.setMaximumLength(10);
        tfdNumero.setRegexFilter("\\d+");

        effacerFormulaire();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfdNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfdAvenue = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfdQuartier = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfdCommune = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfdDistrict = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbxProvince = new javax.swing.JComboBox<>();
        tfdNumero = new JCustomTextField();
        chbActiver = new javax.swing.JCheckBox();
        btnEnregistrer = new javax.swing.JButton();
        btnEffacerFormulaire = new javax.swing.JButton();
        btnConsulterShop = new javax.swing.JButton();
        btnExclure = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registre de Shop");

        jLabel2.setText("Nom:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Adresse"));

        jLabel3.setText("Avenue:");

        jLabel5.setText("Nº:");

        jLabel6.setText("Quartier:");

        jLabel7.setText("Commune:");

        jLabel8.setText("District:");

        jLabel9.setText("Province:");

        cbxProvince.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kinshasa", "Kasaï", "Kongo-Central" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(tfdQuartier)
                            .addComponent(cbxProvince, 0, 250, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfdDistrict)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(232, 232, 232))
                            .addComponent(tfdCommune))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tfdAvenue, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tfdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdAvenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdQuartier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        chbActiver.setText("Activer");

        btnEnregistrer.setText("ENREGISTRER");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        btnEffacerFormulaire.setText("EFFACER");
        btnEffacerFormulaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffacerFormulaireActionPerformed(evt);
            }
        });

        btnConsulterShop.setText("...");
        btnConsulterShop.setFocusable(false);
        btnConsulterShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulterShopActionPerformed(evt);
            }
        });

        btnExclure.setText("EXCLURE");
        btnExclure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExclureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExclure, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEffacerFormulaire, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(chbActiver)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfdNom, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnConsulterShop))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulterShop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(chbActiver)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEffacerFormulaire, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExclure, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEffacerFormulaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffacerFormulaireActionPerformed
        effacerFormulaire();
    }//GEN-LAST:event_btnEffacerFormulaireActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed

        if (!btnEnregistrerClickable || !isInformationObligatoiresRemplies()) {
            return;
        }

        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        habiliterComposantFormulaire(false);

        String adresse = new StringBuilder(tfdAvenue.getText())
                .append("@").append(tfdNumero.getText())
                .append("@").append(tfdQuartier.getText())
                .append("@").append(tfdCommune.getText())
                .append("@").append(cbxProvince.getSelectedItem().toString())
                .append("@").append(tfdDistrict.getText())
                .toString();

        Shop shop = new ShopBuilder(idShop)
                .withNom(tfdNom.getText())
                .withAdresse(adresse)
                .withActive(modeEdition ? chbActiver.isSelected() : true)
                .create();

        ShopDTO shopDTO = new ShopDTOBuilder(shop.getId())
                .withShopNom(shop.getNom())
                .withShopAdresse(shop.getAdresse())
                .withShopActive(shop.isActive())
                .create();

        Gson gson = new GsonBuilder().create();

        //Here saving shop
        Notification notification = RegistreShopModule.getInstance().saveShop(gson.toJson(shopDTO));

        if (notification.isSucess()) {
            effacerFormulaire();
        }

        JOptionPane.showMessageDialog(null, notification);
        setCursor(Cursor.getDefaultCursor());
        habiliterComposantFormulaire(false);

        if (notification.isExitSystemRequest()) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void btnConsulterShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulterShopActionPerformed
        if (!btnConsulterShopClickable) {
            return;
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        habiliterComposantFormulaire(false);

        try {

            ConsultationShop consultationShop = new ConsultationShop(null, true, ShopService.getInstance().listerTousLesShops());
            consultationShop.setFrameAncetre(this);
            consultationShop.setVisible(true);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConsultationShop.class.getName()).log(Level.SEVERE, null, ex);
        }

        habiliterComposantFormulaire(true);
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnConsulterShopActionPerformed

    public void shopSelectionne(Shop shop) {
        if (shop == null) {
            return;
        }
        idShop = shop.getId();
        tfdNom.setText(shop.getNom());

        String[] adresse = shop.getAdresse().split("@");
        tfdAvenue.setText(adresse[0]);
        tfdNumero.setText(adresse[1]);
        tfdQuartier.setText(adresse[2]);
        tfdCommune.setText(adresse[3]);
        switch (adresse[4]) {
            case "Kinshasa":
                cbxProvince.setSelectedIndex(0);
                break;
            case "Kasaï":
                cbxProvince.setSelectedIndex(1);
                break;
            case "Kongo-Central":
                cbxProvince.setSelectedIndex(2);
                break;
        }
        tfdDistrict.setText(adresse[5]);

        chbActiver.setVisible(true);
        chbActiver.setSelected(shop.isActive());
        btnEnregistrer.setText("ACTUALISER");
        btnExclure.setEnabled(true);
        modeEdition = true;
    }

    private void btnExclureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExclureActionPerformed

        Object[] options = {"Exclure", "Annuler"};
        int n = JOptionPane.showOptionDialog(this,
                "Êtes-vous sûr de vouloir exclure définitivement ce shop?",
                "Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, //do not use a custom Icon
                options, //the titles of buttons
                options[0]); //default button title

        if (n == 0) {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            habiliterComposantFormulaire(false);

            Shop shop = new ShopBuilder(idShop).create();
            ShopDTO shopDTO = new ShopDTOBuilder(shop.getId()).create();

            Gson gson = new GsonBuilder().create();

            Notification notification = RegistreShopModule.getInstance().deleteShop(gson.toJson(shopDTO));

            if (notification.isSucess()) {
                effacerFormulaire();
            }
            JOptionPane.showMessageDialog(null, notification);

            setCursor(Cursor.getDefaultCursor());
            habiliterComposantFormulaire(true);
        }
    }//GEN-LAST:event_btnExclureActionPerformed

    private void habiliterComposantFormulaire(boolean hcf) {
        tfdNom.setEditable(hcf);
        tfdAvenue.setEditable(hcf);
        tfdNumero.setEditable(hcf);
        tfdQuartier.setEditable(hcf);
        tfdCommune.setEditable(hcf);
        tfdDistrict.setEditable(hcf);
        chbActiver.setEnabled(hcf);
        cbxProvince.setEnabled(hcf);
        btnConsulterShopClickable = hcf;
        btnEnregistrerClickable = hcf;
        btnAnnulerClickable = hcf;
    }

    private void effacerFormulaire() {
        idShop = "";
        tfdNom.setText("");
        tfdNom.requestFocus();
        tfdAvenue.setText("");
        tfdNumero.setText("");
        tfdQuartier.setText("");
        tfdCommune.setText("");
        cbxProvince.setSelectedIndex(0);
        tfdDistrict.setText("");
        chbActiver.setVisible(false);
        chbActiver.setSelected(true);
        modeEdition = false;
        btnEnregistrer.setText("ENREGISTRER");
        habiliterComposantFormulaire(true);
        btnExclure.setEnabled(false);
    }

    private boolean isInformationObligatoiresRemplies() {

        StringBuilder notification = new StringBuilder();
        Queue<Integer> nio = new LinkedList<>();

        if (tfdNom.getText().isEmpty()) {
            notification.append("\nNom");
            nio.add(1);
        }
        if (tfdAvenue.getText().isEmpty()) {
            notification.append("\nAvenue");
            nio.add(2);
        }
        if (tfdNumero.getText().isEmpty()) {
            notification.append("\nNuméro");
            nio.add(3);
        }

        if (tfdQuartier.getText().isEmpty()) {
            notification.append("\nQuartier");
            nio.add(4);
        }
        if (tfdCommune.getText().isEmpty()) {
            notification.append("\nCommune");
            nio.add(5);
        }

        if (notification.toString().isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, new StringBuilder(nio.size() > 1 ? "Informations obligatoires:" : "Information obligatoire:")
                    .append(notification));
            switch (nio.poll()) {
                case 1:
                    tfdNom.requestFocus();
                    break;

                case 2:
                    tfdAvenue.requestFocus();
                    break;
                case 3:
                    tfdNumero.requestFocus();
                    break;

                case 4:
                    tfdQuartier.requestFocus();
                    break;
                case 5:
                    tfdCommune.requestFocus();
                    break;
                default:
            }
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulterShop;
    private javax.swing.JButton btnEffacerFormulaire;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnExclure;
    private javax.swing.JComboBox<String> cbxProvince;
    private javax.swing.JCheckBox chbActiver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfdAvenue;
    private javax.swing.JTextField tfdCommune;
    private javax.swing.JTextField tfdDistrict;
    private javax.swing.JTextField tfdNom;
    private JCustomTextField tfdNumero;
    private javax.swing.JTextField tfdQuartier;
    // End of variables declaration//GEN-END:variables
}

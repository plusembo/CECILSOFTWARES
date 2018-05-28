package com.cecilsoftwares.reussoftfrontend.form;

import com.cecilsoftwares.reussoftbackend.service.CollaborateurService;
import com.cecilsoftwares.reussoftfrontend.dialog.ConsultationCollaborateur;
import com.cecilsoftwares.reussoftfrontend.dialog.ConsultationShop;
import com.cecilsoftwares.reussoftfrontend.dialog.RegistreUtilisateur;
import com.cecilsoftwares.reussoftmiddleend.model.Collaborateur;
import com.cecilsoftwares.reussoftmiddleend.model.Collaborateur.CollaborateurBuilder;
import com.cecilsoftwares.reussoftmiddleend.model.Shop;
import com.cecilsoftwares.reussoftmiddleend.model.Shop.ShopBuilder;
import com.cecilsoftwares.reussoftmiddleend.model.Utilisateur;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 * @author Plamedi L. Lusembo
 */
public class RegistreCollaborateur extends JInternalFrame {

    private Utilisateur utilisateur;

    public RegistreCollaborateur() {
        initComponents();
        effacerFormulaire();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfdCode = new javax.swing.JTextField();
        btnConsulterCollaborateur = new javax.swing.JButton();
        tfdPrenom = new javax.swing.JTextField();
        tfdNom = new javax.swing.JTextField();
        tfdPostnom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfdSurnom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfdIdUtilisateur = new javax.swing.JTextField();
        btnCreerUtilisateur = new javax.swing.JButton();
        lblNomUtilisateur = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObservation = new javax.swing.JTextArea();
        chbActiver = new javax.swing.JCheckBox();
        btnAnnuler = new javax.swing.JButton();
        btnEnregistrer = new javax.swing.JButton();
        tfdIdShop = new javax.swing.JTextField();
        btnConsulterShop = new javax.swing.JButton();
        lblDescriptionShop = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registre de Collaborateur");

        jLabel1.setText("Code:");

        jLabel2.setText("Prénom:");

        jLabel3.setText("Nom:");

        jLabel4.setText("Surnom:");

        jLabel5.setText("Shop:");

        btnConsulterCollaborateur.setText("...");
        btnConsulterCollaborateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulterCollaborateurActionPerformed(evt);
            }
        });

        jLabel6.setText("Postnom:");

        jLabel7.setText("Utilisateur:");

        tfdIdUtilisateur.setEditable(false);

        btnCreerUtilisateur.setText("Créer");
        btnCreerUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerUtilisateurActionPerformed(evt);
            }
        });

        lblNomUtilisateur.setText("nomUtilisateur");

        jLabel9.setText("Observation:");

        txaObservation.setColumns(20);
        txaObservation.setRows(5);
        jScrollPane1.setViewportView(txaObservation);

        chbActiver.setText("Activer");

        btnAnnuler.setText("ANNULER");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        btnEnregistrer.setText("ENREGISTRER");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        tfdIdShop.setEditable(false);

        btnConsulterShop.setText("...");
        btnConsulterShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulterShopActionPerformed(evt);
            }
        });

        lblDescriptionShop.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfdIdShop, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsulterShop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescriptionShop))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chbActiver)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfdIdUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCreerUtilisateur)
                                .addGap(18, 18, 18)
                                .addComponent(lblNomUtilisateur))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfdSurnom)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfdCode, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnConsulterCollaborateur))
                                    .addComponent(tfdPrenom))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdNom, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(tfdPostnom, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulterCollaborateur))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdPostnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdSurnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdIdShop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulterShop)
                    .addComponent(lblDescriptionShop))
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdIdUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreerUtilisateur)
                    .addComponent(lblNomUtilisateur))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(chbActiver)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnEnregistrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        effacerFormulaire();
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed

        Shop shop = new ShopBuilder(Integer.parseInt(tfdIdShop.getText())).build();
        Collaborateur collaborateur = new CollaborateurBuilder(Integer.parseInt(tfdCode.getText()))
                .prenom(tfdPrenom.getText())
                .nom(tfdNom.getText())
                .postnom(tfdPostnom.getText())
                .surnom(tfdSurnom.getText())
                .shop(shop)
                .utilisateur(this.utilisateur)
                .observation(txaObservation.getText())
                .active(true)
                .build();

        try {
            if (CollaborateurService.getInstance().enregistrerCollaborateur(collaborateur)) {
                effacerFormulaire();
                JOptionPane.showMessageDialog(null, "Sauvegarde effectuée avec succès");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Une faille est survenue en sauvegardant le Collaborateur");
            Logger.getLogger(RegistreShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    public void collaborateurSelectionne(Collaborateur collaborateur) {
        tfdCode.setText(String.valueOf(collaborateur.getCode()));
        tfdPrenom.setText(collaborateur.getPrenom());
        tfdNom.setText(collaborateur.getNom());
        tfdPostnom.setText(collaborateur.getPostnom());
        tfdSurnom.setText(collaborateur.getSurnom());
        tfdIdShop.setText(String.valueOf(collaborateur.getShop().getCode()));
        lblDescriptionShop.setText(collaborateur.getShop().getNom());
        tfdIdUtilisateur.setText(String.valueOf(collaborateur.getUtilisateur().getCode()));
        lblNomUtilisateur.setText(collaborateur.getUtilisateur().getNom());
        txaObservation.setText(collaborateur.getObservation());
        chbActiver.setVisible(true);
        chbActiver.setSelected(collaborateur.isActive());
    }

    public void shopSelectionne(Shop shop) {
        tfdIdShop.setText(String.valueOf(shop.getCode()));
        lblDescriptionShop.setText(shop.getNom());
    }
    private void btnCreerUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerUtilisateurActionPerformed
        RegistreUtilisateur registreUtilisateur = new RegistreUtilisateur(null, true);
        registreUtilisateur.setRegistreCollaborateur(this);
        registreUtilisateur.setUtilisateur(getUtilisateur());
        registreUtilisateur.setVisible(true);
        if (this.utilisateur != null) {
            tfdIdUtilisateur.setText(String.valueOf(this.utilisateur.getCode()));
            lblNomUtilisateur.setText(this.utilisateur.getNom());
        }
    }//GEN-LAST:event_btnCreerUtilisateurActionPerformed

    private void btnConsulterCollaborateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulterCollaborateurActionPerformed
        ConsultationCollaborateur consultationCollaborateur = new ConsultationCollaborateur(null, true);
        consultationCollaborateur.setFrameAncetre(this);
        consultationCollaborateur.setVisible(true);
    }//GEN-LAST:event_btnConsulterCollaborateurActionPerformed

    private void btnConsulterShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulterShopActionPerformed
        ConsultationShop consultationShop = new ConsultationShop(null, true);
        consultationShop.setFrameAncetre(this);
        consultationShop.setVisible(true);
    }//GEN-LAST:event_btnConsulterShopActionPerformed

    private void effacerFormulaire() {
        tfdCode.setText("");
        tfdCode.requestFocus();
        tfdPrenom.setText("");
        tfdNom.setText("");
        tfdPostnom.setText("");
        tfdSurnom.setText("");
        tfdIdShop.setText("");
        lblDescriptionShop.setText("");
        tfdIdUtilisateur.setText("");
        lblNomUtilisateur.setText("");
        txaObservation.setText("");
        chbActiver.setVisible(false);
        chbActiver.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnConsulterCollaborateur;
    private javax.swing.JButton btnConsulterShop;
    private javax.swing.JButton btnCreerUtilisateur;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JCheckBox chbActiver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescriptionShop;
    private javax.swing.JLabel lblNomUtilisateur;
    private javax.swing.JTextField tfdCode;
    private javax.swing.JTextField tfdIdShop;
    private javax.swing.JTextField tfdIdUtilisateur;
    private javax.swing.JTextField tfdNom;
    private javax.swing.JTextField tfdPostnom;
    private javax.swing.JTextField tfdPrenom;
    private javax.swing.JTextField tfdSurnom;
    private javax.swing.JTextArea txaObservation;
    // End of variables declaration//GEN-END:variables
}

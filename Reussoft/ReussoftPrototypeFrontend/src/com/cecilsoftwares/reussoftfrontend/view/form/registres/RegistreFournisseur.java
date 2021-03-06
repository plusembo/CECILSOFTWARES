package com.cecilsoftwares.reussoftfrontend.view.form.registres;

import com.cecilsoftwares.reussoftbackend.service.FournisseurService;
import com.cecilsoftwares.reussoftfrontend.view.dialog.ConsultationFournisseur;
import com.cecilsoftwares.reussoftmiddleend.model.Fournisseur;
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
public class RegistreFournisseur extends JInternalFrame {

    private String idFournisseur;
    private boolean modeEdition;
    private boolean btnConsulterFournisseurClickable;
    private boolean btnEnregistrerClickable;
    private boolean btnExclureClickable;
    private boolean btnAnnulerClickable;

    public RegistreFournisseur() {
        initComponents();
        effacerFormulaire();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnConsulterFournisseur = new javax.swing.JButton();
        tfdEntreprise = new javax.swing.JTextField();
        tfdResponsable = new javax.swing.JTextField();
        tfdTelephone = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(##) ####-####");
            tfdTelephone = new javax.swing.JFormattedTextField(telefone);
        }catch(Exception e){
        }
        btnEffacerFormulaire = new javax.swing.JButton();
        btnEnregistrer = new javax.swing.JButton();
        btnExclure = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registre de Fournisseur");

        jLabel2.setText("Entreprise:");

        jLabel3.setText("Responsable:");

        jLabel4.setText("Téléphone:");

        btnConsulterFournisseur.setText("...");
        btnConsulterFournisseur.setFocusable(false);
        btnConsulterFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulterFournisseurActionPerformed(evt);
            }
        });

        btnEffacerFormulaire.setText("EFFACER");
        btnEffacerFormulaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffacerFormulaireActionPerformed(evt);
            }
        });

        btnEnregistrer.setText("ENREGISTRER");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(tfdResponsable)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(tfdEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnConsulterFournisseur))
                        .addComponent(tfdTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExclure, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEffacerFormulaire, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulterFournisseur))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEffacerFormulaire, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExclure, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
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

        Fournisseur fournisseur = new Fournisseur(idFournisseur);
        fournisseur.setEntreprise(tfdEntreprise.getText());
        fournisseur.setResponsable(tfdResponsable.getText());
        fournisseur.setTelephone(tfdTelephone.getText().replace("(", "").replace(")", "").replace(" ", "").replace("-", ""));
        try {
            if (FournisseurService.getInstance().enregistrerFournisseur(fournisseur)) {
                String notification = modeEdition ? "Actualisation effectuée avec succès" : "Sauvegarde effectuée avec succès";
                effacerFormulaire();
                JOptionPane.showMessageDialog(null, notification);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Une faille est survenue en sauvegardant le Fournisseur");
            Logger.getLogger(RegistreShop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RegistreFournisseur.class.getName()).log(Level.SEVERE, null, ex);
        }

        setCursor(Cursor.getDefaultCursor());

    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void btnConsulterFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulterFournisseurActionPerformed
        if (!btnConsulterFournisseurClickable) {
            return;
        }

        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        habiliterComposantFormulaire(false);

        try {
            ConsultationFournisseur consultationFournisseur = new ConsultationFournisseur(null, true, FournisseurService.getInstance()
                    .listerTousLesFournisseurs());
            consultationFournisseur.setFrameAncetre(this);
            consultationFournisseur.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConsultationFournisseur.class.getName()).log(Level.SEVERE, null, ex);
        }
        habiliterComposantFormulaire(true);
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnConsulterFournisseurActionPerformed

    public void fournisseurSelectionne(Fournisseur fournisseur) {
        if (fournisseur == null) {
            return;
        }
        idFournisseur = fournisseur.getId();
        tfdResponsable.setText(fournisseur.getResponsable());
        tfdTelephone.setText(fournisseur.getTelephone());
        tfdEntreprise.setText(fournisseur.getEntreprise());
        btnEnregistrer.setText("ACTUALISER");
        modeEdition = true;
        btnExclure.setEnabled(true);
    }

    private void btnExclureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExclureActionPerformed
        Object[] options = {"Exclure", "Annuler"};
        int n = JOptionPane.showOptionDialog(this,
                "Êtes-vous sûr de vouloir exclure définitivement ce fournisseur?",
                "Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, //do not use a custom Icon
                options, //the titles of buttons
                options[0]); //default button title

        if (n == 0) {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            habiliterComposantFormulaire(false);
            try {
                FournisseurService.getInstance().exclureFournisseur(idFournisseur);
                effacerFormulaire();
                JOptionPane.showMessageDialog(null, "Exclusion effectuée avec succès");
            } catch (SQLException ex) {
                StringBuilder notification = new StringBuilder("Une faille est survenue lors de l'exclusion du fournisseur :(");
                switch (ex.getErrorCode()) {
                    case 1451:
                        notification.append("\n\nCe fournisseur est utilisé par un autre registre!");
                        break;
                    default:
                        break;
                }
                JOptionPane.showMessageDialog(null, notification);
                habiliterComposantFormulaire(true);
                Logger.getLogger(RegistreShop.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Une faille est survenue lors de l'exclusion du fournisseur :(");
                habiliterComposantFormulaire(true);
            } finally {
                setCursor(Cursor.getDefaultCursor());
            }
        }
    }//GEN-LAST:event_btnExclureActionPerformed

    private void effacerFormulaire() {
        idFournisseur = "";
        tfdEntreprise.setText("");
        tfdEntreprise.requestFocus();
        tfdResponsable.setText("");
        tfdTelephone.setText("");
        modeEdition = false;
        btnEnregistrer.setText("ENREGISTRER");
        habiliterComposantFormulaire(true);
        btnExclure.setEnabled(false);
    }

    private void habiliterComposantFormulaire(boolean hcf) {
        tfdEntreprise.setEditable(hcf);
        tfdResponsable.setEditable(hcf);
        tfdTelephone.setEditable(hcf);
        btnConsulterFournisseurClickable = hcf;
        btnEnregistrerClickable = hcf;
        btnAnnulerClickable = hcf;
    }

    private boolean isInformationObligatoiresRemplies() {

        StringBuilder notification = new StringBuilder();
        Queue<Integer> nio = new LinkedList<>();

        if (tfdEntreprise.getText().isEmpty()) {
            notification.append("\nEntreprise");
            nio.add(1);
        }
        if (tfdResponsable.getText().isEmpty()) {
            notification.append("\nResponsable");
            nio.add(2);
        }
        if (tfdTelephone.getText().isEmpty()) {
            notification.append("\nTéléphone");
            nio.add(3);
        }

        if (notification.toString().isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, new StringBuilder(nio.size() > 1 ? "Informations obligatoires:" : "Information obligatoire:")
                    .append(notification));
            switch (nio.poll()) {
                case 1:
                    tfdEntreprise.requestFocus();
                    break;

                case 2:
                    tfdResponsable.requestFocus();
                    break;
                case 3:
                    tfdTelephone.requestFocus();
                    break;

                default:
            }
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulterFournisseur;
    private javax.swing.JButton btnEffacerFormulaire;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnExclure;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfdEntreprise;
    private javax.swing.JTextField tfdResponsable;
    private javax.swing.JTextField tfdTelephone;
    // End of variables declaration//GEN-END:variables
}

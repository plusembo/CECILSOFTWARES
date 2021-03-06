package com.cecilsoftwares.reussoftfrontend.view.form.configurations;

import com.cecilsoftwares.reussoftfrontend.view.form.registres.RegistreShop;
import com.cecilsoftwares.reussoftbackend.service.CollaborateurService;
import com.cecilsoftwares.reussoftbackend.service.ProfilUtilisateurService;
import com.cecilsoftwares.reussoftfrontend.view.dialog.ConsultationProfilUtilisateur;
import com.cecilsoftwares.reussoftmiddleend.ks.SessionUtilisateurKS;
import com.cecilsoftwares.reussoftmiddleend.model.Collaborateur;
import com.cecilsoftwares.reussoftmiddleend.model.ProfilUtilisateur;
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
public class ConfigurationCompte extends JInternalFrame {

    private String idCollaborateur;
    private String idProfilUtilisateur;
    private boolean btnConsulterCollaborateurClickable;
    private boolean btnConsulterProfilUtilisateurClickable;
    private boolean btnEnregistrerClickable;
    private boolean btnEffacerFormulaireClickable;

    public ConfigurationCompte() {
        initComponents();
        effacerFormulaire();

        collaborateurSelectionne(SessionUtilisateurKS.getInstance().getSessionUtilisateur().getCollaborateur());

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfdPrenom = new javax.swing.JTextField();
        tfdNom = new javax.swing.JTextField();
        tfdPostnom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfdSurnom = new javax.swing.JTextField();
        btnEffacerFormulaire = new javax.swing.JButton();
        btnEnregistrer = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tfdNomUtilisateur = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfdDescriptionProfilUtilisateur = new javax.swing.JTextField();
        btnConsulterProfilUtilisateur = new javax.swing.JButton();
        pwfMotDePasse = new javax.swing.JPasswordField();
        pwfConfirmerMotDePasse = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuration du compte");

        jLabel2.setText("Prénom:");

        jLabel3.setText("Nom:");

        jLabel4.setText("Surnom:");

        jLabel6.setText("Postnom:");

        btnEffacerFormulaire.setText("EFFACER");
        btnEffacerFormulaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffacerFormulaireActionPerformed(evt);
            }
        });

        btnEnregistrer.setText("ACTUALISER");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Utilisateur"));

        tfdNomUtilisateur.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfdNomUtilisateurFocusGained(evt);
            }
        });

        jLabel7.setText("Nom d'utilisateur:");

        jLabel1.setText("Mot de passe:");

        jLabel8.setText("Confirmer mot de passe:");

        tfdDescriptionProfilUtilisateur.setEditable(false);

        btnConsulterProfilUtilisateur.setText("...");
        btnConsulterProfilUtilisateur.setFocusable(false);
        btnConsulterProfilUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulterProfilUtilisateurActionPerformed(evt);
            }
        });

        jLabel9.setText("Profil d'utilisateur:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdNomUtilisateur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(tfdDescriptionProfilUtilisateur, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsulterProfilUtilisateur)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pwfMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(pwfConfirmerMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdNomUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwfMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwfConfirmerMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel9)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDescriptionProfilUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulterProfilUtilisateur))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfdSurnom)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(tfdPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tfdNom, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfdPostnom, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEffacerFormulaire, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdPostnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(tfdSurnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEffacerFormulaire, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEffacerFormulaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffacerFormulaireActionPerformed
        effacerFormulaire();
    }//GEN-LAST:event_btnEffacerFormulaireActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed

        if (!btnEnregistrerClickable || !isInformationObligatoiresRemplies() || !isMotdePasseConfirme()) {
            return;
        }

        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        habiliterComposantFormulaire(false);

        Collaborateur collaborateur = new Collaborateur(idCollaborateur);
        collaborateur.setPrenom(tfdPrenom.getText());
        collaborateur.setNom(tfdNom.getText());
        collaborateur.setPostnom(tfdPostnom.getText());
        collaborateur.setSurnom(tfdSurnom.getText());
        collaborateur.setNomUtilisateur(tfdNomUtilisateur.getText());
        collaborateur.setMotDePasse(pwfMotDePasse.getText());

        ProfilUtilisateur profilUtilisateur = new ProfilUtilisateur(idProfilUtilisateur);
        collaborateur.setProfilUtilisateur(profilUtilisateur);
        collaborateur.setActive(true);

        Collaborateur collab = SessionUtilisateurKS.getInstance().getSessionUtilisateur().getCollaborateur();

        if (collaborateur.getPrenom().equals(collab.getPrenom())
                && collaborateur.getNom().equals(collab.getNom())
                && collaborateur.getPostnom().equals(collab.getPostnom())
                && collaborateur.getSurnom().equals(collab.getSurnom())
                && collaborateur.getNomUtilisateur().equals(collab.getNomUtilisateur())
                && collaborateur.getMotDePasse().equals(collab.getMotDePasse())
                && collaborateur.getProfilUtilisateur().getId().equals(collab.getProfilUtilisateur().getId())) {

            JOptionPane.showMessageDialog(null, "Il n'y a eu aucune necessité d'actualiser le collaborateur."
                    + "\nAucune alteration a été réalisée!");

        } else {

            try {
                //Editer le nom d'utilisateur dans la base de donnée pour être "unique"
                if (CollaborateurService.getInstance().enregistrerCollaborateur(collaborateur)) {
                    effacerFormulaire();
                    JOptionPane.showMessageDialog(null, "Actualisation effectuée avec succès."
                            + "\nIl est necessaire de quitter le système pour que les alterations soient appliquée");

                    System.exit(0);

                }
            } catch (SQLException ex) {
                StringBuilder notification = new StringBuilder("Une faille est survenue en sauvegardant le collaborateur :(");
                switch (ex.getErrorCode()) {
                    case 1062:
                        notification.append("\n\nLe nom d'utilisateur de ce collaborateur est déjà utilisé!");
                        tfdNomUtilisateur.selectAll();
                        break;
                    default:
                        break;
                }
                JOptionPane.showMessageDialog(null, notification);

                Logger.getLogger(RegistreShop.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Une faille est survenue en sauvegardant le collaborateur :(");
            } catch (Exception ex) {
                Logger.getLogger(ConfigurationCompte.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                setCursor(Cursor.getDefaultCursor());
            }
        }

        habiliterComposantFormulaire(true);
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void collaborateurSelectionne(Collaborateur collaborateur) {
        if (collaborateur == null) {
            return;
        }

        idCollaborateur = collaborateur.getId();
        tfdPrenom.setText(collaborateur.getPrenom());
        tfdNom.setText(collaborateur.getNom());
        tfdPostnom.setText(collaborateur.getPostnom());
        tfdSurnom.setText(collaborateur.getSurnom());
        tfdNomUtilisateur.setText(collaborateur.getNomUtilisateur());
        pwfMotDePasse.setText(collaborateur.getMotDePasse());
        pwfConfirmerMotDePasse.setText(collaborateur.getMotDePasse());
        idProfilUtilisateur = collaborateur.getProfilUtilisateur().getId();
        tfdDescriptionProfilUtilisateur.setText(collaborateur.getProfilUtilisateur().getDescription());
    }

    private void btnConsulterProfilUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulterProfilUtilisateurActionPerformed
        if (!btnConsulterProfilUtilisateurClickable) {
            return;
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        habiliterComposantFormulaire(false);

        try {
            ConsultationProfilUtilisateur consultationProfilUtilisateur = new ConsultationProfilUtilisateur(null, true, ProfilUtilisateurService.getInstance()
                    .listerTousLesProfilUtilisateurs());
            consultationProfilUtilisateur.setFrameAncetre(this);
            consultationProfilUtilisateur.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConfigurationCompte.class.getName()).log(Level.SEVERE, null, ex);
        }

        habiliterComposantFormulaire(true);
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnConsulterProfilUtilisateurActionPerformed

    public void profilUtilisateurSelectionne(ProfilUtilisateur profilUtilisateur) {
        if (profilUtilisateur == null) {
            return;
        }

        tfdDescriptionProfilUtilisateur.setText(profilUtilisateur.getDescription());
        idProfilUtilisateur = profilUtilisateur.getId();
        tfdDescriptionProfilUtilisateur.requestFocus();
    }

    private void tfdNomUtilisateurFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdNomUtilisateurFocusGained
        if (tfdNomUtilisateur.getText().isEmpty() && !tfdNom.getText().isEmpty() && !tfdPostnom.getText().isEmpty()) {
            tfdNomUtilisateur.setText(new StringBuilder().append(tfdPrenom.getText().toLowerCase()).append(".")
                    .append(tfdPostnom.getText().toLowerCase()).toString());
        }
    }//GEN-LAST:event_tfdNomUtilisateurFocusGained

    private void effacerFormulaire() {
        idCollaborateur = "";
        tfdPrenom.setText("");
        tfdPrenom.requestFocus();
        tfdNom.setText("");
        tfdPostnom.setText("");
        tfdSurnom.setText("");
        tfdNomUtilisateur.setText("");
        pwfMotDePasse.setText("");
        pwfConfirmerMotDePasse.setText("");
        tfdDescriptionProfilUtilisateur.setText("");
        habiliterComposantFormulaire(true);
    }

    private void habiliterComposantFormulaire(boolean hcf) {
        tfdPrenom.setEditable(hcf);
        tfdNom.setEditable(hcf);
        tfdPostnom.setEditable(hcf);
        tfdSurnom.setEditable(hcf);
        tfdNomUtilisateur.setEditable(hcf);
        pwfMotDePasse.setEditable(hcf);
        pwfConfirmerMotDePasse.setEditable(hcf);
        btnConsulterCollaborateurClickable = hcf;
        btnConsulterProfilUtilisateurClickable = hcf;
        btnEnregistrerClickable = hcf;
        btnEffacerFormulaireClickable = hcf;
    }

    private boolean isMotdePasseConfirme() {
        if (pwfMotDePasse.getText().equals(pwfConfirmerMotDePasse.getText())) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Le mot de passe ne correspond pas!");
            pwfConfirmerMotDePasse.requestFocus();
            return false;
        }
    }

    private boolean isInformationObligatoiresRemplies() {

        StringBuilder notification = new StringBuilder();
        Queue<Integer> nio = new LinkedList<>();

        if (tfdPrenom.getText().isEmpty()) {
            notification.append("\nPrénom");
            nio.add(1);
        }
        if (tfdNom.getText().isEmpty()) {
            notification.append("\nNom");
            nio.add(2);
        }
        if (tfdPostnom.getText().isEmpty()) {
            notification.append("\nPostnom");
            nio.add(3);
        }

        if (tfdSurnom.getText().isEmpty()) {
            notification.append("\nSurnom");
            nio.add(4);
        }

        if (tfdNomUtilisateur.getText().isEmpty()) {
            notification.append("\nnom d'utilisateur");
            nio.add(5);
        }
        if (pwfMotDePasse.getText().isEmpty()) {
            notification.append("\nMot de passe");
            nio.add(6);
        }

        if (notification.toString().isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, new StringBuilder(nio.size() > 1 ? "Informations obligatoires:" : "Information obligatoire:")
                    .append(notification));
            switch (nio.poll()) {
                case 1:
                    tfdPrenom.requestFocus();
                    break;

                case 2:
                    tfdNom.requestFocus();
                    break;
                case 3:
                    tfdPostnom.requestFocus();
                    break;

                case 4:
                    tfdSurnom.requestFocus();
                    break;
                case 5:
                    tfdNomUtilisateur.requestFocus();
                    break;
                case 6:
                    pwfMotDePasse.requestFocus();
                    break;
                default:
            }
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulterProfilUtilisateur;
    private javax.swing.JButton btnEffacerFormulaire;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pwfConfirmerMotDePasse;
    private javax.swing.JPasswordField pwfMotDePasse;
    private javax.swing.JTextField tfdDescriptionProfilUtilisateur;
    private javax.swing.JTextField tfdNom;
    private javax.swing.JTextField tfdNomUtilisateur;
    private javax.swing.JTextField tfdPostnom;
    private javax.swing.JTextField tfdPrenom;
    private javax.swing.JTextField tfdSurnom;
    // End of variables declaration//GEN-END:variables
}

package com.cecilsoftwares.reussoftfrontend.form.operations;

import com.cecilsoftwares.reussoftfrontend.form.registres.RegistreShop;
import com.cecilsoftwares.reussoftbackend.service.DispatchService;
import com.cecilsoftwares.reussoftbackend.service.ProduitService;
import com.cecilsoftwares.reussoftbackend.service.ShopService;
import com.cecilsoftwares.reussoftbackend.service.StockProduitService;
import com.cecilsoftwares.reussoftfrontend.dialog.ConsultationDispatch;
import com.cecilsoftwares.reussoftfrontend.dialog.ConsultationFournisseur;
import com.cecilsoftwares.reussoftfrontend.dialog.ConsultationProduit;
import com.cecilsoftwares.reussoftfrontend.dialog.ConsultationShop;
import com.cecilsoftwares.reussoftmiddleend.ks.SessionUtilisateurKS;
import com.cecilsoftwares.reussoftmiddleend.model.Dispatch;
import com.cecilsoftwares.reussoftmiddleend.model.ItemDispatch;
import com.cecilsoftwares.reussoftmiddleend.model.Produit;
import com.cecilsoftwares.reussoftmiddleend.model.Shop;
import com.cecilsoftwares.reussoftmiddleend.model.StockProduit;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Plamedi L. Lusembo
 */
public class OperationDispatch extends JInternalFrame {

    private String idDispatch;
    private boolean modeEdition;
    private boolean modeEditionItemDispatch;

    private boolean btnConsulterDispatchClickable;
    private boolean btnConsulterShopClickable;
    private boolean btnConsulterProduitClickable;
    private boolean btnAjouterProduitClickable;
    private boolean btnEffacerChampsProduitsClickable;
    private boolean tblItemsEntreeStockClickable;
    private boolean btnEnregistrerClickable;
    private boolean btnAnnulerClickable;

    private Produit produitSelectionne;
    private Shop shopSelectionne;
    private List<ItemDispatch> itemsDispatch;

    private StockProduit stockProduitShopActuel;
    private List<StockProduit> listeStockProduit;

    private final DefaultTableModel defaultTableModel;
    private final Object dataRows[];

    public OperationDispatch() {
        initComponents();

        itemsDispatch = new ArrayList();

        defaultTableModel = (DefaultTableModel) tblItemsDispatch.getModel();
        dataRows = new Object[5];

        listeStockProduit = new ArrayList();

        effacerFormulaire();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tfdDescriptionProduit = new javax.swing.JTextField();
        btnConsulterProduit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnAjouterProduit = new javax.swing.JButton();
        spnQuantiteProduit = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItemsDispatch = new javax.swing.JTable();
        btnEffacerChampsProduits = new javax.swing.JButton();
        lblNombreItemDispatch = new javax.swing.JLabel();
        btnConsulterShop = new javax.swing.JButton();
        tfdNomShop = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblStockProduitShopActuel = new javax.swing.JLabel();
        btnApercuDispatch = new javax.swing.JButton();
        lblStockProduitSource = new javax.swing.JLabel();
        btnEffacerFormulaire = new javax.swing.JButton();
        btnEnregistrer = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tfdNumeroDispatch = new javax.swing.JTextField();
        btnConsulterDispatch = new javax.swing.JButton();
        chbValider = new javax.swing.JCheckBox();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dispatch");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        tfdDescriptionProduit.setEditable(false);

        btnConsulterProduit.setText("...");
        btnConsulterProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulterProduitActionPerformed(evt);
            }
        });

        jLabel12.setText("Shop destinataire:");

        btnAjouterProduit.setText("+");
        btnAjouterProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterProduitActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantité:");

        tblItemsDispatch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Shop", "Produit", "Qt. anterieur", "Qt. Ajoutée", "Qt. Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItemsDispatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemsDispatchMouseClicked(evt);
            }
        });
        tblItemsDispatch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblItemsDispatchKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblItemsDispatch);
        if (tblItemsDispatch.getColumnModel().getColumnCount() > 0) {
            tblItemsDispatch.getColumnModel().getColumn(0).setResizable(false);
            tblItemsDispatch.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblItemsDispatch.getColumnModel().getColumn(1).setResizable(false);
            tblItemsDispatch.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblItemsDispatch.getColumnModel().getColumn(2).setResizable(false);
            tblItemsDispatch.getColumnModel().getColumn(3).setResizable(false);
            tblItemsDispatch.getColumnModel().getColumn(4).setResizable(false);
            tblItemsDispatch.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        btnEffacerChampsProduits.setText("<-");
        btnEffacerChampsProduits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffacerChampsProduitsActionPerformed(evt);
            }
        });

        lblNombreItemDispatch.setText("jLabel2");

        btnConsulterShop.setText("...");
        btnConsulterShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulterShopActionPerformed(evt);
            }
        });

        tfdNomShop.setEditable(false);

        jLabel1.setText("Produit:");

        lblStockProduitShopActuel.setText("jLabel2");

        btnApercuDispatch.setText("...");
        btnApercuDispatch.setToolTipText("Aperçu du dispatch");
        btnApercuDispatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApercuDispatchActionPerformed(evt);
            }
        });

        lblStockProduitSource.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNombreItemDispatch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnApercuDispatch))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnAjouterProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEffacerChampsProduits, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfdNomShop, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnConsulterShop))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spnQuantiteProduit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfdDescriptionProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnConsulterProduit)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStockProduitSource)
                                    .addComponent(lblStockProduitShopActuel))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsulterShop)
                    .addComponent(tfdNomShop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsulterProduit)
                    .addComponent(tfdDescriptionProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStockProduitSource))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnQuantiteProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStockProduitShopActuel))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouterProduit)
                    .addComponent(btnEffacerChampsProduits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApercuDispatch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreItemDispatch))
                .addGap(18, 18, 18))
        );

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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Numero:");

        tfdNumeroDispatch.setEditable(false);

        btnConsulterDispatch.setText("...");
        btnConsulterDispatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulterDispatchActionPerformed(evt);
            }
        });

        chbValider.setText("Valider");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEffacerFormulaire, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbValider)
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfdNumeroDispatch, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsulterDispatch)))
                        .addGap(382, 382, 382))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdNumeroDispatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulterDispatch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chbValider)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEffacerFormulaire, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        if (isInformationObligatoiresRemplies()) {

            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            habiliterComposantFormulaire(false);

            Dispatch dispatch = new Dispatch(idDispatch);
            dispatch.setNumeroDispatch(tfdNumeroDispatch.getText());
            dispatch.setShop(SessionUtilisateurKS.getInstance().getSessionUtilisateur().getCollaborateur().getShop());
            dispatch.setDateHeure(new Date());
            dispatch.setItemsDispatch(itemsDispatch);
            dispatch.setValide(modeEdition ? chbValider.isSelected() : true);

            try {
                if (DispatchService.getInstance().enregistrerDispatch(dispatch)) {
                    String notification = modeEdition ? "Actualisation effectuée avec succès" : "Sauvegarde effectuée avec succès";
                    effacerFormulaire();
                    JOptionPane.showMessageDialog(null, notification);
                }
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Une faille est survenue en sauvegardant le Client");
                Logger.getLogger(RegistreShop.class.getName()).log(Level.SEVERE, null, ex);
            }
            setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void btnEffacerFormulaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffacerFormulaireActionPerformed
        effacerFormulaire();
    }//GEN-LAST:event_btnEffacerFormulaireActionPerformed

    private void btnAjouterProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterProduitActionPerformed

        if (spnQuantiteProduit.getValue().toString().equals("0") || spnQuantiteProduit.getValue().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Quantité incorrect!");
            return;
        }

        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        habiliterComposantFormulaire(false);

        boolean ajouter = true;

        if (modeEditionItemDispatch) {
            for (ItemDispatch ids : itemsDispatch) {
                if (ids.getProduit().getId().equals(idDispatch)) {

                    try {

                        BigDecimal stockProduitSource = StockProduitService.getInstance()
                                .selectionnerStockProduitTousLesShopsParIdProduitSansDetail(ids.getProduit().getId()).getQuantiteStock();

                        if (getStockProduitDispatch(ids.getProduit()).add(ids.getQuantiteProduit()).compareTo(stockProduitSource) > 0) {
                            JOptionPane.showMessageDialog(null, "Stock insuffisant!\nDisponible: " + stockProduitSource.subtract(getStockProduitDispatch(ids.getProduit())).toString());
                            ajouter = false;
                        } else {
                            ids.setQuantiteProduit(new BigDecimal(spnQuantiteProduit.getValue().toString()));
                            ajouter = true;
                        }
                        break;

                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(OperationEntreeStock.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

        } else {

            ItemDispatch itemDispatch = new ItemDispatch(new Dispatch(idDispatch), produitSelectionne, shopSelectionne);
            itemDispatch.setQuantiteProduit(new BigDecimal(spnQuantiteProduit.getValue().toString()));

            boolean produitExistant = false;

            for (ItemDispatch ids : itemsDispatch) {
                if (ids.getProduit().getId().equals(itemDispatch.getProduit().getId())
                        && ids.getShop().getId().equals(itemDispatch.getShop().getId())) {
                    JOptionPane.showMessageDialog(null, "Ce produit a déjà été ajouté");
                    ajouter = false;
                    produitExistant = true;
                    break;
                }
            }

            if (!produitExistant) {
                try {

                    BigDecimal stockProduitSource = StockProduitService.getInstance()
                            .selectionnerStockProduitTousLesShopsParIdProduitSansDetail(itemDispatch.getProduit().getId()).getQuantiteStock();

                    if (getStockProduitDispatch(itemDispatch.getProduit()).add(itemDispatch.getQuantiteProduit()).compareTo(stockProduitSource) > 0) {
                        JOptionPane.showMessageDialog(null, "Stock insuffisant!\nDisponible: " + stockProduitSource.subtract(getStockProduitDispatch(itemDispatch.getProduit())).toString());

                        ajouter = false;
                    } else {

                        itemsDispatch.add(itemDispatch);
                        listeStockProduit.add(stockProduitShopActuel);
                        ajouter = true;
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(OperationEntreeStock.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        if (ajouter) {
            chargerTableauItemDispatch();

            tfdDescriptionProduit.setText("");
            lblStockProduitSource.setText("");
            lblStockProduitShopActuel.setText("");
            spnQuantiteProduit.setValue(0);
            modeEditionItemDispatch = false;
            tfdDescriptionProduit.requestFocus();

            btnAjouterProduit.setEnabled(false);
            stockProduitShopActuel = null;
        }
        habiliterComposantFormulaire(true);
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnAjouterProduitActionPerformed

    private void btnConsulterDispatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulterDispatchActionPerformed

        if (!btnConsulterDispatchClickable) {
            return;
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        habiliterComposantFormulaire(false);

        try {
            List<Dispatch> dispatchs = DispatchService.getInstance().listerTousLesDispatchsAvecItems();
            ConsultationDispatch consultationDispatch = new ConsultationDispatch(null, true, dispatchs);
            consultationDispatch.setFrameAncetre(this);
            consultationDispatch.setVisible(true);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OperationDispatch.class.getName()).log(Level.SEVERE, null, ex);
        }

        habiliterComposantFormulaire(true);
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnConsulterDispatchActionPerformed

    public void dispatchSelectionne(Dispatch dispatch) {
        if (dispatch == null) {
            return;
        }
        idDispatch = dispatch.getId();
        tfdNumeroDispatch.setText(dispatch.getNumeroDispatch());

        itemsDispatch = dispatch.getItemsDispatch();

        chargerTableauItemDispatch();

        chbValider.setVisible(true);
        chbValider.setSelected(dispatch.isValide());

        modeEdition = true;
        btnEnregistrer.setText("ACTUALISER");

    }

    private void btnConsulterShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulterShopActionPerformed
        if (!btnConsulterShopClickable) {
            return;
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        habiliterComposantFormulaire(false);

        try {

            ConsultationShop consultationShop = new ConsultationShop(null, true, ShopService.getInstance()
                    .listerTousLesShops());
            consultationShop.setFrameAncetre(this);
            consultationShop.setVisible(true);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConsultationFournisseur.class.getName()).log(Level.SEVERE, null, ex);
        }

        modeEditionItemDispatch = false;
        btnConsulterProduit.setEnabled(true);

        habiliterComposantFormulaire(true);
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnConsulterShopActionPerformed

    public void shopSelectionne(Shop shop) {
        if (shop == null) {
            return;
        }
        shopSelectionne = shop;
        tfdNomShop.setText(String.valueOf(shopSelectionne.getNom()));

        btnConsulterProduit.requestFocus();

    }

    private void btnConsulterProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulterProduitActionPerformed
        if (!btnConsulterProduitClickable) {
            return;
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        habiliterComposantFormulaire(false);

        try {

            ConsultationProduit consultationProduit = new ConsultationProduit(null, true, ProduitService.getInstance()
                    .listerTousLesProduits());
            consultationProduit.setFrameAncetre(this);
            consultationProduit.setVisible(true);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConsultationFournisseur.class.getName()).log(Level.SEVERE, null, ex);
        }

        habiliterComposantFormulaire(true);
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnConsulterProduitActionPerformed

    public void setProduitSelectionne(Produit produit) {
        if (produit == null) {
            return;
        }

        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        habiliterComposantFormulaire(false);

        produitSelectionne = produit;
        tfdDescriptionProduit.setText(produitSelectionne.getDescription());

        try {

            BigDecimal stockProduitSource = StockProduitService.getInstance()
                    .selectionnerStockProduitTousLesShopsParIdProduitSansDetail(produit.getId()).getQuantiteStock();

            lblStockProduitSource.setText(new StringBuilder("Stock Source: ")
                    .append(stockProduitSource.subtract(getStockProduitDispatch(produit)).toString()).toString());

            stockProduitShopActuel = StockProduitService.getInstance()
                    .selectionnerStockProduitParIdProduitEIdShopSansDetail(produit.getId(), shopSelectionne.getId());

            lblStockProduitShopActuel.setText(new StringBuilder("Stock actuel à " + shopSelectionne.getNom() + ": ")
                    .append(stockProduitShopActuel.getQuantiteStock().toString()).toString());

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OperationEntreeStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        btnAjouterProduit.setEnabled(true);
        modeEditionItemDispatch = false;
        btnConsulterShop.setEnabled(false);
        spnQuantiteProduit.requestFocus();

        habiliterComposantFormulaire(true);
        setCursor(Cursor.getDefaultCursor());
    }

    public BigDecimal getStockProduitDispatch(Produit produit) {
        BigDecimal stockProduitDispatch = new BigDecimal("0");

        for (ItemDispatch id : itemsDispatch) {
            if (id.getProduit().getId().equals(produit.getId())) {
                stockProduitDispatch = stockProduitDispatch.add(id.getQuantiteProduit());
            }
        }
        return stockProduitDispatch;
    }

    private void btnEffacerChampsProduitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffacerChampsProduitsActionPerformed
        effacerChampsItemStock();
    }//GEN-LAST:event_btnEffacerChampsProduitsActionPerformed

    public void effacerChampsItemStock() {

        tfdNomShop.setText("");
        tfdDescriptionProduit.setText("");
        btnConsulterShop.setEnabled(true);
        btnConsulterProduit.setEnabled(false);
        lblStockProduitSource.setText("");
        lblStockProduitShopActuel.setText("");
        spnQuantiteProduit.setValue(0);
        modeEditionItemDispatch = false;
        tfdDescriptionProduit.requestFocus();

        btnAjouterProduit.setEnabled(false);

        stockProduitShopActuel = null;

    }

    private void tblItemsDispatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemsDispatchMouseClicked
        if (evt.getClickCount() == 2) {
            int row = tblItemsDispatch.getSelectedRow();

            ItemDispatch itemDispatch;

            itemDispatch = itemsDispatch.get(row);
            if (itemDispatch == null) {
                return;
            }
            shopSelectionne = itemDispatch.getShop();
            tfdNomShop.setText(shopSelectionne.getNom());

            produitSelectionne = itemDispatch.getProduit();

            tfdDescriptionProduit.setText(produitSelectionne.getDescription());
            spnQuantiteProduit.setValue(itemDispatch.getQuantiteProduit());

            tfdDescriptionProduit.setText(produitSelectionne.getDescription());

            StockProduit sp = listeStockProduit.stream()
                    .filter(lsp -> lsp.getProduit().getId().equals(produitSelectionne.getId()))
                    .findFirst().orElse(null);

            modeEditionItemDispatch = true;
            btnAjouterProduit.setEnabled(true);

        }
    }//GEN-LAST:event_tblItemsDispatchMouseClicked

    private void tblItemsDispatchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblItemsDispatchKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {

            boolean exclu = false;

            List<ItemDispatch> listeItemsDispatch = itemsDispatch;
            int row = tblItemsDispatch.getSelectedRow();

            for (ItemDispatch ids : listeItemsDispatch) {

                if (ids.getProduit().getId().equals(itemsDispatch.get(row).getProduit().getId())) {

                    itemsDispatch.remove(ids);

                    if (!tfdDescriptionProduit.getText().isEmpty()) {
                        lblStockProduitSource.setText("");
                    }

                    StockProduit sp = listeStockProduit.stream()
                            .filter(lsp -> lsp.getProduit().getId().equals(ids.getProduit().getId()))
                            .findFirst().orElse(null);

                    listeStockProduit.remove(sp);

                    modeEditionItemDispatch = false;
                    exclu = true;
                    break;
                }
            }

            if (exclu) {

                chargerTableauItemDispatch();
            }

        }
    }//GEN-LAST:event_tblItemsDispatchKeyReleased

    private void btnApercuDispatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApercuDispatchActionPerformed
        effacerChampsItemStock();
        tfdNomShop.setText("");
    }//GEN-LAST:event_btnApercuDispatchActionPerformed

    private void chargerTableauItemDispatch() {
        defaultTableModel.setRowCount(0);

        itemsDispatch.forEach(ies -> {
            dataRows[0] = ies.getShop().getNom();
            dataRows[1] = ies.getProduit().getDescription();
            dataRows[2] = Double.parseDouble(stockProduitShopActuel.getQuantiteStock().toString());
            dataRows[3] = Double.parseDouble(ies.getQuantiteProduit().toString());
            dataRows[4] = Double.parseDouble(stockProduitShopActuel.getQuantiteStock().add(ies.getQuantiteProduit()).toString());
            defaultTableModel.addRow(dataRows);
        });

        String formeNombre = itemsDispatch.size() > 1 ? "Items" : "Item";
        lblNombreItemDispatch.setText(itemsDispatch.size() + " " + formeNombre);

        btnApercuDispatch.setVisible(!itemsDispatch.isEmpty());

    }

    private void effacerFormulaire() {

        tfdNumeroDispatch.setText("");
        tfdNumeroDispatch.requestFocus();

        tfdNomShop.setText("");
        lblStockProduitShopActuel.setText("");
        lblStockProduitSource.setText("");

        btnApercuDispatch.setVisible(false);

        shopSelectionne = null;
        produitSelectionne = null;

        stockProduitShopActuel = null;
        listeStockProduit.clear();

        btnAjouterProduit.setEnabled(false);

        tfdDescriptionProduit.setText("");
        spnQuantiteProduit.setValue(0);
        modeEditionItemDispatch = false;
        btnConsulterProduit.setEnabled(false);
        btnConsulterShop.setEnabled(true);

        defaultTableModel.setRowCount(0);
        itemsDispatch.clear();

        chbValider.setVisible(false);
        chbValider.setSelected(true);

        habiliterComposantFormulaire(true);

    }

    private void habiliterComposantFormulaire(boolean hcf) {
        spnQuantiteProduit.setEnabled(hcf);
        btnConsulterDispatchClickable = hcf;
        btnConsulterShopClickable = hcf;
        btnConsulterProduitClickable = hcf;

        btnAjouterProduitClickable = hcf;
        btnEffacerChampsProduitsClickable = hcf;
        tblItemsEntreeStockClickable = hcf;

        btnEnregistrerClickable = hcf;
        btnAnnulerClickable = hcf;
    }

    private boolean isInformationObligatoiresRemplies() {

        StringBuilder notification = new StringBuilder();
        Queue<Integer> nio = new LinkedList<>();

        if (tfdNomShop.getText().isEmpty()) {
            notification.append("\nFournisseur");
            nio.add(1);
        }
        if (itemsDispatch.isEmpty()) {
            notification.append("\nProduits");
            nio.add(2);
        }

        if (notification.toString().isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, new StringBuilder(nio.size() > 1 ? "Informations obligatoires:" : "Information obligatoire:")
                    .append(notification));
            switch (nio.poll()) {
                case 1:
                    tfdNomShop.requestFocus();
                    break;

                case 2:
                    tfdDescriptionProduit.requestFocus();
                    break;
                default:
            }
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouterProduit;
    private javax.swing.JButton btnApercuDispatch;
    private javax.swing.JButton btnConsulterDispatch;
    private javax.swing.JButton btnConsulterProduit;
    private javax.swing.JButton btnConsulterShop;
    private javax.swing.JButton btnEffacerChampsProduits;
    private javax.swing.JButton btnEffacerFormulaire;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JCheckBox chbValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreItemDispatch;
    private javax.swing.JLabel lblStockProduitShopActuel;
    private javax.swing.JLabel lblStockProduitSource;
    private javax.swing.JSpinner spnQuantiteProduit;
    private javax.swing.JTable tblItemsDispatch;
    private javax.swing.JTextField tfdDescriptionProduit;
    private javax.swing.JTextField tfdNomShop;
    private javax.swing.JTextField tfdNumeroDispatch;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Manufacture;

import Business.EcoSystem;
import Business.NationalEnterprise.Manufacturer;
import Business.Organization.ManufactureOrganization;
import Business.Organization.Organization;
import Business.Vaccine.VaccineDetails;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinithiteshharsora
 */
public class ManageVaccinesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageVaccinesJPanel
     */
    private JPanel workContainer;
    private Manufacturer manufacturer;
    private EcoSystem business;
    
    public ManageVaccinesJPanel(JPanel workContainer, Manufacturer manufacturer, EcoSystem business) {
        initComponents();
        this.workContainer = workContainer;
        this.manufacturer = manufacturer;
        this.business = business;
        populateTable();
        
    }
    
    private void populateTable(){
        
         DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblvacc.getModel();
        defaulttabelmodel.setRowCount(0);
        
        ManufactureOrganization manufacureOrg = null;
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(VaccineDetails vaccine : manufacureOrg.getVaccineProductCatalog().getVaccineProductList())
            {Object[] row = new Object[7];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineDefinition().getVaccineName();
            row[2] = vaccine.getVaccineId();
            row[3] = vaccine.getBatchId();
            row[4] = vaccine.getVaccinePrice();
            row[5] = vaccine.getAvailablity();
            row[6] = vaccine.getManufactureDate();
            defaulttabelmodel.addRow(row);
            }
        }
        }
        
        
        
    }
    
    
    private void searchVaccine(String vaccineCode){
         DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblvacc.getModel();
        defaulttabelmodel.setRowCount(0);
        
        ManufactureOrganization manufacureOrg = null;
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(VaccineDetails vaccine : manufacureOrg.getVaccineProductCatalog().getVaccineProductList())
            {
                if(vaccineCode.equalsIgnoreCase(vaccine.getVaccineDefinition().getVaccineCode()))
                {
                Object[] row = new Object[7];
            
                row[0] = vaccine;
                row[1] = vaccine.getVaccineDefinition().getVaccineName();
                row[2] = vaccine.getVaccineId();
                row[3] = vaccine.getBatchId();
                row[4] = vaccine.getVaccinePrice();
                row[5] = vaccine.getAvailablity();
                row[6] = vaccine.getManufactureDate();
                defaulttabelmodel.addRow(row);
                }
            }
        }
        
        
        
        
    }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblvacc = new javax.swing.JTable();
        btnref = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtvacccode = new javax.swing.JTextField();
        btnremvacc = new javax.swing.JButton();
        btnnwvacc = new javax.swing.JButton();
        btnsrch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Vaccines");

        tblvacc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Vaccine id", "Lot Number", "Price", "Availability", "manufacture date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblvacc.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblvacc);

        btnref.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnref.setForeground(new java.awt.Color(255, 255, 255));
        btnref.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/MicrosoftTeams-image (2).png"))); // NOI18N
        btnref.setText("Refresh");
        btnref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Vaccine:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vaccine Code:");

        btnremvacc.setBackground(new java.awt.Color(0, 0, 102));
        btnremvacc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnremvacc.setForeground(new java.awt.Color(255, 255, 255));
        btnremvacc.setText("Remove Vaccine");
        btnremvacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremvaccActionPerformed(evt);
            }
        });

        btnnwvacc.setBackground(new java.awt.Color(0, 0, 102));
        btnnwvacc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnnwvacc.setForeground(new java.awt.Color(255, 255, 255));
        btnnwvacc.setText("Add Vaccine");
        btnnwvacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnwvaccActionPerformed(evt);
            }
        });

        btnsrch.setBackground(new java.awt.Color(0, 0, 102));
        btnsrch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsrch.setForeground(new java.awt.Color(255, 255, 255));
        btnsrch.setText("Search");
        btnsrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsrchActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/immu1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnref)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtvacccode, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsrch, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnremvacc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnnwvacc)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnref)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtvacccode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsrch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnremvacc)
                    .addComponent(btnnwvacc))
                .addGap(54, 54, 54)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsrchActionPerformed
        // TODO add your handling code here:  
        String searchCode= txtvacccode.getText();
        searchVaccine(searchCode);
 
    }//GEN-LAST:event_btnsrchActionPerformed

    private void btnrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnrefActionPerformed

    private void btnremvaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremvaccActionPerformed
        // TODO add your handling code here:
         int row = tblvacc.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a Vaccine from table");
            return;
        }
        VaccineDetails vaccine = (VaccineDetails)tblvacc.getValueAt(row, 0);
        ManufactureOrganization manufactureOrg = null;
        for(Organization org: manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        { manufactureOrg = (ManufactureOrganization)org;
            for(VaccineDetails vaccineProduct : manufactureOrg.getVaccineProductCatalog().getVaccineProductList())
            {
                if(vaccine.equals(vaccineProduct))
                    manufactureOrg.getVaccineProductCatalog().removeVaccineProduct(vaccineProduct);
            }
        }
        }

        populateTable();
        
        
    }//GEN-LAST:event_btnremvaccActionPerformed

    private void btnnwvaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnwvaccActionPerformed
        // TODO add your handling code here:
         AddNewVaccineJPanel panel = new AddNewVaccineJPanel(workContainer, manufacturer, business);
        workContainer.add("AddNewVaccineJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_btnnwvaccActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnwvacc;
    private javax.swing.JButton btnref;
    private javax.swing.JButton btnremvacc;
    private javax.swing.JButton btnsrch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblvacc;
    private javax.swing.JTextField txtvacccode;
    // End of variables declaration//GEN-END:variables
}

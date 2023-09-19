/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author abhin
 */
public class PersonPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonPanel
     */
    public PersonPanel() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnPersonSubmit = new javax.swing.JButton();
        txtPerson_firstName = new javax.swing.JTextField();
        txtPerson_lastName = new javax.swing.JTextField();
        txtPerson_age = new javax.swing.JTextField();
        txtPerson_occupation = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPerson_BloodGroup = new javax.swing.JComboBox<>();
        txtPerson_DOB_Date = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPerson_DOB_Year = new javax.swing.JTextField();
        txtPerson_Mobile = new javax.swing.JTextField();
        txtPerson_ImageURL = new javax.swing.JTextField();
        txtPerson_SSN1 = new javax.swing.JTextField();
        txtPerson_DOB_Month1 = new javax.swing.JComboBox<>();
        txtPerson_Website = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Person Details");

        jLabel2.setText("First Name");

        jLabel3.setText("Occupation");

        jLabel4.setText("Last Name");

        jLabel5.setText("Age");

        jLabel6.setText("Date of Birth");

        jLabel7.setText("Mobile");

        jLabel8.setText("Social Security Number");

        jLabel9.setText("Website");

        jLabel10.setText("Blood Group");

        jLabel11.setText("Image URL");

        btnPersonSubmit.setText("Submit");
        btnPersonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonSubmitActionPerformed(evt);
            }
        });

        txtPerson_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerson_firstNameActionPerformed(evt);
            }
        });

        txtPerson_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerson_lastNameActionPerformed(evt);
            }
        });

        txtPerson_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerson_ageActionPerformed(evt);
            }
        });

        txtPerson_occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerson_occupationActionPerformed(evt);
            }
        });

        jLabel12.setText("Month:");

        txtPerson_BloodGroup.setMaximumRowCount(12);
        txtPerson_BloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        txtPerson_DOB_Date.setMaximumRowCount(12);
        txtPerson_DOB_Date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel13.setText("Date:");

        jLabel14.setText("Year:");

        txtPerson_DOB_Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerson_DOB_YearActionPerformed(evt);
            }
        });

        txtPerson_Mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerson_MobileActionPerformed(evt);
            }
        });

        txtPerson_ImageURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerson_ImageURLActionPerformed(evt);
            }
        });

        txtPerson_SSN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerson_SSN1ActionPerformed(evt);
            }
        });

        txtPerson_DOB_Month1.setMaximumRowCount(12);
        txtPerson_DOB_Month1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        txtPerson_Website.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerson_WebsiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPerson_occupation, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPerson_age, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPerson_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPerson_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPersonSubmit)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPerson_DOB_Month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPerson_DOB_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPerson_DOB_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPerson_Website, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPerson_ImageURL, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPerson_BloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPerson_Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPerson_SSN1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPerson_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPerson_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPerson_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPerson_occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(txtPerson_DOB_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(txtPerson_DOB_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerson_DOB_Month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPerson_Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPerson_SSN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPerson_Website, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPerson_BloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPerson_ImageURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPersonSubmit)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPersonSubmitActionPerformed

    private void txtPerson_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerson_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerson_firstNameActionPerformed

    private void txtPerson_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerson_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerson_lastNameActionPerformed

    private void txtPerson_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerson_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerson_ageActionPerformed

    private void txtPerson_occupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerson_occupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerson_occupationActionPerformed

    private void txtPerson_DOB_YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerson_DOB_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerson_DOB_YearActionPerformed

    private void txtPerson_MobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerson_MobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerson_MobileActionPerformed

    private void txtPerson_ImageURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerson_ImageURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerson_ImageURLActionPerformed

    private void txtPerson_SSN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerson_SSN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerson_SSN1ActionPerformed

    private void txtPerson_WebsiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerson_WebsiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerson_WebsiteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPersonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> txtPerson_BloodGroup;
    private javax.swing.JComboBox<String> txtPerson_DOB_Date;
    private javax.swing.JComboBox<String> txtPerson_DOB_Month1;
    private javax.swing.JTextField txtPerson_DOB_Year;
    private javax.swing.JTextField txtPerson_ImageURL;
    private javax.swing.JTextField txtPerson_Mobile;
    private javax.swing.JTextField txtPerson_SSN1;
    private javax.swing.JTextField txtPerson_Website;
    private javax.swing.JTextField txtPerson_age;
    private javax.swing.JTextField txtPerson_firstName;
    private javax.swing.JTextField txtPerson_lastName;
    private javax.swing.JTextField txtPerson_occupation;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sapient.jdbc.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author dredmo
 */
public class EmployeeDetails extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeDetails
     */
    public EmployeeDetails() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu3 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btnFindById = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFindById.setText("Find by ID");
        btnFindById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindByIdActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Salary");

        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSalary)
                            .addComponent(txtLastName)
                            .addComponent(txtFirstName)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFindById, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindById)
                    .addComponent(btnAdd)
                    .addComponent(btnModify)
                    .addComponent(btnRemove)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void btnFindByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindByIdActionPerformed
        // TODO add your handling code here:
    	Connection dbConnect = null;
    	PreparedStatement pStatement = null;
    	ResultSet result = null;
    	try {
			//Load / register the driver
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			//Establish a connection
			dbConnect = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "Danielle", "Danielle");
			//Create statement object
			pStatement = dbConnect.prepareStatement
					("SELECT EMPLOYEE_ID,FIRST_NAME,LAST_NAME,SALARY FROM EMPLOYEES WHERE EMPLOYEE_ID=?");
			pStatement.setInt(1, Integer.parseInt(txtID.getText()));
			//Execute query 
			result = pStatement.executeQuery();
			if (result.next()){
				txtFirstName.setText(result.getString(2));
				txtLastName.setText(result.getString(3));
				txtSalary.setText(result.getString(4));
			} else {
				JOptionPane.showMessageDialog(this, "No Record Found", "Employee ID does not exist", JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dbConnect != null && !dbConnect.isClosed()){
					dbConnect.close();
				}
				if (pStatement != null) {
					pStatement.close();
				}
				if (result != null) {
					result.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
    }//GEN-LAST:event_btnFindByIdActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    	// TODO add your handling code here:
    	Connection dbConnect = null;
    	PreparedStatement pStatement = null;
    	ResultSet result = null;
    	try {
			//Load / register the driver
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			//Establish a connection
			dbConnect = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "Danielle", "Danielle");
			//Create statement object
			pStatement = dbConnect.prepareStatement
					("Insert into EMPLOYEES (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,"
							+ "HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID) "
							+ "values (?,?,?,'SKING','515.123.4567',to_date('17-JUN-87','DD-MON-RR'),"
							+ "'AD_PRES',?,null,null,90)");
			pStatement.setInt(1, Integer.parseInt(txtID.getText()));
			pStatement.setString(2, txtFirstName.getText());
			pStatement.setString(3, txtLastName.getText());
			pStatement.setInt(4, Integer.parseInt(txtSalary.getText()));
			//Execute query 
			int check = pStatement.executeUpdate();
			if (check>0){
				JOptionPane.showMessageDialog(this, "This employee has been added to the database.");
			} else {
				JOptionPane.showMessageDialog(this, "We were not able to add this employee.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dbConnect != null && !dbConnect.isClosed()){
					dbConnect.close();
				}
				if (pStatement != null) {
					pStatement.close();
				}
				if (result != null) {
					result.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
    	Connection dbConnect = null;
    	PreparedStatement pStatement = null;
    	ResultSet result = null;
    	try {
			//Load / register the driver
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			//Establish a connection
			dbConnect = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "Danielle", "Danielle");
			//Create statement object
			pStatement = dbConnect.prepareStatement("UPDATE EMPLOYEES SET FIRST_NAME=?, LAST_NAME=?, SALARY=? WHERE EMPLOYEE_ID=?");
			pStatement.setString(1, txtFirstName.getText());
			pStatement.setString(2, txtLastName.getText());
			pStatement.setInt(3, Integer.parseInt(txtSalary.getText()));
			pStatement.setInt(4, Integer.parseInt(txtID.getText()));

			//Execute query 
			int check = pStatement.executeUpdate();
			if (check>0){
				JOptionPane.showMessageDialog(this, "This employee has been updated.");
			} else {
				JOptionPane.showMessageDialog(this, "We were not able to add this employee.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dbConnect != null && !dbConnect.isClosed()){
					dbConnect.close();
				}
				if (pStatement != null) {
					pStatement.close();
				}
				if (result != null) {
					result.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
    	Connection dbConnect = null;
    	PreparedStatement pStatement = null;
    	ResultSet result = null;
    	try {
			//Load / register the driver
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			//Establish a connection
			dbConnect = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "Danielle", "Danielle");
			//Create statement object
			pStatement = dbConnect.prepareStatement("DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID=?");
			pStatement.setInt(1, Integer.parseInt(txtID.getText()));

			//Execute query 
			int check = pStatement.executeUpdate();
			if (check>0){
				JOptionPane.showMessageDialog(this, "This employee has been removed.");
			} else {
				JOptionPane.showMessageDialog(this, "We were not able to remove this employee.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dbConnect != null && !dbConnect.isClosed()){
					dbConnect.close();
				}
				if (pStatement != null) {
					pStatement.close();
				}
				if (result != null) {
					result.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFindById;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRemove;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bg.smg;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author A
 */
public class DetailedView extends javax.swing.JFrame {
 private Application a;

    /**
     * Creates new form DetailedView
     */
    public DetailedView(Application a) {
        initComponents();
       jTextField4.setVisible(false);
       jTextField5.setVisible(false);
        FirstNameTxtfl.setText(a.getStudent().getFirstName());
        FirstNameTxtfl.setEditable(false);
        LastNameTxtfl.setText(a.getStudent().getLastName());
        LastNameTxtfl.setEditable(false);
        EmailTxtfl.setText(a.getStudent().getEmail());
        EmailTxtfl.setEditable(false);
        BirtdateTxtfl.setText(a.getStudent().getBirthDate().toString());
        BirtdateTxtfl.setEditable(false);
        SATTxtfl.setText(Integer.toString(a.getSAT()));
        SATTxtfl.setEditable(false);
        ACTTxtfl.setText(Integer.toString(a.getACT()));
        ACTTxtfl.setEditable(false);
      
        GPATxtfl.setText(Double.toString(a.getGPA()));
        GPATxtfl.setEditable(false);
        jTextField1.setText(a.getListMajors().get(0));
        jTextField1.setEditable(false);
        jTextField2.setText(a.getListMajors().get(1));
        jTextField2.setEditable(false);
        jTextField3.setText(a.getListMajors().get(2));
        jTextField3.setEditable(false);
        if(a.getStudent() instanceof InternationalStudent){
            YesRbtn.setSelected(true);
            jTextField4.setVisible(true);
            jTextField4.setText(Integer.toString(((InternationalStudent)a.getStudent()).getTOEFlscore()));
            jTextField5.setVisible(true);
            jTextField5.setText(Double.toString(((InternationalStudent)a.getStudent()).getIELTSscore()));
        }
        else {NoRbtn.setSelected(true);}
        NoRbtn.setEnabled(false);
        YesRbtn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        FirstNamwLbl = new javax.swing.JLabel();
        EmailLbl = new javax.swing.JLabel();
        ToeflLbl = new javax.swing.JLabel();
        ACTLbl = new javax.swing.JLabel();
        GPALbl = new javax.swing.JLabel();
        IsIntLbl = new javax.swing.JLabel();
        FrontNamelbl = new javax.swing.JLabel();
        LastNameLbl = new javax.swing.JLabel();
        BirthDLbl = new javax.swing.JLabel();
        SATLbl = new javax.swing.JLabel();
        IELTSLbl = new javax.swing.JLabel();
        FIRSTMLbl = new javax.swing.JLabel();
        SecondMLbl = new javax.swing.JLabel();
        ThirdMLbl = new javax.swing.JLabel();
        FirstNameTxtfl = new javax.swing.JTextField();
        LastNameTxtfl = new javax.swing.JTextField();
        BirtdateTxtfl = new javax.swing.JTextField();
        EmailTxtfl = new javax.swing.JTextField();
        SATTxtfl = new javax.swing.JTextField();
        ACTTxtfl = new javax.swing.JTextField();
        GPATxtfl = new javax.swing.JTextField();
        YesRbtn = new javax.swing.JRadioButton();
        NoRbtn = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setTitle("Student Information Details");
        setBackground(new java.awt.Color(200, 230, 255));
        setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N

        FirstNamwLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        FirstNamwLbl.setText("First name:");

        EmailLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        EmailLbl.setText("Email:");

        ToeflLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        ToeflLbl.setText("TOEFL score:");

        ACTLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        ACTLbl.setText("ACT score:");

        GPALbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        GPALbl.setText("GPA:");

        IsIntLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        IsIntLbl.setText("Is the student international?");

        FrontNamelbl.setFont(new java.awt.Font("Muna", 0, 18)); // NOI18N
        FrontNamelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FrontNamelbl.setText("Student Information Details ");
        FrontNamelbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 62, 149), 1, true));

        LastNameLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        LastNameLbl.setText("Last name:");

        BirthDLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        BirthDLbl.setText("Birth date:");

        SATLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        SATLbl.setText("SAT score:");

        IELTSLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        IELTSLbl.setText("IELTS score:");

        FIRSTMLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        FIRSTMLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FIRSTMLbl.setText("First major:");

        SecondMLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        SecondMLbl.setText("Second major:");

        ThirdMLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        ThirdMLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ThirdMLbl.setText("Third major:");

        FirstNameTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTxtflActionPerformed(evt);
            }
        });

        LastNameTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTxtflActionPerformed(evt);
            }
        });

        EmailTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTxtflActionPerformed(evt);
            }
        });

        SATTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SATTxtflActionPerformed(evt);
            }
        });

        GPATxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPATxtflActionPerformed(evt);
            }
        });

        YesRbtn.setText("Yes");
        YesRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesRbtnActionPerformed(evt);
            }
        });

        NoRbtn.setText("No");
        NoRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoRbtnActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ACTTxtfl, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(GPATxtfl)
                                    .addComponent(BirthDLbl)
                                    .addComponent(SATLbl)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ACTLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(GPALbl))
                                    .addComponent(FirstNameTxtfl)
                                    .addComponent(BirtdateTxtfl)
                                    .addComponent(SATTxtfl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ThirdMLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastNameLbl)
                                    .addComponent(SecondMLbl)
                                    .addComponent(FIRSTMLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastNameTxtfl, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(EmailTxtfl)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)))
                            .addComponent(FrontNamelbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNamwLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IsIntLbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ToeflLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(NoRbtn))
                                    .addComponent(YesRbtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IELTSLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(56, 97, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FrontNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNamwLbl)
                    .addComponent(LastNameLbl))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BirthDLbl)
                    .addComponent(EmailLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BirtdateTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SATLbl)
                    .addComponent(FIRSTMLbl))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SATTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ACTLbl)
                    .addComponent(SecondMLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GPATxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GPALbl)
                    .addComponent(ThirdMLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACTTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IsIntLbl)
                    .addComponent(YesRbtn)
                    .addComponent(NoRbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToeflLbl)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IELTSLbl)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoRbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoRbtnActionPerformed

    private void YesRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesRbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YesRbtnActionPerformed

    private void LastNameTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTxtflActionPerformed

    private void EmailTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTxtflActionPerformed

    private void FirstNameTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameTxtflActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void SATTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SATTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SATTxtflActionPerformed

    private void GPATxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPATxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GPATxtflActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(DetailedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACTLbl;
    private javax.swing.JTextField ACTTxtfl;
    private javax.swing.JTextField BirtdateTxtfl;
    private javax.swing.JLabel BirthDLbl;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JTextField EmailTxtfl;
    private javax.swing.JLabel FIRSTMLbl;
    private javax.swing.JTextField FirstNameTxtfl;
    private javax.swing.JLabel FirstNamwLbl;
    private javax.swing.JLabel FrontNamelbl;
    private javax.swing.JLabel GPALbl;
    private javax.swing.JTextField GPATxtfl;
    private javax.swing.JLabel IELTSLbl;
    private javax.swing.JLabel IsIntLbl;
    private javax.swing.JLabel LastNameLbl;
    private javax.swing.JTextField LastNameTxtfl;
    private javax.swing.JRadioButton NoRbtn;
    private javax.swing.JLabel SATLbl;
    private javax.swing.JTextField SATTxtfl;
    private javax.swing.JLabel SecondMLbl;
    private javax.swing.JLabel ThirdMLbl;
    private javax.swing.JLabel ToeflLbl;
    private javax.swing.JRadioButton YesRbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}

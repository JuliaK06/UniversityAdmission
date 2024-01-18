/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bg.smg;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author A
 */
public class ApplicationPanel extends javax.swing.JPanel {
    
    Application a;

    /**
     * Creates new form ApplicationPanel
     * @param parent
     */
    public ApplicationPanel( Application a) {
        
        initComponents();
        FNameTxtf.setText(a.getStudent().getFirstName()); 
        FNameTxtf.setEditable(false);
        LNameTxtfl.setText(a.getStudent().getLastName());
        LNameTxtfl.setEditable(false);
        GPATxtfl.setText(Double.toString(a.getGPA()));
        GPATxtfl.setEditable(false);
        
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FirstNameLbl = new javax.swing.JLabel();
        LastNameLbl = new javax.swing.JLabel();
        GPALbl = new javax.swing.JLabel();
        DetailsBtn = new javax.swing.JButton();
        RedactBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        FNameTxtf = new javax.swing.JTextField();
        LNameTxtfl = new javax.swing.JTextField();
        GPATxtfl = new javax.swing.JTextField();

        setBackground(new java.awt.Color(205, 225, 238));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(420, 140));

        FirstNameLbl.setText("First name:");

        LastNameLbl.setText("Last name:");

        GPALbl.setText("GPA:");

        DetailsBtn.setText("Details");
        DetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsBtnActionPerformed(evt);
            }
        });

        RedactBtn.setText("Redact");
        RedactBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedactBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstNameLbl)
                    .addComponent(LastNameLbl)
                    .addComponent(GPALbl))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LNameTxtfl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(FNameTxtf, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GPATxtfl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DetailsBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RedactBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DetailsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RedactBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteBtn)
                            .addComponent(GPATxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FNameTxtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstNameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LNameTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GPALbl)
                        .addGap(7, 7, 7)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RedactBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedactBtnActionPerformed
  
    }//GEN-LAST:event_RedactBtnActionPerformed

    private void DetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsBtnActionPerformed
       ( new DetailedView(a)).setVisible(true);  
        
    }//GEN-LAST:event_DetailsBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
   
    }//GEN-LAST:event_DeleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DetailsBtn;
    private javax.swing.JTextField FNameTxtf;
    private javax.swing.JLabel FirstNameLbl;
    private javax.swing.JLabel GPALbl;
    private javax.swing.JTextField GPATxtfl;
    private javax.swing.JTextField LNameTxtfl;
    private javax.swing.JLabel LastNameLbl;
    private javax.swing.JButton RedactBtn;
    // End of variables declaration//GEN-END:variables
}

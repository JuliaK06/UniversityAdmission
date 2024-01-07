/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bg.smg;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Mimi
 */
public class MainFrame extends javax.swing.JFrame {

    List<Application> applications;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        applications = new ArrayList();
        WhenInternationalPnl.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IfInternationalStudentButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        EmailLbl = new javax.swing.JLabel();
        EmailTxtfl = new javax.swing.JTextField();
        FirstNameLbl = new javax.swing.JLabel();
        FirstNameTxtfl = new javax.swing.JTextField();
        LastNameLbl = new javax.swing.JLabel();
        LastNameTxtfl = new javax.swing.JTextField();
        DateOfBirthLbl = new javax.swing.JLabel();
        BirthDateFtxf = new javax.swing.JFormattedTextField();
        SATLbl = new javax.swing.JLabel();
        SATScoreTxtfl = new javax.swing.JFormattedTextField();
        ACTLbl = new javax.swing.JLabel();
        ACTScoreTxtfl = new javax.swing.JFormattedTextField();
        GPALbl = new javax.swing.JLabel();
        GPATxtfl = new javax.swing.JFormattedTextField();
        FirstMajorLbl = new javax.swing.JLabel();
        FirstMajorComboBox = new javax.swing.JComboBox<>();
        SecondMajorLbl = new javax.swing.JLabel();
        SecondMajorComboBox = new javax.swing.JComboBox<>();
        ThirdMajorLbl = new javax.swing.JLabel();
        ThirdMajorComboBox = new javax.swing.JComboBox<>();
        IsInternstionalLbl = new javax.swing.JLabel();
        WhenInternationalPnl = new javax.swing.JPanel();
        ToefScoreLbl = new javax.swing.JLabel();
        ToeflTxtfl = new javax.swing.JTextField();
        IeltsScoreLbl = new javax.swing.JLabel();
        IeltsTxtfl = new javax.swing.JTextField();
        YesRBtn = new javax.swing.JRadioButton();
        NoRBtn = new javax.swing.JRadioButton();
        SaveBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        EmailLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmailLbl.setText("Email:");

        FirstNameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FirstNameLbl.setText("First name:");

        FirstNameTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTxtflActionPerformed(evt);
            }
        });

        LastNameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LastNameLbl.setText("Last name:");

        LastNameTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTxtflActionPerformed(evt);
            }
        });

        DateOfBirthLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DateOfBirthLbl.setText("Date of birth:");

        BirthDateFtxf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yy"))));
        BirthDateFtxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthDateFtxfActionPerformed(evt);
            }
        });

        SATLbl.setText("SAT score:");

        SATScoreTxtfl.setText("Enter SAT score");
        SATScoreTxtfl.setToolTipText("");
        SATScoreTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SATScoreTxtflActionPerformed(evt);
            }
        });

        ACTLbl.setText("ACT score");

        ACTScoreTxtfl.setText("Enter ACT score");
        ACTScoreTxtfl.setToolTipText("");
        ACTScoreTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTScoreTxtflActionPerformed(evt);
            }
        });

        GPALbl.setText("GPA:");

        GPATxtfl.setText("Enter GPA");

        FirstMajorLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FirstMajorLbl.setText("1. Select first major");

        FirstMajorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Architecture", "Biology", "Business ", "Computer Science", "Engineering", "History", "Law", "Maths" }));
        FirstMajorComboBox.setToolTipText("");
        FirstMajorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstMajorComboBoxActionPerformed(evt);
            }
        });

        SecondMajorLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SecondMajorLbl.setText("2. Select second major");

        SecondMajorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Architecture", "Biology", "Business ", "Computer Science", "Engineering", "History", "Law", "Maths" }));

        ThirdMajorLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ThirdMajorLbl.setText("3. Select third major");

        ThirdMajorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Architecture", "Biology", "Business ", "Computer Science", "Engineering", "History", "Law", "Maths" }));

        IsInternstionalLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IsInternstionalLbl.setText("Are you an international student ?");

        WhenInternationalPnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        ToefScoreLbl.setText("Enter Toefl score:");

        ToeflTxtfl.setText("Score");

        IeltsScoreLbl.setText("Enter IELTS score:");

        IeltsTxtfl.setText("Score");
        IeltsTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IeltsTxtflActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WhenInternationalPnlLayout = new javax.swing.GroupLayout(WhenInternationalPnl);
        WhenInternationalPnl.setLayout(WhenInternationalPnlLayout);
        WhenInternationalPnlLayout.setHorizontalGroup(
            WhenInternationalPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhenInternationalPnlLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(WhenInternationalPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(WhenInternationalPnlLayout.createSequentialGroup()
                        .addComponent(IeltsScoreLbl)
                        .addGap(18, 18, 18)
                        .addComponent(IeltsTxtfl))
                    .addGroup(WhenInternationalPnlLayout.createSequentialGroup()
                        .addComponent(ToefScoreLbl)
                        .addGap(18, 18, 18)
                        .addComponent(ToeflTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WhenInternationalPnlLayout.setVerticalGroup(
            WhenInternationalPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhenInternationalPnlLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(WhenInternationalPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToefScoreLbl)
                    .addComponent(ToeflTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(WhenInternationalPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IeltsScoreLbl)
                    .addComponent(IeltsTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        IfInternationalStudentButtonGroup.add(YesRBtn);
        YesRBtn.setText("Yes");
        YesRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesRBtnActionPerformed(evt);
            }
        });

        IfInternationalStudentButtonGroup.add(NoRBtn);
        NoRBtn.setText("No");
        NoRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoRBtnActionPerformed(evt);
            }
        });

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(IsInternstionalLbl)
                                    .addGap(18, 18, 18)
                                    .addComponent(YesRBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(NoRBtn))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(FirstMajorLbl)
                                    .addGap(39, 39, 39)
                                    .addComponent(FirstMajorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DateOfBirthLbl)
                                        .addComponent(EmailLbl)
                                        .addComponent(FirstNameLbl)
                                        .addComponent(LastNameLbl))
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BirthDateFtxf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EmailTxtfl)
                                        .addComponent(FirstNameTxtfl)
                                        .addComponent(LastNameTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ThirdMajorLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ThirdMajorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SecondMajorLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(SecondMajorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SATLbl)
                                        .addComponent(ACTLbl)
                                        .addComponent(GPALbl))
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(GPATxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ACTScoreTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SATScoreTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap(41, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(SaveBtn)
                            .addGap(159, 159, 159))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(WhenInternationalPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EmailLbl)
                        .addComponent(EmailTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FirstNameLbl)
                        .addComponent(FirstNameTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LastNameLbl)
                        .addComponent(LastNameTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DateOfBirthLbl)
                        .addComponent(BirthDateFtxf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SATLbl)
                        .addComponent(SATScoreTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ACTLbl)
                        .addComponent(ACTScoreTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GPALbl)
                        .addComponent(GPATxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FirstMajorLbl)
                        .addComponent(FirstMajorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SecondMajorLbl)
                        .addComponent(SecondMajorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ThirdMajorLbl)
                        .addComponent(ThirdMajorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IsInternstionalLbl)
                        .addComponent(YesRBtn)
                        .addComponent(NoRBtn))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(WhenInternationalPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(SaveBtn)
                    .addContainerGap()))
        );

        YesRBtn.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        jMenu1.setText("New");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sort");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoRBtnActionPerformed
        WhenInternationalPnl.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_NoRBtnActionPerformed

    private void IeltsTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IeltsTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IeltsTxtflActionPerformed

    private void FirstNameTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameTxtflActionPerformed

    private void LastNameTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTxtflActionPerformed

    private void YesRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesRBtnActionPerformed
        WhenInternationalPnl.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_YesRBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        Application appl = new Application();
        Student s = new Student();
        if (YesRBtn.isSelected()) {
            s = new InternationalStudent();
            ((InternationalStudent) s).setTOEFlscore(Integer.parseInt(ToeflTxtfl.getText()));
            ((InternationalStudent) s).setIELTSscore(Double.parseDouble(IeltsTxtfl.getText()));
        }
        s.setEmail(EmailTxtfl.getText());
        s.setFirstName(FirstNameTxtfl.getText());
        s.setLastName(LastNameTxtfl.getText());
        s.setBirthDate((Date) BirthDateFtxf.getValue());
        appl.setStudent(s);
        appl.setACT(Integer.parseInt(ACTScoreTxtfl.getText()));
        appl.setSAT(Integer.parseInt(SATScoreTxtfl.getText()));
        appl.setGPA(Double.parseDouble(GPATxtfl.getText()));
        List<String> majors = new ArrayList();
        String m1 = FirstMajorComboBox.getSelectedItem().toString();
        majors.add(m1);
        String m2 = SecondMajorComboBox.getSelectedItem().toString();
        majors.add(m2);
        String m3 = ThirdMajorComboBox.getSelectedItem().toString();
        majors.add(m3);
        appl.setListMajors(majors);
        applications.add(appl);
        
        FirstMajorComboBox.setSelectedIndex(0);
        SecondMajorComboBox.setSelectedIndex(0);
        ThirdMajorComboBox.setSelectedIndex(0);
        ACTScoreTxtfl.setText("Enter ACT score");
        SATScoreTxtfl.setText("Enter ACT score");
        GPATxtfl.setText("Enter GPA score");
        EmailTxtfl.setText("");
        FirstNameTxtfl.setText("");
        LastNameTxtfl.setText("");
        IeltsTxtfl.setText("Score");
        ToeflTxtfl.setText("Score");

    }//GEN-LAST:event_SaveBtnActionPerformed

    private void FirstMajorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstMajorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstMajorComboBoxActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:

        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void BirthDateFtxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthDateFtxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BirthDateFtxfActionPerformed

    private void SATScoreTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SATScoreTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SATScoreTxtflActionPerformed

    private void ACTScoreTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTScoreTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACTScoreTxtflActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACTLbl;
    private javax.swing.JFormattedTextField ACTScoreTxtfl;
    private javax.swing.JFormattedTextField BirthDateFtxf;
    private javax.swing.JLabel DateOfBirthLbl;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JTextField EmailTxtfl;
    private javax.swing.JComboBox<String> FirstMajorComboBox;
    private javax.swing.JLabel FirstMajorLbl;
    private javax.swing.JLabel FirstNameLbl;
    private javax.swing.JTextField FirstNameTxtfl;
    private javax.swing.JLabel GPALbl;
    private javax.swing.JFormattedTextField GPATxtfl;
    private javax.swing.JLabel IeltsScoreLbl;
    private javax.swing.JTextField IeltsTxtfl;
    private javax.swing.ButtonGroup IfInternationalStudentButtonGroup;
    private javax.swing.JLabel IsInternstionalLbl;
    private javax.swing.JLabel LastNameLbl;
    private javax.swing.JTextField LastNameTxtfl;
    private javax.swing.JRadioButton NoRBtn;
    private javax.swing.JLabel SATLbl;
    private javax.swing.JFormattedTextField SATScoreTxtfl;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JComboBox<String> SecondMajorComboBox;
    private javax.swing.JLabel SecondMajorLbl;
    private javax.swing.JComboBox<String> ThirdMajorComboBox;
    private javax.swing.JLabel ThirdMajorLbl;
    private javax.swing.JLabel ToefScoreLbl;
    private javax.swing.JTextField ToeflTxtfl;
    private javax.swing.JPanel WhenInternationalPnl;
    private javax.swing.JRadioButton YesRBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

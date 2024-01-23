/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bg.smg;




import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import javax.swing.JTextField;
import javax.swing.text.DateFormatter;

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
         ACTScoreTxtfl.setSize(108, 23);
SATScoreTxtfl.setSize(108, 23);
GPATxtfl.setSize(108, 23);
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        SaveBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(560, 800));

        jPanel1.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 700));

        EmailLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        EmailLbl.setText("Email:");

        EmailTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTxtflActionPerformed(evt);
            }
        });

        FirstNameLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        FirstNameLbl.setText("First name:");

        FirstNameTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTxtflActionPerformed(evt);
            }
        });

        LastNameLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        LastNameLbl.setText("Last name:");

        LastNameTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTxtflActionPerformed(evt);
            }
        });

        DateOfBirthLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        DateOfBirthLbl.setText("Date of birth:");

        BirthDateFtxf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yy"))));
        BirthDateFtxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthDateFtxfActionPerformed(evt);
            }
        });

        SATLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        SATLbl.setText("Enter SAT score:");

        SATScoreTxtfl.setToolTipText("");
        SATScoreTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SATScoreTxtflActionPerformed(evt);
            }
        });

        ACTLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        ACTLbl.setText("Enter ACT score:");

        ACTScoreTxtfl.setToolTipText("");
        ACTScoreTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTScoreTxtflActionPerformed(evt);
            }
        });

        GPALbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        GPALbl.setText("Enter GPA :");

        GPATxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPATxtflActionPerformed(evt);
            }
        });

        FirstMajorLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        FirstMajorLbl.setText("1. Select first major");

        FirstMajorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Architecture", "Biology", "Business ", "Computer Science", "Engineering", "History", "Law", "Maths" }));
        FirstMajorComboBox.setToolTipText("");
        FirstMajorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstMajorComboBoxActionPerformed(evt);
            }
        });

        SecondMajorLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        SecondMajorLbl.setText("2. Select second major");

        SecondMajorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Architecture", "Biology", "Business ", "Computer Science", "Engineering", "History", "Law", "Maths" }));

        ThirdMajorLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        ThirdMajorLbl.setText("3. Select third major");

        ThirdMajorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Architecture", "Biology", "Business ", "Computer Science", "Engineering", "History", "Law", "Maths" }));

        IsInternstionalLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        IsInternstionalLbl.setText("Are you an international student ?");

        WhenInternationalPnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        ToefScoreLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
        ToefScoreLbl.setText("Enter Toefl score:");

        ToeflTxtfl.setText("Score");
        ToeflTxtfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToeflTxtflActionPerformed(evt);
            }
        });

        IeltsScoreLbl.setFont(new java.awt.Font("Muna", 0, 14)); // NOI18N
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
                .addGap(80, 80, 80)
                .addGroup(WhenInternationalPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IeltsScoreLbl)
                    .addComponent(ToefScoreLbl))
                .addGap(44, 44, 44)
                .addGroup(WhenInternationalPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IeltsTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToeflTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        WhenInternationalPnlLayout.setVerticalGroup(
            WhenInternationalPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhenInternationalPnlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(WhenInternationalPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToefScoreLbl)
                    .addComponent(ToeflTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(WhenInternationalPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IeltsScoreLbl)
                    .addComponent(IeltsTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
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

        jLabel1.setFont(new java.awt.Font("Muna", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("University Admission Form");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SATLbl)
                            .addComponent(ACTLbl)
                            .addComponent(GPALbl))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ACTScoreTxtfl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(GPATxtfl)
                            .addComponent(SATScoreTxtfl)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FirstMajorLbl)
                        .addGap(44, 44, 44)
                        .addComponent(FirstMajorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(IsInternstionalLbl)
                        .addGap(18, 18, 18)
                        .addComponent(YesRBtn)
                        .addGap(18, 18, 18)
                        .addComponent(NoRBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateOfBirthLbl)
                            .addComponent(EmailLbl)
                            .addComponent(FirstNameLbl)
                            .addComponent(LastNameLbl))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(LastNameTxtfl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                .addComponent(FirstNameTxtfl, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(BirthDateFtxf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(171, 171, 171))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveBtn)
                .addGap(239, 239, 239))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WhenInternationalPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EmailTxtfl, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
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
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BirthDateFtxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateOfBirthLbl))
                .addGap(26, 26, 26)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
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
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IsInternstionalLbl)
                    .addComponent(YesRBtn)
                    .addComponent(NoRBtn))
                .addGap(30, 30, 30)
                .addComponent(WhenInternationalPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SaveBtn)
                .addGap(10, 10, 10))
        );

        YesRBtn.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );

        jMenu1.setText("New");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed

        Application appl = new Application();   
        Student s = new Student();
        if (YesRBtn.isSelected()) {
            s = new InternationalStudent();
            ((InternationalStudent) s).setTOEFlscore(Integer.parseInt(ToeflTxtfl.getText()));
            ((InternationalStudent) s).setIELTSscore(Double.parseDouble(IeltsTxtfl.getText()));
        }
         Date date=(Date) BirthDateFtxf.getValue();
    s.setBirthDate(Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate());
        s.setEmail(EmailTxtfl.getText());
        s.setFirstName(FirstNameTxtfl.getText());
        s.setLastName(LastNameTxtfl.getText());
       
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
        boolean shouldBeSaved=true;
         for(Application app: applications){
         if(app.equals(appl)){
             shouldBeSaved=false;
             break;
         }}
         if(shouldBeSaved){
         applications.add(appl);
         }
        
                
        System.out.println(applications.toString());
        
        FirstMajorComboBox.setSelectedIndex(0);
        SecondMajorComboBox.setSelectedIndex(0);
        ThirdMajorComboBox.setSelectedIndex(0);
        EmailTxtfl.setText("");
        BirthDateFtxf.setValue(null);
        FirstNameTxtfl.setText("");
        LastNameTxtfl.setText("");
        SATScoreTxtfl.setText("");
        ACTScoreTxtfl.setText("");
        GPATxtfl.setText("");
        ToeflTxtfl.setText("");
        IeltsTxtfl.setText("");
         
IfInternationalStudentButtonGroup.clearSelection();
WhenInternationalPnl.setVisible(false);
    }//GEN-LAST:event_SaveBtnActionPerformed


    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked
 
    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:

        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        generateAppPanels();
        
          
    }//GEN-LAST:event_jMenu2MouseClicked
private void generateAppPanels(){
int i=0;
        
         for(Application app: applications){
            ApplicationPanel AppPan= new ApplicationPanel( this,app);
            AppPan.setBounds(50, (i*130+20), 445, 130);
         
             jPanel2.add(AppPan);
             
             AppPan.a=app;
             
             AppPan.setVisible(true);
             i++;
         }}
    private void NoRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoRBtnActionPerformed
        WhenInternationalPnl.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_NoRBtnActionPerformed

    private void YesRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesRBtnActionPerformed
        WhenInternationalPnl.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_YesRBtnActionPerformed

    private void IeltsTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IeltsTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IeltsTxtflActionPerformed

    private void ToeflTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToeflTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToeflTxtflActionPerformed

    private void FirstMajorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstMajorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstMajorComboBoxActionPerformed

    private void GPATxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPATxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GPATxtflActionPerformed

    private void ACTScoreTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTScoreTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACTScoreTxtflActionPerformed

    private void SATScoreTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SATScoreTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SATScoreTxtflActionPerformed

    private void BirthDateFtxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthDateFtxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BirthDateFtxfActionPerformed

    private void LastNameTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTxtflActionPerformed

    private void FirstNameTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameTxtflActionPerformed

    private void EmailTxtflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTxtflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTxtflActionPerformed


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
    public void edit(Application a){
       
        jPanel1.setVisible(true);
        jPanel2.setVisible(false); 
        ACTScoreTxtfl.setText(Integer.toString(a.getACT()));
        SATScoreTxtfl.setText(Integer.toString(a.getSAT()));
        GPATxtfl.setText(Double.toString(a.getGPA()));
        FirstNameTxtfl.setText(a.getStudent().getFirstName());
        LastNameTxtfl.setText(a.getStudent().getLastName());
        EmailTxtfl.setText(a.getStudent().getEmail());
        ZoneId defaultZoneId = ZoneId.systemDefault();
        Date date = Date.from((a.getStudent().getBirthDate()).atStartOfDay(defaultZoneId).toInstant());
       BirthDateFtxf.setValue(date);
        FirstMajorComboBox.setSelectedItem(a.getListMajors().get(0));
        SecondMajorComboBox.setSelectedItem(a.getListMajors().get(1));
        ThirdMajorComboBox.setSelectedItem(a.getListMajors().get(2));
        if(a.getStudent() instanceof InternationalStudent){
          WhenInternationalPnl.setVisible(true);
          YesRBtn.setSelected(true);
          ToeflTxtfl.setText(Integer.toString(((InternationalStudent)a.getStudent()).getTOEFlscore()));
          IeltsTxtfl.setText(Double.toString(((InternationalStudent)a.getStudent()).getIELTSscore()));
          }
        else {NoRBtn.setSelected(true);
        delete(a);
        }
     
}
    public void delete(Application a){
     for(int i=0;i<this.applications.size();i++){
        if(this.applications.get(i).equals(a)){
            this.applications.remove(i);
        }
    }
   
    }
public void detailedView(Application a){
  ( new DetailedView(a)).setVisible(true);  
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
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}

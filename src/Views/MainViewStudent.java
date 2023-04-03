package Views;

import Controllers.StudentsController;
import Controllers.UsersController;
import Misc.Pair;
import Models.Student;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class MainViewStudent extends javax.swing.JPanel {

    private final Color background;
    private final Color foreground;
    private final Color lightBackground;
    private final Color activeForeground;
    private JLabel lastSwitched = null;
    private CardLayout cardLayout;
    private StudentsController studentController;

    public MainViewStudent(UsersController userController) {
        background = new Color(43, 56, 65);
        foreground = new Color(191, 205, 214);
        lightBackground = new Color(60, 73, 82);
        activeForeground = new Color(77, 133, 114);
        initComponents();
        this.studentController = new StudentsController(userController.getCurrentUser());
        lastSwitched = dashboardLabel;
        setLabelColor(dashboardLabel, background, activeForeground);
        cardLayout = (CardLayout) mainViewCardLayout.getLayout();
        cardLayout.show(mainViewCardLayout, "dashboardPanel");
        setStudentDashboard();

    }

    private void setStudentDashboard() {
        studentNameLabel.setText(studentController.getFullName());
        studentEmailLabel.setText(studentController.getEmail());
        matriculationNrLabel.setText(((Student) studentController.getUser()).getMatriculationNr());
        birthdateLabel.setText(studentController.getUser().getBirthDate().toString());
        residenceLabel.setText(studentController.getUser().getResidence().toString());
        try {
            classLabel.setText(studentController.getStudentClass().getName());
        } catch (SQLException ex) {
            Logger.getLogger(MainViewStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            classMasterLabel.setText(studentController.getStudentClassProfessor().getFirstName() + ' ' + studentController.getStudentClassProfessor().getLastName());
        } catch (SQLException ex) {
            Logger.getLogger(MainViewStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SideMenu = new Views.PanelRound();
        titleLabel = new javax.swing.JLabel();
        dashboardLabel = new javax.swing.JLabel();
        gradesLabel = new javax.swing.JLabel();
        scheduleLabel = new javax.swing.JLabel();
        absencesLabel = new javax.swing.JLabel();
        mainViewCardLayout = new Views.PanelRound();
        dashboardPanel = new Views.PanelRound();
        studentNameLabel = new javax.swing.JLabel();
        studentEmailLabel = new javax.swing.JLabel();
        panelRound1 = new Views.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        matriculationNrLabel = new javax.swing.JLabel();
        residenceLabel = new javax.swing.JLabel();
        birthdateLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        classMasterLabel = new javax.swing.JLabel();
        gradesPanel = new Views.PanelRound();
        schedulePanel = new Views.PanelRound();
        scheduleTitleLabel = new javax.swing.JLabel();
        panelRound2 = new Views.PanelRound();
        mondayPanel = new javax.swing.JPanel();
        tuesdayPanel = new javax.swing.JPanel();
        wednesdayPanel = new javax.swing.JPanel();
        thursdayPanel = new javax.swing.JPanel();
        fridayPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mondayStartTime = new javax.swing.JLabel();
        tuesdayStartTime = new javax.swing.JLabel();
        wednesdayStartTime = new javax.swing.JLabel();
        thursdayStartTime = new javax.swing.JLabel();
        fridayStartTime = new javax.swing.JLabel();
        absencesPanel = new Views.PanelRound();
        absencesScrollPanel = new javax.swing.JScrollPane();
        absencesTable = new javax.swing.JTable();
        semesterLabel = new javax.swing.JLabel();
        semesterOption = new javax.swing.JComboBox<>();
        absencesTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(43, 56, 65));
        setPreferredSize(new java.awt.Dimension(900, 600));

        SideMenu.setBackground(new java.awt.Color(60, 73, 82));
        SideMenu.setRoundBottomLeft(25);
        SideMenu.setRoundBottomRight(25);
        SideMenu.setRoundTopLeft(25);
        SideMenu.setRoundTopRight(25);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(191, 205, 214));
        titleLabel.setIcon(new javax.swing.ImageIcon("C:\\Informatica\\An 2\\Sem2\\PAO\\ECatalogV2\\src\\Misc\\logo.png")); // NOI18N
        titleLabel.setText("ECatalog");

        dashboardLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dashboardLabel.setBackground(new java.awt.Color(43, 56, 65));
        dashboardLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dashboardLabel.setForeground(new java.awt.Color(191, 205, 214));
        dashboardLabel.setText("Dashboard");
        dashboardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardLabelMouseClicked(evt);
            }
        });

        gradesLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gradesLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gradesLabel.setForeground(new java.awt.Color(191, 205, 214));
        gradesLabel.setText("Grades");
        gradesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradesLabelMouseClicked(evt);
            }
        });

        scheduleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scheduleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        scheduleLabel.setForeground(new java.awt.Color(191, 205, 214));
        scheduleLabel.setText("Schedule");
        scheduleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleLabelMouseClicked(evt);
            }
        });

        absencesLabel.setHorizontalAlignment(SwingConstants.CENTER);
        absencesLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        absencesLabel.setForeground(new java.awt.Color(191, 205, 214));
        absencesLabel.setText("Absences");
        absencesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                absencesLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SideMenuLayout = new javax.swing.GroupLayout(SideMenu);
        SideMenu.setLayout(SideMenuLayout);
        SideMenuLayout.setHorizontalGroup(
            SideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SideMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titleLabel)
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(gradesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scheduleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(absencesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SideMenuLayout.setVerticalGroup(
            SideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideMenuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(titleLabel)
                .addGap(48, 48, 48)
                .addComponent(dashboardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(gradesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scheduleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(absencesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainViewCardLayout.setBackground(new java.awt.Color(60, 73, 82));
        mainViewCardLayout.setRoundBottomLeft(25);
        mainViewCardLayout.setRoundBottomRight(25);
        mainViewCardLayout.setRoundTopLeft(25);
        mainViewCardLayout.setRoundTopRight(25);
        mainViewCardLayout.setLayout(new java.awt.CardLayout());

        dashboardPanel.setBackground(new java.awt.Color(60, 73, 82));
        dashboardPanel.setRoundBottomLeft(25);
        dashboardPanel.setRoundBottomRight(25);
        dashboardPanel.setRoundTopLeft(25);
        dashboardPanel.setRoundTopRight(25);

        studentNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        studentNameLabel.setForeground(new java.awt.Color(191, 205, 214));

        studentEmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentEmailLabel.setForeground(new java.awt.Color(191, 205, 214));

        panelRound1.setBackground(new java.awt.Color(60, 73, 82));
        panelRound1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(43, 56, 65), 2, true));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(191, 205, 214));
        jLabel3.setText("Matriculation Number:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 205, 214));
        jLabel4.setText("Personal Information");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 205, 214));
        jLabel5.setText("Birth Date:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(191, 205, 214));
        jLabel6.setText("Class Master:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(191, 205, 214));
        jLabel7.setText("Residence:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(191, 205, 214));
        jLabel8.setText("Class:");

        matriculationNrLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        matriculationNrLabel.setForeground(new java.awt.Color(191, 205, 214));

        residenceLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        residenceLabel.setForeground(new java.awt.Color(191, 205, 214));

        birthdateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        birthdateLabel.setForeground(new java.awt.Color(191, 205, 214));

        classLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        classLabel.setForeground(new java.awt.Color(191, 205, 214));

        classMasterLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        classMasterLabel.setForeground(new java.awt.Color(191, 205, 214));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(197, 197, 197))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classLabel))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matriculationNrLabel))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classMasterLabel))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthdateLabel))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(residenceLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(matriculationNrLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(birthdateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(residenceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(classLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(classMasterLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentNameLabel)
                    .addComponent(studentEmailLabel)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(studentNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentEmailLabel)
                .addGap(26, 26, 26)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );

        mainViewCardLayout.add(dashboardPanel, "dashboardPanel");

        gradesPanel.setBackground(new java.awt.Color(60, 73, 82));
        gradesPanel.setRoundBottomLeft(25);
        gradesPanel.setRoundBottomRight(25);
        gradesPanel.setRoundTopLeft(25);
        gradesPanel.setRoundTopRight(25);

        javax.swing.GroupLayout gradesPanelLayout = new javax.swing.GroupLayout(gradesPanel);
        gradesPanel.setLayout(gradesPanelLayout);
        gradesPanelLayout.setHorizontalGroup(
            gradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        gradesPanelLayout.setVerticalGroup(
            gradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        mainViewCardLayout.add(gradesPanel, "gradesPanel");

        schedulePanel.setBackground(new java.awt.Color(60, 73, 82));
        schedulePanel.setForeground(new java.awt.Color(60, 73, 82));
        schedulePanel.setToolTipText("");
        schedulePanel.setRoundBottomLeft(25);
        schedulePanel.setRoundBottomRight(25);
        schedulePanel.setRoundTopLeft(25);
        schedulePanel.setRoundTopRight(25);

        scheduleTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        scheduleTitleLabel.setForeground(new java.awt.Color(191, 205, 214));
        scheduleTitleLabel.setText("Schedule");

        panelRound2.setBackground(lightBackground);
        panelRound2.setForeground(foreground);
        panelRound2.setRoundBottomLeft(25);
        panelRound2.setRoundBottomRight(25);
        panelRound2.setRoundTopLeft(25);
        panelRound2.setRoundTopRight(25);

        mondayPanel.setBackground(lightBackground);
        mondayPanel.setPreferredSize(new java.awt.Dimension(127, 480));
        mondayPanel.setLayout(new GridLayout(8, 1, 0, 0));

        javax.swing.GroupLayout mondayPanelLayout = new javax.swing.GroupLayout(mondayPanel);
        mondayPanel.setLayout(mondayPanelLayout);
        mondayPanelLayout.setHorizontalGroup(
            mondayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        mondayPanelLayout.setVerticalGroup(
            mondayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        tuesdayPanel.setBackground(lightBackground);
        tuesdayPanel.setPreferredSize(new java.awt.Dimension(127, 480));
        tuesdayPanel.setLayout(new GridLayout(8, 1, 0, 0));

        javax.swing.GroupLayout tuesdayPanelLayout = new javax.swing.GroupLayout(tuesdayPanel);
        tuesdayPanel.setLayout(tuesdayPanelLayout);
        tuesdayPanelLayout.setHorizontalGroup(
            tuesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        tuesdayPanelLayout.setVerticalGroup(
            tuesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        wednesdayPanel.setBackground(lightBackground);
        wednesdayPanel.setPreferredSize(new java.awt.Dimension(127, 480));
        wednesdayPanel.setLayout(new GridLayout(8, 1, 0, 0));

        javax.swing.GroupLayout wednesdayPanelLayout = new javax.swing.GroupLayout(wednesdayPanel);
        wednesdayPanel.setLayout(wednesdayPanelLayout);
        wednesdayPanelLayout.setHorizontalGroup(
            wednesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        wednesdayPanelLayout.setVerticalGroup(
            wednesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        thursdayPanel.setBackground(lightBackground);
        thursdayPanel.setPreferredSize(new java.awt.Dimension(127, 480));
        thursdayPanel.setLayout(new GridLayout(8, 1, 0, 0));

        javax.swing.GroupLayout thursdayPanelLayout = new javax.swing.GroupLayout(thursdayPanel);
        thursdayPanel.setLayout(thursdayPanelLayout);
        thursdayPanelLayout.setHorizontalGroup(
            thursdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        thursdayPanelLayout.setVerticalGroup(
            thursdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        fridayPanel.setBackground(lightBackground);
        fridayPanel.setPreferredSize(new java.awt.Dimension(126, 0));
        fridayPanel.setLayout(new GridLayout(8, 1, 0, 0));

        javax.swing.GroupLayout fridayPanelLayout = new javax.swing.GroupLayout(fridayPanel);
        fridayPanel.setLayout(fridayPanelLayout);
        fridayPanelLayout.setHorizontalGroup(
            fridayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        fridayPanelLayout.setVerticalGroup(
            fridayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(foreground);
        jLabel1.setText("Monday");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(foreground);
        jLabel2.setText("Tuesday");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(foreground);
        jLabel9.setText("Wednesday");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(foreground);
        jLabel10.setText("Thursday");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(foreground);
        jLabel11.setText("Friday");

        mondayStartTime.setForeground(foreground);
        mondayStartTime.setText("jLabel12");

        tuesdayStartTime.setForeground(foreground);
        tuesdayStartTime.setText("jLabel13");

        wednesdayStartTime.setForeground(foreground);
        wednesdayStartTime.setText("jLabel14");

        thursdayStartTime.setForeground(foreground);
        thursdayStartTime.setText("jLabel15");

        fridayStartTime.setForeground(foreground);
        fridayStartTime.setText("jLabel16");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(mondayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tuesdayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(wednesdayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(thursdayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(fridayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(mondayStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(tuesdayStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(wednesdayStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thursdayStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fridayStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mondayStartTime)
                    .addComponent(tuesdayStartTime)
                    .addComponent(wednesdayStartTime)
                    .addComponent(thursdayStartTime)
                    .addComponent(fridayStartTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mondayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tuesdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wednesdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thursdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fridayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        mondayStartTime.setHorizontalAlignment(SwingConstants.CENTER);
        tuesdayStartTime.setHorizontalAlignment(SwingConstants.CENTER);
        wednesdayStartTime.setHorizontalAlignment(SwingConstants.CENTER);
        thursdayStartTime.setHorizontalAlignment(SwingConstants.CENTER);
        fridayStartTime.setHorizontalAlignment(SwingConstants.CENTER);

        javax.swing.GroupLayout schedulePanelLayout = new javax.swing.GroupLayout(schedulePanel);
        schedulePanel.setLayout(schedulePanelLayout);
        schedulePanelLayout.setHorizontalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedulePanelLayout.createSequentialGroup()
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(schedulePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(schedulePanelLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(scheduleTitleLabel)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        schedulePanelLayout.setVerticalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scheduleTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        mainViewCardLayout.add(schedulePanel, "schedulePanel");

        absencesPanel.setBackground(new java.awt.Color(60, 73, 82));
        absencesPanel.setForeground(new java.awt.Color(60, 73, 82));
        absencesPanel.setToolTipText("");
        absencesPanel.setRoundBottomLeft(25);
        absencesPanel.setRoundBottomRight(25);
        absencesPanel.setRoundTopLeft(25);
        absencesPanel.setRoundTopRight(25);

        absencesScrollPanel.setBackground(lightBackground);

        absencesTable.setBackground(lightBackground);
        absencesTable.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));
        absencesTable.setForeground(new java.awt.Color(191, 205, 214));
        absencesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materie", "Data"
            }
        ) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return String.class;
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    absencesTable.setToolTipText("");
    absencesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    absencesTable.setEnabled(false);
    absencesTable.setFocusable(false);
    absencesTable.setGridColor(background);
    absencesTable.setRowHeight(30);
    absencesTable.setRowSelectionAllowed(false);
    absencesTable.setSelectionBackground(new java.awt.Color(60, 73, 82));
    absencesScrollPanel.setViewportView(absencesTable);
    absencesTable.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 18));
    absencesTable.getTableHeader().setForeground(foreground);
    absencesTable.getTableHeader().setBackground(lightBackground);
    absencesTable.getTableHeader().setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, background));
    absencesTable.setBorder(BorderFactory.createLineBorder(background));
    absencesTable.getTableHeader().setOpaque(true);
    absencesTable.getTableHeader().setResizingAllowed(false);
    absencesTable.getTableHeader().setReorderingAllowed(false);
    absencesTable.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
        {
            setHorizontalAlignment(JLabel.CENTER);
            setVerticalAlignment(JLabel.CENTER);
            setOpaque(true);
            setBackground(lightBackground);
            setBorder(BorderFactory.createMatteBorder(0, 0, 5, 2, background)); // set bottom and right border to background color
            setForeground(foreground);
        }
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
            JComponent c = (JComponent) super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, column);
            c.setBorder(BorderFactory.createLineBorder(background));
            return c;
        }
    });
    absencesTable.getTableHeader().setPreferredSize(new Dimension(absencesTable.getTableHeader().getWidth(), 40));

    semesterLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    semesterLabel.setForeground(new java.awt.Color(191, 205, 214));
    semesterLabel.setText("Semestru:");

    semesterOption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    semesterOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II" }));
    semesterOption.setSelectedIndex(-1);
    semesterOption.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            semesterOptionActionPerformed(evt);
        }
    });

    absencesTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    absencesTitle.setForeground(new java.awt.Color(191, 205, 214));
    absencesTitle.setText("Absente");

    javax.swing.GroupLayout absencesPanelLayout = new javax.swing.GroupLayout(absencesPanel);
    absencesPanel.setLayout(absencesPanelLayout);
    absencesPanelLayout.setHorizontalGroup(
        absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(absencesPanelLayout.createSequentialGroup()
            .addGap(283, 283, 283)
            .addComponent(absencesTitle)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, absencesPanelLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(semesterLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(semesterOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(261, 261, 261))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, absencesPanelLayout.createSequentialGroup()
            .addContainerGap(48, Short.MAX_VALUE)
            .addComponent(absencesScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(49, 49, 49))
    );
    absencesPanelLayout.setVerticalGroup(
        absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, absencesPanelLayout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addComponent(absencesTitle)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(semesterOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(semesterLabel))
            .addGap(39, 39, 39)
            .addComponent(absencesScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    JViewport viewport = absencesScrollPanel.getViewport();
    viewport.setBackground(lightBackground);
    absencesScrollPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, background));

    mainViewCardLayout.add(absencesPanel, "absencesPanel");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(SideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(mainViewCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainViewCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(SideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void switchMenuLabel(JLabel label) {
        setLabelColor(lastSwitched, lightBackground, foreground);
        setLabelColor(label, background, activeForeground);
        lastSwitched = label;
    }

    private void dashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLabelMouseClicked
        switchMenuLabel(dashboardLabel);
        showCard("dashboardPanel");
    }//GEN-LAST:event_dashboardLabelMouseClicked

    private void scheduleLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleLabelMouseClicked
        switchMenuLabel(scheduleLabel);
        if (scheduleMatrix == null) {
            scheduleMatrix = new SchedulePanel[5][8];
            JPanel schedulePanels[] = {mondayPanel, tuesdayPanel, wednesdayPanel, thursdayPanel, fridayPanel};
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 8; j++) {
                    SchedulePanel p = new SchedulePanel("", "", lightBackground, foreground);
                    scheduleMatrix[i][j] = p;
                    schedulePanels[i].add(p);
                }
            }
        }
        try {
            JLabel startTimeLabels[] = {mondayStartTime, tuesdayStartTime, wednesdayStartTime, thursdayStartTime, fridayStartTime};
            Pair< Pair<Integer, Integer>[], ArrayList< String[]>[]> retValue = studentController.getCourses();
            ArrayList< String[]>[] courses = retValue.getSecond();
            Pair<Integer, Integer>[] lowestTimes = retValue.getFirst();

            for (int i = 0; i < courses.length; i++) {
                startTimeLabels[i].setText(String.format("%02d", lowestTimes[i].getFirst()) + ':' + String.format("%02d", lowestTimes[i].getSecond()));
                for (int j = 0; j < courses[i].size(); j++) {
                    scheduleMatrix[i][j].setSubjectName(courses[i].get(j)[0]);
                    scheduleMatrix[i][j].setProfessorName(courses[i].get(j)[1]);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainViewStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
//        System.out.println(scheduleMatrix[0][0].getComponentZOrder());
        showCard("schedulePanel");
    }//GEN-LAST:event_scheduleLabelMouseClicked

    private void gradesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesLabelMouseClicked
        switchMenuLabel(gradesLabel);
        showCard("gradesPanel");
    }//GEN-LAST:event_gradesLabelMouseClicked

    private void absencesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_absencesLabelMouseClicked
        switchMenuLabel(absencesLabel);
        showCard("absencesPanel");
    }//GEN-LAST:event_absencesLabelMouseClicked

    private void semesterOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterOptionActionPerformed
        String selectedOption = (String) semesterOption.getSelectedItem();
        try {
            ArrayList< String[]> absences = studentController.getAbsences(selectedOption);
            DefaultTableModel model = (DefaultTableModel) absencesTable.getModel();
            model.setRowCount(0);
            for (String[] row : absences) {
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainViewStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_semesterOptionActionPerformed

    private void setLabelColor(JLabel label, Color bg, Color fg) {
        label.setBackground(bg);
        label.setForeground(fg);
        label.setOpaque(true);
    }

    public void showCard(String name) {
        cardLayout.show(mainViewCardLayout, name);
    }
    private SchedulePanel[][] scheduleMatrix = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Views.PanelRound SideMenu;
    private javax.swing.JLabel absencesLabel;
    private Views.PanelRound absencesPanel;
    private javax.swing.JScrollPane absencesScrollPanel;
    private javax.swing.JTable absencesTable;
    private javax.swing.JLabel absencesTitle;
    private javax.swing.JLabel birthdateLabel;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel classMasterLabel;
    private javax.swing.JLabel dashboardLabel;
    private Views.PanelRound dashboardPanel;
    private javax.swing.JPanel fridayPanel;
    private javax.swing.JLabel fridayStartTime;
    private javax.swing.JLabel gradesLabel;
    private Views.PanelRound gradesPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Views.PanelRound mainViewCardLayout;
    private javax.swing.JLabel matriculationNrLabel;
    private javax.swing.JPanel mondayPanel;
    private javax.swing.JLabel mondayStartTime;
    private Views.PanelRound panelRound1;
    private Views.PanelRound panelRound2;
    private javax.swing.JLabel residenceLabel;
    private javax.swing.JLabel scheduleLabel;
    private Views.PanelRound schedulePanel;
    private javax.swing.JLabel scheduleTitleLabel;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JComboBox<String> semesterOption;
    private javax.swing.JLabel studentEmailLabel;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JPanel thursdayPanel;
    private javax.swing.JLabel thursdayStartTime;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel tuesdayPanel;
    private javax.swing.JLabel tuesdayStartTime;
    private javax.swing.JPanel wednesdayPanel;
    private javax.swing.JLabel wednesdayStartTime;
    // End of variables declaration//GEN-END:variables
}

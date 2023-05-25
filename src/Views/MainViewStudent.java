package Views;

import Controllers.StudentsController;
import Controllers.UsersController;
import Models.Student;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;

public class MainViewStudent extends javax.swing.JPanel {

    private final Color background;
    private final Color foreground;
    private final Color lightBackground;
    private final Color activeForeground;
    private JLabel lastSwitched = null;
    private CardLayout cardLayout;
    private StudentsController studentController;

    public class MultiLineCellRenderer extends DefaultTableCellRenderer {

        private Color cellBackgroundColor; // Specify your desired background color

        public MultiLineCellRenderer(Color backgroundColor) {
            this.cellBackgroundColor = backgroundColor;
            setOpaque(true); // Ensure the renderer is opaque
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component rendererComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            rendererComponent.setBackground(cellBackgroundColor);
            setText("<html><body style='width: 100px'>" + value + "</html></body>");
            return rendererComponent;
        }
    }

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
        gradesScrollPanel = new javax.swing.JScrollPane();
        gradesTable = new javax.swing.JTable();
        semesterLabel1 = new javax.swing.JLabel();
        semesterOption1 = new javax.swing.JComboBox<>();
        gradesTitle = new javax.swing.JLabel();
        subjectLabel = new javax.swing.JLabel();
        subjectOption = new javax.swing.JComboBox<>();
        schedulePanel = new Views.PanelRound();
        scheduleTitleLabel = new javax.swing.JLabel();
        scheduleScrollPanel = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();
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
                .addContainerGap(230, Short.MAX_VALUE))
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
                .addContainerGap(212, Short.MAX_VALUE)
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
                .addContainerGap(34, Short.MAX_VALUE))
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

        gradesScrollPanel.setBackground(lightBackground);

        gradesTable.setBackground(lightBackground);
        gradesTable.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));
        gradesTable.setForeground(new java.awt.Color(191, 205, 214));
        gradesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nota", "Data"
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
    gradesTable.setToolTipText("");
    gradesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    gradesTable.setEnabled(false);
    gradesTable.setFocusable(false);
    gradesTable.setGridColor(background);
    gradesTable.setRowHeight(30);
    gradesTable.setRowSelectionAllowed(false);
    gradesTable.setSelectionBackground(new java.awt.Color(60, 73, 82));
    gradesScrollPanel.setViewportView(gradesTable);
    gradesTable.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 18));
    gradesTable.getTableHeader().setForeground(foreground);
    gradesTable.getTableHeader().setBackground(lightBackground);
    gradesTable.getTableHeader().setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, background));
    gradesTable.setBorder(BorderFactory.createLineBorder(background));
    gradesTable.getTableHeader().setOpaque(true);
    gradesTable.getTableHeader().setResizingAllowed(false);
    gradesTable.getTableHeader().setReorderingAllowed(false);
    gradesTable.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
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
    gradesTable.getTableHeader().setPreferredSize(new Dimension(gradesTable.getTableHeader().getWidth(), 40));

    semesterLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    semesterLabel1.setForeground(new java.awt.Color(191, 205, 214));
    semesterLabel1.setText("Semester:");

    semesterOption1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    semesterOption1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II" }));
    semesterOption1.setSelectedIndex(-1);
    semesterOption1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            semesterOption1ActionPerformed(evt);
        }
    });

    gradesTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    gradesTitle.setForeground(new java.awt.Color(191, 205, 214));
    gradesTitle.setText("Grades");

    subjectLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    subjectLabel.setForeground(new java.awt.Color(191, 205, 214));
    subjectLabel.setText("Subject:");

    subjectOption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    subjectOption.setSelectedIndex(-1);
    subjectOption.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            subjectOptionActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout gradesPanelLayout = new javax.swing.GroupLayout(gradesPanel);
    gradesPanel.setLayout(gradesPanelLayout);
    gradesPanelLayout.setHorizontalGroup(
        gradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(gradesPanelLayout.createSequentialGroup()
            .addGap(149, 149, 149)
            .addComponent(semesterLabel1)
            .addGap(18, 18, 18)
            .addComponent(semesterOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(74, 74, 74)
            .addComponent(subjectLabel)
            .addGap(18, 18, 18)
            .addComponent(subjectOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradesPanelLayout.createSequentialGroup()
            .addContainerGap(48, Short.MAX_VALUE)
            .addGroup(gradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradesPanelLayout.createSequentialGroup()
                    .addComponent(gradesScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradesPanelLayout.createSequentialGroup()
                    .addComponent(gradesTitle)
                    .addGap(292, 292, 292))))
    );
    gradesPanelLayout.setVerticalGroup(
        gradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradesPanelLayout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addComponent(gradesTitle)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(gradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(semesterLabel1)
                .addComponent(subjectLabel)
                .addComponent(subjectOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(semesterOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(39, 39, 39)
            .addComponent(gradesScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(68, Short.MAX_VALUE))
    );

    JViewport viewport = gradesScrollPanel.getViewport();
    viewport.setBackground(lightBackground);
    gradesScrollPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, background));

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

    scheduleScrollPanel.setBackground(lightBackground);

    scheduleTable.setBackground(lightBackground);
    scheduleTable.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));
    scheduleTable.setForeground(new java.awt.Color(191, 205, 214));
    scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
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
    scheduleTable.setToolTipText("");
    scheduleTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    scheduleTable.setEnabled(false);
    scheduleTable.setFocusable(false);
    scheduleTable.setGridColor(background);
    scheduleTable.setRowHeight(30);
    scheduleTable.setRowSelectionAllowed(false);
    scheduleTable.setSelectionBackground(new java.awt.Color(60, 73, 82));
    scheduleScrollPanel.setViewportView(scheduleTable);
    scheduleTable.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 18));
    scheduleTable.getTableHeader().setForeground(foreground);
    scheduleTable.getTableHeader().setBackground(lightBackground);
    scheduleTable.getTableHeader().setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, background));
    scheduleTable.setBorder(BorderFactory.createLineBorder(background));
    scheduleTable.getTableHeader().setOpaque(true);
    scheduleTable.getTableHeader().setResizingAllowed(false);
    scheduleTable.getTableHeader().setReorderingAllowed(false);
    scheduleTable.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
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
    scheduleTable.getTableHeader().setPreferredSize(new Dimension(scheduleTable.getTableHeader().getWidth(), 40));
    scheduleTable.setRowHeight(100);
    MultiLineCellRenderer multiLineRenderer = new MultiLineCellRenderer(lightBackground);
    scheduleTable.setDefaultRenderer(Object.class, multiLineRenderer);

    javax.swing.GroupLayout schedulePanelLayout = new javax.swing.GroupLayout(schedulePanel);
    schedulePanel.setLayout(schedulePanelLayout);
    schedulePanelLayout.setHorizontalGroup(
        schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, schedulePanelLayout.createSequentialGroup()
            .addContainerGap(283, Short.MAX_VALUE)
            .addComponent(scheduleTitleLabel)
            .addGap(282, 282, 282))
        .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedulePanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(scheduleScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE)))
    );
    schedulePanelLayout.setVerticalGroup(
        schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(schedulePanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(scheduleTitleLabel)
            .addContainerGap(550, Short.MAX_VALUE))
        .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedulePanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(scheduleScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE)))
    );

    viewport = scheduleScrollPanel.getViewport();
    viewport.setBackground(lightBackground);
    scheduleScrollPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, background));

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
    semesterLabel.setText("Semester:");

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
    absencesTitle.setText("Absences");

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
            .addComponent(absencesScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(68, Short.MAX_VALUE))
    );

    viewport = absencesScrollPanel.getViewport();
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
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(mainViewCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(SideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
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
        if (studentCourses == null) {
            studentCourses = studentController.getCourses();
        }
        DefaultTableModel model = (DefaultTableModel) scheduleTable.getModel();
        model.setRowCount(8);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                model.setValueAt("", j, i);
            }
        }
        for (int i = 0; i < studentCourses.length; i++) {
            int j = 0;
            for (String[] course : studentCourses[i]) {

                model.setValueAt(course[0] + ' ' + course[1] + ' ' + course[2], j, i);
                j++;
            }
        }
        showCard("schedulePanel");
    }//GEN-LAST:event_scheduleLabelMouseClicked

    private void gradesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesLabelMouseClicked
        switchMenuLabel(gradesLabel);
        if (subjectOption.getItemCount() == 0) {
            subjectOption.setModel(new javax.swing.DefaultComboBoxModel<>(studentController.getSubjects()));
            subjectOption.setSelectedIndex(-1);
        }
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

    private void semesterOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterOption1ActionPerformed
        String selectedSemester = (String) semesterOption1.getSelectedItem();
        String selectedSubject = (String) subjectOption.getSelectedItem();
        if (selectedSemester != null && selectedSubject != null) {
            insertGrades(selectedSemester, selectedSubject);
        }
    }//GEN-LAST:event_semesterOption1ActionPerformed

    private void subjectOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectOptionActionPerformed
        String selectedSemester = (String) semesterOption1.getSelectedItem();
        String selectedSubject = (String) subjectOption.getSelectedItem();
        if (selectedSemester != null && selectedSubject != null) {
            insertGrades(selectedSemester, selectedSubject);
        }
    }//GEN-LAST:event_subjectOptionActionPerformed

    private void setLabelColor(JLabel label, Color bg, Color fg) {
        label.setBackground(bg);
        label.setForeground(fg);
        label.setOpaque(true);
    }

    private void insertGrades(String sem, String subj) {
        ArrayList< String[]> grades = studentController.getGrades(sem, subj);
        DefaultTableModel model = (DefaultTableModel) gradesTable.getModel();
        model.setRowCount(0);
        for (String[] row : grades) {
            model.addRow(row);
        }
    }

    public void showCard(String name) {
        cardLayout.show(mainViewCardLayout, name);
    }
    private ArrayList< String[]>[] studentCourses = null;
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
    private javax.swing.JLabel gradesLabel;
    private Views.PanelRound gradesPanel;
    private javax.swing.JScrollPane gradesScrollPanel;
    private javax.swing.JTable gradesTable;
    private javax.swing.JLabel gradesTitle;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private Views.PanelRound mainViewCardLayout;
    private javax.swing.JLabel matriculationNrLabel;
    private Views.PanelRound panelRound1;
    private javax.swing.JLabel residenceLabel;
    private javax.swing.JLabel scheduleLabel;
    private Views.PanelRound schedulePanel;
    private javax.swing.JScrollPane scheduleScrollPanel;
    private javax.swing.JTable scheduleTable;
    private javax.swing.JLabel scheduleTitleLabel;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JLabel semesterLabel1;
    private javax.swing.JComboBox<String> semesterOption;
    private javax.swing.JComboBox<String> semesterOption1;
    private javax.swing.JLabel studentEmailLabel;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JComboBox<String> subjectOption;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

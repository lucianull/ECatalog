package Views;

import Controllers.ProfessorsController;
import Controllers.UsersController;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JTable;
import javax.swing.JComponent;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class MainViewProfessor extends javax.swing.JPanel {

    private final Color background;
    private final Color foreground;
    private final Color lightBackground;
    private final Color activeForeground;
    private JLabel lastSwitched = null;
    private CardLayout cardLayout;
    private ProfessorsController professorController;

    public class MultiLineCellRenderer extends JTextArea implements TableCellRenderer {

        public MultiLineCellRenderer() {
            setLineWrap(true);
            setWrapStyleWord(true);
            setOpaque(true);
            setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            setText(value != null ? value.toString() : "");
            setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
            setForeground(isSelected ? table.getSelectionForeground() : table.getForeground());
            setFont(table.getFont());
            setSize(table.getColumnModel().getColumn(column).getWidth(), getPreferredSize().height);
            if (table.getRowHeight(row) != getPreferredSize().height) {
                table.setRowHeight(row, getPreferredSize().height);
            }
            return this;
        }
    }

    public MainViewProfessor(UsersController userController) {
        background = new Color(43, 56, 65);
        foreground = new Color(191, 205, 214);
        lightBackground = new Color(60, 73, 82);
        activeForeground = new Color(77, 133, 114);
        initComponents();
        this.professorController = new ProfessorsController(userController.getCurrentUser());
        lastSwitched = gradesLabel;
        setLabelColor(gradesLabel, background, activeForeground);
        cardLayout = (CardLayout) mainViewCardLayout.getLayout();
        cardLayout.show(mainViewCardLayout, "dashboardPanel");
        setGradesPanel();
    }

    private void setGradesPanel() {
        subjectOption.setModel(new javax.swing.DefaultComboBoxModel<>(professorController.getSubjects()));
        subjectOption.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SideMenu = new Views.PanelRound();
        titleLabel = new javax.swing.JLabel();
        gradesLabel = new javax.swing.JLabel();
        scheduleLabel = new javax.swing.JLabel();
        absencesLabel = new javax.swing.JLabel();
        mainViewCardLayout = new Views.PanelRound();
        gradesPanel = new Views.PanelRound();
        gradesScrollPanel = new javax.swing.JScrollPane();
        gradesTable = new javax.swing.JTable();
        semesterLabel = new javax.swing.JLabel();
        semesterOption = new javax.swing.JComboBox<>();
        gradesTitle = new javax.swing.JLabel();
        subjectLabel = new javax.swing.JLabel();
        subjectOption = new javax.swing.JComboBox<>();
        classLabel = new javax.swing.JLabel();
        classOption = new javax.swing.JComboBox<>();
        studentLabel = new javax.swing.JLabel();
        studentOption = new javax.swing.JComboBox<>();
        addGradeButton = new javax.swing.JButton();
        gradeLabel = new javax.swing.JLabel();
        gradeTextField = new javax.swing.JTextField();
        thesisCheckbox = new javax.swing.JCheckBox();
        schedulePanel = new Views.PanelRound();
        scheduleTitleLabel = new javax.swing.JLabel();
        scheduleScrollPanel = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();
        absencesPanel = new Views.PanelRound();
        absencesScrollPanel = new javax.swing.JScrollPane();
        absencesTable = new javax.swing.JTable();
        semesterLabel2 = new javax.swing.JLabel();
        semesterOption2 = new javax.swing.JComboBox<>();
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
            .addGroup(SideMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titleLabel)
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(scheduleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(absencesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SideMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(gradesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        SideMenuLayout.setVerticalGroup(
            SideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideMenuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(titleLabel)
                .addGap(0, 0, 0)
                .addComponent(gradesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scheduleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(absencesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainViewCardLayout.setBackground(new java.awt.Color(60, 73, 82));
        mainViewCardLayout.setPreferredSize(new java.awt.Dimension(600, 594));
        mainViewCardLayout.setRoundBottomLeft(25);
        mainViewCardLayout.setRoundBottomRight(25);
        mainViewCardLayout.setRoundTopLeft(25);
        mainViewCardLayout.setRoundTopRight(25);
        mainViewCardLayout.setLayout(new java.awt.CardLayout());

        gradesPanel.setBackground(new java.awt.Color(60, 73, 82));
        gradesPanel.setRoundBottomLeft(25);
        gradesPanel.setRoundBottomRight(25);
        gradesPanel.setRoundTopLeft(25);
        gradesPanel.setRoundTopRight(25);
        gradesPanel.setLayout(null);

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

    gradesPanel.add(gradesScrollPanel);
    gradesScrollPanel.setBounds(48, 195, 566, 360);
    JViewport viewport = gradesScrollPanel.getViewport();
    viewport.setBackground(lightBackground);
    gradesScrollPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, background));

    semesterLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    semesterLabel.setForeground(new java.awt.Color(191, 205, 214));
    semesterLabel.setText("Semester:");
    gradesPanel.add(semesterLabel);
    semesterLabel.setBounds(50, 78, 59, 20);

    semesterOption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    semesterOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II" }));
    semesterOption.setSelectedIndex(-1);
    semesterOption.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            semesterOptionActionPerformed(evt);
        }
    });
    gradesPanel.add(semesterOption);
    semesterOption.setBounds(115, 75, 110, 26);

    gradesTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    gradesTitle.setForeground(new java.awt.Color(191, 205, 214));
    gradesTitle.setText("Grades");
    gradesPanel.add(gradesTitle);
    gradesTitle.setBounds(277, 25, 73, 32);

    subjectLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    subjectLabel.setForeground(new java.awt.Color(191, 205, 214));
    subjectLabel.setText("Subject:");
    gradesPanel.add(subjectLabel);
    subjectLabel.setBounds(263, 78, 47, 20);

    subjectOption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    subjectOption.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            subjectOptionActionPerformed(evt);
        }
    });
    gradesPanel.add(subjectOption);
    subjectOption.setBounds(322, 75, 72, 26);

    classLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    classLabel.setForeground(new java.awt.Color(191, 205, 214));
    classLabel.setText("Class:");
    gradesPanel.add(classLabel);
    classLabel.setBounds(483, 78, 34, 20);

    classOption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    classOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II" }));
    classOption.setSelectedIndex(-1);
    classOption.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            classOptionActionPerformed(evt);
        }
    });
    gradesPanel.add(classOption);
    classOption.setBounds(542, 75, 72, 26);

    studentLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    studentLabel.setForeground(new java.awt.Color(191, 205, 214));
    studentLabel.setText("Student:");
    gradesPanel.add(studentLabel);
    studentLabel.setBounds(50, 122, 51, 20);

    studentOption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    studentOption.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            studentOptionActionPerformed(evt);
        }
    });
    //Dimension maximumSize = new Dimension(30, studentOption.getPreferredSize().height);
    //studentOption.setMaximumSize(maximumSize);
    gradesPanel.add(studentOption);
    studentOption.setBounds(113, 119, 110, 26);

    addGradeButton.setText("Add");
    addGradeButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addGradeButtonActionPerformed(evt);
        }
    });
    gradesPanel.add(addGradeButton);
    addGradeButton.setBounds(287, 151, 72, 23);

    gradeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    gradeLabel.setForeground(new java.awt.Color(191, 205, 214));
    gradeLabel.setText("Grade:");
    gradesPanel.add(gradeLabel);
    gradeLabel.setBounds(483, 124, 40, 20);

    gradeTextField.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            gradeTextFieldActionPerformed(evt);
        }
    });
    gradeTextField.setColumns(5);
    gradesPanel.add(gradeTextField);
    gradeTextField.setBounds(544, 124, 70, 22);

    thesisCheckbox.setBackground(new java.awt.Color(60, 73, 82));
    thesisCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    thesisCheckbox.setForeground(new java.awt.Color(191, 205, 214));
    thesisCheckbox.setText("Thesis");
    thesisCheckbox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            thesisCheckboxActionPerformed(evt);
        }
    });
    gradesPanel.add(thesisCheckbox);
    thesisCheckbox.setBounds(260, 120, 85, 20);

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
    MultiLineCellRenderer multiLineRenderer = new MultiLineCellRenderer();
    scheduleTable.setDefaultRenderer(Object.class, multiLineRenderer);

    javax.swing.GroupLayout schedulePanelLayout = new javax.swing.GroupLayout(schedulePanel);
    schedulePanel.setLayout(schedulePanelLayout);
    schedulePanelLayout.setHorizontalGroup(
        schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(schedulePanelLayout.createSequentialGroup()
            .addGap(280, 280, 280)
            .addComponent(scheduleTitleLabel)
            .addContainerGap(285, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    semesterLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    semesterLabel2.setForeground(new java.awt.Color(191, 205, 214));
    semesterLabel2.setText("Semester:");

    semesterOption2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    semesterOption2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II" }));
    semesterOption2.setSelectedIndex(-1);
    semesterOption2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            semesterOption2ActionPerformed(evt);
        }
    });

    absencesTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    absencesTitle.setForeground(new java.awt.Color(191, 205, 214));
    absencesTitle.setText("Absences");

    javax.swing.GroupLayout absencesPanelLayout = new javax.swing.GroupLayout(absencesPanel);
    absencesPanel.setLayout(absencesPanelLayout);
    absencesPanelLayout.setHorizontalGroup(
        absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, absencesPanelLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(semesterLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(semesterOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(261, 261, 261))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, absencesPanelLayout.createSequentialGroup()
            .addContainerGap(48, Short.MAX_VALUE)
            .addComponent(absencesScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(49, 49, 49))
        .addGroup(absencesPanelLayout.createSequentialGroup()
            .addGap(277, 277, 277)
            .addComponent(absencesTitle)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    absencesPanelLayout.setVerticalGroup(
        absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, absencesPanelLayout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addComponent(absencesTitle)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(semesterOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(semesterLabel2))
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
                .addComponent(SideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainViewCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
            .addContainerGap())
    );
    }// </editor-fold>//GEN-END:initComponents

    private void gradesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesLabelMouseClicked
        switchMenuLabel(gradesLabel);

        showCard("gradesPanel");
    }//GEN-LAST:event_gradesLabelMouseClicked

    private void scheduleLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleLabelMouseClicked
        switchMenuLabel(scheduleLabel);
        DefaultTableModel model = (DefaultTableModel) scheduleTable.getModel();
        if (model.getRowCount() == 0) {
            ArrayList< String[]>[] schedule = professorController.getCourses();
            model.setRowCount(12);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 12; j++) {
                    model.setValueAt("", j, i);
                }
            }
            for (int i = 0; i < schedule.length; i++) {
                int j = 0;
                for (String[] course : schedule[i]) {

                    model.setValueAt(course[0] + '\n' + course[1] + '\n' + course[2], j, i);
                    j++;
                }
            }
        }
        showCard("schedulePanel");
    }//GEN-LAST:event_scheduleLabelMouseClicked

    private void absencesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_absencesLabelMouseClicked
        switchMenuLabel(absencesLabel);
        showCard("absencesPanel");
    }//GEN-LAST:event_absencesLabelMouseClicked

    private void semesterOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterOptionActionPerformed
        String selectedSemester = (String) semesterOption.getSelectedItem();
        String selectedSubject = (String) subjectOption.getSelectedItem();
//        if (selectedSemester != null && selectedSubject != null) {
//            insertGrades(selectedSemester, selectedSubject);
//        }
    }//GEN-LAST:event_semesterOptionActionPerformed

    private void subjectOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectOptionActionPerformed
        String selectedSubject = (String) subjectOption.getSelectedItem();
        if (selectedSubject != null) {
            classOption.setModel(new javax.swing.DefaultComboBoxModel<>(professorController.getClasses(selectedSubject)));
            classOption.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_subjectOptionActionPerformed

    private void semesterOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterOption2ActionPerformed
        String selectedOption = (String) semesterOption2.getSelectedItem();
//        try {
//            ArrayList< String[]> absences = studentController.getAbsences(selectedOption);
//            DefaultTableModel model = (DefaultTableModel) absencesTable.getModel();
//            model.setRowCount(0);
//            for (String[] row : absences) {
//                model.addRow(row);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(MainViewStudent.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_semesterOption2ActionPerformed

    private void classOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classOptionActionPerformed
        String selectedClass = (String) classOption.getSelectedItem();
        if (selectedClass != null) {
            studentOption.setModel(new javax.swing.DefaultComboBoxModel<>(professorController.getStudents(selectedClass)));
            studentOption.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_classOptionActionPerformed

    private void studentOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentOptionActionPerformed
        String selectedStudent = (String) studentOption.getSelectedItem();
        if (selectedStudent != null) {
            insertGrades();
        }
    }//GEN-LAST:event_studentOptionActionPerformed

    private void gradeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeTextFieldActionPerformed

    private void addGradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGradeButtonActionPerformed
        String selectedSemester = (String) semesterOption.getSelectedItem();
        String selectedSubject = (String) subjectOption.getSelectedItem();
        String selectedClass = (String) classOption.getSelectedItem();
        String selectedStudent = (String) studentOption.getSelectedItem();
        byte thesis = 0;
        if (thesisCheckbox.isSelected()) {
            thesis = 1;
        }
        professorController.insertGrade(selectedSemester, selectedSubject, selectedClass, selectedStudent, Float.parseFloat(gradeTextField.getText()), thesis);
        insertGrades();
    }//GEN-LAST:event_addGradeButtonActionPerformed

    private void thesisCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thesisCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thesisCheckboxActionPerformed

    private void setLabelColor(JLabel label, Color bg, Color fg) {
        label.setBackground(bg);
        label.setForeground(fg);
        label.setOpaque(true);
    }

    private void switchMenuLabel(JLabel label) {
        setLabelColor(lastSwitched, lightBackground, foreground);
        setLabelColor(label, background, activeForeground);
        lastSwitched = label;
    }

    public void showCard(String name) {
        cardLayout.show(mainViewCardLayout, name);
    }

    private void insertGrades() {
        String selectedSemester = (String) semesterOption.getSelectedItem();
        String selectedSubject = (String) subjectOption.getSelectedItem();
        String selectedStudent = (String) studentOption.getSelectedItem();
        ArrayList< String[]> grades = professorController.getGrades(selectedStudent, selectedSemester, selectedSubject);
        DefaultTableModel model = (DefaultTableModel) gradesTable.getModel();
        model.setRowCount(0);
        for (String[] row : grades) {
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Views.PanelRound SideMenu;
    private javax.swing.JLabel absencesLabel;
    private Views.PanelRound absencesPanel;
    private javax.swing.JScrollPane absencesScrollPanel;
    private javax.swing.JTable absencesTable;
    private javax.swing.JLabel absencesTitle;
    private javax.swing.JButton addGradeButton;
    private javax.swing.JLabel classLabel;
    private javax.swing.JComboBox<String> classOption;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JTextField gradeTextField;
    private javax.swing.JLabel gradesLabel;
    private Views.PanelRound gradesPanel;
    private javax.swing.JScrollPane gradesScrollPanel;
    private javax.swing.JTable gradesTable;
    private javax.swing.JLabel gradesTitle;
    private Views.PanelRound mainViewCardLayout;
    private javax.swing.JLabel scheduleLabel;
    private Views.PanelRound schedulePanel;
    private javax.swing.JScrollPane scheduleScrollPanel;
    private javax.swing.JTable scheduleTable;
    private javax.swing.JLabel scheduleTitleLabel;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JLabel semesterLabel2;
    private javax.swing.JComboBox<String> semesterOption;
    private javax.swing.JComboBox<String> semesterOption2;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JComboBox<String> studentOption;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JComboBox<String> subjectOption;
    private javax.swing.JCheckBox thesisCheckbox;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

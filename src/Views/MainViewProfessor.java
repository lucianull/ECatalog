package Views;

import Controllers.ProfessorsController;
import Controllers.UsersController;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JTable;
import javax.swing.JComponent;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
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
        semesterLabel1 = new javax.swing.JLabel();
        semesterOption1 = new javax.swing.JComboBox<>();
        absencesTitle = new javax.swing.JLabel();
        subjectLabel1 = new javax.swing.JLabel();
        subjectOption1 = new javax.swing.JComboBox<>();
        classLabel1 = new javax.swing.JLabel();
        classOption1 = new javax.swing.JComboBox<>();
        studentLabel1 = new javax.swing.JLabel();
        studentOption1 = new javax.swing.JComboBox<>();
        addAbsenceButton = new javax.swing.JButton();

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
    gradesTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            gradesTableMouseClicked(evt);
        }
    });
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
            "Date"
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
    absencesTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            absencesTableMouseClicked(evt);
        }
    });
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

    absencesTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    absencesTitle.setForeground(new java.awt.Color(191, 205, 214));
    absencesTitle.setText("Absences");

    subjectLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    subjectLabel1.setForeground(new java.awt.Color(191, 205, 214));
    subjectLabel1.setText("Subject:");

    subjectOption1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    subjectOption1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            subjectOption1ActionPerformed(evt);
        }
    });

    classLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    classLabel1.setForeground(new java.awt.Color(191, 205, 214));
    classLabel1.setText("Class:");

    classOption1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    classOption1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II" }));
    classOption1.setSelectedIndex(-1);
    classOption1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            classOption1ActionPerformed(evt);
        }
    });

    studentLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    studentLabel1.setForeground(new java.awt.Color(191, 205, 214));
    studentLabel1.setText("Student:");

    studentOption1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    studentOption1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            studentOption1ActionPerformed(evt);
        }
    });
    //Dimension maximumSize = new Dimension(30, studentOption.getPreferredSize().height);
    //studentOption.setMaximumSize(maximumSize);

    addAbsenceButton.setText("Add");
    addAbsenceButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addAbsenceButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout absencesPanelLayout = new javax.swing.GroupLayout(absencesPanel);
    absencesPanel.setLayout(absencesPanelLayout);
    absencesPanelLayout.setHorizontalGroup(
        absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(absencesPanelLayout.createSequentialGroup()
            .addGroup(absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(absencesPanelLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(absencesScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(absencesPanelLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addAbsenceButton)
                        .addGroup(absencesPanelLayout.createSequentialGroup()
                            .addComponent(semesterLabel1)
                            .addGap(12, 12, 12)
                            .addComponent(semesterOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(subjectLabel1)
                            .addGap(12, 12, 12)
                            .addComponent(subjectOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(classLabel1)))
                    .addGap(25, 25, 25)
                    .addComponent(classOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(studentLabel1)
                    .addGap(12, 12, 12)
                    .addComponent(studentOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(20, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, absencesPanelLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(absencesTitle)
            .addGap(275, 275, 275))
    );
    absencesPanelLayout.setVerticalGroup(
        absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(absencesPanelLayout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(absencesTitle)
            .addGap(18, 18, 18)
            .addGroup(absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(absencesPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(studentLabel1))
                    .addComponent(studentOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(absencesPanelLayout.createSequentialGroup()
                    .addGroup(absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(semesterOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subjectOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(classOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(absencesPanelLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(absencesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(semesterLabel1)
                                .addComponent(subjectLabel1)
                                .addComponent(classLabel1))))
                    .addGap(18, 18, 18)
                    .addComponent(addAbsenceButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                    .addComponent(absencesScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(68, 68, 68))
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
        if (subjectOption1.getItemCount() == 0) {
            subjectOption1.setModel(new javax.swing.DefaultComboBoxModel<>(professorController.getSubjects()));
            subjectOption1.setSelectedIndex(-1);
        }
        showCard("absencesPanel");
    }//GEN-LAST:event_absencesLabelMouseClicked

    private void semesterOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterOptionActionPerformed

    }//GEN-LAST:event_semesterOptionActionPerformed

    private void subjectOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectOptionActionPerformed
        String selectedSubject = (String) subjectOption.getSelectedItem();
        if (selectedSubject != null) {
            classOption.setModel(new javax.swing.DefaultComboBoxModel<>(professorController.getClasses(selectedSubject)));
            classOption.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_subjectOptionActionPerformed

    private void semesterOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterOption1ActionPerformed

    }//GEN-LAST:event_semesterOption1ActionPerformed

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

    private void subjectOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectOption1ActionPerformed
        String selectedSubject = (String) subjectOption1.getSelectedItem();
        if (selectedSubject != null) {
            classOption1.setModel(new javax.swing.DefaultComboBoxModel<>(professorController.getClasses(selectedSubject)));
            classOption1.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_subjectOption1ActionPerformed

    private void classOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classOption1ActionPerformed
        String selectedClass = (String) classOption1.getSelectedItem();
        if (selectedClass != null) {
            studentOption1.setModel(new javax.swing.DefaultComboBoxModel<>(professorController.getStudents(selectedClass)));
            studentOption1.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_classOption1ActionPerformed

    private void studentOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentOption1ActionPerformed
        String selectedStudent = (String) studentOption1.getSelectedItem();
        if (selectedStudent != null) {
            insertAbsences();
        }
    }//GEN-LAST:event_studentOption1ActionPerformed

    private void addAbsenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAbsenceButtonActionPerformed
        String selectedSemester = (String) semesterOption1.getSelectedItem();
        String selectedSubject = (String) subjectOption1.getSelectedItem();
        String selectedClass = (String) classOption1.getSelectedItem();
        String selectedStudent = (String) studentOption1.getSelectedItem();
        professorController.insertAbsence(selectedSemester, selectedSubject, selectedClass, selectedStudent);
        insertAbsences();
    }//GEN-LAST:event_addAbsenceButtonActionPerformed

    private void absencesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_absencesTableMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) {
            int row = absencesTable.rowAtPoint(evt.getPoint());
            int column = absencesTable.columnAtPoint(evt.getPoint());
            // Show the right-click menu
            showPopupMenuAbsences(evt.getComponent(), evt.getX(), evt.getY(), row, column);
        }
    }//GEN-LAST:event_absencesTableMouseClicked

    private void gradesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesTableMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) {
            int row = gradesTable.rowAtPoint(evt.getPoint());
            int column = gradesTable.columnAtPoint(evt.getPoint());
            // Show the right-click menu
            showPopupMenuGrades(evt.getComponent(), evt.getX(), evt.getY(), row, column);
        }
    }//GEN-LAST:event_gradesTableMouseClicked
    
    private void showPopupMenuGrades(Component component, int x, int y, int row, int column) {
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem deleteRowItem = new JMenuItem("Delete");
        deleteRowItem.addActionListener(e -> {
            // Handle delete row action
            DefaultTableModel model = (DefaultTableModel) gradesTable.getModel();
            String selectedSemester = (String) semesterOption.getSelectedItem();
            String selectedSubject = (String) subjectOption.getSelectedItem();
            String selectedStudent = (String) studentOption.getSelectedItem();
            professorController.deleteGrade(selectedSemester, selectedSubject, selectedStudent, (String) gradesTable.getValueAt(row, 1), (String) gradesTable.getValueAt(row, 0));
            model.removeRow(row);
        });
        popupMenu.add(deleteRowItem);

        popupMenu.show(component, x, y);
    }
    
    private void showPopupMenuAbsences(Component component, int x, int y, int row, int column) {
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem deleteRowItem = new JMenuItem("Delete");
        deleteRowItem.addActionListener(e -> {
            // Handle delete row action
            DefaultTableModel model = (DefaultTableModel) absencesTable.getModel();
            String selectedSemester = (String) semesterOption1.getSelectedItem();
            String selectedSubject = (String) subjectOption1.getSelectedItem();
            String selectedStudent = (String) studentOption1.getSelectedItem();
            professorController.deleteAbsence(selectedSemester, selectedSubject, selectedStudent, (String) absencesTable.getValueAt(row, column));
            model.removeRow(row);
        });
        popupMenu.add(deleteRowItem);

        popupMenu.show(component, x, y);
    }

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

    private void insertAbsences() {
        String selectedSemester = (String) semesterOption1.getSelectedItem();
        String selectedSubject = (String) subjectOption1.getSelectedItem();
        String selectedStudent = (String) studentOption1.getSelectedItem();
        ArrayList< String> absences = professorController.getAbsences(selectedStudent, selectedSemester, selectedSubject);
        DefaultTableModel model = (DefaultTableModel) absencesTable.getModel();
        model.setRowCount(0);
        for (String row : absences) {
            model.addRow(new Object[]{row});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Views.PanelRound SideMenu;
    private javax.swing.JLabel absencesLabel;
    private Views.PanelRound absencesPanel;
    private javax.swing.JScrollPane absencesScrollPanel;
    private javax.swing.JTable absencesTable;
    private javax.swing.JLabel absencesTitle;
    private javax.swing.JButton addAbsenceButton;
    private javax.swing.JButton addGradeButton;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel classLabel1;
    private javax.swing.JComboBox<String> classOption;
    private javax.swing.JComboBox<String> classOption1;
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
    private javax.swing.JLabel semesterLabel1;
    private javax.swing.JComboBox<String> semesterOption;
    private javax.swing.JComboBox<String> semesterOption1;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JLabel studentLabel1;
    private javax.swing.JComboBox<String> studentOption;
    private javax.swing.JComboBox<String> studentOption1;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JLabel subjectLabel1;
    private javax.swing.JComboBox<String> subjectOption;
    private javax.swing.JComboBox<String> subjectOption1;
    private javax.swing.JCheckBox thesisCheckbox;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

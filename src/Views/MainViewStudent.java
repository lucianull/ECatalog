package Views;
import Controllers.UsersController;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class MainViewStudent extends javax.swing.JPanel {
    
    private Color background;
    private Color foreground;
    private Color lightBackground;
    private Color activeForeground;
    private JLabel lastSwitched = null;
    private CardLayout cardLayout;
    private UsersController userController;
    
    public MainViewStudent(UsersController userController) {
        background = new Color(43, 56, 65);
        foreground = new Color(191, 205, 214);
        lightBackground = new Color(60,73,82);
        activeForeground = new Color(77,133,114);
        initComponents();
        this.userController = userController;
        lastSwitched = dashboardLabel;
        setLabelColor(dashboardLabel, background, activeForeground);
        cardLayout = (CardLayout) mainViewCardLayout.getLayout();
        cardLayout.show(mainViewCardLayout, "dashboardPanel");
        studentNameLabel.setText(userController.getFullName());
        studentEmailLabel.setText(userController.getEmail());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SideMenu = new Views.Widgets.PanelRound();
        titleLabel = new javax.swing.JLabel();
        dashboardLabel = new javax.swing.JLabel();
        scheduleLabel = new javax.swing.JLabel();
        gradesLabel = new javax.swing.JLabel();
        mainViewCardLayout = new Views.Widgets.PanelRound();
        dashboardPanel = new Views.Widgets.PanelRound();
        studentNameLabel = new javax.swing.JLabel();
        studentEmailLabel = new javax.swing.JLabel();
        panelRound1 = new Views.Widgets.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gradesPanel = new Views.Widgets.PanelRound();
        schedulePanel = new Views.Widgets.PanelRound();

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

        scheduleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scheduleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        scheduleLabel.setForeground(new java.awt.Color(191, 205, 214));
        scheduleLabel.setText("Schedule");
        scheduleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleLabelMouseClicked(evt);
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

        javax.swing.GroupLayout SideMenuLayout = new javax.swing.GroupLayout(SideMenu);
        SideMenu.setLayout(SideMenuLayout);
        SideMenuLayout.setHorizontalGroup(
            SideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SideMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titleLabel)
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(scheduleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gradesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(197, 197, 197))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNameLabel)
                    .addComponent(studentEmailLabel))
                .addContainerGap(36, Short.MAX_VALUE))
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
                .addContainerGap(81, Short.MAX_VALUE))
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
            .addGap(0, 588, Short.MAX_VALUE)
        );

        mainViewCardLayout.add(gradesPanel, "gradesPanel");

        schedulePanel.setBackground(new java.awt.Color(60, 73, 82));
        schedulePanel.setForeground(new java.awt.Color(60, 73, 82));
        schedulePanel.setToolTipText("");
        schedulePanel.setRoundBottomLeft(25);
        schedulePanel.setRoundBottomRight(25);
        schedulePanel.setRoundTopLeft(25);
        schedulePanel.setRoundTopRight(25);

        javax.swing.GroupLayout schedulePanelLayout = new javax.swing.GroupLayout(schedulePanel);
        schedulePanel.setLayout(schedulePanelLayout);
        schedulePanelLayout.setHorizontalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        schedulePanelLayout.setVerticalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        mainViewCardLayout.add(schedulePanel, "schedulePanel");

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
        showCard("schedulePanel");
    }//GEN-LAST:event_scheduleLabelMouseClicked

    private void gradesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesLabelMouseClicked
        switchMenuLabel(gradesLabel);
        showCard("gradesPanel");
    }//GEN-LAST:event_gradesLabelMouseClicked

    private void setLabelColor(JLabel label, Color bg, Color fg) {
        label.setBackground(bg);
        label.setForeground(fg);
        label.setOpaque(true);
    }
    
    public void showCard(String name) {
        cardLayout.show(mainViewCardLayout, name);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Views.Widgets.PanelRound SideMenu;
    private javax.swing.JLabel dashboardLabel;
    private Views.Widgets.PanelRound dashboardPanel;
    private javax.swing.JLabel gradesLabel;
    private Views.Widgets.PanelRound gradesPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private Views.Widgets.PanelRound mainViewCardLayout;
    private Views.Widgets.PanelRound panelRound1;
    private javax.swing.JLabel scheduleLabel;
    private Views.Widgets.PanelRound schedulePanel;
    private javax.swing.JLabel studentEmailLabel;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

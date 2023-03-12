package Views;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class MainViewStudent extends javax.swing.JPanel {
    
    private Color background;
    private Color foreground;
    private Color lightBackground;
    private JLabel lastSwitched = null;
    
    public MainViewStudent() {
        background = new Color(43, 56, 65);
        foreground = new Color(191, 205, 214);
        lightBackground = new Color(60,73,82);
        initComponents();
        lastSwitched = dashboardLabel;
        setLabelColor(dashboardLabel, background);
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

        setBackground(new java.awt.Color(43, 56, 65));

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
                .addContainerGap(280, Short.MAX_VALUE))
        );

        mainViewCardLayout.setBackground(new java.awt.Color(60, 73, 82));
        mainViewCardLayout.setRoundBottomLeft(25);
        mainViewCardLayout.setRoundBottomRight(25);
        mainViewCardLayout.setRoundTopLeft(25);
        mainViewCardLayout.setRoundTopRight(25);
        mainViewCardLayout.setLayout(new java.awt.CardLayout());

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
        setLabelColor(lastSwitched, lightBackground);
        setLabelColor(label, background);
        lastSwitched = label;
    }
    
    private void dashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLabelMouseClicked
        switchMenuLabel(dashboardLabel);
    }//GEN-LAST:event_dashboardLabelMouseClicked

    private void scheduleLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleLabelMouseClicked
        switchMenuLabel(scheduleLabel);
    }//GEN-LAST:event_scheduleLabelMouseClicked

    private void gradesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesLabelMouseClicked
        switchMenuLabel(gradesLabel);
    }//GEN-LAST:event_gradesLabelMouseClicked

    private void setLabelColor(JLabel label, Color color) {
        label.setBackground(color);
        label.setOpaque(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Views.Widgets.PanelRound SideMenu;
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JLabel gradesLabel;
    private Views.Widgets.PanelRound mainViewCardLayout;
    private javax.swing.JLabel scheduleLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

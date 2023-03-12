package Views;

import java.awt.CardLayout;
import javax.swing.JPanel;

public class App extends javax.swing.JFrame {
    
    private static App instance = null;
    private CardLayout cardLayout;

    private App() {
        initComponents();
        cardLayout = (CardLayout) cards.getLayout();
        getContentPane().add(cards);
    }

    public static App getInstance() {
        if(instance == null) {
            instance = new App();
            instance.setVisible(true);
        }
        return instance;
    }
    
    public void showCard(String name) {
        cardLayout.show(cards, name);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cards = new javax.swing.JPanel();
        loginPanel = new Views.LoginView();
        mainViewStudent = new Views.MainViewStudent();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cards.setLayout(new java.awt.CardLayout());
        cards.add(loginPanel, "loginPanel");
        cards.add(mainViewStudent, "mainViewStudent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cards, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cards, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        App app = App.getInstance();
        app.showCard("loginPanel");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cards;
    private Views.LoginView loginPanel;
    private Views.MainViewStudent mainViewStudent;
    // End of variables declaration//GEN-END:variables
}

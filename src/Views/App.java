package Views;

import Controllers.UsersController;
import java.awt.CardLayout;

public class App extends javax.swing.JFrame {

    private static App instance = null;
    private CardLayout cardLayout;
    private UsersController userController;
    private MainViewStudent mainViewStudent = null;

    private App() {
        userController = new UsersController();
        initComponents();
        cardLayout = (CardLayout) cards.getLayout();
        getContentPane().add(cards);
    }

    public static App getInstance() {
        if (instance == null) {
            instance = new App();
            instance.setVisible(true);
        }
        return instance;
    }

    public void setMainViewStudent(MainViewStudent mainViewStudent) {
        this.mainViewStudent = mainViewStudent;
        cards.add(mainViewStudent, "mainViewStudent");
    }

    public void showCard(String name) {
        cardLayout.show(cards, name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cards = new javax.swing.JPanel();
        loginView = new Views.LoginView(userController);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cards.setLayout(new java.awt.CardLayout());
        cards.add(loginView, "loginView");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        app.showCard("loginView");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cards;
    private Views.LoginView loginView;
    // End of variables declaration//GEN-END:variables
}

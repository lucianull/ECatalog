
package Controllers;

import CSVDatabase.CSVDatabase;


public class UsersController {
    private CSVDatabase csvDatabase;
    
    public UsersController() {
        csvDatabase = new CSVDatabase();
    }
    public boolean CheckAccount(String email, String password) {
        return csvDatabase.checkAccount(email, password);
    }
}

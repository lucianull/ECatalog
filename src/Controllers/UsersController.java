
package Controllers;

import CSVDatabase.CSVDatabase;


public class UsersController {
    private CSVDatabase csvDatabase;
    private int currentUserId;
    
    
    public UsersController() {
        csvDatabase = new CSVDatabase();
    }
    public boolean CheckAccount(String email, String password) {
        int [] response = csvDatabase.checkAccount(email, password);
        if(response[0] > 0)
        {
            currentUserId = response[1];
            return true;
        }
        return false;
    }
    public String getFullName() {
        return csvDatabase.getFullName(currentUserId);
    }
    public String getEmail() {
        return csvDatabase.getEmail(currentUserId);
    }
}

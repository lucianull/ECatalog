
package Controllers;

import CSVDatabase.CSVDatabase;
import Misc.Pair;
import Models.User;


public class UsersController {
    private CSVDatabase csvDatabase;
    private User currentUser;
    
    
    public UsersController() {
        csvDatabase = new CSVDatabase();
    }
    public boolean CheckAccount(String email, String password) {
        Pair < Boolean, User > response = csvDatabase.checkAccount(email, password);
        if(response.getFirst())
        {
            currentUser = response.getSecond();
            return true;
        }
        return false;
    }
    public String getFullName() {
        return currentUser.getLastName() + ' ' + currentUser.getFirstName();
    }
    public String getEmail() {
        return currentUser.getEmail();
    }
    public User getUser() {
        return currentUser;
    }
}

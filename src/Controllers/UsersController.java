
package Controllers;

import Misc.Pair;
import Models.User;
import SQLDatabase.DbContext;


public class UsersController {
    private DbContext dbContext;
    private User currentUser;
    
    
    public UsersController() {
        dbContext = DbContext.getInstance();
    }
    public boolean CheckAccount(String email, String password) {
//        Pair < Boolean, User > response = csvDatabase.checkAccount(email, password);
//        if(response.getFirst())
//        {
//            currentUser = response.getSecond();
//            return true;
//        }
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

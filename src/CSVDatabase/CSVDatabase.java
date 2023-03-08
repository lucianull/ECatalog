/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSVDatabase;


public class CSVDatabase {
    
    private CSVAccounts AccountsDb;
    public CSVDatabase() {
        AccountsDb = new CSVAccounts();
    }
    public int CreateAccount(String email, String password) {
        return AccountsDb.CreateAccount(email, password);
    }
    public boolean checkAccount(String email, String password) {
        return AccountsDb.checkAccount(email, password);
    }
}

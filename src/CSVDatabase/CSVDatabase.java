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
    public int CreateAccount(String email, String password, String firstName, String lastName, 
            String phoneNumber, String street, String number, String block, String sc, int level, 
            int apartment, String city, String county, int year, int month, int day, int classId, String matriculationNr, String parentFirstName, 
            String parentLastName, String parentPhoneNumber, String parentEmail, int roleId) {
        return AccountsDb.CreateStudentAccount(email, password, firstName, lastName, 
            phoneNumber, street, number, block, sc, level, 
            apartment, city, county, year, month, day, classId, matriculationNr, parentFirstName, 
            parentLastName, parentPhoneNumber, parentEmail, roleId);
    }
    public int[] checkAccount(String email, String password) {
        return AccountsDb.checkLoginAccount(email, password);
    }
    
    public String getFullName(int id) {
        return AccountsDb.getFullName(id);
    }
    public String getEmail(int id) {
        return AccountsDb.getEmail(id);
    }
}

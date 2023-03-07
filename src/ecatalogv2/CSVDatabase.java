/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecatalogv2;

import CSVDatabase.CSVReader;
import java.util.HashMap;


public class CSVDatabase {
    private HashMap < String, String > accounts;
    public CSVDatabase() {
        accounts = new HashMap < String, String > ();
        CSVReader csvReader = new CSVReader("C:\\Informatica\\An 2\\Sem2\\PAO\\ECatalogV2\\src\\CSVDatabase\\Accounts.csv", "UTF-8");
        String[] Line;
        while((Line = csvReader.getLine()) != null) {
//            System.out.println(Line[0] + ' ' + Line[1]);
            accounts.put(Line[0], Line[1]);
        }
//        for(String key : accounts.keySet()) {
//            System.out.println(key + ' ' + accounts.get(key));
//        }
    }
    public boolean checkAccount(String email, String password) {
        if(accounts.containsKey(email) == false)
            return false;
        return (accounts.get(email)).equals(password);
    }
}

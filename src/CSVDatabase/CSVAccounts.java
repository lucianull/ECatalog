package CSVDatabase;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import javafx.util.Pair;

public class CSVAccounts {
    
    private Stack < Integer > availableIds;
    private HashMap < String, String > EmailPasswordMap;
    private HashMap < Integer, String > IdEmailMap;
    private CSVReaderWriter csvReaderWriter;
    
    public CSVAccounts() {
        availableIds = new Stack < Integer > ();
        int[] usedIds = new int[1000001];
        EmailPasswordMap = new HashMap < String, String > ();
        IdEmailMap = new HashMap < Integer, String > ();
        csvReaderWriter = new CSVReaderWriter("C:\\Informatica\\An 2\\Sem2\\PAO\\ECatalogV2\\src\\CSVDatabase\\Accounts.csv", "UTF-8");
        String[] Line;
        int x = 0;
        while((Line = csvReaderWriter.getLine()) != null) {
            x = Integer.parseInt(Line[0]);
            EmailPasswordMap.put(Line[1], Line[2]);
            IdEmailMap.put(x, Line[1]);
            usedIds[x] = 1;
        }
        for(int i = 1000000; i >= 1; i--)
            if(usedIds[i] == 0)
                availableIds.push(i);
    }
    
    public boolean checkAccount(String email, String password) {
        if(EmailPasswordMap.containsKey(email) == false)
            return false;
        return (EmailPasswordMap.get(email)).equals(password);
    }
    
    public String GetAccounts() {
        String Accounts = "";
        for(Map.Entry < Integer, String > it : IdEmailMap.entrySet()) {
            Accounts += it.getKey() + ',' + it.getValue() + ',' + EmailPasswordMap.get(it.getValue()) + '\n';
        }
        return Accounts;
    }
    
    public int CreateAccount(String email, String password) {
        Integer newId = availableIds.pop();
        EmailPasswordMap.put(email, password);
        IdEmailMap.put(newId, email);
        csvReaderWriter.WriteToFile(GetAccounts());
        return newId;
    }
    
}

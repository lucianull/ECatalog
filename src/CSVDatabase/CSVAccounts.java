package CSVDatabase;

import Misc.Pair;
import Models.Address;
import Models.Date;
import Models.Professor;
import Models.Student;
import Models.User;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CSVAccounts {
    
    private Stack < Integer > availableIds;
    private HashMap < String, Pair < Integer, String > > EmailPasswordMap;
    private HashMap < Integer, Student > studentsAccounts;
    private HashMap < Integer, Professor > professorAccounts;
    private CSVReaderWriter csvReaderWriter;
    
    public CSVAccounts() {
//        availableIds = new Stack <  > ();
//        int[] usedIds = new int[1000001];
//        EmailPasswordMap = new HashMap <  > ();
//        studentsAccounts = new HashMap <  > ();
//        csvReaderWriter = new CSVReaderWriter("C:\\Informatica\\An 2\\Sem2\\PAO\\ECatalogV2\\src\\CSVDatabase\\Students.csv", "UTF-8");
//        String[] Line;
//        int x = 0;
//        while((Line = csvReaderWriter.getLine()) != null) {
//            x = Integer.parseInt(Line[0]);
//            EmailPasswordMap.put(Line[1], new Pair (x, Line[2]));
//            String[] birth = Line[14].split("/");
//            studentsAccounts.put(x, new Student(Line[3], Line[4], Line[1], Line[5], x, 
//                    new Address(Line[6], Line[7], Line[8], Line[9], Integer.parseInt(Line[10]), Integer.parseInt(Line[11]), 
//                    Line[12], Line[13]), new Date(Integer.parseInt(birth[2]), Integer.parseInt(birth[1]), Integer.parseInt(birth[0])),
//                    Integer.parseInt(Line[15]), Line[16], Line[17], Line[18], Line[19], Line[20],
//                    Integer.parseInt(Line[21]), Line[2]));
//            usedIds[x] = 1;
//        }
//        for(int i = 1000000; i >= 1; i--)
//            if(usedIds[i] == 0)
//                availableIds.push(i);
    }
    
//    public Pair < Boolean, User > checkLoginAccount(String email, String password) {
//        Pair < Boolean, User > retValue = new Pair <Boolean, User >(true, null);
//        if(EmailPasswordMap.containsKey(email) == false){
//            retValue.setFirst(false);
//            return retValue;
//        }
//        if((EmailPasswordMap.get(email)).getSecond().equals(password) == false)
//        {
//            retValue.setFirst(false);
//            return retValue;
//        }
//        retValue.setSecond(studentsAccounts.get(EmailPasswordMap.get(email).getFirst()));
//        return retValue;
//    }
//    
//    public String GetAccountsPrintFormat() {
//        String Accounts = "";
//        for(Map.Entry < Integer, Student > it : studentsAccounts.entrySet()) {
//            Accounts += it.toString() + '\n';
//        }
//        return Accounts;
//    }
//    
//    public int CreateStudentAccount(String email, String password, String firstName, String lastName, 
//            String phoneNumber, String street, String number, String block, String sc, int level, 
//            int apartment, String city, String county, int year, int month, int day, int classId, String matriculationNr, String parentFirstName, 
//            String parentLastName, String parentPhoneNumber, String parentEmail, int roleId) {
//        Integer newId = availableIds.pop();
//        EmailPasswordMap.put(email, new Pair(newId,password));
//        studentsAccounts.put(newId, new Student(firstName, lastName, email, phoneNumber, newId, 
//                new Address(street, number, block, sc, level, apartment, city, county), new Date(year, month, day), 
//                classId, matriculationNr, parentFirstName, parentLastName, parentPhoneNumber, parentEmail, roleId, password));
//        csvReaderWriter.WriteToFile(GetAccountsPrintFormat());
//        return newId;
//    }
    
}

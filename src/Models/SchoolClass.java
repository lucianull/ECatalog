package Models;

import java.util.ArrayList;

public class SchoolClass {
    
    ArrayList < Integer > professorsIds;
    ArrayList < Integer > studentsIds;
    private int timetableId;
    private int classMaster;
    
    public SchoolClass(int timetableId) {
        this.timetableId = timetableId;
    }
}

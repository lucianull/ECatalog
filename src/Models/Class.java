package Models;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class implements Cloneable{
    private int classId;
    private String name;
    private int classMasterId;
    private Professor classMaster = null;

    public Class(int classId, String name, int classMasterId) {
        this.classId = classId;
        this.name = name;
        this.classMasterId = classMasterId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassMasterId() {
        return classMasterId;
    }

    public void setClassMasterId(int classMasterId) {
        this.classMasterId = classMasterId;
    }

    public Professor getClassMaster() {
        return classMaster;
    }

    public void setClassMaster(Professor classMaster) {
        this.classMaster = classMaster;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Class other = (Class) obj;
        if (this.classId != other.classId) {
            return false;
        }
        if (this.classMasterId != other.classMasterId) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
    @Override
    public Class clone()
    {
        try {
            Class clonedClass = (Class) super.clone();
            return clonedClass;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

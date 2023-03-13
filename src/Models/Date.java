
package Models;

public class Date implements Cloneable, Comparable <Date> {
    
    protected int year;
    protected int month;
    protected int day;

    public Date() {
        year = 0;
        month = 0;
        day = 0;
    }
    
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
        public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || !(obj instanceof Date)) {
            return false;
        }
        Date castedObject = (Date) (obj);
        return year == castedObject.year && month == castedObject.month && day == castedObject.day;
    }
    
    @Override
    public int compareTo(Date date) {
        if(this.year != date.year) {
            return Integer.compare(this.year, date.year);
        }
        if(this.month != date.month) {
            return Integer.compare(this.month, date.month);
        }
        return Integer.compare(this.day, date.day);
    }
    
    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

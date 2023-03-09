/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

public class Timestamp extends Date {
    private int hour;
    private int minute;
    private int second;
    public Timestamp(int year, int month, int day, int hour, int minute, int second) {
        super(year, month, day);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    public int compareTo(Timestamp date) {
        Date current = (Date) this;
        Date other = (Date) date;
        int x = current.compareTo(other);
        if(x != 0)
            return x;
        if(this.hour != date.hour) {
            return Integer.compare(this.hour, date.hour);
        }
        if(this.minute != date.minute) {
            return Integer.compare(this.minute, date.minute);
        }
        return Integer.compare(this.second, date.second);
    }
    
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d %02d:%02d:%02d", this.year, this.month, this.day, this.hour, this.minute, this.second);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public boolean equals(Timestamp date) {
        if(this == date)
            return true;
        if(date == null || !(date instanceof Timestamp))
            return false;
        Date current = (Date) this;
        Date other = (Date) date;
        boolean x = current.equals(other);
        if(x == false)
            return false;
        return hour == date.hour && minute == date.minute && second == date.second;
    }
    
}

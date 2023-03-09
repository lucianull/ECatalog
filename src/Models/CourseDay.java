package Models;


public class CourseDay {
    private Subject day[];
    
    public CourseDay(Subject day[]) {
        this.day = day.clone();
    }
}

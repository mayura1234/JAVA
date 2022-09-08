import java.io.*;
public class enumer {
    public enum DaysOfWeek {
        MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
public int val;
DaysOfWeek(int val){
    this.val=val;
}
boolean isWorkDay(){
    if(val<6)
    return true;
    else
    return false;
}
    }
public static void main(String[] args) {
    DaysOfWeek D;
    System.out.println(DaysOfWeek.SUNDAY.isWorkDay());
    System.out.println(DaysOfWeek.MONDAY.isWorkDay());
}
}


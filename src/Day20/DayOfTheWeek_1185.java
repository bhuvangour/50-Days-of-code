package Day20;
import java.util.*;

public class DayOfTheWeek_1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Date date = new Date(year - 1900, month - 1, day);
        return days[date.getDay()];
    }

    public static void main(String[] args) {
        DayOfTheWeek_1185 solution = new DayOfTheWeek_1185();
        System.out.println(solution.dayOfTheWeek(31, 8, 2019));
    }  
}
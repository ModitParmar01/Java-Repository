package enumpractice;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek weekdays = DaysOfWeek.SATURDAY;
        System.out.printf("The day is %s, value is %d\n", weekdays, weekdays.ordinal());
        System.out.println(getRandomDays());
    }

    public static DaysOfWeek getRandomDays() {
        int rand = new Random().nextInt(7);
        var allDays = DaysOfWeek.values();
        return allDays[rand];
    }
}

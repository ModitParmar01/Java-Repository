package enumpractice;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek weekday = DaysOfWeek.SATURDAY;
        System.out.printf("The day is %s, value is %d\n", weekday, weekday.ordinal());

        for(int i=0; i<7; i++) {
            DaysOfWeek weekdays = getRandomDays();
            switchDays(weekdays);
        }
    }

    public static void switchDays(DaysOfWeek weekDays) {
        int weekDayInteger = weekDays.ordinal()+1;
        switch (weekDays) {
            case SUNDAY -> System.out.println("Sunday is the Day "+ weekDayInteger);
            case MONDAY -> System.out.println("Monday is the Day "+weekDayInteger);
            default -> System.out.println(weekDays.name().charAt(0) + weekDays.name().substring(1).toLowerCase() + " is the Day " + weekDayInteger);
        }

    }

    public static DaysOfWeek getRandomDays() {
        int rand = new Random().nextInt(7);
        var allDays = DaysOfWeek.values();
        return allDays[rand];
    }
}
package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int isLeap = 0;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeap = 1;
        }

        switch (isLeap) {
            case (1):
                System.out.println(year + " is a leap year");
                break;
            case (0):
                System.out.println(year + " is not a leap year");
                break;
        }
    }
}

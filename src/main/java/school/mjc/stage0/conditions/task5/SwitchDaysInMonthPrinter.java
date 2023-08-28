package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        int days;

        switch (month) {
            case 2: // February
                days = 28; // Assuming non-leap year
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;
            default: // January, March, May, July, August, October, December
                days = 31;
                break;
        }

        System.out.println( days);
    }
}


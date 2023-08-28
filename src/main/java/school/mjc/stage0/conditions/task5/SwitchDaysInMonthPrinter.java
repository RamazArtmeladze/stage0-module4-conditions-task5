package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {

        switch (month) {
            case 2: // February
                System.out.println(28);
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                System.out.println(30);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            default:
                System.out.println( "wrong number!");
                break;
        }
    }
}


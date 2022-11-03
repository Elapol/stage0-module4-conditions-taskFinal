package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public static void main(String[] args) {
        printDays(2011, 11);
    }

    public static void printDays(int year, int month) {
        if (year / 400 != 0 && year % 400 == 0 || year / 4 != 0 && year % 4 == 0) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
        switch (month) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                System.out.println(31);
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                System.out.println(30);
                break;
            case (2):
                System.out.println(28);
                break;
            default:
                System.out.println("wrong number!");
                break;

        }
    }
}



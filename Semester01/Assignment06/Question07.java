public class Question07 {
    // To be assigned.

    /*
    * If divisible by 400 - leap year,
    * If divisible by 100 - not a leap year,
    * If divisible by 4 - lear year.
    */
    public static int numberOfDaysInAYear(int year) {
        if (year % 400 == 0) {
            return 366;
        } else if (year % 100 == 0) {
            return 365;
        } else if (year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }
    }

    public static void main(String[] args) {
        System.out.println("Year \t Days");
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%d \t %d%n", i, numberOfDaysInAYear(i));
        }
    }
}

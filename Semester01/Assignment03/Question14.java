package Semester01.Assignment03;

public class Question14 {
    // Assigned On 10/11/2025 - Sixth Class
    public static void main(String[] args) {
        int randomNumber = (int) (1 + Math.random() * 12);
        String monthName;

        switch (randomNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month";
                break;

        }

        System.out.println("Randomly generated number: " + randomNumber);
        System.out.println("Corresponding month: " + monthName);
    }
}

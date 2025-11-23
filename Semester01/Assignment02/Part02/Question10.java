package Semester01.Assignment02.Part02;

public class Question10 {
    // Assigned On - 27/10/2025 - Fifth Class
    public static void main(String[] args) {
        float random1 = (float) Math.random();
        float random2 = (float) Math.random();
        float random3 = (float) Math.random();
        float random4 = (float) Math.random();
        float random5 = (float) Math.random();

        System.out.println(
                "Random Values: \n" + random1 + "\n" + random2 + "\n" + random3 + "\n" + random4 + "\n" + random5);

        float average = (random1 + random2 + random3 + random4 + random5) / 5;

        float min = (float) Math.min(Math.min(Math.min(Math.min(random1, random2), random3), random4), random5);
        float max = (float) Math.max(Math.max(Math.max(Math.max(random1, random2), random3), random4), random5);

        System.out.println("Average value: " + average);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

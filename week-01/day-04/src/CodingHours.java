public class CodingHours {
    public static void main(String[] args) {
        int dailyHours = 6;
        int workDays = 5;
        int semesterWeeks = 17;
        int weeklyHours = 52;

        double codingHours = dailyHours * workDays * semesterWeeks;
        int totalHours = weeklyHours * semesterWeeks;

        System.out.println("Hours spent coding: " + (codingHours) +"h");
        System.out.println("Total coding time proportion: " + codingHours/totalHours*100 + "%");
    }
}

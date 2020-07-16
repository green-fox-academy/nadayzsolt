public class SecondsInADay {
    public static void main(String[] args) {
                int currentHours = 14;
                int currentMinutes = 34;
                int currentSeconds = 42;

                int totalHours = 24;
                int hourMinutes = 60;
                int minuteSeconds = 60;

                int totalSeconds = totalHours * hourMinutes * minuteSeconds;
                int tillNowSeconds = currentHours * hourMinutes * minuteSeconds + currentMinutes * minuteSeconds + currentSeconds;
        System.out.println(totalSeconds-tillNowSeconds + " seconds left from the day.");


                // Write a program that prints the remaining seconds (as an integer) from a
                // day if the current time is represented by the variables
    }
}

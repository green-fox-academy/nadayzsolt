package greenFoxInheritanceExercise;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super(); // ezt amúgy is meghívná super() nélkül is, de most szokjuk meg így.
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public String getPreviousOrganization() {
        return previousOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }

    public void setPreviousOrganization(String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }

    public void setSkippedDays(int skippedDays) {
        this.skippedDays = skippedDays;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public int skipDays(int numberOfDays){
        return skippedDays = skippedDays + numberOfDays;
    }

}
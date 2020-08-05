package clonable;

public class Person {
//    protected static String name; / ez így is lehetne
    protected String name;
    protected int age;
    protected String gender;

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

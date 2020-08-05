package clonable;

import greenFoxInheritanceExercise.Cohort;
import greenFoxInheritanceExercise.Person;

import greenFoxInheritanceExercise.*;

import java.util.ArrayList;

public class GreenFoxInheritanceExerciseTest {
  public static void main(String[] args) {
    Student john = new Student("John", 20, "male", "BME");
    Student clone = john.clone();
    System.out.println(clone.getClass() + " " +clone.getName());


  }
}

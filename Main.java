package S47_mayur_OOP_Fitness_Workout_Tracker;

import java.util.*;

class User {
    String name;
    String fitnessGoal;
    int age;

    public void setFitnessGole(String fitnessGoal, String name, int age) {
        this.fitnessGoal = fitnessGoal;
        this.name = name;
        this.age = age;
    }

    public String getFitnessGole() {
        return ("\n" + "\n" + "Hi " + name + "," + "\n" + "Age:" + age + "," + "\n" + "Today's fitness goal is: "
                + fitnessGoal + "\n");
    }

}

class Exercise {
    String exerciseName;
    String muscleGroup;
    int set;

    public void setTimeDuration(String exerciseName, String muscleGroup, int set) {
        this.exerciseName = exerciseName;
        this.muscleGroup = muscleGroup;
        this.set = set;
    };

    public String getTimeDuration() {
        return ("Your Exercise Name is : " + exerciseName + "\n" + "By this exercise " + muscleGroup
                + " muscle will traind " + "\n" + "You have to do " + set + " Set "
                + "\n" + "Thank You :)");
    }

}

class Student {
    String name;
    int age;
    static String GymName  = "ABC GYM";

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gym Name: " + GymName);
    }
}

class GymOperations {

    static int add(int a, int b) {
        return a + b;
    }


    static int multiply(int a, int b) {
        return a * b;
    }
}

abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name:");
        String name = scanner.nextLine();

        System.out.println("Fitness Gole:");
        String fitnessGoal = scanner.nextLine();

        System.out.println("Exercise Name:");
        String exerciseName = scanner.nextLine();

        System.out.println("Muscle Group:");
        String muscleGroup = scanner.nextLine();
        System.out.println("Set");

        int set = scanner.nextInt();
        System.out.println("Age:");

        int age = scanner.nextInt();
        
        User user = new User();
        user.setFitnessGole(fitnessGoal, name , age);
        System.out.println(user.getFitnessGole()); 

        Exercise exercise = new Exercise();
        exercise.setTimeDuration(exerciseName , muscleGroup ,set);
        System.out.println(exercise.getTimeDuration());

        Student[] students = new Student[3];


        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 19);


        for (Student student : students) {
            student.displayInfo();
        }
        // Accessing static methods without creating an object
        int sum = GymOperations.add(5, 10);
        int product = GymOperations.multiply(5, 10);

        System.out.println("Sum: " + sum);        // Output: Sum: 15
        System.out.println("Product: " + product);


        Animal dog = new Dog();
        dog.sound(); // Output: Dog barks
        dog.sleep(); // Output: This animal is sleeping.

        Animal cat = new Cat();
        cat.sound(); // Output: Cat meows
        cat.sleep();

        scanner.close();
    }
}

package S47_mayur_OOP_Fitness_Workout_Tracker;


class Fitness {
    String name;
    int age;

    // Default Constructor
    public Fitness() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    public Fitness(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using Default Constructor
        Fitness Fitness1 = new Fitness();
        Fitness1.displayDetails(); // Output: Name: Unknown, Age: 0

        // Using Parameterized Constructor
        Fitness Fitness2 = new Fitness("Alice", 20);
        Fitness2.displayDetails(); // Output: Name: Alice, Age: 20
    }
}


package S47_mayur_OOP_Fitness_Workout_Tracker;

import java.util.*;

class User{
    String name;
    String fitnessGole;
    int age;

    public void setFitnessGole(String fitnessGole , String name , int age){
        this.fitnessGole = fitnessGole;
        this.name= name;
        this.age = age;
    }

    public String getFitnessGole(){
        return(
            "\n" + "\n" + "Hi "+ name + "," + "\n" + "Age:" + age + "," + "\n" +"Today's fitness goal is: " + fitnessGole + "\n"
        );
    }

}

class Exercise {
    String exerciseName;
    String muscleGroup;
    int set;

    public void setTimeDuration(String exerciseName , String muscleGroup , int set){
        this.exerciseName = exerciseName;
        this.muscleGroup = muscleGroup;
        this.set = set;
    };

    public String getTimeDuration(){
        return(
            "Your Exercise Name is : "+ exerciseName + "\n" +"By this exercise " + muscleGroup 
                + " muscle will traind "+ "\n" + "You have to do " + set + " Set " 
                    + "\n" + "Thank You :)"
        );
    }

}

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Fitness Gole:");
        String fitnessGole = scanner.nextLine();        
        
        
        System.out.println("Exercise Name:");
        String exerciseName = scanner.nextLine();
        System.out.println("Muscle Group:");
        String muscleGroup = scanner.nextLine();
        System.out.println("Set");
        int set = scanner.nextInt();
        System.out.println("Age:");
        int age = scanner.nextInt();
        
        User user = new User();
        user.setFitnessGole(fitnessGole , name , age);
        System.out.println(user.getFitnessGole()); 

        Exercise exercise = new Exercise();
        exercise.setTimeDuration(exerciseName , muscleGroup ,set);
        System.out.println(exercise.getTimeDuration());

        scanner.close();
    }
}


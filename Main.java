abstract class Exercise {
    abstract String getExerciseDetails();
}

class TimeBasedExercise extends Exercise {
    private String name;
    private int duration; 

    public TimeBasedExercise(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    String getExerciseDetails() {
        return name + " for " + duration + " seconds.";
    }
}

class RepetitionBasedExercise extends Exercise {
    private String name;
    private int repetitions;

    public RepetitionBasedExercise(String name, int repetitions) {
        this.name = name;
        this.repetitions = repetitions;
    }

    @Override
    String getExerciseDetails() {
        return name + " for " + repetitions + " repetitions.";
    }
}

public class Main {
    public static void main(String[] args) {
        Exercise plank = new TimeBasedExercise("Plank", 60); 
        Exercise pushUps = new RepetitionBasedExercise("Push-Ups", 20); 

        System.out.println(plank.getExerciseDetails());
        System.out.println(pushUps.getExerciseDetails());
    }
}

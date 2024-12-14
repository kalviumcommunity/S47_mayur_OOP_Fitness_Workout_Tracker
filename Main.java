abstract class Workout {
    abstract double calculateCaloriesBurned(int minutes);
}

class Yoga extends Workout {
    @Override
    double calculateCaloriesBurned(int minutes) {
        return minutes * 3.0; 
    }
}

class StrengthTraining extends Workout {
    @Override
    double calculateCaloriesBurned(int minutes) {
        return minutes * 8.0; 
    }
}

class Cardio extends Workout {
    @Override
    double calculateCaloriesBurned(int minutes) {
        return minutes * 10.0; 
    }
}

class HIIT extends Workout {
    @Override
    double calculateCaloriesBurned(int minutes) {
        return minutes * 15.0; 
    }
}

public class Main {
    public static void main(String[] args) {
        Workout yoga = new Yoga();
        Workout strengthTraining = new StrengthTraining();
        Workout cardio = new Cardio();
        Workout hiit = new HIIT(); 

        System.out.println("Yoga (30 min): " + yoga.calculateCaloriesBurned(30) + " calories");
        System.out.println("Strength Training (30 min): " + strengthTraining.calculateCaloriesBurned(30) + " calories");
        System.out.println("Cardio (30 min): " + cardio.calculateCaloriesBurned(30) + " calories");
        System.out.println("HIIT (30 min): " + hiit.calculateCaloriesBurned(30) + " calories");
    }
}

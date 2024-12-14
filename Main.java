class FitnessActivity {
    private String activityType; 
    private int duration;
    private String date; 


    public FitnessActivity(String activityType, int duration, String date) {
        this.activityType = activityType;
        this.duration = duration;
        this.date = date;
    }

   
    public String getActivityType() {
        return activityType;
    }

    public int getDuration() {
        return duration;
    }

    public String getDate() {
        return date;
    }
}

class FitnessActivityPersistence {
    public void saveToFile(FitnessActivity activity, String fileName) {
        try (java.io.FileWriter writer = new java.io.FileWriter(fileName, true)) { // Append mode
            writer.write(activity.getDate() + ",");
            writer.write(activity.getActivityType() + ",");
            writer.write(activity.getDuration() + "\n");
            System.out.println("Activity saved to file: " + fileName);
        } catch (Exception e) {
            System.out.println("An error occurred while saving the activity: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FitnessActivity activity = new FitnessActivity("Running", 30, "2024-12-15");

        FitnessActivityPersistence persistence = new FitnessActivityPersistence();
        persistence.saveToFile(activity, "fitness_log.txt");
    }
}
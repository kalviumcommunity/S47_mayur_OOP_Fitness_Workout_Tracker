class fitness_tracker {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        fitness_tracker calc = new fitness_tracker();

        System.out.println(calc.add(5, 10));         
        System.out.println(calc.add(5, 10, 20));   
        System.out.println(calc.add(5.5, 10.5));    
    }
}

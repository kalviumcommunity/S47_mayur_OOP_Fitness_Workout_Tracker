abstract class AbstractClass {
    abstract void abstractMethod();

    void concreteMethod() {
        System.out.println("This is a concrete method.");
    }
}

class SubClass extends AbstractClass {
    void abstractMethod() {
        System.out.println("Abstract method implemented in SubClass.");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass obj = new SubClass();
        obj.abstractMethod();  
        obj.concreteMethod(); 
    }
}

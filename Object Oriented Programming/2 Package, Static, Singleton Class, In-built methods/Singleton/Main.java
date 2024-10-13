package Singleton;

public class Main {
    public static void main(String[] args) {
        // doesnot matter how many refrence variable are there it is going to give same instance of class

        // all refrence variables are pointing to just one object
        SingletonClass obj = SingletonClass.getInstance();

        SingletonClass obj1 = SingletonClass.getInstance();
        
        SingletonClass obj2 = SingletonClass.getInstance();
    }
}

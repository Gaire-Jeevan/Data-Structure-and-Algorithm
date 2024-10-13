package Singleton;

public class SingletonClass {

    // to prevent this class to access from other file
    private SingletonClass() {

    }

    // store instance once it is created
    private static SingletonClass instance;

    public static SingletonClass getInstance() {
        // check whether 1 obj only is created or not

        if (instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }
}

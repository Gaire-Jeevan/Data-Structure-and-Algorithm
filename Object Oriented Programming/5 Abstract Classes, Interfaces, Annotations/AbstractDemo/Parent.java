public abstract class Parent {

    int age;


    public Parent(int age) {
        this.age = age;
    }

    static void greet() {
        System.out.println("Hello from static method inside abstract class");
    }

    void normalMethod() {
        System.out.println("Hello I am normal method inside abstract class");
    }

    abstract void career();
    abstract void partner();
}

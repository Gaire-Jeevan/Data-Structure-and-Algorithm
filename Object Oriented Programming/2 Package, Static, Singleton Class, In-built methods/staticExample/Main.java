package staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(21, "Kunal Sharma", 10_000, false);
        Human rohit = new Human(37, "Rohit", 20_000, true);

        System.out.println(kunal.age);
        System.out.println(rohit.population);
        System.out.println(kunal.population);

        // this is not allowed to call (use) non-static data inside static data as it is totally meaningless to use non-static data inside static data as static data doesn't belong to instance but non-static method does

        // gretting()

        fun();
    }

    // this is independent on objects
    static void fun() {
        // we can't use this because it requiresan instance 
        // but the function we are using it in does not depend on instances
        // greeting();

        // we cannot access non static stuff without referencing their instances in a static context
        Main obj = new Main();
        obj.greeting();
        System.out.println("This is static method");
    }


    
    // something that is not static belong to objects
    void greeting() {
        fun();
        System.out.println("Hello, People!");
    }
}

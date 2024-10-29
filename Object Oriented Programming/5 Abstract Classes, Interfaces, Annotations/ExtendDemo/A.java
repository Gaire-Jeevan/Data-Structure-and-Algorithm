public interface A {

    // static interface method should always have body as they cannot be overriden as static method doesn't depend on object
    // call via interface name
    static void greeting() {
        System.out.println("Hey i am static method");
    }

    default void fun() {
        System.out.println("I am in fun of A");
    }
}
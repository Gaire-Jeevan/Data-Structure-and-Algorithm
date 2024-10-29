public interface B extends A {
    void greet();
    default void fun() {
        System.out.println("Fun of B");
    }
}

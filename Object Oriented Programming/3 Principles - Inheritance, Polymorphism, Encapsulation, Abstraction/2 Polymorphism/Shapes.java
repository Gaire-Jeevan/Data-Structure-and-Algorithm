public class Shapes {
    void area() {
        System.out.println("I am in Shapes");
    }

    // Early binding as final method are not overridden so here compiler has no tension to choose which mehtod to determine
    // final void area() {
    //     System.out.println("I am in Shapes");
    // }
}
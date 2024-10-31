// we are implementing Cloneable interface being empty i.e. it doesn't contain the abstract method because it is the way to telll JVM that we have to just perform clone on our object of type (HUMAN in our case now)
public class Human implements Cloneable {
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    // this clone is actually present inside Object class
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
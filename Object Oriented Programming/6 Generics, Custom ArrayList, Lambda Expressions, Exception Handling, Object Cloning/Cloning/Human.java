// we are implementing Cloneable interface being empty i.e. it doesn't contain the abstract method because it is the way to telll JVM that we have to just perform clone on our object of type (HUMAN in our case now)
public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[] {3, 4, 5, 6, 9, 1};
    }

    // public Human(Human other) {
    //     this.age = other.age;
    //     this.name = other.name;
    // }

    // this clone is actually present inside Object class
    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     // this is shallow copy. directly giving refrence of object member (i.e. only non primitive member like array) to clone so that all data can be accessed by clone too
    //     return super.clone();
    // }


    // DEEP COPY
    @Override
    public Object clone() throws CloneNotSupportedException {
        // this is deep copy
        Human twin = (Human)super.clone(); // this is actually shallow copy

        // make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
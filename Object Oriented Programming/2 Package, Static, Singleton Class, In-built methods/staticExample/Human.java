package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    // the properties that are not specificially realted to only one object (but common to all object) that properties should be static
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
    }
       
}

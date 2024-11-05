public class Basic {

    // enum can't extend any class as multiple inheritance is not allowed in java
    // but it can implement any number of class
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // every single one over here is Public, statc and final member
        // since its final we can't create child enums (final prevent inheritance)
        // type is week


        // this is not public or protected, only private or default
        // why? if we created public or protected, it will aloow initialization of more than one object. we want it to be like constant number of objects.

        // we don't want to create new objecs
        // this is not the enum concept, that's why

        // internally: public static final Week Monday = new week();
        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello, how are you");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();

        // return enum constant
        System.out.println(Week.valueOf("Monday"));

        // for(Week day: Week.values()) {
        //     System.out.println(day);
        // }

        System.out.println(week.ordinal());
        // System.out.println(week);
    }
}
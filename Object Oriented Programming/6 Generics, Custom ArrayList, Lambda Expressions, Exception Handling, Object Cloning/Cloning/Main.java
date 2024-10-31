public class Main {

    // something inside this function throws exception
    public static void main(String[] args) throws CloneNotSupportedException {
        Human jeevan = new Human(22, "Jeevan Gaire");
        // Human twin = new Human(jeevan);

        Human twin = (Human)jeevan.clone();
        System.out.println(twin.age + " " + twin.name);
    }
    
}

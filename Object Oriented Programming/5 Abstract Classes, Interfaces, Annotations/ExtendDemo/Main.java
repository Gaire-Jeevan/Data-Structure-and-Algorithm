public class Main implements A, B{

    @Override
    public void greet() {
    System.out.println("Greeting from main method");    
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        main.greet();
        main.fun();

        A.greeting();
    }
}

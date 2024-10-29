public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(30);
        daughter.career();
        daughter.partner();

        Parent.greet();
        son.normalMethod();
    }
}

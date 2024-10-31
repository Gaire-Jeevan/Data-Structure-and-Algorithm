public class MyExceptionDemo {
    public static void main(String[] args) {
        try {
            String name = "Jeevan";

            if (name.equals("Jeevan")) {
                throw new MyException("name is Kunal");
            }

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

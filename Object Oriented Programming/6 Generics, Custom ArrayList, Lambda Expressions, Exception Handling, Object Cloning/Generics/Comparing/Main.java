import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student jeevan = new Student(12, 98.8f);
        Student raj = new Student(21, 85.8f);
        Student rahul = new Student(1, 77.8f);
        Student sandeep = new Student(52, 75.6f);
        Student paras = new Student(65, 98.9f);

        Student[] list = {jeevan, raj, rahul, sandeep, paras};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if (jeevan.compareTo(raj) < 0) {
            System.out.println(jeevan.compareTo(raj));
            System.out.println("Raj has more marks");
        }
        else {
            System.out.println(jeevan.compareTo(raj));
            System.out.println("Jeevan has more marks");
        
        }
    }
}

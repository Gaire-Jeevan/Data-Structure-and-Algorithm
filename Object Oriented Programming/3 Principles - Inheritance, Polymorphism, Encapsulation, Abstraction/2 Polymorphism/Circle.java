public class Circle extends Shapes {
    
    // this will run when obj of Child is created
    // hence it is overriding the parent method
    @Override // this is annotatio
    void area() {
        System.out.println("Area is pie * r * r");
    }
}

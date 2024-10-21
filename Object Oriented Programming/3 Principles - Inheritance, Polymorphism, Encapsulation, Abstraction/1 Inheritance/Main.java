public class Main {
    public static void main(String[] args) {
        Box box = new Box();

        System.out.println(box.length + " " + box.height + " " + box.width);

        // Here box1 is of type Box (refrence type of Box) but it is refrencing type BoxWeight
       // box1 object can only access the member of Box type it cannot access any extra member present in child class 
        Box box1 = new BoxWeight(2, 3, 4, 5);


        // there are many variables in both parent and child classes
        // we are given access to variables that are in the reference type i.e. BoxWeight
        // hence, we should have aceess to weight variable
        // this also means, that the ones we are tryingto access should be initialized
        // here when the obj itself is of type parent class, how will you call the constructor of child class

        // parent class has no idea about weight property and refrencing class doesn't has it's all property initialize

        // that is why error
        // BoxWeight box2 = new Box(2, 3, 4);
    }
}

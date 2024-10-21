public class Box {
    double length;
    double height;
    double width;

    Box () {
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    // cube
    Box (double side) {
        this.length = side; 
        this.height = side; 
        this.width = side; 
    }

    Box (double length, double height, double width) {
        this.height = length;
        this.length = height;
        this.width = width;
    }

    // copy constructor
    Box (Box old) {
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
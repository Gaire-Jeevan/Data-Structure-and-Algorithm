public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double length, double height, double width, double weight) {
        // this call the parent class constructor
        // used to initialise values present in parent class
        super(length, height, width);
        this.weight = weight;
    }
}
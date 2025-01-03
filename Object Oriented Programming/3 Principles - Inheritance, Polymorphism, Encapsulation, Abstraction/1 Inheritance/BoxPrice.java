public class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice () {
        super();
        this.cost = -1;
    }

    BoxPrice (BoxPrice other) {
            super(other);
            this.cost = other.cost;
    }

    BoxPrice (double length, double height, double weidth, double weight, double cost) {
        super(length, height, weidth, weight);
        this.cost = cost;
    }  
    
    public BoxPrice (double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

}

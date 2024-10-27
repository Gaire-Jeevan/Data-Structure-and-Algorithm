public class ObjectDemo {
    
    int num;


    public ObjectDemo(int num) {
        this.num = num;
    }


    // gives number representation of objects
    // hashcode is not address it is just random integer value
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(35);
        System.out.println(obj.hashCode());
    }
}

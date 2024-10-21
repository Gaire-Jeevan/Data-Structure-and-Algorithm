public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num =  num;
    }


    @Override
    public String toString() {
        return "{" +
            " num='" + getNum() + "'" +
            "}";
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}

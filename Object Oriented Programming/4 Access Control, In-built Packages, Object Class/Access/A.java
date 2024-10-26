public class A {
    private int num;
    String name;
    int[] arr;

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getArr() {
        return this.arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    
}
package Stack;
public class DynamicStack extends CustomStack {
    
    public DynamicStack() {
        // call the constructor with no argument
        super();
    }

    public DynamicStack(int size) {
        super(size); // it will call CustomStack(int size);
    }

    @Override
    public boolean push(int item) {

        // this takes care of it being full
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];

            // call all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        // at this point we know that our array is not full
        // insert item
        return super.push(item);

    }
}

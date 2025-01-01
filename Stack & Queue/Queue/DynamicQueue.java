package Queue;
public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        // call the constructor with no argument
        super();
    }

    public DynamicQueue(int size) {
        super(size); // it will call CustomStack(int size);
    }

    @Override
    public boolean insert(int item) {
        
         // this takes care of it being full
         if (this.isFull()) {
            int[] temp = new int[data.length * 2];

            // call all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }

            front = 0;
            end = data.length;
            data = temp;
        }

        // at this point we know that our array is not full
        // insert item

        return super.insert(item);
    }
}

package dataStructures;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int frontPointer = 0;
    protected int endPointer = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int value) {
        if (isFull()) {
            System.out.println("Out of bounds!!");
            return false;
        }

        data[endPointer++] = value;
        endPointer = endPointer % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }

        int removed = data[frontPointer++];
        frontPointer = frontPointer % data.length;
        size--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from an empty Queue!!");
        }

        return data[frontPointer];
    }

    public void display() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }

        int i = frontPointer;

        do {
            System.out.print(data[i] + " <- ");
            i++;
            i %= data.length;
        } while (i != endPointer);
        System.out.println("END");
    }

    public boolean isFull() {
        return size == data.length;
    }

    public  boolean isEmpty() {
        return size == 0;
    }
}

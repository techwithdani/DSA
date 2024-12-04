package dataStructures;

public class Stacks {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int pointer = -1;

    public Stacks() {
        this(DEFAULT_SIZE);
    }

    public Stacks(int size) {
        this.data = new int[size];
    }

    public boolean push(int value) throws StackException {
        if (isFull()) {
            throw new StackException("Stack is Full!!");
        }

        pointer++;
        data[pointer] = value;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Empty!!");
        }

        int removedElement = data[pointer];
        pointer--;
        return removedElement;
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty Stack!!");
        }

        return data[pointer];
    }

    public boolean isFull() {
        return pointer == data.length - 1;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }
}

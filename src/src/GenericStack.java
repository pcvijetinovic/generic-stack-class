public class GenericStack<T> {

    private Object[] data;
    private int top;

    public GenericStack(int size) {
        data = new Object[size];
        top = -1;
    }

    public void push(T value) throws StackFullException {
        if (top == data.length - 1) {
            throw new StackFullException("Stack is full");
        }

        top++;
        data[top] = value;
    }
}

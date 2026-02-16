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

    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }

        T value = (T) data[top];
        data[top] = null;
        top--;
        return value;
    }

    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }

        return (T) data[top];
    }

    public String list() {
        String result = "";

        for (int i = 0; i <= top; i++) {
            result = result + data[i];
            if (i < top) {
                result = result + ";";
            }
        }

        return result;
    }


}

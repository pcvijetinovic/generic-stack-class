public class GenericStack<T> {
    // Object array is used because generic arrays cannot be created directly
    private Object[] data;
    private int top;

    public GenericStack(int size) {
        data = new Object[size];
        top = -1; // stack starts empty
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

        // Cast from Object to T because we store data in Object[]
        T value = (T) data[top];
        data[top] = null;
        top--;
        return value;
    }

    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        // Cast is needed because array stores Object
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

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Number Stack Test");

            GenericStack<Integer> stack = new GenericStack<>(3);

            stack.push(5);
            stack.push(10);
            stack.push(15);

            System.out.println("Stack: " + stack.list());

            System.out.println("Peek: " + stack.peek());

            System.out.println("Pop: " + stack.pop());

            System.out.println("After pop: " + stack.list());

        } catch (StackFullException e) {
            System.out.println("Stack is full!");
        } catch (StackEmptyException e) {
            System.out.println("Stack is empty!");
        }

        System.out.println(" ");

        try {
            System.out.println("Text Stack Test");

            GenericStack<String> textStack = new GenericStack<>(2);

            textStack.push("Hello");
            textStack.push("World");

            System.out.println("Stack: " + textStack.list());

            System.out.println("Pop: " + textStack.pop());
            System.out.println("Pop: " + textStack.pop());

            // This will cause an exception because the stack is empty
            textStack.pop();

        } catch (StackFullException e) {
            System.out.println("Stack is full");
        } catch (StackEmptyException e) {
            System.out.println("Stack is empty");
        }
    }
}
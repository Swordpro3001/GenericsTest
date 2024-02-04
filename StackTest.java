public class StackTest {
    public static void main(String[] args) {
        // Test a number stack
        Stack<Integer> numberStack = new Stack<>();
        try {
            numberStack.push(1); // Push 1
            numberStack.push(2); // Push 2
            System.out.println(numberStack.list()); // List elements
            System.out.println(numberStack.pop()); // Pop and print
            System.out.println(numberStack.peek()); // Peek and print
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Test a text stack
        Stack<String> textStack = new Stack<>();
        try {
            textStack.push("Hello"); // Push "Hello"
            textStack.push("World"); // Push "World"
            System.out.println(textStack.list()); // List elements
            System.out.println(textStack.pop()); // Pop and print
            System.out.println(textStack.peek()); // Peek and print
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
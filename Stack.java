/**
 * A generic Stack class.
 * @param <T> the type of elements in this stack
 */
public class Stack<T> {
    private Object[] elements;
    private int top;

    /**
     * Constructs an empty Stack.
     */
    public Stack() {
        elements = new Object[10]; // default size
        top = -1;
    }

    /**
     * Constructs a Stack with the given elements.
     * @param elements the initial elements of the stack
     */
    public Stack(T[] elements) {
        this.elements = new Object[elements.length];
        System.arraycopy(elements, 0, this.elements, 0, elements.length);
        top = elements.length - 1;
    }

    /**
     * Adds an element to the top of the stack.
     * @param element the element to add
     * @throws StackFullException if the stack is full
     */
    public void push(T element) throws StackFullException {
        if (top == elements.length - 1) {
            throw new StackFullException("Stack is full");
        }
        elements[++top] = element;
    }

    /**
     * Removes and returns the top element of the stack.
     * @return the top element of the stack
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[top--];
    }

    /**
     * Returns the top element of the stack without removing it.
     * @return the top element of the stack
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[top];
    }

    /**
     * Returns a string representation of the stack.
     * @return a string representation of the stack
     */
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]);
            if (i < top) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
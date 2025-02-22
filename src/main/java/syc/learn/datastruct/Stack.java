package syc.learn.datastruct;

/**
 * 基于数组实现的栈
 * @author syc
 */
public class Stack<T> {
    // 存储元素的数组
    private Object[] elements;
    
    // 栈顶指针
    private int top;
    
    // 栈的容量
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        elements = new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public Stack(int initialCapacity) {
        elements = new Object[initialCapacity];
        top = -1;
    }

    /**
     * 入栈
     */
    public void push(T element) {
        ensureCapacity();
        elements[++top] = element;
    }

    /**
     * 出栈
     */
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("栈为空");
        }
        T element = (T) elements[top];
        elements[top--] = null; // 避免内存泄漏
        return element;
    }

    /**
     * 查看栈顶元素
     */
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("栈为空");
        }
        return (T) elements[top];
    }

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 获取栈的大小
     */
    public int size() {
        return top + 1;
    }

    /**
     * 确保容量足够
     */
    private void ensureCapacity() {
        if (top == elements.length - 1) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);  
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }   
}

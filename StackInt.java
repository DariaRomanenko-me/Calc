//Непрерывная реализация стека целых чисел.
class StackInt {
    private static final int DEFSIZE = 16;
    private int[] array;
    private int head;

    public StackInt() {
        array = new int[DEFSIZE];
        head = 0;
    }

    public final void push(int val) {
        array[head++] = val;
    }

    public final int pop() {
        return array[--head];
    }

    public final int top() {
        return array[head - 1];
    }

    public final void test() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3999) {
                System.err.println("Одно из значений формулы больше 3999");
                System.exit(0);
            }
        }
    }
}

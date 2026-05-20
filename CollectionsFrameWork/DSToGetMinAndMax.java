import java.util.Stack;

class MinMaxDS {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;
    private Stack<Integer> maxStack;
    MinMaxDS() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
        maxStack = new Stack<>();
    }
    void insert(int x) {
        mainStack.push(x);
        minStack.push(
            minStack.isEmpty() ? x : Math.min(x, minStack.peek())
        );
        maxStack.push(
            maxStack.isEmpty() ? x : Math.max(x, maxStack.peek())
        );
    }
    int getMin() {
        return minStack.peek();
    }
    int getMax() {
        return maxStack.peek();
    }
    int extractMin() {
        int min = minStack.peek();
        removeElement(min);
        return min;
    }
    int extractMax() {
        int max = maxStack.peek();
        removeElement(max);
        return max;
    }
    private void removeElement(int value) {
        Stack<Integer> temp = new Stack<>();
        while (!mainStack.isEmpty() && mainStack.peek() != value) {
            temp.push(mainStack.pop());
            minStack.pop();
            maxStack.pop();
        }
        if (!mainStack.isEmpty()) {
            mainStack.pop();
            minStack.pop();
            maxStack.pop();
        }
        while (!temp.isEmpty()) {
            insert(temp.pop());
        }
    }
}
class DSToGetMinAndMax{
    public static void main(String[] args) {
        MinMaxDS ds = new MinMaxDS();
        ds.insert(5);
        ds.insert(10);
        ds.insert(3);
        ds.insert(15);
        ds.insert(2);
        System.out.println(ds.getMin()); 
        System.out.println(ds.getMax()); 
        ds.insert(1);
        System.out.println(ds.getMin()); 
        ds.insert(20);
        System.out.println(ds.getMax()); 
        System.out.println(ds.extractMin()); 
        System.out.println(ds.extractMax()); 
    }
}
package stack;

public class main {
    public static void main(String[] args){
        Stack newStack= new Stack(55);
        newStack.printStack();
        newStack.getHeight();
        newStack.printTop();
        newStack.push(21);
        newStack.printStack();
        newStack.getHeight();
        newStack.pop();
        newStack.printTop();
        newStack.getHeight();
        newStack.printStack();

    }
}

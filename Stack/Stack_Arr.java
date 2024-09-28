
class Stack_Arr {
    static class Stack {
        int maxSize;
        int top;
        int arr[];

        Stack(int n) {
            this.maxSize = n;
            this.arr = new int[n];
            top = -1;// stack is initially empty
        }

        // push operation
        void push(int val) {
            // check if Stack is full
            if (top == maxSize - 1) {
                System.out.println("Overflow :");
            } else {
                top++; // Move top pointer up
                arr[top] = val;// Add value to the stack

            }
        }

        void disp() {
            if (isEmpty()) {
                System.out.println("Empty");
            } else {
                System.out.println("Elements are :");
                for (int i = 0; i < maxSize; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        boolean isEmpty(){
            return top == -1;
        }
        int pop(){
            if(top == -1){
                System.out.println("Underflow ");
            }
            else{
                int temp = arr[top];
                top--;
                return temp;
            }
            return -1;
        }
        // Peek operation to view the top element without removing it
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            } else {
                return arr[top];
            }
        }

    }

    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        
        myStack.disp();
    System.out.println();
     myStack.pop();
    myStack.disp();
    }
}
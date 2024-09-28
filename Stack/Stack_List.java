import java.util.Stack;

public class Stack_List {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

        public static class Stack {
            Node head;

            public boolean isEmpty() {
                return head == null;
            }

            void push(int data) {
                Node newNode = new Node(data);
                if (isEmpty()) {
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }

            int pop() {
                if (isEmpty()) {
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }

            int peek() {
                if (isEmpty()) {
                    return -1;
                }
                return head.data;
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
           System.out.println(s.peek());
           s.pop();
        }
        //System.out.println(s.peek());

    }
}

import java.util.Scanner;

public class LINKEA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        int begin = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String cmd = sc.next();

            switch (cmd) {
                case "insertAt":
                    int index = sc.nextInt();
                    int value = sc.nextInt();
                    linkedList.insertAt(index, value);
                    break;
                case "getAt":
                    index = sc.nextInt();
                    System.out.println(linkedList.getAt(index));
                default:
                    break;
            }
        }

    }

}

class LinkedList<T extends Number> {

    static private class LinkedNode<U extends Number> {
        U number;
        LinkedNode<U> next;

        public LinkedNode(U number) {
            this.number = number;
        }
    }

    LinkedNode<T> head = null;

    public void insertAt(int index, T number) {
        // Your code here
        LinkedNode<T> node = new LinkedNode<>(number);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    /**
     * @return null if index is out of range
     */
    public T getAt(int index) {
        // Your code here
        LinkedNode<T> tempHead = head;
        for(int i = 0; i<index;i++) {
            if (tempHead == null) {
                return null;
            }
            tempHead = tempHead.next;
        }
        
        return tempHead.number;
    }

}

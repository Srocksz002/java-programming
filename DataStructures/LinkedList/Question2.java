package DataStructures.LinkedList;

class LinkedList {

    public static Node head;
    public static Node tail;
    public static int size;

    // public LinkedList() {
    // this.head = null;
    // this.tail = null;
    // this.size = 0;
    // }

    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node() {
            this.next = null;
        }
    }

    // Getter method to access the nested class instance
    public Node getNode() {
        return new Node();
    }

    public void addFirst(int data) {
        // step 1--create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2--new node next=head
        newNode.next = head;// link

        // step 3--head=new node
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print(Node head) {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void deleteNthfromLast(int n) {
        // calculate size
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next;
            return;
        }
        Node prev = head;
        int i = 1;
        while (i < size - n) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) { // helper function
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // slow-->+1
            fast = fast.next.next; // fats-->+2
        }
        return slow; // slow is my mid
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return false;
        }
        // step1:find midNode
        Node miNode = findMid(head);
        // step2:reverse 2nd half
        Node prev = null;
        Node curr = miNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // step3:check left and right half
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        // remove cycle
        prev.next = null;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newleft, newRight);

    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            right = nextR;
            left = nextL;
        }
    }

    // public static Node head;
    // public static Node tail;
    // public static int size;

    Node dummyOdd = new Node(-1);
    Node oddTail = dummyOdd;
    Node curr = head;

}

public class Question2 {

    public static LinkedList parentLL = new LinkedList();
    public static LinkedList.Node head;
    public static LinkedList.Node tail;

    public static void Swap(int x, int y) {
        if (head == null) {
            return;
        }
        if (x == y) {
            return;
        }

        LinkedList.Node prevX = null;
        LinkedList.Node currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        LinkedList.Node prevY = null;
        LinkedList.Node currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return;
        }

        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }
        LinkedList.Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    // question 4--->even odd linked list

    public static LinkedList.Node seggregateEvenOdd(LinkedList.Node head) {
        if (head == null || head.next == null)
            return head;
        LinkedList.Node dummyEven = parentLL.new Node(-1);
        LinkedList.Node evenTail = dummyEven;
        LinkedList.Node dummyOdd = parentLL.new Node(-1);
        LinkedList.Node oddTail = dummyEven;
        LinkedList.Node curr = head;
        while (curr != null) {
            if (curr.data % 2 != 0) {
                oddTail.next = curr;
                oddTail = oddTail.next;

            } else {
                evenTail.next = curr;
                evenTail = evenTail.next;

            }
            curr = curr.next;
        }
        evenTail.next = dummyOdd.next;
        oddTail.next = null;
        head = dummyEven.next;
        // System.out.println("hhihih "+head.data);
        // System.out.println("hhihih "+evenTail.data);
        // System.out.println("hhihih "+oddTail.data);
        return head;
        // return dummyEven.next;
    }

    public static void main(String[] args) {
        // Node head = new Node(); // Instantiate a Node object for the head of the
        // linked list
        LinkedList.Node head = parentLL.new Node(1); // Create the first node and assign it to the head
        head.next = parentLL.new Node(2); // Create subsequent nodes and connect them to the head
        head.next.next = parentLL.new Node(3);
        head.next.next.next = parentLL.new Node(4);
        head.next.next.next.next = parentLL.new Node(5);
        head.next.next.next.next.next = parentLL.new Node(6);
        head.next.next.next.next.next.next = parentLL.new Node(7);
        head.next.next.next.next.next.next.next = parentLL.new Node(8);

        System.out.println("List before segregation:");
        // Now you need to print the list. You can create a method in the LinkedList
        // class to print the list.
        // For example:
        // head.parentLL.print();
        parentLL.print(head);
        LinkedList.Node segregatedHead = seggregateEvenOdd(head); // Segregate even and odd elements

        System.out.println("List after segregation:");

        // segregatedHead.print();
        // Print the segregated list
        // LinkedList.print(segregatedHead);
    }

}
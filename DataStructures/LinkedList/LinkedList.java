// package DL;
// public class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }

//     public Node() {
//         this.next = null;
//     }
// }
// public class LinkedList {
   
    
//     public Node head;
//     public Node tail;
//     public int size;

//     public LinkedList() {
//         this.head = null;
//         this.tail = null;
//         this.size = 0;
//     }

//     public void addFirst(int data){
//         //step 1--create new node
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }

//         //step 2--new node next=head
//         newNode.next=head;//link

//         //step 3--head=new node
//         head=newNode;
//     }

//     public void addLast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//         }

//         tail.next=newNode;
//         tail=newNode;
//     }
//      public void print() {
//         if (head == null) {
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "-->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public void add(int idx,int data){
//         if(idx==0){
//             addFirst(data);
//             return;
//         }
//         Node newNode=new Node(data);
//         size++;
//         Node temp=head;
//         int i=0;
//         while(i<idx-1){
//             temp=temp.next;
//             i++;
//         }
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }

//     public int removeFirst(){
//         if(size==0){
//             System.out.println("LL is empty");
//             return Integer.MAX_VALUE;
//         }else if(size==1){
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;
//         }
//         int val=head.data;
//         head=head.next;
//         size--;
//         return val;
//     }

//     public int removeLast(){
//         if(size==0){
//             System.out.println("LL is empty");
//             return Integer.MIN_VALUE;
//         }else if(size==1){
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;
//         }
//         Node prev=head;
//         for(int i=0;i<size-2;i++){
//             prev=prev.next;
//         }
//         int val=prev.next.data;
//         prev.next=null;
//         tail=prev;
//         size--;
//         return val;
//     }

//     public int itrSearch(int key){
//         Node temp=head;
//         int i=0;
//         while(temp!=null){
//             if(temp.data==key){
//                 return i;
//             }
//             temp=temp.next;
//             i++;
//         }
//         return -1;
//     }

//     public int recSearch(int key){
//         return helper(head,key);
//     }
//     public int helper(Node head,int key){
//         if(head==null){
//             return -1;
//         }
//         if(head.data==key){
//             return 0;
//         }
//         int idx=helper(head.next, key);
//         if(idx==-1){
//             return -1;
//         }
//         return idx+1;
//     }

//     public void reverse(){
//         Node prev=null;
//         Node curr=tail=head;
//         Node next;

//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }

//         head=prev;
//     }
//     public void deleteNthfromLast(int n){
//         //calculate size
//         Node temp=head;
//         int size=0;
//         while(temp!=null){
//             temp=temp.next;
//             size++;
//         }
//         if(n==size){
//             head=head.next;
//             return;
//         }
//         Node prev=head;
//         int i=1;
//         while(i<size-n){
//             prev=prev.next;
//             i++;
//         }
//         prev.next=prev.next.next;
//         return;
//     }

//     public Node findMid(Node head){     //helper function
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;             //slow-->+1
//             fast=fast.next.next;        //fats-->+2
//         }
//         return slow;                    //slow is my mid
//     }

//     public boolean checkPalindrome(){
//         if(head==null||head.next==null){
//             return false;
//         }
//         //step1:find midNode
//         Node miNode=findMid(head);
//         //step2:reverse 2nd half
//         Node prev=null;
//         Node curr=miNode;
//         Node next;
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         Node right=prev;
//         Node left=head;

//         //step3:check left and right half
//         while(right!=null){
//             if(right.data!=left.data){
//             return false;
//             }
//             right=right.next;
//             left=left.next;
//         }
//         return true;
//     }
//     public boolean isCycle(){
//         Node slow=head;
//         Node fast=head;

//         while(fast!=null&& fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public void removeCycle(){
//         //detect cycle
//         Node slow=head;
//         Node fast=head;
//         boolean cycle=false;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast){
//                 cycle=true;
//                 break;
//             }
//         }
//         if(cycle==false){
//             return;
//         }

//         //find meeting point
//         slow=head;
//         Node prev=null;
//         while(slow!=fast){
//             slow=slow.next;
//             prev=fast;
//             fast=fast.next;
//         }
//         //remove cycle 
//         prev.next=null;
//     }

//     public Node mergeSort(Node head){
//         if(head==null || head.next==null){
//             return head;
//         }
//         //find mid
//         Node mid=getMid(head);
//         Node rightHead=mid.next;
//         mid.next=null;
//         Node newleft=mergeSort(head);
//         Node newRight=mergeSort(rightHead);
//         return merge(newleft,newRight);

//     }
//     private Node getMid(Node head){
//         Node slow=head;
//         Node fast=head.next;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }

//     private Node merge(Node head1,Node head2){
//         Node mergedll=new Node(-1);
//         Node temp=mergedll;

//         while(head1!=null && head2!=null){
//             if(head1.data<=head2.data){
//                 temp.next=head1;
//                 head1=head1.next;
//                 temp=temp.next;
//             }else{
//                 temp.next=head2;
//                 head2=head2.next;
//                 temp=temp.next;
//             }
//         }

//         while(head1!=null){
//             temp.next=head1;
//             head1=head1.next;
//             temp=temp.next;
//         }

//         while(head2!=null){
//             temp.next=head2;
//             head2=head2.next;
//             temp=temp.next;
//         }
//         return mergedll.next;
//     }

//     public void zigZag(){
//         //find mid
//         Node slow=head;
//         Node fast=head.next;
//         while(fast!=null&& fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         Node mid=slow;

//         //reverse 2nd half
//         Node curr=mid.next;
//         mid.next=null;
//         Node prev=null;
//         Node next;
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }

//         Node left=head;
//         Node right=prev;
//         Node nextL,nextR;

//         while(left!=null&& right!=null){
//             nextL=left.next;
//             left.next=right;
//             nextR=right.next;
//             right.next=nextL;

//             right=nextR;
//             left=nextL;
//         }
//     }


//     public static Node head;
//     public static Node tail; 
//     public static int size;

//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//        // ll.print();
//         // ll.addFirst(2);
//         // //ll.print();
//         // ll.addFirst(1);
//         // //ll.print();
//         // ll.addLast(3);
//         // //ll.print();
//         // ll.addLast(4);
//         // ll.print();

//         // ll.add(2,9);
//         // ll.print();
//         // System.out.println(ll.size);
//         // System.out.println(ll.removeFirst());
//         // ll.print();
//         // ll.removeLast();
//         // ll.print();
//         // System.out.println(ll.itrSearch(3));
//         // System.out.println(ll.itrSearch(10));
//         // System.out.println(ll.recSearch(3));
//         // System.out.println(ll.recSearch(10));

//         // ll.reverse();
//         // ll.print();
//         // ll.deleteNthfromLast(3);
//         // ll.print();
//         // ll.addLast(1);
//         // ll.addLast(2);
//         // ll.addLast(1);
//         // //ll.addLast(1);
//         // ll.print();
//         // System.out.println(ll.checkPalindrome());
//         //head=new Node(1);
//         //head.next=new Node(2);
//         //head.next.next=new Node(3);
//         // head.next.next.next=new Node(4);
//         // head.next.next.next.next=new Node(5);
//         // head.next.next.next.next.next=head.next.next;
        
//         // //head.next.next.next=head.next;
//         // //ll.print();
//         // System.out.println(ll.isCycle());
//         // ll.removeCycle();
//         // ll.print();
        
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(3);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.addLast(6);

//         ll.print();
//         //ll.head=ll.mergeSort(ll.head);
//         ll.zigZag();
//         ll.print();
        

//     }
// }

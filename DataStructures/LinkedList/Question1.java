package DataStructures.LinkedList;
public class Question1 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node getMergeNode(Node head1,Node head2){   //O(N*M)
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null){
            while(temp2!=null){
                
                if(temp1==temp2){
                    return temp1;
                }
                temp2=temp2.next;  
            }
            temp2=head2;
            temp1=temp1.next;
        }
        return null ;
       
    }


    //OPTIMISED----------------->O(N+M)

    public static Node getIntersection(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;

            if(temp1==null && temp2==null){
                return null;
            }

            if(temp1==null){
                temp1=head2;
            }
            if(temp2==null){
                temp2=head1;
            }
        }
        return temp1;
    }
    
    public static void main(String[] args) {
        Node head1=new Node(4);//4
        Node head2=new Node(1);//1
        Node newNode=new Node(5);
        head1.next=newNode;//4-->5
        newNode=new Node(6);
        head1.next.next=newNode;//4-->5-->6
        newNode=new Node(7);
        head1.next.next.next=newNode;//4-->5-->6-->7

        newNode=new Node(2);
        head2.next=newNode;//1-->2
        newNode=new Node(3);
        head2.next.next=newNode;//1-->2-->3
        head2.next.next.next=head1.next.next;

        //Node mergingPoint=getMergeNode(head1,head2);
        Node mergingPoint=getIntersection(head1, head2); 
        System.out.println(mergingPoint);
    }
}

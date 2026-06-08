class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
    }
}
public class reverseLL{
    private static Node convert(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static Node reverse(Node head){
        Node temp=head;
        Node prev=null;
        Node front=head;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    private static Node reverseRecur(Node head){
        if(head==null||head.next==null) return head;
        Node newhead=reverseRecur(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
    private static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        int[] arr={2,5,6,8};
        Node head=convert(arr);
        //head=reverse(head);
        head=reverseRecur(head);
        print(head);
     }
}
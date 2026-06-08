class Node{
    int data;
    Node next;
    Node back;
    Node(int data1,Node next1,Node back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
    Node(int data1){
        this.data=data1;
    }
}
public class reverseDLL{
    private static Node reverse(Node head){
        Node current=head;
        Node last=null;
        while(current!=null){
            last=current.back;
            current.back=current.next;
            current.next=last;
            current=current.back;
        }
        if(last!=null){
            head=last.back;
        }
        return head;
    }
    private static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
     private static Node arraytoDLL(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public static void main(String args[]){
        int[] arr={2,5,6,8};
        Node head=arraytoDLL(arr);
        head=reverse(head);
        print(head);
    }
}
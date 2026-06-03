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
public class deletion{
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
    //remove starting head
    private static Node removehead(Node head){
        if(head==null) return head;
        head=head.next;
        return head;
    }
    //remove tail
    private static Node removetail(Node head){
        if(head==null||head.next==null) return null;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    //remove position
    private static Node removepos(Node head,int k){
        if(head==null) return head;
        if(k==1){
            head=head.next;
            return head;
        }
        int cnt=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            cnt++;
            if(k==cnt){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    //remove value
    private static void print(Node head){
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String args[]){
        int[] arr={2,5,6,8};
        Node head=convert(arr);
        //head=removehead(head);
        //head=removetail(head);
        head=removepos(head,4);
        print(head);
     }
}
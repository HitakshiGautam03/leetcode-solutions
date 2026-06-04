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
public class insertion{
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
    //insert starting head
    private static Node inserthead(Node head,int v){
        if(head==null) return head;
        Node temp=new Node(v,head);
        return temp;
    }
    //insert tail
    private static Node inserttail(Node head,int v){
        if(head==null||head.next==null) return null;
        Node abc=new Node(v);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=abc;
        return head;
    }
    //insert position
    private static Node insertpos(Node head,int k,int v){
        if(head==null) return head;
        if(k==1){
            head=inserthead(head,v);
            return head;
        }
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            if(cnt==k-1){
                Node abc=new Node(v);
                abc.next=temp.next;
                temp.next=abc;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    //insert before value
    private static Node insertel(Node head,int val,int el){
        if(head==null) return head;
        Node temp=head;
        Node prev=null;
        if(head.data==el){
            return new Node(val,head);
        }
        while(temp!=null){
            if(temp.next.data==el){
                Node abc=new Node(val);
                abc.next=temp.next;
                temp.next=abc;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    private static void print(Node head){
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String args[]){
        int[] arr={2,5,6,8};
        Node head=convert(arr);
        //head=inserthead(head,100);
        //head=inserttail(head,100);
        //head=insertpos(head,2,100);
        head=insertel(head,100,2);
        print(head);
     }
}
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
public class DLLbasic{
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
    private static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    //delete head of Dll
    private static Node delhead(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;
        return head;
    }
    //delete tail of Dll
    private static Node deltail(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node prev=temp.back;
        temp.back=null;
        prev.next=null;
        return head;
    }
    //delete the kth element of dll
    private static Node delKth(Node head,int k){
        int count=0;
        Node knode=head;
        while(knode!=null){
            count++;
            if(count==k) break;
            knode=knode.next;
        }
        Node prev=knode.back;
        Node front=knode.next;
        if(prev==null&&front==null){
            return null;
        }
        else if(prev==null){
            return delhead(head);
        }
        else if(front==null){
            return deltail(head);
        }
        prev.next=front;
        front.back=prev;
        knode.next=null;
        knode.back=null;
        return head;
    }
    //delete the value from dll
    private static Node delval(Node head,int val){
        Node temp=head;
        while(temp.data!=val){
            temp=temp.next;
        }
        Node prev=temp.back;
        Node front=temp.next;
        if(prev==null&&front==null){
            return null;
        }
        else if(prev==null){
            return delhead(head);
        }
        else if(front==null){
            return deltail(head);
        }
        prev.next=front;
        front.back=prev;
        temp.next=null;
        temp.back=null;
        return head;
    }
    //insert head of Dll
    private static Node insserthead(Node head,int val){
        Node temp=new Node(val,head,null);
        if(head==null || head.next==null){
            return null;
        }
        head.back=temp;
        return temp;
    }
    //insert tail of Dll
    private static Node inserttail(Node head,int val){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node prev=temp.back;
        Node abc=new Node(val,temp,prev);
        prev.next=abc;
        temp.back=abc;
        return head;
    }
    //insert the kth element of dll
    private static Node insertKth(Node head,int k,int val){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            if(count==k) break;
            temp=temp.next;
        }
        Node prev=temp.back;
        Node abc=new Node(val,temp,prev);
        temp.back=abc;
        prev.next=abc;
        return head;
    }
    //insert the value from dll
    private static Node insertval(Node head,int val,int el){
        Node temp=head;
       
        while(temp.data!=el){
            temp=temp.next;
        }
         Node prev=temp.back;
     Node abc=new Node(val,temp,prev);
        temp.back=abc;
        prev.next=abc;
        return head;
    }
    public static void main(String args[]){
        int[] arr={2,5,6,8};
        Node head=arraytoDLL(arr);
        //head=delhead(head);
        //head=deltail(head);
        //head=delKth(head,1);
        //head=delval(head,8);
      //head=insserthead(head,100);
  // head=inserttail(head,100);
    //head=insertkth(head,2,100)
    head=insertval(head,100,8);
        print(head);
    }
}
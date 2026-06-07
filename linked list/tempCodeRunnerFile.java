private static Node delval(Node head,int val){
    //     Node temp=head;
    //     int count=0;
    //     while(temp.data!=val){
    //         temp=temp.next;
    //     }
    //     Node prev=temp.back;
    //     Node front=temp.next;
    //     if(prev==null&&front==null){
    //         return null;
    //     }
    //     else if(prev==null){
    //         return delhead(head);
    //     }
    //     else if(front==null){
    //         return deltail(head);
    //     }
    //     prev.next=front;
    //     front.back=prev;
    //     temp.next=null;
    //     temp.back=null;
    //     return head;
    // }
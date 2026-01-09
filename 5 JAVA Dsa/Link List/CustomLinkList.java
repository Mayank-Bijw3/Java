public class CustomLinkList {
    
    Node head = null;
    Node tail = null;

    static class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next){
            this.val = val;
            this.next=next;
        }
    }


    //all functions heere

    public void inserFirst(int val){
        Node temp = new Node(val);
        temp.next=head; //The new node points to the current first node
        head=temp; //The new node becomes the new head.

        if(tail==null){
            tail=head;
        }
    }

    //we are not using head coz using head disturbs the link list
    public void display(){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

}

class Main{
    public static void main(String[] args) {
        CustomLinkList list = new CustomLinkList();

        list.inserFirst(1);
        list.inserFirst(2);
        list.inserFirst(3);
        list.inserFirst(4);
        list.inserFirst(5);
        list.inserFirst(6);
        list.display();
    }
}

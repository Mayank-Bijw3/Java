public class DublyLinkList {

    Node head;
    

    public void inssertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.previous=null;

        if(head!=null){
        head.previous=node;
        }

        head=node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("end");
    }

 private class Node{
    private int val;
    private Node next;
    private Node previous;
    
    public Node(int val) {
        this.val = val;
    }

    public Node(int val, DublyLinkList.Node next, DublyLinkList.Node previous) {
        this.val = val;
        this.next = next;
        this.previous = previous;
    }

    

 }
    
}

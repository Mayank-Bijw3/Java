//custom linklist

class Node{
    int data;
    Node nextNode;
}

class Linklist{
    Node head;
     
    public void insert(int data){

        Node node = new Node();
        node.data=data;
        node.nextNode = null;

        if(head==null){ //if it is a 1st node then
            head = node;
        }
        else{
            Node n = head;
            while(n.nextNode!=null){
                n=n.nextNode;
            }
            n.nextNode=node;
        }
    }

    public void show(){
        Node node = head;
        while(node.nextNode != null ){
            System.out.println(node.data);
            node =node.nextNode;
        }
        System.out.println(node.data);
    }
}
public class Linklist2 {
    public static void main(String[] args) {
        
        Linklist list = new Linklist();

        list.insert(7);
        list.insert(79);
        list.insert(78);

        list.show();
        
    }
}

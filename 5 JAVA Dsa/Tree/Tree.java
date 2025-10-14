class Node{
    int data;
    Node right;
    Node left;

    public Node(int data){
        this.data=data;
    }
}

class BinaryTree{

Node root; //only refrence

public void insert(int data){

    if(root==null)
        root = new Node(data);  //object declare and assign using constructor

    else if(data < root.data){
        root.left.data = data;
    }
}
}

public class Tree {
    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree();

        tree.insert(8);
        tree.insert(7);
    }
}

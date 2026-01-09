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
    root=insertRec(root,data);
}

public Node insertRec(Node root,int data){

    if(root==null)
        return new Node(data);  //object declare and assign using constructor

    if(data < root.data){
        root.left = insertRec(root.left,data);
    }
    else{
        root.right = insertRec(root.right,data);
    }
    return root;
}


public void display(Node root){
    if(root==null){
        return;
    }

    System.out.print(root.data+" ");
    display(root.left);
    display(root.right);

}
}

public class Tree {
    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree();

        tree.insert(8);
        tree.insert(7);
        tree.insert(3);
        tree.insert(4);
        tree.insert(1);

        tree.display(tree.root);
    }
}

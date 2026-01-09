public class BinarySearchTree {

    public class Node {

        private int height;
        private int val;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }

    }

    private Node root;   //outside node class

    public BinarySearchTree() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;

        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int val){
        if(root==null){
            root = new Node(val);
        }
        root = orgInsert(val, root);
        
    }

    public Node orgInsert(int val,Node node){
        if(node==null){
            node = new Node(val);
            return node;
        }
        if(val < node.val){
            node.left = orgInsert(val,node.left);
        }
        else{
            node.right = orgInsert(val,node.right);
        }

        node.height = Math.max(height(node.left), height(node.right));
        return node;
    }

    public boolean balanced(){
        return checkBalanced(root);
    }

}

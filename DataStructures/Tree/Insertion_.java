package DataStructures.Tree;

public class Insertion_ {
    
static class TNode{
    int data;
    TNode left, right;

    TNode(int val){
        this.data = val;
        right = left = null;
    }
}

    static class BinaryTree{
        TNode root;

        BinaryTree(){
            root = null;
        }

        // Traversal of Binary Tree
        void preorder(TNode root){
            if(root == null){  // if thsi condition is not set then stack over
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        void postorder(TNode root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        void inorder(TNode root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TNode(10);
        tree.root.left = new TNode(20);
        tree.root.left.left = new TNode(82);
        tree.root.left.right = new TNode(70);
        tree.root.right = new TNode(55);
        tree.root.right.left = new TNode(42);
        tree.root.right.right = new TNode(12);

        System.out.println("Pre-Order: ");
        tree.preorder(tree.root);

        System.out.println();
        System.out.println("In-Order: ");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("Post-Order: ");
        tree.postorder(tree.root);
    }
}

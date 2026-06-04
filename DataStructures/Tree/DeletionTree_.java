package DataStructures.Tree;

public class DeletionTree_ {
    public static void main(String[] args) {
        DeletionBST bst = new DeletionBST();

        bst.root = bst.insert(50,bst.root);
        bst.root = bst.insert(30,bst.root);
        bst.root = bst.insert(72,bst.root);
        bst.root = bst.insert(41,bst.root);
        bst.root = bst.insert(20,bst.root);
        bst.root = bst.insert(79,bst.root);
        bst.root = bst.insert(65,bst.root);
        bst.root = bst.insert(12,bst.root);
        bst.root = bst.insert(38,bst.root);
        bst.root = bst.insert(29,bst.root);
        bst.root = bst.insert(17,bst.root);

        System.out.println("In-Order");
        bst.inorder(bst.root);
        System.out.println();
    }
}

class DBSNode{
    int data;
    DBSNode left, right;

    DBSNode(int val){
        this.data = val;
        right = left = null;
    }
}

class DeletionBST{
    DBSNode root;
    DeletionBST(){
        root = null;
    }

    DBSNode insert(int data, DBSNode root){
        if(root == null){
            return new DBSNode(data);
        }
        if(data < root.data){
            root.left = insert(data,root.left);
        }else{
            root.right = insert(data, root.right);
        }
        return root;
    }





    void inorder(DBSNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

}

// main moved to public DeletionTree_ class above
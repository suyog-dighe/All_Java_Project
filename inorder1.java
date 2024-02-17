// Inorder and preorder binary tree

public class inorder1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class Binarytree {
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newnode =new Node(nodes[idx]);
            newnode.left= buildtree(nodes);
            newnode.right =buildtree(nodes);

            return newnode;


        }
    }
    public  static void preorder1(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.data+" ");
        preorder1(root.left);
        preorder1(root.right);
    }

    public static void inorder(Node root){
        if (root== null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);

    }
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree= new Binarytree();
        Node root = tree.buildtree(nodes);
        //System.out.println(root.data);
        //preorder1(root);
        inorder(root);

    }
}

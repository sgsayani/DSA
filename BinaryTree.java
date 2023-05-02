import java.util.LinkedList;

import java.util.Queue;
public class BinaryTree
{
    //making nodes ,,
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)// constructor
        {
            this.data = data;
            this.left = null;// starting pe null
            this.right= null;//starting pe null
        }
    }
//make binary tree
    static class binarytree{
        static int idx = -1;// incremnet kar ke length pe le jana hya
        public static Node buildTree(int nodes[]){//array nodes pass return root node
            idx++;
            if(nodes[idx]==-1)
            {
                return null;//-1 represent null
            }
            Node newnode =  new Node(nodes[idx]);//single index travel
            newnode.left = buildTree(nodes);// create left sub tree
            newnode.right=buildTree(nodes);// create right sub tree

            return newnode;
            // node created recurcively ... 
        }

        
    }
//preorder
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
//inorder
    public static void Inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
//postorder
public static void postorder(Node root) {
       if(root == null) {
        //   System.out.print(-1+" ");
           return;
       }
       postorder(root.left);
       postorder(root.right);
       System.out.print(root.data+" ");
   }

//levelorder find
public static void levelorder(Node root)
{
    if(root==null)
    {
        return;
    }
    Queue <Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty())
    {
        Node curr = q.remove();
        if(curr==null)
        {
            System.out.println();
            // empty queue
            if(q.isEmpty())
            {
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            System.out.println(curr.data+"");
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }
    }
}
// height of the tree
public static int height(Node root)
{
    if(root==null)
    {
        return 0 ;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    return Math.max(leftHeight,rightHeight)+1;
    
}

//count nodes in binary tree
public static int countOfNodes(Node root) {
    if(root == null) {
        return 0;
    }
    int leftNodes = countOfNodes(root.left);
    int rightNodes = countOfNodes(root.right);
    return leftNodes + rightNodes + 1;
}
// sum of nodes

public static int sumOfNodes(Node root)
{
    if(root==null)
    {
        return 0;
    }
    int leftNodes = sumOfNodes(root.left);
    int rightNodes = sumOfNodes(root.right);
    return leftNodes+rightNodes+root.data;
}

// diameter of tree approch1 --> O(N^2)
public static int diameter(Node root)
{
    if(root == null)
    {
        return 0;
    }
    int diam1 = height(root.left)+height(root.right)+1;
    int diam2 = diameter(root.left);
    int diam3 = diameter(root.right);
    return Math.max(diam1, Math.max(diam2,diam3));
}
//diameter of binary tree approch2 --> O(N)

static class TreeInfo{
    int ht,diam;
    TreeInfo(int ht,int diam)
    {
        this.ht = ht;
        this.diam = diam;
    }
}
public static TreeInfo diameter2(Node root)
{
    if(root == null )
    {
        return new TreeInfo(0, 0);
    }
    TreeInfo leftTI = diameter2(root.left);
    TreeInfo rightTI = diameter2(root.right);

    int myheight = Math.max(leftTI.ht,rightTI.ht+1);



    int diam1 = leftTI.ht+rightTI.ht+1;
    int diam2 = leftTI.diam;
    int diam3 = rightTI.diam;
    int mydiam = Math.max(diam1, Math.max(diam2,diam3));
    return new TreeInfo(myheight, mydiam);

}




    public static void main(String[] args)
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree = new binarytree(); 
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
       // preorder(root);
       //Inorder(root);
        //postorder(root);
       // levelorder(root);
         //System.out.println(height(root)); 
        // System.out.println(countOfNodes(root)); 
        //System.out.println(sumOfNodes(root));
        //System.out.println(diameter(root));
        System.out.println(diameter2(root));
    }
}
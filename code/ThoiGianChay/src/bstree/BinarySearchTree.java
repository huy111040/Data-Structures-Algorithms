package bstree;

public class BinarySearchTree {
    Node root;
    public void insert(int value){
        Node newNode=new Node(value);
        root=insertHelper(root,newNode);
    }
    //trả về node gốc sau khi thêm 1 node vào cây có node gốc root
    private Node insertHelper(Node root, Node node){
        if(root==null) return node;
        else 
            if(node.data>root.data)
            {
                root.right=insertHelper(root.right,node);
            }
            else
            {
                root.left=insertHelper(root.left,node);
            }
        return root;
    }
    public void display(){
        System.out.println("Print tree in PreOrder");
        displayHelper_PreOrder(root);
        System.out.println();
        System.out.println("Print tree in InOrder");
        displayHelper_InOrder(root);
        System.out.println();
        System.out.println("Print tree in PostOrder");
        displayHelper_PostOrder(root);
        System.out.println();
    }
    //Print: Root ->L ->R
    private void displayHelper_PreOrder(Node root) {
        if(root!=null)
        {
            System.out.print(root.data+" -> ");
            displayHelper_PreOrder(root.left);
            displayHelper_PreOrder(root.right);
        }
    }
    //Print: L->Root->R
    private void displayHelper_InOrder(Node root) {
        if(root!=null)
        {
            displayHelper_InOrder(root.left);
            System.out.print(root.data+" -> ");
            displayHelper_InOrder(root.right);
        }
    }
    //Prnt: L->R->Root
    private void displayHelper_PostOrder(Node root) {
        if(root!=null)
        {
            displayHelper_PostOrder(root.left);
            displayHelper_PostOrder(root.right);
            System.out.print(root.data+" -> ");
        }
    }
    public boolean search(int value){
        return searchHelper(root,value);
    }
    private boolean searchHelper(Node root, int value) {
        if(root==null) {
            return false;
        }
        else if(root.data==value) 
             {
                return true;
             }
             else if(root.data>value)
                     return searchHelper(root.left,value);
                  else 
                     return searchHelper(root.right,value);
                    
    }
    public void remove(int data){
        if(search(data)){
            removeHelper(root,data);
        }
        else{
            System.out.println(data+" could not be found");
        }
    }
    //return về root mới
    private Node removeHelper(Node root, int data) {
        if(root==null){
            return root;
        }
        else if(data<root.data){
            root.left=removeHelper(root.left, data);
        }
             else if(data>root.data){
                    root.right=removeHelper(root.right, data);}
                  else //node found
                  {
                     //nếu là node lá
                     if(root.left==null&&root.right==null){
                        root=null;
                     }
                     else if(root.right!=null){
                        //tìm phần tử nhỏ nhất bên phải thay cho phần tử bị xoá
                        root.data=successor(root);
                        //xoá phần tử vừa thay
                        root.right=removeHelper(root.right, root.data);
                     }
                     else{
                        //tìm phần tử lớn nhất bên trái thay cho phần tử bị xoá
                        root.data=predecessor(root.left);
                        root.left=removeHelper(root.left,root.data);
                     }
                  }
       return root;
    }
    //kế nhiệm: //tìm phần tử nhỏ nhất bên phải
    public int successor(Node root){
        root=root.right;
        while(root.left!=null){
            root=root.left;
        }
        return root.data;
    }
    //tiền nhiệm: //tìm phần tử lớn nhất bên trái
    public int predecessor(Node root){
        root=root.left;
        while(root.right!=null){
            root=root.right;
        }
        return root.data;
    }
    public int getHeight(){
        return getHeightHelper(root);
    }
    private int getHeightHelper(Node root) {
        if(root==null) {
            return -1;
        }
        else return 1+Math.max(getHeightHelper(root.left), getHeightHelper(root.right));
    }
    //đếm số nút tron cây nhị phân
    public int countNode(){
        return countNodeHelper(root);
    }
    private int countNodeHelper(Node root) {
        if(root==null)
            return 0;
        else
            return 1+countNodeHelper(root.left)+countNodeHelper(root.right);
    }
    //đếm số node lá trong cây
    private boolean isLeafNode(Node node){
        return (node.left==null&&node.right==null);
    }
    public int countLeafNode(){
        return countLeafNodeHelper(root);
    }
    private int countLeafNodeHelper(Node root) {
        if(root==null) return 0;
        if(isLeafNode(root)) return 1;
        else return countLeafNodeHelper(root.left)+countLeafNodeHelper(root.right);
    }
}

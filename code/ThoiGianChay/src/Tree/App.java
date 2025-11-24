package Tree;

public class App {
    public static void main(String[] args) throws Exception {
        BSTree myBsTree=new BSTree();
        myBsTree.createTree();
        myBsTree.addNode(4);
        TreeNode newRoot;
        newRoot=myBsTree.addNode_DQ(myBsTree.root, 8);
        myBsTree.root=newRoot;
        System.out.println("Done"); //đặt break point tại đây
        myBsTree.Print();
        System.out.println("Chiều cao của cây: "+myBsTree.height());
    }
}

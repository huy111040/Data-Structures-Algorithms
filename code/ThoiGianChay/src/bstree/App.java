package bstree;

public class App {
    public static void main(String[] args) throws Exception {
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(5);
        tree.insert(1);
        tree.insert(9);
        tree.insert(2);
        tree.insert(7);
        tree.insert(3);
        tree.insert(6);
        tree.insert(4);
        tree.insert(8);
        System.out.println("A tree was created");
        tree.display();
        System.out.println("8 is in Tree: "+tree.search(8));
        
        tree.remove(3);
        System.out.println("After removing node 3");
        tree.display();
        System.out.println("The height of tree is: "+tree.getHeight());
        System.out.println("The number of nodes in the tree is: "+tree.countNode());
        System.out.println("The number of Leaf nodes in the tree is: "+tree.countLeafNode());
    }
}

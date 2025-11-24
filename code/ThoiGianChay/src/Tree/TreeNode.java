package Tree;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return data+"->";
    }
}

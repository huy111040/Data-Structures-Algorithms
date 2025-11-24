package Tree;

public class BSTree {
    TreeNode root;
    //khởi tạo một cây
    public BSTree() {
    }
    //Tạo một cây có một số nút cho trước
    public void createTree(){
        TreeNode node1=new TreeNode(5);
        TreeNode node2=new TreeNode(1);
        TreeNode node3=new TreeNode(6);
        TreeNode node4=new TreeNode(0);
        TreeNode node5=new TreeNode(3);
        TreeNode node6=new TreeNode(7);
        TreeNode node7=new TreeNode(2);
        node1.right=node3;
        node1.left=node2;
        node2.left=node4;
        node2.right=node5;
        node3.right=node6;
        node5.left=node7;
        root=node1;
    }
    //thêm một nút vào cây
    public TreeNode addNode_DQ(TreeNode r,int value){
        TreeNode newNode=new TreeNode(value);
        //nếu cây rỗng
        if(r==null){
            return newNode;
        }
        else
        {
            if(value>r.data){
                //kiểm tra bên phải có node không
                if(r.right==null)
                {
                    r.right=newNode;
                }
                else
                    addNode_DQ(r.right,value);
            }
            else
            if(r.left==null)
            {
                r.left=newNode;
            }
            else
            {
                addNode_DQ(r.right,value);
            }
        }
        return r;
    }

    public void addNode(int value){
        TreeNode newNode=new TreeNode(value);
        //nếu cây rỗng
        if(root==null){
            root=newNode;
        }
        else
        {
            //tìm vị trí thích hợp để chèn
            TreeNode temp=root;
            while(true){
                //chèn nút sang bên phải
                if(value>temp.data){
                    //kiểm tra nút bên phải của temp có rỗng không?
                    if(temp.right==null){
                        temp.right=newNode;
                        break;
                    }
                    else
                        temp=temp.right;
                }
                else
                {
                    //kiểm tra nút bên trái của temp có rỗng không?
                    if(temp.left==null){
                        temp.left=newNode;
                        break;
                    }

                    else
                        temp=temp.left;
                }
            }

        }
    }
    //duyệt cây Pre-order N-L-R
    public void Print(){
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        lastOrder(root);
        System.out.println();
    }
    //duyệt cây Pre-order Root-Left-Right
    private void preOrder(TreeNode r){
        if(r==null) return;
        System.out.print(r);
        preOrder(r.left);
        preOrder(r.right);
    }
    //Left-Root-Right
    private void inOrder(TreeNode r){
        if(r==null) return;
        inOrder(r.left);
        System.out.print(r);
        inOrder(r.right);
    }
    //Left-Right-Root
    private void lastOrder(TreeNode r){
        if(r==null) return;
        inOrder(r.left);
        inOrder(r.right);
        System.out.print(r);
    }
    public int height(){
        return treeHeight(root);
    }
    private int treeHeight(TreeNode r){
        if(r==null) return -1;
        return 1+ Math.max(treeHeight(r.left),treeHeight(r.right));
    }
}

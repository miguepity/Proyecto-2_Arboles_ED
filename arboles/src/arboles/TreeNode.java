package arboles;


public class TreeNode {

    private String id;
    private final List children = new List();
    private final TreeNode parent;

    public TreeNode(String id, TreeNode parent) {
        this.id = id;
        this.parent = parent;
    }
   
    public TreeNode(TreeNode parent) {
        this.parent = parent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List getChildren() {
        return children;
    }

    public TreeNode getParent() {
        return parent;
    }

}

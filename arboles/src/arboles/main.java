/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author Miguel A. Ardon E
 */
public class main {

    public static void main(String[] args) {
        TreeNode treeRootNode = new TreeNode(null);
        treeRootNode.setId("root");
        // add child to root node 
        TreeNode childNode = addChild(treeRootNode, "child-1");
        // add child to the child node created above
        addChild(childNode, "child-11");
        addChild(childNode, "child-12");

        // add child to root node
        TreeNode child2 = addChild(treeRootNode, "child-2");
        // add child to the child node created above
        addChild(child2, "child-21");

        //printTree(treeRootNode, " ");

    }

    private static TreeNode addChild(TreeNode parent, String id) {
        TreeNode node = new TreeNode(parent);
        node.setId(id);
        parent.getChildren().insert(node, parent.getChildren().getSize());
        System.out.println(node.getId());
        return node;
    }

    private static void printTree(TreeNode node, String appender) {
        System.out.println(appender + node.getId());
        for (int i =0; i<node.getChildren().getSize();i++) {
            printTree(node.getChildren().get(i),appender + appender);
                    System.out.println(appender + node.getId());

        }
    }
}


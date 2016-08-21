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
public class NodeTreeNode {

    private TreeNode node;
    NodeTreeNode next;

    public NodeTreeNode(TreeNode node) {
        this.node = node;
    }

    public NodeTreeNode() {

    }

    public TreeNode getTreeNode() {
        return node;
    }

    public void setStudent(TreeNode node) {
        this.node = node;
    }

    public NodeTreeNode getNext() {
        return next;
    }

    public void setNext(NodeTreeNode next) {
        this.next = next;
    }

}

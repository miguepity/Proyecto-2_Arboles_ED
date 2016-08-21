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
public class List {
    NodeTreeNode head;
    int size;

    public List() {
        head = new NodeTreeNode();
    }

    public boolean insert(TreeNode value, int pos) {
        if(pos<0 || pos>size){
            return false;
        }
        NodeTreeNode neo= new NodeTreeNode(null);
        if(size==0){
            head=neo;
        }else if(pos==0){
            neo.next=head;
            head = neo;
        }else{
            NodeTreeNode temp = head;
            for (int i = 0; i < pos-1; i++) {
                temp= temp.next;
            }
            neo.next=temp.next;
            temp.next=neo;
        }
        size++;
        return true;        
    }

    public void setHead(NodeTreeNode head) {
        this.head = head;
    }

    public TreeNode get(int pos) {
        NodeTreeNode temp = head;
        TreeNode value = temp.getTreeNode();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();

            value = temp.getTreeNode();
        }
        return value;
    }

    public void delete(int pos) {
        NodeTreeNode temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        NodeTreeNode temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public TreeNode first() {
        return head.getTreeNode();
    }

    public void Print_Lista() {
        NodeTreeNode temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.getTreeNode() + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getTreeNode() + "]");
                cont++;
            }
            temp = temp.next;
        }
        System.out.println("");
    }

    public int getSize() {
        return size;
    }
}

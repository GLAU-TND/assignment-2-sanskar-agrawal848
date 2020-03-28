/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree
import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
public class MyBinarySearchTree {
    private TreeNode root;

    // To insert a new Node in Tree.
    public void insert(int value){
        TreeNode node = new TreeNode(value);
        if(root == null){
            root = node;
            //System.out.println("root Node inserted");
        }
        else {
            insertHelper(root,value);
        }
    }

    private void insertHelper(TreeNode current,int value){
        TreeNode node = new TreeNode(value);
        if(value == current.getData()){
            return;
        }
        else if(value < current.getData()){
            if(current.getLeftChild() == null){
                //System.out.println("New Node inserted");
                current.setLeftChild(node);
                node.setParent(current);
            }
            else {
                insertHelper(current.getLeftChild(),value);
            }
        }
        else {
            if(current.getRightChild() == null){
                //System.out.println("New Node inserted");
                current.setRightChild(node);
                node.setParent(current);
            }
            else {
                insertHelper(current.getRightChild(),value);
            }
        }
        return;
    }
}

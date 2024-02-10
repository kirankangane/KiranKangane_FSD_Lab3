package com.gl.dsa.bst;

public class Main {
    public static void main(String[] args){

        BinarySearchTree bst = BSTUtils.sampleBST();
        Node root = bst.getRoot();
        //System.out.println(root.getLeft().getRight().getData());
        BSTPairFinder pairFinder = new BSTPairFinder(bst, 100);

        pairFinder.findPairs();
    }
}
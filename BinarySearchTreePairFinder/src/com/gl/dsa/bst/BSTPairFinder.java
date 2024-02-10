package com.gl.dsa.bst;

import java.util.LinkedHashSet;
import java.util.Set;

public class BSTPairFinder {

    BinarySearchTree bst;
    Integer sum;
    Set<Integer> previouslyVisitedNodes;
    boolean pairFound = false;

    public BSTPairFinder(BinarySearchTree bst, Integer sum) {

        this.bst = bst;
        this.sum = sum;

        this.previouslyVisitedNodes = new LinkedHashSet<>();
    }

    void findPairs() {
        preOrderTraversal();
    }

    void preOrderTraversal() {
        preOrderTraveralInternal(bst.getRoot());
        if (!pairFound){
            System.out.println("Nodes are not found");
        }
    }

    void preOrderTraveralInternal(Node currentNode) {

        if (currentNode == null) {
            return;
        }

        Integer difference = (sum - currentNode.getData());

        if (previouslyVisitedNodes.contains(difference)) {

            System.out.println("Match Identified");
            System.out.printf("[%d, %d]", currentNode.getData(), difference);
            System.out.println();
            pairFound = true;
        }

        this.previouslyVisitedNodes.add(currentNode.getData());

        preOrderTraveralInternal(currentNode.getLeft());
        preOrderTraveralInternal(currentNode.getRight());
    }
}

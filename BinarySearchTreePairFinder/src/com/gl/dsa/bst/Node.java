package com.gl.dsa.bst;

public class Node {

    Integer data;
    Node left;
    Node right;

    public Node(Integer data){
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String toString() {
        return String.format("[%d]", data);
    }

}

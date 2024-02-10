package com.gl.dsa.brackets.balancer;

public class Main {
    public static void main(String[] args) {
        BracketsBalancer balancer = new BracketsBalancer("[<>())(]");
        balancer.check();
    }
}

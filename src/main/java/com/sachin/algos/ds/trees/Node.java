package com.sachin.algos.ds.trees;

import java.util.Objects;

public class Node<V extends Comparable<V>> {

    private final V value;
    private Node<V> left;
    private Node<V> right;

    public Node(V value) {
        this(value, null, null);
    }

    public Node(V value, Node<V> left, Node<V> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public V getValue() {
        return value;
    }

    public Node<V> getLeft() {
        return left;
    }

    public void setLeft(Node<V> left) {
        this.left = left;
    }

    public Node<V> getRight() {
        return right;
    }

    public void setRight(Node<V> right) {
        this.right = right;
    }

    public Node<V> copy() {
        Node<V> node = new Node<>(value);
        if (getLeft() != null) {
            node.setLeft(getLeft().copy());
        }
        if (getRight() != null) {
            node.setRight(getRight().copy());
        }
        return node;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(value, node.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

package com.sachin.algos.ds.trees.bst;

import com.sachin.algos.ds.trees.Node;

import java.util.Objects;

public class BinarySearchTree<V extends Comparable<V>> {

    private Node<V> root;

    public BinarySearchTree() {
    }

    @SafeVarargs
    public BinarySearchTree(V... values) {
        for (V value : values) {
            insert(value);
        }
    }

    public boolean contains(V value) {
        if (root != null) {
            return findNode(value, root) != null;
        }
        return false;
    }

    public Node<V> getNode(V value) {
        return findNode(value, root);
    }

    private Node<V> findNode(V value, Node<V> node) {
        int result = node.getValue().compareTo(value);
        if (result == 0) {
            return node;
        }
        if (result > 0) {
            if (node.getLeft() == null) {
                return null;
            }
            return findNode(value, node.getLeft());
        } else {
            if (node.getRight() == null) {
                return null;
            }
            return findNode(value, node.getRight());
        }
    }

    public void insert(V value) {
        Objects.requireNonNull(value);
        if (root == null) {
            root = new Node<>(value, null, null);
        } else {
            addNewValue(value, root);
        }
    }

    private void addNewValue(V newValue, Node<V> currentNode) {
        int result = currentNode.getValue().compareTo(newValue);
        if (result > 0) {
            if (currentNode.getLeft() != null) {
                addNewValue(newValue, currentNode.getLeft());
            } else {
                currentNode.setLeft(new Node<>(newValue, null, null));
            }
        } else {
            if (currentNode.getRight() != null) {
                addNewValue(newValue, currentNode.getRight());
            } else {
                currentNode.setRight(new Node<>(newValue, null, null));
            }
        }
    }

    public boolean delete(V value) {
        if (root == null) {
            return false;
        }
        return deleteValue(value, root);
    }

    /*
        5
       / \
      4   6
      Op: Delete 5
      1. Find the right node
      2. Make right node as root node

            5
           / \
          3   10
         /   / \
        2   8   13
               /  \
              12  14
             /
            11
      Op: Delete 5
      1. Find left node
      2. Make left as root
     */

    private boolean deleteValue(V value, Node<V> node) {
        Node<V> parent = null;
        Node<V> currentNode = node;
        while (currentNode != null) {
            int result = currentNode.getValue().compareTo(value);
            if (result > 0) {
                parent = currentNode;
                currentNode = currentNode.getLeft();
            } else if (result < 0) {
                parent = currentNode;
                currentNode = currentNode.getRight();
            } else {
                // 1. No right child
                if (currentNode.getRight() == null) {
                    if (parent == null) {
                        // This is a root node
                        this.root = currentNode.getLeft();
                    } else {
                        // if current node is left
                        if (currentNode.getValue().compareTo(parent.getValue()) <= 0) {
                            parent.setLeft(currentNode.getLeft());
                        } else {
                            parent.setRight(currentNode.getLeft());
                        }
                    }
                }
                // 2. Right child doesn't have right child
                else if (currentNode.getRight().getLeft() == null) {
                    if (parent == null) {
                        // This is the root node
                        this.root = currentNode.getRight();
                    } else {
                        if (currentNode.getValue().compareTo(parent.getValue()) <= 0) {
                            parent.setLeft(currentNode.getRight());
                        } else {
                            parent.setRight(currentNode.getRight());
                        }
                    }
                }
                // 3. Right child has left child node
                else {
                    Node<V> leftMost = currentNode.getRight().getLeft();
                    Node<V> leftMostParent = currentNode.getRight();
                    while (leftMost.getLeft() != null) {
                        leftMostParent = leftMost;
                        leftMost = leftMost.getLeft();
                    }

                    // as the left most node is going to a new position, we need to re-align it's children as well
                    leftMostParent.setLeft(leftMost.getRight());

                    // set the left and right of references of node being deleted to new node
                    leftMost.setLeft(currentNode.getLeft());
                    leftMost.setRight(currentNode.getRight());

                    if (parent == null) {
                        // replacing the root node
                        this.root = leftMost;
                    } else {
                        if (currentNode.getValue().compareTo(parent.getValue()) <= 0) {
                            parent.setLeft(leftMost);
                        } else {
                            parent.setRight(leftMost);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

}

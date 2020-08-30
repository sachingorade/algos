package com.sachin.algos.ds.trees.bst;

import com.sachin.algos.ds.trees.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void test_contains_without_insert() {
        BinarySearchTree<Integer> bst = createNewTree();
        assertFalse(bst.contains(5));
    }

    @Test
    void test_contains_after_insert_valid() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(5);
        assertTrue(bst.contains(5));
    }

    @Test
    void test_insert_left_node() {
        BinarySearchTree<Integer> bst = createNewTree(58);
        bst.insert(27);

        Node<Integer> root = bst.getNode(58);
        assertEquals(58, root.getValue());
        assertEquals(27, root.getLeft().getValue());
    }

    @Test
    void test_insert_right_node() {
        BinarySearchTree<Integer> bst = createNewTree(58, 27);
        bst.insert(68);

        Node<Integer> root = bst.getNode(58);
        assertEquals(27, root.getLeft().getValue());
        assertEquals(68, root.getRight().getValue());
    }

    @Test
    void test_contains_all_multiple_insert() {
        BinarySearchTree<Integer> bst = createNewTree(5, 4, 6);
        assertTrue(bst.contains(6));
        assertTrue(bst.contains(4));
        assertTrue(bst.contains(5));
    }

    @Test
    void test_delete_single_value() {
        BinarySearchTree<Integer> bst = createNewTree(5);
        assertTrue(bst.delete(5));
        assertFalse(bst.contains(5));
    }

    @Test
    void test_delete_left_child_node() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>(58, 27, 98);
        assertTrue(bst.delete(27));
        assertFalse(bst.contains(27));
    }

    @SafeVarargs
    private <T extends Comparable<T>> BinarySearchTree<T> createNewTree(T... values) {
        return new BinarySearchTree<>(values);
    }

}
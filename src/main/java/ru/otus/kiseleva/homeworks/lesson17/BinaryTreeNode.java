package ru.otus.kiseleva.homeworks.lesson17;

import java.util.*;

public class BinaryTreeNode implements SearchTree {

    private BinaryTreeNode left;

    private BinaryTreeNode right;

    private BinaryTreeNode parent;

    private Integer key;

    public BinaryTreeNode() {
    }

    /**
     * конструктор для корн бинарного дерева поиска
     *
     * @param key значение в узле
     */
    private BinaryTreeNode(Integer key) {
        this.key = key;
    }

    /**
     * конструктор для узлов, имеющих родителя
     *
     * @param key    значение в узле
     * @param parent ссылка на родителя
     */
    private BinaryTreeNode(Integer key, BinaryTreeNode parent) {
        this.parent = parent;
        this.key = key;
    }

    @Override
    public List getSortedList() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer number = new Random().nextInt(100);
            result.add(number);
        }
        Collections.sort(result);
        return result;
    }

    public BinaryTreeNode createBinaryTreeFromSortedList() {
        List<Integer> source = getSortedList();
        return createBinaryTree(source, 0, source.size() - 1);
    }

    /**
     * Из Предварительно отсортированного списка (List) сформировать двоичное дерево поиска
     * Должно быть не более двух дочерних узлов
     * Дочерние узлы тоже должны быть бинарными деревьями
     * Дочерние узлы называют левыми и правыми
     * Все значения в узлах левого дочернего поддерева меньше значения родительского узла
     * Все значения в узлах правого дочернего поддерева больше значения родительского узла
     *
     * @param source
     */
    private BinaryTreeNode createBinaryTree(List source, int start, int end) {
        if (start > end) {
            return null;
        }
        int rootIndx = (start + end + 1) / 2;
        Integer root = (Integer) source.get(rootIndx);
        BinaryTreeNode tree = new BinaryTreeNode(root);
        tree.left = createBinaryTree(source, start, rootIndx - 1);
        tree.right = createBinaryTree(source, rootIndx + 1, end);
        return tree;
    }

    @Override
    public Integer find(Integer element) {
        BinaryTreeNode tmp = findNode(element);
        if (Objects.nonNull(tmp)) {
            return tmp.key;
        } else return null;
    }

    /**
     * Если искомое значение бинарного дерева поиска меньше значения узла,
     * то оно может находиться только в левом поддереве.
     * Искомое значение, которое больше значения узла, может быть только в правом поддереве.
     */
    public BinaryTreeNode findNode(Integer value) {
        BinaryTreeNode node = this;
        while (node != null) {
            if (Objects.equals(value, node.key)) {
                return node;
            }
            if (value < node.key) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return null;
    }

    public void print(){
        printBinaryTreeNode(this,0);
    }

    private void printBinaryTreeNode(BinaryTreeNode node, int space) {
        if (node == null) return;
        space += 3;
        printBinaryTreeNode(node.right, space);
        System.out.print("\n");
        for (int i = 3; i < space; i++) System.out.print(" ");
        System.out.print(node.key + "\n");
        printBinaryTreeNode(node.left, space);
    }

}

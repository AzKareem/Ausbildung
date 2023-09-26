package Java_basic;

import java.util.ArrayList;
import java.util.Random;

public class TreeÜbung {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Tree> treeList = new ArrayList<>();
        int totalLeaves = 0;
        int maxLeaves = 0;
        Tree treeWithMaxLeaves = null; // gebe ihm kein wert

        for (int i = 0; i < 100; i++) {
            int randomNumber = r.nextInt(101);
            Tree tree = new Tree(i, randomNumber);
            treeList.add(tree);
        }
        for (int i = 0; i < treeList.size(); i++) {
            Tree tree = treeList.get(i);
            System.out.print("ID: " + tree.id);
            System.out.println(" Leaves: " + tree.leaves);
            totalLeaves += tree.leaves;
            if (maxLeaves < tree.leaves) {
                maxLeaves = tree.leaves;
                treeWithMaxLeaves = tree;
            }
        }
        System.out.println("totalLeaves = " + totalLeaves);
        System.out.println("maxleaves = " + maxLeaves);
        System.out.println("treeWithMaxLeaves = " + treeWithMaxLeaves.id);


    }
}

package Datenstrukturen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Mengenlehre {
    public static void main(String[] args) {

        Integer[] A = {1, 3, 5};
        Integer[] B = {3, 5, 7};
        Integer[] C = {5, 7, 9};
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(A));
        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(B));
        Set<Integer> set3 = new HashSet<>();
        set3.addAll(Arrays.asList(C));

        System.out.println("UnionSet = " + setUnion1(set1, set2, set3));
        System.out.println("SetIntersection = " + setIntersection1(set2, set3));
        System.out.println("setDifference = " + setDifference1(set1, set2, set3));
    }
    public static Set<Integer> setUnion1(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        unionSet.addAll(set3);
        return unionSet;
    }
    public static Set<Integer> setIntersection1(Set<Integer> set2, Set<Integer> set3) {
        Set<Integer> setIntersection = new HashSet<>(set2);
        setIntersection.retainAll(set3);
        return setIntersection;
    }
    public static Set<Integer> setDifference1(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        Set<Integer> setDifference = new HashSet<>(set1);
        setDifference.retainAll(set2);
        setDifference.retainAll(set3);
        return setDifference;
    }
}

package day2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EHDemo {

    public static void main(String[] args) {
         // ==  equals
//        String str1 = new String("one");
//        String str2 = new String("one");
//        System.out.println(str1 == str2);        // false
//        System.out.println(str1.equals(str2));   // true
//
//        EHNode node1 = new EHNode(1);
//        EHNode node2 = new EHNode(1);
//        System.out.println(node1 == node2);       // false
//        System.out.println(node1.equals(node2));  // false -> true

//        Set<EHNode> treeSet = new TreeSet<>(new Comparator<EHNode>() {
//            @Override
//            public int compare(EHNode o1, EHNode o2) {
//                return o2.value - o1.value;
//            }
//        });


        Set<EHNode> treeSet = new TreeSet<>(new MyComparator());


        treeSet.add(new EHNode(1));
        treeSet.add(new EHNode(2));
        treeSet.add(new EHNode(3));
        System.out.println(treeSet.size());
    }
}


class MyComparator implements Comparator<EHNode> {

    @Override
    public int compare(EHNode o1, EHNode o2) {
        return o2.value - o1.value;
    }
}



class EHNode implements Comparable<EHNode>{   // class Object ->   equals()  -> ==
    int value;
    EHNode(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return value + 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof EHNode)) return false;
        EHNode other = (EHNode) obj;
        return this.value == other.value;
    }

    @Override
    public int compareTo(EHNode o) {
        return this.value - o.value;
    }
}

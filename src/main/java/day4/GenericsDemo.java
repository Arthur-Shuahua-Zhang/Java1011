package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {
        Node node = new Node("key", 123);
        Node2 node2 = new Node2(1.0, "va");
        Node3 node3 = new Node3(node2, node);

        GNode<String, String> node4 = new GNode<>("asdf", "asdf");
        GNode<Node2, Node> node5 = new GNode<>(node2, node);

    }

    public static <E> E getFirst(E[] array) {
        return array[0];
    }

    public static <E, U> E method(E[] array, List<U> list) {
        return null;
    }
}

class GNode<K, V> {
    K key;
    V value;

    public GNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}




class Node {
    String key;
    Integer value;

    public Node(String key, Integer value) {
        this.key = key;
        this.value = value;
    }
}

class Node2 {
    Double key;
    String value;

    public Node2(Double key, String value) {
        this.key = key;
        this.value = value;
    }
}

class Node3 {
    Node2 key;
    Node value;

    public Node3(Node2 key, Node value) {
        this.key = key;
        this.value = value;
    }
}



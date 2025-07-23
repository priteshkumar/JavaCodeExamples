package com.example.helloworld.corejava.generics;

class Util {
    public <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }
}

public class GenericMethodDemo {
    public static void main(String[] args) {
        Pair<String, String> p1 = new Pair<>("one", "world");
        Pair<String, String> p2 = new Pair<>("one", "world");
        Util util = new Util();
        System.out.println(util.compare(p1, p2));
    }
}

//package com.graphql_java.phr_service.utils;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Utils {

    public static <K, V> HashMap<K, V> newNonNullHashMap() {
        return new HashMap<>() {
            @Override
            public V put(K key, V val) {
                if(key == null) return null;
                return super.put(key, val);
            }
        };
    }

    public static <T> ArrayList<T> newNonNullArrayList() {
        return new ArrayList<>() {
            @Override
            public boolean add(T object) {
                if(object == null) return false;
                return super.add(object);
            }

            @Override
            public boolean addAll(Collection<? extends T> objects) {
                if(objects == null) return false;
                return super.addAll(objects.stream()
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList()));
            }
        };
    }

    public static <T> ArrayList<T> newNonNullArrayList(Collection<T> inputCollection) {
        ArrayList<T> list = newNonNullArrayList();
        if(inputCollection != null) list.addAll(inputCollection);
        return list;
    }

    public static <T> HashSet<T> newNonNullHashSet() {
        return new HashSet<>() {
            @Override
            public boolean add(T object) {
                if(object == null) return false;
                return super.add(object);
            }

            @Override
            public boolean addAll(Collection<? extends T> objects) {
                if(objects == null) return false;
                return super.addAll(objects.stream()
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList()));
            }
        };
    }

    public static <T> HashSet<T> newNonNullHashSet(Collection<T> inputCollection) {
        HashSet<T> set = newNonNullHashSet();
        if(inputCollection != null) set.addAll(inputCollection);
        return set;
    }

    public static <T> void forEachWithCounter(Iterable<T> source, BiConsumer<Integer, T> consumer) {
        int i = 0;
        for (T item : source) {
            consumer.accept(i, item);
            i++;
        }
    }

    public static <T> void forEachWithCounter(Iterable<T> source, Integer initVal, BiConsumer<Integer, T> consumer) {
        int i = initVal;
        for (T item : source) {
            consumer.accept(i, item);
            i++;
        }
    }

    public static String capitalize(String name) {
        if(name != null && !name.isBlank()) {
            char[] delimiters = { ' ','.','(',')','-','[',']' };
            return null;
        }
        return name;
    }

}

package io.github.initio.thirdBrac;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class thirdBrac<T> implements Iterable<T> {
    private final Deque<T> list;

    // Private Constructor
    private thirdBrac(List<T> data) {
        this.list = new ArrayDeque<>(data);
    }

    // ✅ Create a new thirdBrac list (Python-style)
    @SafeVarargs
    public static <T> thirdBrac<T> list(T... elements) {
        return new thirdBrac<>(Arrays.asList(elements));
    }

    @SafeVarargs
    public static <T> thirdBrac<T> of(T... elements) {
        return new thirdBrac<>(Arrays.asList(elements));
    }

    // ✅ Append (Add element to end)
    public void append(T value) {
        list.addLast(value);
    }

    // ✅ Insert (Add at specific index)
    public void insert(int index, T value) {
        List<T> temp = new ArrayList<>(list);
        temp.add(index, value);
        list.clear();
        list.addAll(temp);
    }

    // ✅ Extend (Add multiple elements)
    public void extend(List<T> values) {
        list.addAll(values);
    }

    // ✅ Remove (First occurrence of value)
    public void remove(T value) {
        list.remove(value);
    }

    // ✅ Pop (Remove last element)
    public T pop() {
        return list.removeLast();
    }

    // ✅ Pop at index
    public T pop(int index) {
        List<T> temp = new ArrayList<>(list);
        T removed = temp.remove(index);
        list.clear();
        list.addAll(temp);
        return removed;
    }

    // ✅ Clear list
    public void clear() {
        list.clear();
    }

    // ✅ Set value at index
    public void set(int index, T value) {
        List<T> temp = new ArrayList<>(list);
        temp.set(index, value);
        list.clear();
        list.addAll(temp);
    }

    // ✅ Get value at index
    public T get(int index) {
        return new ArrayList<>(list).get(index);
    }

    // ✅ First element
    public T first() {
        return list.getFirst();
    }

    // ✅ Last element
    public T last() {
        return list.getLast();
    }

    // ✅ Slice (Sublist)
    public thirdBrac<T> slice(int start, int end) {
        List<T> temp = new ArrayList<>(list).subList(start, end);
        return new thirdBrac<>(temp);
    }

    // ✅ Reverse Slice
    public thirdBrac<T> reverseSlice() {
        List<T> temp = new ArrayList<>(list);
        Collections.reverse(temp);
        return new thirdBrac<>(temp);
    }

    // ✅ Index of value
    public int index(T value) {
        return new ArrayList<>(list).indexOf(value);
    }

    // ✅ Count occurrences of value
    public int count(T value) {
        return Collections.frequency(list, value);
    }

    // ✅ Sort (Ascending)
    public void sort() {
        List<T> temp = new ArrayList<>(list);
        Collections.sort((List<Comparable>) temp);
        list.clear();
        list.addAll(temp);
    }

    // ✅ Sort (Descending)
    public void sortDescending() {
        List<T> temp = new ArrayList<>(list);
        temp.sort(Collections.reverseOrder());
        list.clear();
        list.addAll(temp);
    }

    // ✅ Reverse order
    public void reverse() {
        List<T> temp = new ArrayList<>(list);
        Collections.reverse(temp);
        list.clear();
        list.addAll(temp);
    }

    // ✅ Copy list
    public thirdBrac<T> copy() {
        return new thirdBrac<>(new ArrayList<>(list));
    }

    // ✅ Merge lists (Concatenation)
    public thirdBrac<T> merge(List<T> otherList) {
        thirdBrac<T> merged = this.copy();
        merged.extend(otherList);
        return merged;
    }

    // ✅ Pythonic "in" check
    public boolean contains(T value) {
        return list.contains(value);
    }

    // ✅ Convert to Java List
    public List<T> toList() {
        return new ArrayList<>(list);
    }

    // ✅ Map function (Pythonic list comprehension)
    public <R> thirdBrac<R> map(Function<T, R> func) {
        return new thirdBrac<>(list.stream().map(func).collect(Collectors.toList()));
    }

    // ✅ Filter function (Keep elements that match condition)
    public thirdBrac<T> filter(Predicate<T> predicate) {
        return new thirdBrac<>(list.stream().filter(predicate).collect(Collectors.toList()));
    }

    // ✅ Reduce function (Aggregate values)
    public Optional<T> reduce(BinaryOperator<T> reducer) {
        return list.stream().reduce(reducer);
    }

    // ✅ List Comprehension (Generate list using function)
    public static thirdBrac<Integer> comprehension(int start, int end, IntFunction<Integer> func) {
        return new thirdBrac<>(IntStream.range(start, end).mapToObj(func).collect(Collectors.toList()));
    }

    // ✅ Iterator support (For-each loop)
    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    // ✅ String Representation
    @Override
    public String toString() {
        return list.toString();
    }
}
